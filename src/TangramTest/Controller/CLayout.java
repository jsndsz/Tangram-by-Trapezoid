package TangramPuzzle.Controller;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import TangramPuzzle.Model.CatalogData;
import TangramPuzzle.View.PuzzleSetScreen;
import TangramPuzzle.View.PuzzleSetScreen2;
import TangramPuzzle.View.PuzzleSolveScreen;
import TangramPuzzle.View.ShapeSetSelection;
import TangramPuzzle.View.StartClass;

@SuppressWarnings("serial")
/**
 * CLayout : class implementing card layout for the different views of the application
 * @author sinamdar
 *
 */
public class CLayout extends JFrame {
	/**
	 * Creating CardLayout to manage the views of the Puzzle
	 */
	static CardLayout cl = new CardLayout();

	/**
	 * panel that is used in the Card Layout to add panels
	 */
	static JPanel panelCLayout = new JPanel();

	/**
	 * instantiating the StartClass
	 */
	StartClass View1 = new StartClass(); // instantiating the StartClass

	JPanel view1 = View1.drawStartScreen();

	CatalogData metaData = new CatalogData();

	/**
	 * Adds the Initial View of the Puzzle to the CardLayout
	 */
	public void setJPanel() {
		panelCLayout.setLayout(cl);
		panelCLayout.add(view1, "1");
	}

		/**
	 * Set up the First Screen of the Puzzle
	 */
	public void firstScreen() {
		main_class n = new main_class();
		JFrame frame = n.getFrame();
		setJPanel();
		frame.add(panelCLayout);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(metaData.screenSizeX, metaData.screenSizeY);
		frame.setVisible(true);
	}

	/**
	 * Set up and display second screen of the puzzle
	 */
	public void showView2() {
		ShapeSetSelection View2 = new ShapeSetSelection();
		JPanel view2 = View2.drawShapeSetSelection();
		panelCLayout.add(view2, "2");
		cl.show(panelCLayout, "2");

	}

	/**
	 * Set up and display third screen of the puzzle
	 */
	public void showView3PuzzleSet2() {
		PuzzleSetScreen2 View3 = new PuzzleSetScreen2();
		JPanel view3 = View3.drawPuzzleSetScreen2();
		panelCLayout.add(view3, "5");
		cl.show(panelCLayout, "5");
	}

	/**
	 * Display first view of the Puzzle
	 */
	public void showView1() {
		cl.show(panelCLayout, "1");
	}

	/**
	 * Set up and Display third screen of the puzzle
	 */
	public void showView3() {
		PuzzleSetScreen View3 = new PuzzleSetScreen();
		JPanel view3 = View3.drawPuzzleSetScreen();
		panelCLayout.add(view3, "3");
		cl.show(panelCLayout, "3");
	}

/**
	 * Set up and display fourths screen of the puzzle
	 * @param puzzleNumber puzz number
	 */
	public void showView4(int puzzleNumber) {
		PuzzleSolveScreen View4 = new PuzzleSolveScreen();
		View4.setChosenPuzzle(puzzleNumber);
		JPanel view4 = View4.drawPuzzleSolveScreen();
		Move ssc = new Move(cl, panelCLayout, view4, View4);
		ssc.drag();
	}

	/**
	 * Exit the application
	 */
	public void exitApplication() {
		System.exit(0);
	}
}
