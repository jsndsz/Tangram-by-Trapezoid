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
}
