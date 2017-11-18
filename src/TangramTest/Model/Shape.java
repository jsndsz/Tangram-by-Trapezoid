package TangramPuzzle.Model;

import java.awt.*;

/**
 * This class helps in making all the shapes used in the application.
 * 
 * @author jdsouza
 * 
 */

public class Shape {
	/**
	 * array to store the x and y coordinates
	 */
	int[] xCoordinates;
	int[] yCoordinates;

	/**
	 * Polygon object
	 */
	Polygon p = new Polygon();

	/**
	 * Constructor for Shape
	 * 
	 * @param xCoordinates
	 *            of the shape to be drawn
	 * @param yCoordinates
	 *            of the shape to be drawn
	 */

	public Shape(int[] xCoordinates, int[] yCoordinates) {
		this.xCoordinates = xCoordinates;
		this.yCoordinates = yCoordinates;
	}

	/**
	 * Method to draw the shapes given the x and y coordinates
	 * 
	 * @return Polygon
	 */
	public Polygon createShape() {
		p.reset();
		if (this.xCoordinates.length != this.yCoordinates.length || xCoordinates.length < 3
				|| yCoordinates.length < 3) {
			return p;
		} else {
			p = new Polygon(this.xCoordinates, this.yCoordinates, this.xCoordinates.length);
			return p;
		}
	}
}