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
	public static int screenSizeY = 730;
}
