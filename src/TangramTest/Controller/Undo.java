package TangramPuzzle.Controller;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.JPanel;

import TangramPuzzle.Model.ControllerState;

/**
 * This class implementes the Undo functionality.
 * @author jdsouza
 *
 */
public class Undo {

;
	static Redo redo = new Redo();
	static ControllerState controller = new ControllerState();

	Polygon p;
	int[] xvalues;
	int[] yvalues;
	static int[] trailX;
	static int[] trailY;
	
 /**
		  * Method to calculate centroid
		  * @param newx : x-coordinates
		  * @param newy : y-coordinates
		  * @return list of integers 
		  */

	public static List<Integer> centroid(int[] newx, int[] newy) {
		int x = 0;
		int y = 0;
		List<Integer> p = new ArrayList<Integer>();
		for (int i = 0; i < newx.length; i++) {
			x += newx[i];
			y += newy[i];

		}
		p.add((int) (x / newx.length));
		p.add((int) (y / newy.length));

		return p;
	}

/**
		 * This method stores the state of the polygon
		 * @param activeShape shape is set here
		 */

	public static void stackUndo(Polygon activeShape) {
		try {
		trailX = activeShape.xpoints.clone();
		trailY = activeShape.ypoints.clone();	
		controller.setUndoStack(trailX, trailY, activeShape);
		} catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
	}

/**
		    * This method retrieves the state of a polygon
		    */

	public void actionUndone() {
		Stack<int []>undoStackx = controller.getUndoStack();
		if (!undoStackx.isEmpty()) {
			
			xvalues = controller.getUndoX();
			yvalues = controller.getUndoY();
			JPanel view4 = Move.getView();
			
			Polygon dragShape = controller.getUndoPolygon();
			redo.stackRedo(dragShape);
			dragShape.xpoints = xvalues;
			dragShape.ypoints = yvalues;
			dragShape.invalidate();
			view4.repaint();

		}
	}

}