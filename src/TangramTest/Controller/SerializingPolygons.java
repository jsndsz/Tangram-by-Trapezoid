package TangramPuzzle.Controller;

import java.awt.Polygon;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import TangramPuzzle.Model.CatalogData;
import TangramPuzzle.Model.ShapeSet;
import TangramPuzzle.Model.ShapeState;
import TangramPuzzle.View.PuzzleSolveScreen;

/**
 * This class is written to serialize the puzzle
 * @author sinamdar
 *
 */
public class SerializingPolygons {

	List<int[]> state = new ArrayList<int[]>();
	private List<Polygon> myPolygons = new ArrayList<Polygon>();
	ShapeSet s = new ShapeSet();
	int chosenShapeSet;
	int chosenPuzzle;
	static String fileToBeWritten;
	ShapeState ss = new ShapeState();


/**
 * constructor
 * @param p this the instance of the polygon
 */

	public void SerializingPolygons(Polygon p) {
		int[] x = p.xpoints;
		int[] y = p.ypoints;
		state.add(x);
		state.add(y);
		ss.setShapeForSerialize(p, state);

		int noOfElementsMap = ss.getSerializedShape().keySet().size();

		if (noOfElementsMap == s.getShapeSet().size()) {
			setPuzzleConfigurations();
			PuzzleCompletion pc = new PuzzleCompletion();
			pc.checkPuzzleCompletion();

		}

	}

 /**
	  * This method writes the serialized puzzle to a file
	  */

	public void setPuzzleConfigurations() {
		PuzzleSolveScreen psolveScreen = new PuzzleSolveScreen();
		CatalogData cd = new CatalogData();
		chosenPuzzle = psolveScreen.getChosenPuzzle();
		chosenShapeSet = psolveScreen.chosenShapeSetNumber;
		if (chosenShapeSet == 1) {
			fileToBeWritten = cd.ShapeSet1Files[chosenPuzzle];
		} else if (chosenShapeSet == 2) {
			fileToBeWritten = cd.ShapeSet2Files[chosenPuzzle];
		}

	}

/**
	  * This method serializes a Polygon
	  */

	public void SerializePuzzle() {
		CatalogData cd = new CatalogData();
		WriteOutObject objectWritten = new WriteOutObject(ss.getSerializedShape());
		try {
			FileOutputStream fileStream = new FileOutputStream(fileToBeWritten);
			ObjectOutputStream out = new ObjectOutputStream(fileStream);
			out.writeObject(objectWritten);
			out.close();
			fileStream.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}