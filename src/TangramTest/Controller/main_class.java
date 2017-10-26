package TangramTest.Controller;


import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class main_class {
	CardLayout panelSwitch = new CardLayout();
	JFrame frame = new JFrame("Tangram Puzzle"); // Creating a Frame

	// getter to return the Frame
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
