package TangramTest.Controller;

import java.awt.CardLayout;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import TangramTest.Model.CatalogData;
import TangramTest.View.PuzzleSolveScreen;

public class SolveScreenController {

	// Polygon variable to identify selected shape from the palette
	private static Polygon dragShape; 
	// To capture the last location of the Selected shape
	private static Point lastLocation; 
	
	// to iterate overs the palette shape to identify the selected shape
	private List<Polygon> myPolygons = new ArrayList<Polygon>(); 
	CardLayout cardLayout;
	JPanel panelCLayout;
	JPanel view4;
	private int xLast;
	private Rectangle rr = new Rectangle();
	PuzzleSolveScreen puzzleScreen;
	CatalogData dataSet = new CatalogData();

	// Constructor Sets up the Fourth View of the Puzzle
	public SolveScreenController(CardLayout cl, JPanel previousLayout, JPanel view, PuzzleSolveScreen ps) {
		cardLayout = cl;
		panelCLayout = previousLayout;
		panelCLayout.add(view, "4");
		cardLayout.show(panelCLayout, "4");
		view4 = view;
		puzzleScreen = ps;

	}

	// Captures the event listeners for shapes in the Palette
	public void drag() {

		view4.addMouseListener(new MyMouseListener());
		view4.addMouseMotionListener(new MyMouseMotionListener());
	}

	// Action for mouse Listeners
	class MyMouseListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			myPolygons = (List<Polygon>) puzzleScreen.getShapes();
			for (Polygon p : myPolygons) {
				if (p.contains(e.getPoint())) {
					dragShape = p;
					lastLocation = e.getPoint();
					rr = p.getBounds();
				}
			}
		}

		public void mouseReleased(MouseEvent e) {
			try {
				if (Math.abs(xLast - dataSet.snapPoint) < dataSet.snapRange) {

					dragShape.translate(-((int) (rr.getWidth() - Math.abs(xLast - dataSet.snapPoint)) + 20), 0);
					view4.repaint();
				}
			} catch (NullPointerException ex) {

			}
			dragShape = null;
			lastLocation = null;
		}
	}

	class MyMouseMotionListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			if (dragShape != null) {
				if (e.getX() > dataSet.minXRange && e.getX() < dataSet.maxXRange && e.getY() > dataSet.minYRange
						&& e.getY() < dataSet.maxYRange) {
					dragShape.translate(e.getX() - lastLocation.x, e.getY() - lastLocation.y);
					lastLocation = e.getPoint();
					xLast = e.getX();
					view4.repaint();
				}
			}

		}
	}
}
