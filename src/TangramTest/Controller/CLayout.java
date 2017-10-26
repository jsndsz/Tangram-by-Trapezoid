package TangramTest.Controller;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import TangramTest.Model.CatalogData;
import TangramTest.View.PuzzleSetScreen;
import TangramTest.View.PuzzleSetScreen2;
import TangramTest.View.PuzzleSolveScreen;
import TangramTest.View.ShapeSetSelection;
import TangramTest.View.StartClass;

@SuppressWarnings("serial")
public class CLayout extends JFrame {
	// Creating CardLayout to manage the views of the Puzzle
	static CardLayout cl = new CardLayout();

	// panel array that is used in the Card Layout to add panels
	static JPanel panelCLayout = new JPanel();

	StartClass View1 = new StartClass(); // instantiating the StartClass
	JPanel view1 = View1.drawStartScreen();
	
	CatalogData metaData = new CatalogData();

	// Adds the Initial View of the Puzzle to the CardLayout
	public void setJPanel() {
		panelCLayout.setLayout(cl);
		panelCLayout.add(view1, "1");
	}

	// Set ups the First Screen of the Puzzle
	public void firstScreen() {
		main_class n = new main_class();
		JFrame frame = n.getFrame();
		setJPanel();
		frame.add(panelCLayout);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(CatalogData.screenSizeX, CatalogData.screenSizeY);
		frame.setVisible(true);
	}

	// Set ups and Displays the Second Screen of the Puzzle
	public void showView2() {
		ShapeSetSelection View2 = new ShapeSetSelection();
		JPanel view2 = View2.drawShapeSetSelection();
		panelCLayout.add(view2, "2");
		cl.show(panelCLayout, "2");

	}
	
	public void showView3PuzzleSet2()
	{
		PuzzleSetScreen2 View3 = new PuzzleSetScreen2();
		JPanel view3 = View3.drawPuzzleSetScreen2();
		panelCLayout.add(view3, "5");
		cl.show(panelCLayout, "5");
	}

	// Displays the First View of the Puzzle
	public void showView1() {
		cl.show(panelCLayout, "1");
	}

	// Set ups and Displays the Third Screen of the Puzzle
	public void showView3() {
		PuzzleSetScreen View3 = new PuzzleSetScreen();
		JPanel view3 = View3.drawPuzzleSetScreen();
		panelCLayout.add(view3, "3");
		cl.show(panelCLayout, "3");
	}

	// Set ups and Displays the Fourth Screen of the Puzzle
	public void showView4(int puzzleNumber) {
		PuzzleSolveScreen View4 = new PuzzleSolveScreen();
		View4.setChosenPuzzle(puzzleNumber);
		JPanel view4 = View4.drawPuzzleSolveScreen();
		SolveScreenController ssc = new SolveScreenController(cl, panelCLayout, view4, View4);
		ssc.drag();
	}

	// Exits the Application
	public void exitApplication() {
		System.exit(0);
	}
}
