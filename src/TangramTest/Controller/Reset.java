package TangramPuzzle.Controller;

import java.awt.Polygon;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import TangramPuzzle.Model.CatalogData;
import TangramPuzzle.Model.ShapeState;
import TangramPuzzle.View.PuzzleSolveScreen;

/**
 * This class responsible for resetting the solution in PuzzleSolveScreen
 * 
 * @author phavannavar
 *
 */

public class Reset {
	public boolean resetValue = false;
	int chosenPuzzle;

	/**
	 * Constructor
	 * 
	 * @param chosenPuz
	 *            chosen puzzle
	 */
	public Reset(int chosenPuz) {
		chosenPuzzle = chosenPuz;
	}

	/**
	 * Resets puzzle to initial state
	 */
	public void resetPuzzle() {
		checkFile();
		ShapeState ss = new ShapeState();
		ss.clearSerializeShape();
		ss.clearShapeState();
		CLayout cl = new CLayout();
		cl.showView4(chosenPuzzle);

	}
	
	/**
	 * This method checks if the puzzle is previously solved and contains a .ser file
	 */

	public void checkFile() {
		PuzzleSolveScreen ps = new PuzzleSolveScreen();
		CatalogData cd = new CatalogData();
		String filePathString = "";
		if (ps.chosenShapeSetNumber == 1) {

			filePathString = cd.ShapeSet1Files[ps.chosenPuzzle];
		} else if (ps.chosenShapeSetNumber == 2) {
			filePathString = cd.ShapeSet2Files[ps.chosenPuzzle];
		}

		File f = new File(filePathString);
		if (f.exists()) {
			f.delete();
		}
	}

}
