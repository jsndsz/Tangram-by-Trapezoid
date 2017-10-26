package TangramTest.Model;

import java.util.ArrayList;
import java.util.List;

public class ShapeSet {
	int chosenShapeSet;
	Coordinates shapeSet1Shapes = new Coordinates();
	@SuppressWarnings("rawtypes")
	List shapeSetXCoordinates = new ArrayList();// stores all the Xcoordinates for the all the shapes
	@SuppressWarnings("rawtypes")
	List shapeSetYCoordinates=new ArrayList();// stores all the Ycoordinates for the all the shapes
	@SuppressWarnings("rawtypes")
	List shapeSet=new ArrayList(); // Contains all the shapes
	
	public ShapeSet(int chosenSet)
	{
		//Represents the shapeSet chosen by the player
		this.chosenShapeSet=chosenSet;
		setShapeSet();
	}
	
	@SuppressWarnings("unchecked")
	public void setShapeSet()
	{
		// Retrieves the coordinates of the shapes from the Coordinates class
		this.shapeSetXCoordinates.addAll(shapeSet1Shapes.getShapeSetX(chosenShapeSet));
		this.shapeSetYCoordinates.addAll(shapeSet1Shapes.getShapeSetY(chosenShapeSet));
		
		//Draws all individual shapes for the chosen shapeSet
		for (int i=0;i<shapeSetXCoordinates.size();i++)
		{
			int[] shapeXCoordinate=(int[]) shapeSetXCoordinates.get(i);
			int[] shapeYCoordinate=(int[]) shapeSetYCoordinates.get(i);
			Shape shape=new Shape(shapeXCoordinate,shapeYCoordinate);
			shapeSet.add(shape.createShape());			
		}
	}
	
	@SuppressWarnings("rawtypes")
	public List getShapeSet()
	{
		return shapeSet;
	}
	//additional 
	public void setterShapeSet(int selectedShapeSet)
	{
		chosenShapeSet=selectedShapeSet;
	}
	

}
