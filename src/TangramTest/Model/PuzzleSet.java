package TangramTest.Model;

import java.util.ArrayList;
import java.util.List;

public class PuzzleSet {
	int chosenPuzzleSet;
	Coordinates puzzleSetPuzzles = new Coordinates();
	List puzzleSetXCoordinates = new ArrayList();
	List puzzleSetYCoordinates = new ArrayList();
	List puzzleSet = new ArrayList();

	// For the chosen Shape Set, the chosen puzzle is generated
	public PuzzleSet(int chosenSet) {
		this.chosenPuzzleSet = chosenSet;
		setPuzzleSet();
	}

	public void setPuzzleSet() {
		// Gets the Arraylist of all the coordinates for a given ShapeSet and
		// sets the X and Y coordinates

		this.puzzleSetXCoordinates.addAll(puzzleSetPuzzles.getPuzzleSetX(this.chosenPuzzleSet));
		this.puzzleSetYCoordinates.addAll(puzzleSetPuzzles.getPuzzleSetY(this.chosenPuzzleSet));

		for (int i = 0; i < this.puzzleSetXCoordinates.size(); i++) {
			int[] xPuzzle = (int[]) this.puzzleSetXCoordinates.get(i);
			int[] yPuzzle = (int[]) this.puzzleSetYCoordinates.get(i);

			Shape Puzzle = new Shape(xPuzzle, yPuzzle);
			puzzleSet.add(Puzzle.createShape());
		}
	}

	// Generates a ArrayList of Polygons with the X and Y coordinates.
	public List getPuzzleSet() {
		return puzzleSet;
	}
}