package TangramTest.Model;

public class CatalogData {
	// coordinates to draw the pallette line
	public float lineX = 220;
	public float lineMinY = 70;
	public float lineMaxY = 700;

	// Snap points to snap the shapes to the pallette
	public int snapPoint = 220;
	public int snapRange = 50;

	// min range to move shape around the puzzle screen
	public int minXRange = 70;
	public int maxXRange = 950;
	public int minYRange = 100;
	public int maxYRange = 600;

	public static int screenSizeX = 1366;
	public static int screenSizeY = 768;

	// Reading files which contains the original coordinates for the puzzle
	public String shapeset1File="src/TangramTest/Resources/ShapeSet1.txt";
	public String shapeset2File="src/TangramTest/Resources/ShapeSet2.txt";
	public String PuzzleSet1="src/TangramTest/Resources/PuzzleSet1.txt";
	public String PuzzleSet2="src/TangramTest/Resources/PuzzleSet2.txt";
	int noOfShapesShapeSet1=7;
	int noOfShapesShapeSet2=11;
	int noOfShapesPuzzleSet1=10;
	int noOfShapesPuzzleSet2=10;
	// Puzzle Saved State Files
	public String ss1Puzzle1="src/TangramTest/Resources/ss1Puzzle1.ser";
	public String ss1Puzzle2="src/TangramTest/Resources/ss1Puzzle2.ser";
	public String ss1Puzzle3="src/TangramTest/Resources/ss1Puzzle3.ser";
	public String ss1Puzzle4="src/TangramTest/Resources/ss1Puzzle4.ser";
	public String ss1Puzzle5="src/TangramTest/Resources/ss1Puzzle5.ser";
	public String ss1Puzzle6="src/TangramTest/Resources/ss1Puzzle6.ser";
	public String ss1Puzzle7="src/TangramTest/Resources/ss1Puzzle7.ser";
	public String ss1Puzzle8="src/TangramTest/Resources/ss1Puzzle8.ser";
	public String ss1Puzzle9="src/TangramTest/Resources/ss1Puzzle9.ser";
	public String ss1Puzzle10="src/TangramTest/Resources/ss1Puzzle10.ser";
	
	public String ss2Puzzle11="src/TangramTest/Resources/ss2Puzzle11.ser";
	public String ss2Puzzle12="src/TangramTest/Resources/ss2Puzzle12.ser";
	public String ss2Puzzle13="src/TangramTest/Resources/ss2Puzzle13.ser";
	public String ss2Puzzle14="src/TangramTest/Resources/ss2Puzzle14.ser";
	public String ss2Puzzle15="src/TangramTest/Resources/ss2Puzzle15.ser";
	public String ss2Puzzle16="src/TangramTest/Resources/ss2Puzzle16.ser";
	public String ss2Puzzle17="src/TangramTest/Resources/ss2Puzzle17.ser";
	public String ss2Puzzle18="src/TangramTest/Resources/ss2Puzzle18.ser";
	public String ss2Puzzle19="src/TangramTest/Resources/ss2Puzzle19.ser";
	public String ss2Puzzle20="src/TangramTest/Resources/ss2Puzzle20.ser";
	
	public String[] ShapeSet1Files= {ss1Puzzle1,ss1Puzzle2,ss1Puzzle3,ss1Puzzle4,ss1Puzzle5,ss1Puzzle6,ss1Puzzle7,ss1Puzzle8,ss1Puzzle9,ss1Puzzle10};
	public String[] ShapeSet2Files= {ss2Puzzle11,ss2Puzzle12,ss2Puzzle13,ss2Puzzle14,ss2Puzzle15,ss2Puzzle16,ss2Puzzle17,ss2Puzzle18,ss2Puzzle19,ss2Puzzle20};
}
