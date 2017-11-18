package TangramPuzzle.Controller;

import java.awt.CardLayout;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

import TangramPuzzle.Model.CatalogData;
import TangramPuzzle.Model.ControllerState;
import TangramPuzzle.Model.ShapeState;
import TangramPuzzle.View.PuzzleSolveScreen;

/**
 * This class captures and implements Mouse listeners
 * 
 * @author phavannavar
 *
 */

public class Move extends MouseAdapter {

	/**
	 * variable to identify the selected shape from the palette
	 */

	protected static Polygon dragShape;
	/**
	 * Captures the last location of the selected shape
	 */
	protected static Point lastLocation;
	protected static Point activeLocation;

	/**
	 * Shows the shape that was last selected
	 */

	public static Polygon activeShape;
	CardLayout cardLayout;
	JPanel panelCLayout;
	static JPanel view4;
	private int xLast;
	private Rectangle rr = new Rectangle();
	PuzzleSolveScreen puzzleScreen;
	CatalogData dataSet = new CatalogData();
	List<Polygon> myPolygons;
	SerializingPolygons sp = new SerializingPolygons();
	ShapeState shapestate = new ShapeState();
	ControllerState controller = new ControllerState();
	Flip flip;

	/**
	 * xMap and yMap store the intermediate values of x-coordinates and
	 * y-coordinates to avoid error factor
	 */
	static Map<Integer, Double> xMap = new HashMap<Integer, Double>();
	static Map<Integer, Double> yMap = new HashMap<Integer, Double>();

	/**
	 * Constructor : sets up the fourth view of the Puzzle
	 * 
	 * @param cl
	 *            : CardLayout object
	 * @param previousLayout
	 *            : JPanel
	 * @param view
	 *            : JPanel
	 * @param ps
	 *            : PuzzleSolveScreen
	 */
	public Move(CardLayout cl, JPanel previousLayout, JPanel view, PuzzleSolveScreen ps) {
		cardLayout = cl;
		panelCLayout = previousLayout;
		panelCLayout.add(view, "4");
		cardLayout.show(panelCLayout, "4");
		view4 = view;
		puzzleScreen = ps;

	}

	/**
	 * Captures the mouse events
	 */
	public void drag() {

		view4.addMouseListener(this);
		view4.addMouseMotionListener(this);
	}

	public static Map<Integer, Double> getXMap() {
		return xMap;
	}

	public static Map<Integer, Double> getYMap() {
		return yMap;
	}

	/**
	 * Returns the current view of the panel
	 * 
	 * @return a view
	 */
	public static JPanel getView() {
		return view4;
	}
	/**
	 * This methods captures mouse event captured for mouse being pressed
	 */
	public void mousePressed(MouseEvent e) {
		try {
			myPolygons = new ArrayList<Polygon>(shapestate.getShapeState().keySet());
			for (Polygon p : myPolygons) {

				if (p.contains(e.getPoint())) {
					dragShape = p;
					lastLocation = e.getPoint();
					rr = p.getBounds();
					controller.setActiveShape(dragShape);
					Undo.stackUndo(dragShape);
				}

			}
		} catch (Exception k) {
			k.printStackTrace();
		}
	}

	/**
	 * This methods captures mouse event captured for mouse being released
	 */
	public void mouseReleased(MouseEvent e) {
		try {
			PuzzleCompletion pc = new PuzzleCompletion();
			pc.checkPuzzleCompletion();

			boolean containsPolygon = pc.containsPolygonInSilhouette();
			boolean checkIntersection = pc.checkIntersection();
			if (containsPolygon == true && checkIntersection == false) {
				pc.displaySuccess();
				checkIntersection = false;

			}
			sp.SerializingPolygons(dragShape);
			xMap.clear();
			yMap.clear();

			int[] ax = dragShape.xpoints;
			int[] ay = dragShape.ypoints;

			for (int i = 0; i < ax.length; i++) {
				xMap.put(i, (double) ax[i]);
				yMap.put(i, (double) ay[i]);
			}

			if (Math.abs(xLast - dataSet.snapPoint) < dataSet.snapRange) {

				dragShape.translate(-((int) (rr.getWidth() - Math.abs(xLast - dataSet.snapPoint)) + 20), 0);
				view4.repaint();
				dragShape.invalidate();
			}
		} catch (NullPointerException ex) {
		}

		dragShape = null;

	}

	public void mouseDragged(MouseEvent e) {

		if (dragShape != null) {
			if (e.getX() > dataSet.minXRange && e.getX() < dataSet.maxXRange && e.getY() > dataSet.minYRange
					&& e.getY() < dataSet.maxYRange) {

				dragShape.translate(e.getX() - lastLocation.x, e.getY() - lastLocation.y);
				lastLocation = e.getPoint();
				xLast = e.getX();
				dragShape.invalidate();

				view4.repaint();

			}
		}

	}

}
