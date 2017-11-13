package TangramTest.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coordinates {

	// list to store list of shapeset coordinates
	List<int[]> ListShapeSet1x = new ArrayList<int[]>();
	List<int[]> ListShapeSet1y = new ArrayList<int[]>();
	List<int[]> ListShapeSet2x = new ArrayList<int[]>();
	List<int[]> ListShapeSet2y = new ArrayList<int[]>();
	
	// list to store list of puzzleset coordinates
	List<int[]> puzzleSet1x = new ArrayList<int[]>();
	List<int[]> puzzleSet1y = new ArrayList<int[]>();
	List<int[]> puzzleSet2x = new ArrayList<int[]>();
	List<int[]> puzzleSet2y = new ArrayList<int[]>();

	CatalogData cd=new CatalogData();


	public Coordinates() {
		setShapeSet1();
		setShapeSet2();
		setPuzzleSet1();
		setPuzzleSet2();
	}

	public void setShapeSet1() {
		
		 int counter=0;
		 String line;
		 String tempStringArray[];
		 
		 try {
		FileReader fileReader = new FileReader(cd.shapeset1File);
       BufferedReader bufferedReader = 
           new BufferedReader(fileReader);

       while((line= bufferedReader.readLine())!=null){
       	
       	if(counter>0&&counter<(cd.noOfShapesShapeSet1+1))
       	{
       		tempStringArray=line.split(",");
       		int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();  
       		ListShapeSet1x.add(numbers);
       	}
       	counter=counter+1;
       	
       	if(counter>(cd.noOfShapesShapeSet1+2)&&counter<(cd.noOfShapesShapeSet1+(cd.noOfShapesShapeSet1+3)))
       	{
       		tempStringArray=line.split(",");
       		int[] numbers2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();  
       		ListShapeSet1y.add(numbers2);
       	}
       
       }
       fileReader.close();
       bufferedReader.close();	
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
	}

	private void setShapeSet2() {
		int counter=0;
		 String line;
		 String tempStringArray[];
		 
		 try {
		FileReader fileReader = new FileReader(cd.shapeset2File);
      BufferedReader bufferedReader = 
          new BufferedReader(fileReader);

      while((line= bufferedReader.readLine())!=null){
      	
      	if(counter>0&&counter<(cd.noOfShapesShapeSet2+1))
      	{
      		tempStringArray=line.split(",");
      		int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();  
      		ListShapeSet2x.add(numbers);
      	}
      	counter=counter+1;
      	
      	if(counter>(cd.noOfShapesShapeSet2+2)&&counter<(cd.noOfShapesShapeSet2+(cd.noOfShapesShapeSet2+3)))
      	{
      		tempStringArray=line.split(",");
      		int[] numbers2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();  
      		ListShapeSet2y.add(numbers2);
      	}
      
      }
      fileReader.close();
      bufferedReader.close();	
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
		
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
			int counter=0;
			 String line;
			 String tempStringArray[];
			 
			 try {
			FileReader fileReader = new FileReader(cd.PuzzleSet1);
	      BufferedReader bufferedReader = 
	          new BufferedReader(fileReader);

	      while((line= bufferedReader.readLine())!=null){
	      	
	      	if(counter>0&&counter<(cd.noOfShapesPuzzleSet1+1))
	      	{
	      		tempStringArray=line.split(",");
	      		int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();  
	      		puzzleSet1x.add(numbers);
	      	}
	      	counter=counter+1;
	      	
	      	if(counter>(cd.noOfShapesPuzzleSet1+2)&&counter<(cd.noOfShapesPuzzleSet1+(cd.noOfShapesPuzzleSet1+3)))
	      	{
	      		tempStringArray=line.split(",");
	      		int[] numbers2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();  
	      		puzzleSet1y.add(numbers2);
	      	}
	      
	      }
	      fileReader.close();
	      bufferedReader.close();	
			 }catch(IOException e)
			 {
				 e.printStackTrace();
			 }
			

		}

		// Sets all the Coordinates of the PuzzleSet2
		public void setPuzzleSet2() {
			int counter=0;
			 String line;
			 String tempStringArray[];
			 
			 try {
			FileReader fileReader = new FileReader(cd.PuzzleSet2);
	     BufferedReader bufferedReader = 
	         new BufferedReader(fileReader);

	     while((line= bufferedReader.readLine())!=null){
	     	
	     	if(counter>0&&counter<(cd.noOfShapesPuzzleSet2+1))
	     	{
	     		tempStringArray=line.split(",");
	     		int[] numbers = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();  
	     		puzzleSet2x.add(numbers);
	     	}
	     	counter=counter+1;
	     	
	     	if(counter>(cd.noOfShapesPuzzleSet2+2)&&counter<(cd.noOfShapesPuzzleSet2+(cd.noOfShapesPuzzleSet2+3)))
	     	{
	     		tempStringArray=line.split(",");
	     		int[] numbers2 = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();  
	     		puzzleSet2y.add(numbers2);
	     	}
	     
	     }
	     fileReader.close();
	     bufferedReader.close();	
			 }catch(IOException e)
			 {
				 e.printStackTrace();
			 }
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