package TangramPuzzle.Controller;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import TangramPuzzle.Model.CatalogData;
import TangramPuzzle.Model.PuzzleSet;
import TangramPuzzle.Model.ShapeState;
import TangramPuzzle.View.PuzzleSolveScreen;

/**
 * This class checks for Puzzle Completion.
 * 
 * @author cpai
 *
 */

public class PuzzleCompletion extends SerializingPolygons {

	/**
	 * ShapeSet1 and ShapeSet2
	 */
	public static Map<Integer, Map> ShapeSet1 = new HashMap<Integer, Map>();
	public static Map<Integer, Map> ShapeSet2 = new HashMap<Integer, Map>();
	CatalogData cd = new CatalogData();
	ShapeState ss = new ShapeState();

	public static Map finalPolygons = new HashMap<Polygon, List>();
	PuzzleSet pset = new PuzzleSet();
	List puzzleSet = new ArrayList();
	PuzzleSolveScreen psolveScreen = new PuzzleSolveScreen();

	List<Polygon> temp = new ArrayList<Polygon>();
	List<Polygon> temp2 = new ArrayList<Polygon>();
	boolean intersectStatusCheck = false;
	int chosenPuzzle;
	int chosenShapeSet;
	boolean statusCheck = true;
	Polygon silhouettePolygon;

	/**
	 * Method to setUp the silhouette polygon to check for puzzle completion
	 */

	public void checkPuzzleCompletion() {
		puzzleSet = pset.getPuzzleSet();
		chosenPuzzle = psolveScreen.getChosenPuzzle();
		silhouettePolygon = (Polygon) puzzleSet.get(chosenPuzzle);
	}

	public void displaySuccess() {
		SerializingPolygons sc = new SerializingPolygons();
		sc.SerializePuzzle();
		JOptionPane.showMessageDialog(null, "Congratulations!!\n You have Successfully Solved the Puzzle",
				"InfoBox: " + "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
		silhouettePolygon = new Polygon();
	}

	/**
	 * Method to check if a polygon is within a silhouette
	 * 
	 * @return True : if polygon present within a silhouette False : if polygon not
	 *         within a silhouette
	 */
	public boolean containsPolygonInSilhouette() {
		Point p = new Point();

		temp.addAll(ss.getShapeState().keySet());

		for (int i = 0; i < temp.size(); i++) {

			int[] xP = temp.get(i).xpoints;
			int[] yP = temp.get(i).ypoints;
			for (int j = 0; j < xP.length; j++) {

				p.x = xP[j];
				p.y = yP[j];

				if (silhouettePolygon.contains(p)) {
					statusCheck = true;
				} else {
					statusCheck = false;
					return statusCheck;
				}

			}

		}

		return statusCheck;

	}

	/**
	 * Method to check if polygons are intersecting each other
	 * 
	 * @return True : if any of the polygons intersect eachother False : if any of
	 *         the polygons does not intersect eachother
	 */
	public boolean checkIntersection() {
		temp2.addAll(ss.getShapeState().keySet());
		int j = 0;
		for (int i = 0; i < temp2.size(); i++) {

			for (int k = i; k < temp2.size() - 1; k++) {
				j = k + 1;

				if (j >= temp2.size()) {
					return intersectStatusCheck;
				}

				Area p1 = new Area(temp.get(i));
				Area p2 = new Area(temp.get(j));
				p1.intersect(p2);

				if (!(p1.isEmpty())) {
					intersectStatusCheck = true;
					return intersectStatusCheck;
				}

			}
		}

		return intersectStatusCheck;

	}

}
