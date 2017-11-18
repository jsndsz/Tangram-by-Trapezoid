package TangramPuzzle.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Helps in fetching the shapes for a Shape set.
 * 
 * @author phavannavar
 * 
 */
public class ShapeSet {
	/**
	 * chosen shape set
	 */
	int chosenShapeSet;

	/**
	 * shapeSet1Shapes : Coordinates instance
	 */
	Coordinates shapeSet1Shapes = new Coordinates();
	@SuppressWarnings("rawtypes")

	/**
	 * stores x-coordinates for all the shapes
	 */
	List shapeSetXCoordinates = new ArrayList();// stores all the Xcoordinates for the all the shapes
	@SuppressWarnings("rawtypes")
	/**
	 * stores y-coordinates for all the shapes
	 */
	List shapeSetYCoordinates = new ArrayList();// stores all the Ycoordinates for the all the shapes
	/**
	 * List of all shapes
	 */
	@SuppressWarnings("rawtypes")
	static List shapeSet = new ArrayList(); // Contains all the shapes
	/**
	 * Variable maintaing a count of shapes
	 */
	public static int numberOfShapes;

	public ShapeSet(int chosenSet) {
		// Represents the shapeSet chosen by the player

		this.chosenShapeSet = chosenSet;
		setShapeSet();
	}

	/**
	 * Default constructor for ShapeSet
	 */
	public ShapeSet() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	/**
	 * Add coordinates of each shape set to a list Draw all shapes for a chosen
	 * shape set
	 */
	public void setShapeSet() {
		// Retrieves the coordinates of the shapes from the Coordinates class
		this.shapeSetXCoordinates.addAll(shapeSet1Shapes.getShapeSetX(chosenShapeSet));
		this.shapeSetYCoordinates.addAll(shapeSet1Shapes.getShapeSetY(chosenShapeSet));

		// Draws all individual shapes for the chosen shapeSet
		shapeSet.clear();
		for (int i = 0; i < shapeSetXCoordinates.size(); i++) {
			int[] shapeXCoordinate = (int[]) shapeSetXCoordinates.get(i);
			int[] shapeYCoordinate = (int[]) shapeSetYCoordinates.get(i);
			Shape shape = new Shape(shapeXCoordinate, shapeYCoordinate);
			shapeSet.add(shape.createShape());
		}
	}

	@SuppressWarnings("rawtypes")
	/**
	 * Returns a shape set
	 * 
	 * @return List
	 */
	public List getShapeSet() {
		return this.shapeSet;
	}

	public void setterShapeSet(int selectedShapeSet) {
		chosenShapeSet = selectedShapeSet;
	}

}
