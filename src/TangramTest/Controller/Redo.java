package TangramPuzzle.Controller;

import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.JPanel;

import TangramPuzzle.Model.ControllerState;

/**
 * This class responsible for redoing the last undone move.
 * 
 * @author jdsouza
 *
 */
public class Redo {

	static ControllerState controller = new ControllerState();

	Polygon p;
	static int[] xvalues;
	static int[] yvalues;
	static Undo undo = new Undo();
	static Point lastLocation;

	/**
	 * Method to calculate centroid
	 * 
	 * @param newx
	 *            : x-coordinates
	 * @param newy
	 *            : y-coordinates
	 * @return List of containing the centroid(x,y)
	 */
	public static List<Integer> centroid(int[] newx, int[] newy) {
		int x = 0;
		int y = 0;
		List<Integer> p = new ArrayList<Integer>();
		for (int i = 0; i < newx.length; i++) {
			x += newx[i];
			y += newy[i];

		}
		p.add((int) (x / newx.length));
		p.add((int) (y / newy.length));

		return p;
	}

	/**
	 * This method stores the state of the Polygon in stack
	 * 
	 * @param activeShape
	 *            active shape
	 */
	public void stackRedo(Polygon activeShape) {

		controller.setRedoStack(activeShape.xpoints, activeShape.ypoints, activeShape);

	}

	/**
	 * This method retrieves the last saved state of a Polygon
	 */
	public static void actionRedone() {
		JPanel view4 = Move.getView();
		Stack<int[]> redoStackx = controller.getRedoStack();
		if (!redoStackx.isEmpty()) {
			try {
				xvalues = controller.getRedoX();
				yvalues = controller.getRedoY();
				Polygon dragShape = controller.getRedoPolygon();
				undo.stackUndo(dragShape);
				dragShape.xpoints = xvalues;
				dragShape.ypoints = yvalues;

				view4.invalidate();

				view4.repaint();
			} catch (NullPointerException ex) {

			}

		}

	}
}