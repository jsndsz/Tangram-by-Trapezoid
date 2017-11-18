package TangramPuzzle.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * PuzzleSet class This class helps in fetching the puzzles from the puzzleSets
 * 
 * @author phavannavar
 *
 */
public class PuzzleSet {
	/**
	 * Indicates the chosenPuzzleSet
	 */
	public static int chosenPuzzleSet;
	/**
	 * Instance of Coordinates
	 */
	Coordinates puzzleSetPuzzles = new Coordinates();
	/**
	 * List to store the x any y coordinates of each puzzle
	 */
	List puzzleSetXCoordinates = new ArrayList();
	List puzzleSetYCoordinates = new ArrayList();
	/**
	 * Puzzle set list
	 */
	static List puzzleSet = new ArrayList();

	/**
	 * constructor for the PuzzleSet class
	 * 
	 * @param chosenSet
	 *            chosenPuzzleSet helps in loading the puzzles of the chosen
	 *            puzzleSet
	 */
	public PuzzleSet(int chosenSet) {
		this.chosenPuzzleSet = chosenSet;
		setPuzzleSet();
	}

	/**
	 * Default Constuctor for PuzzleSet class
	 */
	public PuzzleSet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Adds coordinates of the each puzzle set to a list
	 */
	public void setPuzzleSet() {

		this.puzzleSetXCoordinates.addAll(puzzleSetPuzzles.getPuzzleSetX(this.chosenPuzzleSet));
		this.puzzleSetYCoordinates.addAll(puzzleSetPuzzles.getPuzzleSetY(this.chosenPuzzleSet));

		puzzleSet.clear();
		for (int i = 0; i < this.puzzleSetXCoordinates.size(); i++) {
			int[] xPuzzle = (int[]) this.puzzleSetXCoordinates.get(i);
			int[] yPuzzle = (int[]) this.puzzleSetYCoordinates.get(i);

			Shape Puzzle = new Shape(xPuzzle, yPuzzle);
			puzzleSet.add(Puzzle.createShape());
		}
	}

	/**
	 * the puzzleSet number for reference to other classes
	 * 
	 * @return List
	 */
	public List getPuzzleSet() {
		return this.puzzleSet;
	}
}