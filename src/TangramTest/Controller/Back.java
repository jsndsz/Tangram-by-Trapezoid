package TangramTest.Controller;

public class Back {
	CLayout cl = new CLayout();

	/*
	 * functionality to get to previous screen from the current screen takes
	 * input as the view you want to go to
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
		case 5:{
			cl.showView3PuzzleSet2();
		}

		}
	}
}
