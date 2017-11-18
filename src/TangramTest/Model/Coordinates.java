package TangramPuzzle.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Coordinates class contains setter and getter methods for the coordinates of
 * the shape sets and puzzle sets
 * 
 * @author sinamdar This class sets up all the necessary shapeSet and puzzleSet
 */
public class Coordinates {

	/**
	 * Lists to store coordinates of the 2 ShapeSets
	 */
	List<int[]> ListShapeSet1x = new ArrayList<int[]>();
	List<int[]> ListShapeSet1y = new ArrayList<int[]>();
	List<int[]> ListShapeSet2x = new ArrayList<int[]>();
	List<int[]> ListShapeSet2y = new ArrayList<int[]>();

	/**
	 * List to store coordinates of both the PuzzleSets
	 */
	List<int[]> puzzleSet1x = new ArrayList<int[]>();
	List<int[]> puzzleSet1y = new ArrayList<int[]>();
	List<int[]> puzzleSet2x = new ArrayList<int[]>();
	List<int[]> puzzleSet2y = new ArrayList<int[]>();

	CatalogData cd = new CatalogData();

	/**
	 * Coordinates constructor to set the ShapeSets and PuzzleSets
	 */
	public Coordinates() {
		setShapeSet1();
		setShapeSet2();
		setPuzzleSet1();
		setPuzzleSet2();
	}

	/**
	 * Reads coordinates of ShapeSet1 from the file
	 */
	private void setShapeSet1() {

		int counter = 0;
		String line;
		String tempStringArray[];

		try {
			FileReader fileReader = new FileReader(cd.shapeset1File);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (counter > 0 && counter < (cd.noOfShapesShapeSet1 + 1)) {
					tempStringArray = line.split(",");
					int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
					ListShapeSet1x.add(numbers);
				}
				counter = counter + 1;

				if (counter > (cd.noOfShapesShapeSet1 + 2)
						&& counter < (cd.noOfShapesShapeSet1 + (cd.noOfShapesShapeSet1 + 3))) {
					tempStringArray = line.split(",");
					int[] numbers2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
					ListShapeSet1y.add(numbers2);
				}

			}
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Read coordinates of ShapeSet 2 from file
	 */
	private void setShapeSet2() {
		int counter = 0;
		String line;
		String tempStringArray[];

		try {
			FileReader fileReader = new FileReader(cd.shapeset2File);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (counter > 0 && counter < (cd.noOfShapesShapeSet2 + 1)) {
					tempStringArray = line.split(",");
					int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
					ListShapeSet2x.add(numbers);
				}
				counter = counter + 1;

				if (counter > (cd.noOfShapesShapeSet2 + 2)
						&& counter < (cd.noOfShapesShapeSet2 + (cd.noOfShapesShapeSet2 + 3))) {
					tempStringArray = line.split(",");
					int[] numbers2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
					ListShapeSet2y.add(numbers2);
				}

			}
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<int[]> getShapeSetX(int shapeSetNumber) {
		if (shapeSetNumber == 1)
			return ListShapeSet1x;
		else if (shapeSetNumber == 2)
			return ListShapeSet2x;

		return null;
	}

	/**
	 * Getter Method to retrieve the shape set y-coordinates
	 * 
	 * @param shapeSetNumber
	 *            checks for the chosen shapeset
	 * @return List of y-coordinates corresponding to the shapeSetNumber
	 */
	public List<int[]> getShapeSetY(int shapeSetNumber) {
		if (shapeSetNumber == 1)
			return ListShapeSet1y;
		else if (shapeSetNumber == 2)
			return ListShapeSet2y;

		return null;
	}

	/**
	 * Read the coordinates for all the puzzles for PuzzeSet 1 from the file
	 * PuzzleSet1.txt
	 */
	public void setPuzzleSet1() {
		int counter = 0;
		String line;
		String tempStringArray[];

		try {
			FileReader fileReader = new FileReader(cd.PuzzleSet1);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (counter > 0 && counter < (cd.noOfShapesPuzzleSet1 + 1)) {
					tempStringArray = line.split(",");
					int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
					puzzleSet1x.add(numbers);
				}
				counter = counter + 1;

				if (counter > (cd.noOfShapesPuzzleSet1 + 2)
						&& counter < (cd.noOfShapesPuzzleSet1 + (cd.noOfShapesPuzzleSet1 + 3))) {
					tempStringArray = line.split(",");
					int[] numbers2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
					puzzleSet1y.add(numbers2);
				}

			}
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Read the coordinates for all the puzzles for PuzzeSet 2 from the file
	 * PuzzleSet2.txt
	 */
	private void setPuzzleSet2() {
		int counter = 0;
		String line;
		String tempStringArray[];

		try {
			FileReader fileReader = new FileReader(cd.PuzzleSet2);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {

				if (counter > 0 && counter < (cd.noOfShapesPuzzleSet2 + 1)) {
					tempStringArray = line.split(",");
					int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
					puzzleSet2x.add(numbers);
				}
				counter = counter + 1;

				if (counter > (cd.noOfShapesPuzzleSet2 + 2)
						&& counter < (cd.noOfShapesPuzzleSet2 + (cd.noOfShapesPuzzleSet2 + 3))) {
					tempStringArray = line.split(",");
					int[] numbers2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
					puzzleSet2y.add(numbers2);
				}

			}
			fileReader.close();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Getter Method for all the x-coordinates of the puzzle set
	 * 
	 * @param puzzleSetNumber
	 *            to set the puzzles for the corresponding chosen shapeSet if
	 *            shapeSet 1 is chosen puzzles from puzzleSet 1 are set up
	 * @return List of all x-coordinates corresponding to a puzzleSetNumber
	 */
	public List<int[]> getPuzzleSetX(int puzzleSetNumber) {
		if (puzzleSetNumber == 1) {
			return puzzleSet1x;

		} else if (puzzleSetNumber == 2) {
			return puzzleSet2x;
		}
		return null;
	}

	/**
	 * Getter Method for all the x-coordinates of the puzzle set
	 * 
	 * @param puzzleSetNumber
	 *            to set the puzzles for the corresponding chosen shapeSet if
	 *            shapeSet 1 is chosen puzzles from puzzleSet 1 are set up
	 * @return List of all y-coordinates corresponding to a puzzleSetNumber
	 */
	public List<int[]> getPuzzleSetY(int puzzleSetNumber) {
		if (puzzleSetNumber == 1)
			return puzzleSet1y;
		else if (puzzleSetNumber == 2)
			return puzzleSet2y;
		return null;
	}

}
