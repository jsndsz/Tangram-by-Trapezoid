package TangramPuzzle.Controller;

import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import TangramPuzzle.Model.ControllerState;

/**
 * Flip class implements flip functionality
 * FlipLeft,FlipRight,FlipUp,FlipDown
 * @author jdsouza
 *
 */

public class Flip {

	static Polygon activeShape;
	static ControllerState controller = new ControllerState();



	/**
	 * Implementation for flip right
	 */
	public static void flipRight() {

		activeShape = controller.getActiveShape();
		JPanel view4 = Move.getView();

		Undo.stackUndo(activeShape);

		int allx[] = activeShape.xpoints;
		int ally[] = activeShape.ypoints;

		int newx[] = new int[allx.length];

		int xmax = 0;
		int counter = 0, xmaxCount = 0;

		for (int i : allx) {

			if (i > xmax) {
				xmax = i;
				xmaxCount = counter;
			}
			counter += 1;
		}

		counter = 0;
		for (int i : allx) {
			if (counter != xmaxCount) {
				newx[counter] = 2 * xmax - i;
			} else {
				newx[counter] = xmax;
			}
			counter += 1;
		}

		Undo.stackUndo(activeShape);
		
		for(int i=0;i<activeShape.ypoints.length;i++) {
			Move.xMap.put(i, (double) newx[i]);
			Move.yMap.put(i,(double) ally[i]);
		}
		activeShape.xpoints = newx;
		activeShape.invalidate();
		
		view4.repaint();

	}

	/**
	 * Implementation for flip Left
	 */
	public static void flipLeft() {

		activeShape = controller.getActiveShape();
		JPanel view4 = Move.getView();

		int allx[] = activeShape.xpoints;
		int ally[] = activeShape.ypoints;

		int newx[] = new int[allx.length];
		int xmin = 99999;
		int counter = 0, xminCount = 0;

		for (int i : allx) {

			if (i < xmin) {
				xmin = i;
				xminCount = counter;
			}
			counter += 1;
		}

		counter = 0;
		for (int i : allx) {
			if (counter != xminCount) {
				newx[counter] = 2 * xmin - i;
			} else {
				newx[counter] = xmin;
			}
			counter += 1;
		}

		Undo.stackUndo(activeShape);
		for(int i=0;i<activeShape.ypoints.length;i++) {
			Move.xMap.put(i, (double) newx[i]);
			Move.yMap.put(i,(double) ally[i]);
		}
		activeShape.xpoints = newx;
		activeShape.invalidate();
		

		view4.repaint();

	}

	/**
	 * Implementation for flip Up
	 */
	public static void flipUp() {

		activeShape = controller.getActiveShape();
		JPanel view4 = Move.getView();

		int allx[] = activeShape.xpoints;
		int ally[] = activeShape.ypoints;

		int newy[] = new int[ally.length];
		int ymin = 99999;
		int counter = 0, yminCount = 0;

		for (int i : ally) {

			if (i < ymin) {
				ymin = i;
				yminCount = counter;
			}
			counter += 1;
		}

		counter = 0;
		for (int i : ally) {
			if (counter != yminCount) {
				newy[counter] = 2 * ymin - i;
			} else {
				newy[counter] = ymin;
			}
			counter += 1;
		}

		Undo.stackUndo(activeShape);
		for(int i=0;i<activeShape.ypoints.length;i++) {
			Move.xMap.put(i, (double) allx[i]);
			Move.yMap.put(i,(double) newy[i]);
		}
		activeShape.ypoints = newy;
		activeShape.invalidate();
	

		view4.repaint();

	}

	/**
	 * Implementation for flip Down
	 */
	public static void flipDown() {

		activeShape = controller.getActiveShape();

		JPanel view4 = Move.getView();
		int allx[] = activeShape.xpoints;
		int ally[] = activeShape.ypoints;

		int newy[] = new int[ally.length];
		int ymax = 0;
		int counter = 0, ymaxCount = 0;

		for (int i : ally) {

			if (i > ymax) {
				ymax = i;
				ymaxCount = counter;
			}
			counter += 1;
		}

		counter = 0;
		for (int i : ally) {
			if (counter != ymaxCount) {
				newy[counter] = 2 * ymax - i;
			} else {
				newy[counter] = ymax;
			}
			counter += 1;
		}

		Undo.stackUndo(activeShape);
		for(int i=0;i<activeShape.ypoints.length;i++) {
			Move.xMap.put(i, (double) allx[i]);
			Move.yMap.put(i,(double) newy[i]);
		}
		activeShape.ypoints = newy;
		activeShape.invalidate();
		
		view4.repaint();

	}

}
