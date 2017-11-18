package TangramPuzzle.Model;

/**
 * This class loads the shapes to be drawn in the Puzzle solve screen
 * Also responsible for storing the state of a solved puzzle and writing out to a file.
 * @author cpai
 *
 */
public class CatalogData {
	
	/**
	 * Coordinates for palette and solution space separation
	 */
	public float lineX = 220;
	public float lineMinY = 70;
	public float lineMaxY = 700;

	/**
	 * Boundary for snapping back shapes to the palette
	 */
	public int snapPoint = 220;
	public int snapRange = 50;
	
	/**
	 * Boundary for moving the shapes around in the Puzzle solve screen
	 */
	public int minXRange = 70;
	public int maxXRange = 950;
	public int minYRange = 100;
	public int maxYRange = 600;

	/**
	 * Window Size
	 */
	public static int screenSizeX = 1366;
	public static int screenSizeY = 768;

	/**
	 * Files containing the coordinates for ShapeSet and PuzzleSet
	 */
	public String shapeset1File = "src/TangramPuzzle/Resources/ShapeSet1.txt";
	public String shapeset2File = "src/TangramPuzzle/Resources/ShapeSet2.txt";
	public String PuzzleSet1 = "src/TangramPuzzle/Resources/PuzzleSet1.txt";
	public String PuzzleSet2 = "src/TangramPuzzle/Resources/PuzzleSet2.txt";

	
	/**
	 * Number of Shapes and Puzzle in each ShapeSet and PuzzleSet
	 */
	int noOfShapesShapeSet1 = 7;
	int noOfShapesShapeSet2 = 11;
	int noOfShapesPuzzleSet1 = 10;
	int noOfShapesPuzzleSet2 = 10;

	/**
	 * Files containing the serialized state of the solved Puzzles for both the 
	 * shape sets
	 */
	public String ss1Puzzle1 = "src/TangramPuzzle/Resources/ss1Puzzle1.ser";
	public String ss1Puzzle2 = "src/TangramPuzzle/Resources/ss1Puzzle2.ser";
	public String ss1Puzzle3 = "src/TangramPuzzle/Resources/ss1Puzzle3.ser";
	public String ss1Puzzle4 = "src/TangramPuzzle/Resources/ss1Puzzle4.ser";
	public String ss1Puzzle5 = "src/TangramPuzzle/Resources/ss1Puzzle5.ser";
	public String ss1Puzzle6 = "src/TangramPuzzle/Resources/ss1Puzzle6.ser";
	public String ss1Puzzle7 = "src/TangramPuzzle/Resources/ss1Puzzle7.ser";
	public String ss1Puzzle8 = "src/TangramPuzzle/Resources/ss1Puzzle8.ser";
	public String ss1Puzzle9 = "src/TangramPuzzle/Resources/ss1Puzzle9.ser";
	public String ss1Puzzle10 = "src/TangramPuzzle/Resources/ss1Puzzle10.ser";

	public String ss2Puzzle11 = "src/TangramPuzzle/Resources/ss2Puzzle11.ser";
	public String ss2Puzzle12 = "src/TangramPuzzle/Resources/ss2Puzzle12.ser";
	public String ss2Puzzle13 = "src/TangramPuzzle/Resources/ss2Puzzle13.ser";
	public String ss2Puzzle14 = "src/TangramPuzzle/Resources/ss2Puzzle14.ser";
	public String ss2Puzzle15 = "src/TangramPuzzle/Resources/ss2Puzzle15.ser";
	public String ss2Puzzle16 = "src/TangramPuzzle/Resources/ss2Puzzle16.ser";
	public String ss2Puzzle17 = "src/TangramPuzzle/Resources/ss2Puzzle17.ser";
	public String ss2Puzzle18 = "src/TangramPuzzle/Resources/ss2Puzzle18.ser";
	public String ss2Puzzle19 = "src/TangramPuzzle/Resources/ss2Puzzle19.ser";
	public String ss2Puzzle20 = "src/TangramPuzzle/Resources/ss2Puzzle20.ser";

	/**
	 * Set containing the path to the serialized state of a puzzle in a shape set.
	 */
	public String[] ShapeSet1Files = { ss1Puzzle1, ss1Puzzle2, ss1Puzzle3, ss1Puzzle4, ss1Puzzle5, ss1Puzzle6,
			ss1Puzzle7, ss1Puzzle8, ss1Puzzle9, ss1Puzzle10 };
	public String[] ShapeSet2Files = { ss2Puzzle11, ss2Puzzle12, ss2Puzzle13, ss2Puzzle14, ss2Puzzle15, ss2Puzzle16,
			ss2Puzzle17, ss2Puzzle18, ss2Puzzle19, ss2Puzzle20 };

	
}
