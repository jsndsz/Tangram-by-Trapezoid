package TangramTest.Controller;

public class Reset {
	public boolean resetValue = false;
	int chosenPuzzle;

	// constructor
	public Reset(int chosenPuz) {
		chosenPuzzle = chosenPuz;
	}

	// Resets the puzzle to initial state
	public void resetPuzzle() {
		CLayout cl = new CLayout();
		cl.showView4(chosenPuzzle);
	}

}
