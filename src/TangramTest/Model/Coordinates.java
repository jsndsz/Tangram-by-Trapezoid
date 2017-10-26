package TangramTest.Model;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {

	List<int[]> ListShapeSet1x = new ArrayList<int[]>();
	List<int[]> ListShapeSet1y = new ArrayList<int[]>();
	List<int[]> ListShapeSet2x = new ArrayList<int[]>();
	List<int[]> ListShapeSet2y = new ArrayList<int[]>();

	List<int[]> puzzleSet1x = new ArrayList<int[]>();
	List<int[]> puzzleSet1y = new ArrayList<int[]>();
	List<int[]> puzzleSet2x = new ArrayList<int[]>();
	List<int[]> puzzleSet2y = new ArrayList<int[]>();

	final int addingPoint = 20;

	public Coordinates() {
		setShapeSet1();
		setShapeSet2();
		setPuzzleSet1();
		setPuzzleSet2();
	}

	private void setShapeSet1() {
		int initialShapeSet1x = 50;
		int initialShapeSet1y = 150;
		final int sqrt2 = (int) (Math.sqrt(2.0) * addingPoint);

		int[] shapeSet1x = { initialShapeSet1x, initialShapeSet1x, initialShapeSet1x, initialShapeSet1x,
				initialShapeSet1x, initialShapeSet1x, initialShapeSet1x };
	
		int[] shapeSet1y = { initialShapeSet1y, initialShapeSet1y + 100, initialShapeSet1y + 150,
				initialShapeSet1y + 250, initialShapeSet1y + 330, initialShapeSet1y + 400, initialShapeSet1y + 470 };

		// sqaure shape1
		final int shapeSet11x[] = { initialShapeSet1x, initialShapeSet1x + addingPoint,
				initialShapeSet1x + 2 * addingPoint, initialShapeSet1x + addingPoint };
		final int shapeSet11y[] = { initialShapeSet1y, initialShapeSet1y - addingPoint, initialShapeSet1y,
				initialShapeSet1y + addingPoint };

		// Right Angled Triangle1 shape2
		final int shapeSet12x[] = { shapeSet1x[1], shapeSet1x[1] + 2 * addingPoint, shapeSet1x[1] + 2 * addingPoint };
		final int shapeSet12y[] = { shapeSet1y[1], shapeSet1y[1], shapeSet1y[1] - 2 * addingPoint };

		// Parralelogram shape3
		final int shapeSet13x[] = { shapeSet1x[2], shapeSet1x[2] + sqrt2, shapeSet1x[2] + 2 * sqrt2,
				shapeSet1x[2] + sqrt2 };
		final int shapeSet13y[] = { shapeSet1y[2], shapeSet1y[2], shapeSet1y[2] + sqrt2, shapeSet1y[2] + sqrt2 };

		// Large triangle1 shape4
		final int shapeSet14x[] = { shapeSet1x[3], shapeSet1x[3] + 2 * addingPoint, shapeSet1x[3] + 4 * addingPoint };
		final int shapeSet14y[] = { shapeSet1y[3], shapeSet1y[3] - 2 * addingPoint, shapeSet1y[3] };

		// Large triangle2 shape5
		final int shapeSet15x[] = { shapeSet1x[4], shapeSet1x[4] + 2 * addingPoint, shapeSet1x[4] + 4 * addingPoint };
		final int shapeSet15y[] = { shapeSet1y[4], shapeSet1y[4] - 2 * addingPoint, shapeSet1y[4] };

		// small triangle1 shape6
		final int shapeSet16x[] = { shapeSet1x[5], shapeSet1x[5] + addingPoint, shapeSet1x[5] + addingPoint };
		final int shapeSet16y[] = { shapeSet1y[5], shapeSet1y[5] - addingPoint, shapeSet1y[5] + addingPoint };

		// Small triangle2 shape7
		final int shapeSet17x[] = { shapeSet1x[6], shapeSet1x[6] + addingPoint, shapeSet1x[6] + addingPoint };
		final int shapeSet17y[] = { shapeSet1y[6], shapeSet1y[6] - addingPoint, shapeSet1y[6] + addingPoint };

		// Adding the x coordinates of the shapes to the Array List
		ListShapeSet1x.add(shapeSet11x);
		ListShapeSet1x.add(shapeSet12x);
		ListShapeSet1x.add(shapeSet13x);
		ListShapeSet1x.add(shapeSet14x);
		ListShapeSet1x.add(shapeSet15x);
		ListShapeSet1x.add(shapeSet16x);
		ListShapeSet1x.add(shapeSet17x);

		// Adding the y coordinates of the shapes to the Array List
		ListShapeSet1y.add(shapeSet11y);
		ListShapeSet1y.add(shapeSet12y);
		ListShapeSet1y.add(shapeSet13y);
		ListShapeSet1y.add(shapeSet14y);
		ListShapeSet1y.add(shapeSet15y);
		ListShapeSet1y.add(shapeSet16y);
		ListShapeSet1y.add(shapeSet17y);

	}

	private void setShapeSet2() {
      
		int addingPoint = 10;
	      int initialShapeSet2x = 20;
	       int initialShapeSet2y = 130;
	       
	       int[] shapeSet2x = { initialShapeSet2x, initialShapeSet2x, initialShapeSet2x , initialShapeSet2x , initialShapeSet2x , initialShapeSet2x, initialShapeSet2x , initialShapeSet2x ,initialShapeSet2x ,initialShapeSet2x ,initialShapeSet2x  };
	       int[] shapeSet2y = { initialShapeSet2y, initialShapeSet2y + 20, initialShapeSet2y + 60, initialShapeSet2y + 140, initialShapeSet2y + 200, initialShapeSet2y + 280, initialShapeSet2y + 320,initialShapeSet2y + 370,initialShapeSet2y + 420,initialShapeSet2y + 490,initialShapeSet2y + 550 };
	      final int shapeSet21x[] = { initialShapeSet2x, initialShapeSet2x + 4*addingPoint, initialShapeSet2x + 12*addingPoint};
	      final int shapeSet21y[] = { initialShapeSet2y, initialShapeSet2y-4*addingPoint, initialShapeSet2y};

	      
	      final int shapeSet22x[] = { shapeSet2x[1], shapeSet2x[1] + 6*addingPoint, shapeSet2x[1]+4*addingPoint };
	      final int shapeSet22y[] = { shapeSet2y[1], shapeSet2y[1], shapeSet2y[1] + 2 * addingPoint };

	   
	      final int shapeSet23x[] = { shapeSet2x[2], shapeSet2x[2]+6*addingPoint, shapeSet2x[2] + 6*addingPoint, shapeSet2x[2] + 3*addingPoint };
	      final int shapeSet23y[] = { shapeSet2y[2], shapeSet2y[2], shapeSet2y[2] + 6 *addingPoint, shapeSet2y[2] + 6*addingPoint };

	      final int shapeSet24x[] = { shapeSet2x[3], shapeSet2x[3] + 6 *addingPoint, shapeSet2x[3]  };
	      final int shapeSet24y[] = { shapeSet2y[3], shapeSet2y[3], shapeSet2y[3] + 3 * addingPoint };

	     
	      final int shapeSet25x[] = { shapeSet2x[4], shapeSet2x[4] + addingPoint, shapeSet2x[4]+4*addingPoint };
	      final int shapeSet25y[] = { shapeSet2y[4], shapeSet2y[4] - 2*addingPoint, shapeSet2y[4] + 4*addingPoint };

	      final int shapeSet26x[] = { shapeSet2x[5], shapeSet2x[5] + 2*addingPoint, shapeSet2x[5] + 6*addingPoint };
	      final int shapeSet26y[] = { shapeSet2y[5], shapeSet2y[5] - 4*addingPoint, shapeSet2y[5] };

	      final int shapeSet27x[] = { shapeSet2x[6], shapeSet2x[6] + 2*addingPoint, shapeSet2x[6]+6*addingPoint };
	      final int shapeSet27y[] = { shapeSet2y[6], shapeSet2y[6] - 2*addingPoint, shapeSet2y[6]};
	      
	      final int shapeSet28x[] = { shapeSet2x[7], shapeSet2x[7] + 2*addingPoint, shapeSet2x[7]+8*addingPoint, shapeSet2x[7]+8*addingPoint, shapeSet2x[7]+2*addingPoint };
	      final int shapeSet28y[] = { shapeSet2y[7], shapeSet2y[7] - 2*addingPoint, shapeSet2y[7] - 2*addingPoint, shapeSet2y[7] +addingPoint, shapeSet2y[7] +addingPoint};      
	      
	      final int shapeSet29x[] = { shapeSet2x[8], shapeSet2x[8] + 6*addingPoint, shapeSet2x[8]+6*addingPoint };
	      final int shapeSet29y[] = { shapeSet2y[8], shapeSet2y[8], shapeSet2y[8]+ 3*addingPoint};
	      
	      final int shapeSet210x[] = { shapeSet2x[9], shapeSet2x[9] + 2*addingPoint, shapeSet2x[9]+6*addingPoint };
	      final int shapeSet210y[] = { shapeSet2y[9], shapeSet2y[9] - 2*addingPoint, shapeSet2y[9]};   
	      
	      final int shapeSet211x[] = { shapeSet2x[10], shapeSet2x[10] + 6*addingPoint, shapeSet2x[10]+8*addingPoint, shapeSet2x[10]+6*addingPoint };
	      final int shapeSet211y[] = { shapeSet2y[10], shapeSet2y[10] - 3*addingPoint, shapeSet2y[10] - 2*addingPoint, shapeSet2y[10] };
	      
	   // Adding the x coordinates of the shapes to the Array List
			ListShapeSet2x.add(shapeSet21x);
			ListShapeSet2x.add(shapeSet22x);
			ListShapeSet2x.add(shapeSet23x);
			ListShapeSet2x.add(shapeSet24x);
			ListShapeSet2x.add(shapeSet25x);
			ListShapeSet2x.add(shapeSet26x);
			ListShapeSet2x.add(shapeSet27x);
			ListShapeSet2x.add(shapeSet28x);
			ListShapeSet2x.add(shapeSet29x);
			ListShapeSet2x.add(shapeSet210x);
			ListShapeSet2x.add(shapeSet211x);

			// Adding the y coordinates of the shapes to the Array List
			ListShapeSet2y.add(shapeSet21y);
			ListShapeSet2y.add(shapeSet22y);
			ListShapeSet2y.add(shapeSet23y);
			ListShapeSet2y.add(shapeSet24y);
			ListShapeSet2y.add(shapeSet25y);
			ListShapeSet2y.add(shapeSet26y);
			ListShapeSet2y.add(shapeSet27y);
			ListShapeSet2y.add(shapeSet28y);
			ListShapeSet2y.add(shapeSet29y);
			ListShapeSet2y.add(shapeSet210y);
			ListShapeSet2y.add(shapeSet211y);
		
		
	}
	
	// Getter Method for all the XCoordinates of the ShapeSet
	public List<int[]> getShapeSetX(int shapeSetNumber) {
		if (shapeSetNumber == 1)
			return ListShapeSet1x;
		else if (shapeSetNumber == 2)
			return ListShapeSet2x;

		return null;
	}

	// Getter Method for all the YCoordinates of the ShapeSet
	public List<int[]> getShapeSetY(int shapeSetNumber) {
		if (shapeSetNumber == 1)
			return ListShapeSet1y;
		else if (shapeSetNumber == 2)
			return ListShapeSet2y;

		return null;
	}

	// Sets all the Coordiantes of the PuzzleSet1
	public void setPuzzleSet1() {
		int x = 550, y = 350;
		final int sqrt2 = (int) (Math.sqrt(2.0) * addingPoint);

		int[] puzzle1x = { x, x + 2 * addingPoint, x + 2 * sqrt2, x + addingPoint + 2 * sqrt2,
				x + 2 * addingPoint + 2 * sqrt2, x + 2 * addingPoint + 3 * sqrt2, x + 2 * addingPoint + 4 * sqrt2,
				x + 2 * addingPoint + 4 * sqrt2, x + 4 * addingPoint + 4 * sqrt2, x + 2 * addingPoint + 4 * sqrt2,
				x + 2 * addingPoint + 3 * sqrt2, x + 2 * addingPoint + 2 * sqrt2, x + 2 * addingPoint + 2 * sqrt2,
				x + 4 * addingPoint, x + 3 * addingPoint, x + 2 * addingPoint };
		int[] puzzle1y = { y, y - 2 * addingPoint, y - 2 * addingPoint, y - 3 * addingPoint, y - 2 * addingPoint,
				y - 2 * addingPoint, y - 2 * addingPoint - sqrt2, y - 4 * addingPoint, y - 2 * addingPoint,
				y - 2 * addingPoint, y - 2 * addingPoint + sqrt2, y - 2 * addingPoint + sqrt2,
				y - 2 * addingPoint + 2 * sqrt2, y, y + addingPoint, y };

		int[] puzzle2x = { x, x + addingPoint, x + 2 * addingPoint, x + 2 * addingPoint, x + 4 * addingPoint,
				x + 4 * addingPoint, x + 5 * addingPoint, x + 7 * addingPoint, x + 6 * addingPoint,
				x + 4 * addingPoint - 2 * sqrt2, x + 2 * addingPoint, x + 2 * addingPoint, x + 2 * addingPoint - sqrt2,
				x + addingPoint, x };
		int[] puzzle2y = { y, y + addingPoint, y, y + 2 * addingPoint, y + 4 * addingPoint,
				y + 4 * addingPoint + 2 * sqrt2, y + 3 * addingPoint + 2 * sqrt2, y + 3 * addingPoint + 2 * sqrt2,
				y + 4 * addingPoint + 2 * sqrt2, y + 4 * addingPoint + 2 * sqrt2, y + 6 * addingPoint,
				y + 2 * addingPoint + 2 * sqrt2, y + 2 * addingPoint + sqrt2, y + 3 * addingPoint,
				y + 2 * addingPoint };

		int[] puzzle3x = { x, x + 4 * addingPoint, x + 4 * addingPoint, x };
		int[] puzzle3y = { y, y, y + 4 * addingPoint, y + 4 * addingPoint };

		int[] puzzle4x = { x, x + sqrt2, x + sqrt2 + addingPoint, x + sqrt2 + addingPoint, x + 2 * sqrt2 - addingPoint,
				x + 2 * sqrt2 + 3 * addingPoint, x + 2 * sqrt2 + addingPoint, x + 4 * sqrt2 - addingPoint,
				x + 2 * sqrt2 - addingPoint, x + sqrt2 - addingPoint, x + sqrt2 - addingPoint, x + sqrt2, x + sqrt2 };
		int[] puzzle4y = { y, y - sqrt2, y + addingPoint - sqrt2, y + 3 * addingPoint - sqrt2,
				y + 5 * addingPoint - 2 * sqrt2, y + 5 * addingPoint - 2 * sqrt2, y + 7 * addingPoint - 2 * sqrt2,
				y + 5 * addingPoint, y + 5 * addingPoint, y + 5 * addingPoint - sqrt2, y + 3 * addingPoint - sqrt2,
				y + 2 * addingPoint - sqrt2, y };

		int[] puzzle5x = { x, x + 4 * sqrt2 - 4 * addingPoint, x + 4 * sqrt2 - 4 * addingPoint, x + 4 * sqrt2,
				x + 5 * sqrt2, x + 4 * sqrt2, x + sqrt2 };
		int[] puzzle5y = { y, y, y - 4 * addingPoint, y, y, y + sqrt2, y + sqrt2 };

		int[] puzzle6x = { x, x, x + 3 * addingPoint, x + 2 * addingPoint, x + 2 * addingPoint, x + 3 * addingPoint,
				x + 3 * addingPoint, x + 4 * addingPoint, x + 4 * addingPoint + sqrt2, x + 4 * addingPoint + sqrt2,
				x + 4 * addingPoint, x + 3 * addingPoint, x + 4 * addingPoint, x + 4 * addingPoint,
				x + 4 * addingPoint - sqrt2, x + 2 * addingPoint, x + 2 * addingPoint, x + 2 * sqrt2 };
		int[] puzzle6y = { y, y - 2 * sqrt2, y - 3 * addingPoint - 2 * sqrt2, y - 4 * addingPoint - 2 * sqrt2,
				y - 6 * addingPoint - 2 * sqrt2, y - 5 * addingPoint - 2 * sqrt2, y - 3 * addingPoint - 2 * sqrt2,
				y - 2 * addingPoint - 2 * sqrt2, y - 2 * addingPoint - 3 * sqrt2, y - 2 * addingPoint - 2 * sqrt2,
				y - 2 * addingPoint - 2 * sqrt2, y - addingPoint - 2 * sqrt2, y - 2 * sqrt2, y - sqrt2, y - 2 * sqrt2,
				y - 2 * sqrt2, y + 2 * addingPoint - 2 * sqrt2, y };

		int[] puzzle7x = { x, x + sqrt2, x + sqrt2, x + 2 * sqrt2, x + 2 * sqrt2, x + 2 * addingPoint + sqrt2,
				x + 4 * addingPoint + sqrt2, x + 2 * addingPoint + 2 * sqrt2, x + 2 * addingPoint + 2 * sqrt2,
				x + 2 * sqrt2 - 2 * addingPoint, x + 2 * sqrt2 - 2 * addingPoint };
		int[] puzzle7y = { y, y - sqrt2, y - 2 * sqrt2, y - 2 * sqrt2, y - sqrt2, y - 2 * addingPoint, y, y,
				y + 2 * addingPoint, y + 2 * addingPoint, y };

		int[] puzzle8x = { x, x + 2 * addingPoint, x + 2 * addingPoint, x + 3 * addingPoint, x + 4 * addingPoint,
				x + 3 * addingPoint + sqrt2, x + 3 * addingPoint + 2 * sqrt2, x + 3 * addingPoint + 2 * sqrt2,
				x + 4 * addingPoint, x + 2 * addingPoint, x + 2 * addingPoint, x + addingPoint, x + addingPoint };
		int[] puzzle8y = { y, y, y + 2 * addingPoint, y + addingPoint, y + 2 * addingPoint, y + 3 * addingPoint - sqrt2,
				y + 3 * addingPoint, y + 3 * addingPoint + 2 * sqrt2, y + 4 * addingPoint, y + 6 * addingPoint,
				y + 4 * addingPoint, y + 3 * addingPoint, y + addingPoint };

		int[] puzzle9x = { x, x + sqrt2, x + 4 * sqrt2 - 2 * addingPoint, x + 4 * sqrt2 - 2 * addingPoint,
				x + 4 * sqrt2 - 3 * addingPoint, x + 4 * sqrt2 - 2 * addingPoint, x + 4 * sqrt2 - addingPoint,
				x + 4 * sqrt2 - 2 * addingPoint, x + 4 * sqrt2, x + 5 * sqrt2, x + 6 * sqrt2, x + 5 * sqrt2,
				x + 5 * sqrt2, x + 4 * sqrt2, x + 3 * sqrt2, x + 2 * sqrt2, x + 2 * sqrt2, x + sqrt2 };
		int[] puzzle9y = { y, y - sqrt2, y - sqrt2, y - 2 * addingPoint - sqrt2, y - 3 * addingPoint - sqrt2,
				y - 4 * addingPoint - sqrt2, y - 3 * addingPoint - sqrt2, y - 2 * addingPoint - sqrt2, y - sqrt2,
				y - 2 * sqrt2, y - sqrt2, y - sqrt2, y + sqrt2, y, y, y + sqrt2, y - sqrt2, y };

		int[] puzzle10x = { x, x + 2 * addingPoint, x + 2 * addingPoint + 3 * sqrt2, x + 2 * addingPoint + 4 * sqrt2,
				x + 2 * addingPoint + 2 * sqrt2, x + 2 * addingPoint + 2 * sqrt2, x + 2 * addingPoint + 3 * sqrt2,
				x + 2 * addingPoint + 2 * sqrt2, x + 2 * addingPoint + sqrt2, x + 2 * sqrt2, x + 2 * addingPoint,
				x + 2 * addingPoint, x + addingPoint, x + addingPoint };
		int[] puzzle10y = { y, y - 2 * addingPoint, y - 2 * addingPoint, y + sqrt2 - 2 * addingPoint,
				y + sqrt2 - 2 * addingPoint, y, y + sqrt2, y + sqrt2, y, y, y + 2 * sqrt2 - 2 * addingPoint,
				y + 2 * addingPoint, y + 3 * addingPoint, y + addingPoint };

		// Adding XCoordinates to the PuzzleSet1 List
		puzzleSet1x.add(puzzle1x);
		puzzleSet1x.add(puzzle2x);
		puzzleSet1x.add(puzzle3x);
		puzzleSet1x.add(puzzle4x);
		puzzleSet1x.add(puzzle5x);
		puzzleSet1x.add(puzzle6x);
		puzzleSet1x.add(puzzle7x);
		puzzleSet1x.add(puzzle8x);
		puzzleSet1x.add(puzzle9x);
		puzzleSet1x.add(puzzle10x);

		// Adding YCoordinates to the PuzzleSet1 List
		puzzleSet1y.add(puzzle1y);
		puzzleSet1y.add(puzzle2y);
		puzzleSet1y.add(puzzle3y);
		puzzleSet1y.add(puzzle4y);
		puzzleSet1y.add(puzzle5y);
		puzzleSet1y.add(puzzle6y);
		puzzleSet1y.add(puzzle7y);
		puzzleSet1y.add(puzzle8y);
		puzzleSet1y.add(puzzle9y);
		puzzleSet1y.add(puzzle10y);

	}

	// Sets all the Coordinates of the PuzzleSet2
	public void setPuzzleSet2() {
		int x = 550, y = 350;
		int addingPoint=10;
		
	      int[] puzzle11x = {x,x+6*addingPoint,x+12*addingPoint,x+6*addingPoint,x+12*addingPoint,x+12*addingPoint,x+6*addingPoint,x+9*addingPoint,x+3*addingPoint,x+6*addingPoint,x
	        ,x,x+6*addingPoint,x};
	      int[] puzzle11y = {y,y-12*addingPoint,y,y+3*addingPoint,y+3*addingPoint,y+6*addingPoint,y+6*addingPoint,y+12*addingPoint,y+12*addingPoint,y+6*addingPoint,y+6*addingPoint,
	        y+3*addingPoint,y+3*addingPoint,y};
	          
	      int[] puzzle12x = {x,x+6*addingPoint,x+6*addingPoint,x+12*addingPoint,x+12*addingPoint,x+18*addingPoint,x+12*addingPoint,x+12*addingPoint,x+6*addingPoint,x+6*addingPoint};
	      int[] puzzle12y = {y,y,y-6*addingPoint,y-6*addingPoint,y,y,y+6*addingPoint,y+12*addingPoint,y+12*addingPoint,y+6*addingPoint};
	      
	      
	      int[] puzzle13x = {x,x+12*addingPoint,x+12*addingPoint,x};
	      int[] puzzle13y = {y,y,y+12*addingPoint,y+12*addingPoint};
	      

	      int[] puzzle14x = {x,x,x+12*addingPoint};
	      int[] puzzle14y = {y,y-24*addingPoint,y};
	      
	      
	      int[] puzzle15x = {x,x+6*addingPoint,x+12*addingPoint,x+12*addingPoint,x};
	      int[] puzzle15y = {y,y-12*addingPoint,y,y+6*addingPoint,y+6*addingPoint};
	      
	      int[] puzzle16x = {x,x+12*addingPoint,x+24*addingPoint,x+12*addingPoint};
	      int[] puzzle16y = {y,y,y+12*addingPoint,y+12*addingPoint};
	      
	      int[] puzzle17x = {x,x+6*addingPoint,x+12*addingPoint,x+9*addingPoint,x+9*addingPoint,x+3*addingPoint,x+3*addingPoint};
	      int[] puzzle17y = {y,y-3*addingPoint,y,y+6*addingPoint,y+18*addingPoint,y+18*addingPoint,y+6*addingPoint};
	      
	      int[] puzzle18x = {x,x+6*addingPoint,x+14*addingPoint,x+23*addingPoint,x+23*addingPoint,x+18*addingPoint,x+6*addingPoint,x+6*addingPoint};
	      int[] puzzle18y = {y,y-6*addingPoint,y+addingPoint,y-8*addingPoint,y+2*addingPoint,y+6*addingPoint,y+6*addingPoint,y};
	      
	      int[] puzzle19x = {x,x+6*addingPoint,x+12*addingPoint,x+18*addingPoint};
	      int[] puzzle19y = {y,y-12*addingPoint,y-12*addingPoint,y};
	      
	      int[] puzzle20x = {x,x+10*addingPoint,x+14*addingPoint,x+17*addingPoint,x+28*addingPoint,x+21*addingPoint,x+7*addingPoint};
	      int[] puzzle20y = {y,y+6*addingPoint,y-1*addingPoint,y+6*addingPoint,y,y+12*addingPoint,y+12*addingPoint};
	      
	   // Adding XCoordinates to the PuzzleSet2 List
	      puzzleSet2x.add(puzzle11x);
	      puzzleSet2x.add(puzzle12x);
	      puzzleSet2x.add(puzzle13x);
	      puzzleSet2x.add(puzzle14x);
	      puzzleSet2x.add(puzzle15x);
	      puzzleSet2x.add(puzzle16x);
	      puzzleSet2x.add(puzzle17x);
	      puzzleSet2x.add(puzzle18x);
	      puzzleSet2x.add(puzzle19x);
	      puzzleSet2x.add(puzzle20x);
	      
	   // Adding YCoordinates to the PuzzleSet2 List
	      puzzleSet2y.add(puzzle11y);
	      puzzleSet2y.add(puzzle12y);
	      puzzleSet2y.add(puzzle13y);
	      puzzleSet2y.add(puzzle14y);
	      puzzleSet2y.add(puzzle15y);
	      puzzleSet2y.add(puzzle16y);
	      puzzleSet2y.add(puzzle17y);
	      puzzleSet2y.add(puzzle18y);
	      puzzleSet2y.add(puzzle19y);
	      puzzleSet2y.add(puzzle20y);
	}

	// Getter Method for all the XCoordinates of the PuzzleSet
	public List<int[]> getPuzzleSetX(int puzzleSetNumber) {
		if (puzzleSetNumber == 1) {
			return puzzleSet1x;

		} else if (puzzleSetNumber == 2)
			return puzzleSet2x;
		return null;
	}

	// Getter Method for all the YCoordinates of the PuzzleSet
	public List<int[]> getPuzzleSetY(int puzzleSetNumber) {
		if (puzzleSetNumber == 1)
			return puzzleSet1y;
		else if (puzzleSetNumber == 2)
			return puzzleSet2y;
		return null;
	}

}
