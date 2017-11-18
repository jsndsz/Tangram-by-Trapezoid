package TangramPuzzle.Controller;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Creates a card layout and instantiates the first screen
 * 
 * @author sinamdar
 *
 */
public class main_class {
	CardLayout panelSwitch = new CardLayout();
	JFrame frame = new JFrame("Tangram Puzzle"); // Creating a Frame

	/**
	 * Method to retrieve the frame
	 * 
	 * @return a Frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CLayout cl = new CLayout();
				cl.firstScreen();
			}
		});

	}
}
