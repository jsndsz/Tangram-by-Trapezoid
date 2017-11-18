package TangramPuzzle.Controller;

/**
 * Controller to go Back to the previous screen
 * @author cpai
 *
 */
public class Back {
	CLayout cl = new CLayout();

	/**
	 * Method to go to the previous screen from the current screen
	 * @param viewChoice : screen number to go to
	 */
	public void getBack(int viewChoice) {
		switch (viewChoice) {
		case 1: {
			cl.showView1();
			break;
		}
		case 2: {
			cl.showView2();
			break;
		}
		case 3: {
			cl.showView3();
			break;
		}
		case 5: {
			cl.showView3PuzzleSet2();
		}

		}
	}
}
