package TangramTest.Controller;

import java.awt.Polygon;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import TangramTest.Model.CatalogData;
import TangramTest.Model.ShapeSet;
import TangramTest.View.PuzzleSolveScreen;

public class SerializingPolygons {
	
	public static Map<Polygon,List> serializablePolygons=new HashMap<Polygon,List>();
	List<int []> state=new ArrayList<int []>();
	private List<Polygon> myPolygons = new ArrayList<Polygon>();
	ShapeSet s=new ShapeSet();
	int chosenShapeSet;
	int chosenPuzzle;
	static String fileToBeWritten;
	

	 public void SerializingPolygons(Polygon p)
	{
		 System.out.println("p is "+p);
		 int[] x = p.xpoints;
		 int[] y = p.ypoints;
		 state.add(x);
		 state.add(y);
		 serializablePolygons.put(p, state);
	
	System.out.println("entered serializable size is "+serializablePolygons.size());
	int noOfElementsMap=serializablePolygons.keySet().size();
	
	
	if(noOfElementsMap==1/*s.getShapeSet().size()*/)
	{
		System.out.println("entered serializable size is "+serializablePolygons.size());
		System.out.println("shape set size "+s.getShapeSet().size()+", no of ele in map: "+noOfElementsMap);
//		PuzzleCompletion pc=new PuzzleCompletion();
		System.out.println("same length");
//		pc.checkPuzzleCompletion(serializablePolygons);
		setPuzzleConfigurations();
	}
	
	
//	PuzzleCompletion pz=new PuzzleCompletion();
//	if(serializablePolygons!=null)
//	{
//	pz.addArea();
//	}
//	
	}
	 
	 public void setPuzzleConfigurations()
	 {
			PuzzleSolveScreen psolveScreen=new PuzzleSolveScreen();
		 CatalogData cd=new CatalogData();
		 chosenPuzzle=psolveScreen.getChosenPuzzle();
		 chosenShapeSet=psolveScreen.chosenShapeSetNumber;
		 if (chosenShapeSet==1)
		 {
			 fileToBeWritten=cd.ShapeSet1Files[chosenPuzzle];
			 System.out.println("writin to file f"+fileToBeWritten);
		 }
		 else  if (chosenShapeSet==2)
		 {
			 fileToBeWritten=cd.ShapeSet2Files[chosenPuzzle];
			 System.out.println("writin to file f"+fileToBeWritten);
		 }
		 
	 }
	 
	 
	 public void SerializePuzzle()
	 {
		 System.out.println();
		 CatalogData cd=new CatalogData();
		 WriteOutObject objectWritten=new WriteOutObject(serializablePolygons);
		 try {
//		 		FileOutputStream fileStream=new FileOutputStream(cd.SerializedPolygonsFile);
			 	FileOutputStream fileStream=new FileOutputStream(fileToBeWritten);
		 		ObjectOutputStream out=new ObjectOutputStream(fileStream);	
		 		System.out.println("object written is "+objectWritten);
		 		out.writeObject(objectWritten);
		 		out.close();
		 		fileStream.close();
		 		System.out.println("initiate serialize Has been serialised");
		 		
		 		}catch(IOException ex)
		 		{
		 		System.out.println("IO Exception was found");
		 		}
	 }
	
	public Map getSerializingPolygons()
	{
		return serializablePolygons;
	}
	
}