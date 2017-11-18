package TangramPuzzle.Controller;

import java.awt.Point;
import java.awt.Polygon;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import TangramPuzzle.Model.ControllerState;

/**
 * This class implements the Rotate function
 * @author phavannavar
 *
 */

public class Rotate {
/**
	 * variables to store the angles in radian
	 */
	public static double angleRadpositive = Math.toRadians(15);
	public static double angleRadnegative = Math.toRadians(345);
	static Undo undo = new Undo();
	static ControllerState controller = new ControllerState();


	/**
	 * This method implements the rotateLeft functionality
	 */
	public static void rotateLeft() {
		Polygon activeShape = controller.getActiveShape();
	
		JPanel view4 = Move.getView();

		double gx = 0;
		double gy = 0;

		double costheta = Math.cos(angleRadnegative);
		double sintheta = Math.sin(angleRadnegative);

		double allx[] = new double[Move.xMap.size()];
		double ally[] = new double[Move.yMap.size()];

		for (int i = 0; i < Move.xMap.size(); i++) {
			allx[i] = Move.xMap.get(i);
		}

		for (int i = 0; i < Move.yMap.size(); i++) {
			ally[i] = Move.yMap.get(i);
		}

		double a = 0, b = 0;

		for (int i = 0; i < allx.length; i++) {
			a += allx[i];
			b += ally[i];
		}
		gx = a / allx.length;
		gy = b / ally.length; // this finds the centroid of the polygon (gx,gy)
		int[] newx = new int[allx.length];
		int[] newy = new int[ally.length];

		for (int i = 0; i < allx.length; i++) {
			double dx = allx[i] - gx;
			double dy = ally[i] - gy;
			double dx1;
			double dy1;
			double temp;
			temp = (dx * costheta) - (dy * sintheta);
			dy1 = Math.ceil((dy * costheta) + (dx * sintheta));
			dx1 = Math.ceil(temp);
			Move.xMap.put(i, (gx + dx1));
			Move.yMap.put(i, (gy + dy1));
			newx[i] = (int) (gx + dx1);
			newy[i] = (int) (gy + dy1);
		}

		undo.stackUndo(activeShape);
		activeShape.xpoints = newx;
		activeShape.ypoints = newy;
		activeShape.invalidate();
		view4.repaint();

	}

	/**
	 * This method implements the rotateRight functionality
	 */
	public static void rotateRight() {
		Polygon activeShape = controller.getActiveShape();

		JPanel view4 = Move.getView();

		double gx = 0;
		double gy = 0;

		double costheta = Math.cos(angleRadpositive);
		double sintheta = Math.sin(angleRadpositive);

		double allx[] = new double[Move.xMap.size()];
		double ally[] = new double[Move.yMap.size()];
		for (int i = 0; i < Move.getXMap().size(); i++) {
			allx[i] = Move.xMap.get(i);
		}

		for (int i = 0; i < Move.getYMap().size(); i++) {
			ally[i] = Move.yMap.get(i);
		}

		double a = 0, b = 0;

		for (int i = 0; i < allx.length; i++) {
			a += allx[i];
			b += ally[i];
		}
		gx = a / allx.length;
		gy = b / ally.length;

		int[] newx = new int[allx.length];
		int[] newy = new int[ally.length];
		for (int i = 0; i < allx.length; i++) {
			double dx = allx[i] - gx;
			double dy = ally[i] - gy;
			double dx1;
			double dy1;
			double temp;
			temp = (dx * costheta) - (dy * sintheta);
			dy1 = Math.ceil((dy * costheta) + (dx * sintheta));
			dx1 = Math.ceil(temp);
			Move.xMap.put(i, (gx + dx1));
			Move.yMap.put(i, (gy + dy1));
			newx[i] = (int) (gx + dx1);
			newy[i] = (int) (gy + dy1);
		}

		undo.stackUndo(activeShape);
		activeShape.xpoints = newx;
		activeShape.ypoints = newy;

		activeShape.invalidate();
		view4.repaint();

	}
}