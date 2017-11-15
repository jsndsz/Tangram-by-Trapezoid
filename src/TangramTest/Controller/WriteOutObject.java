package TangramTest.Controller;

import java.awt.Polygon;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WriteOutObject implements Serializable {
	public Map<Polygon,List> serializedPolygons=new HashMap<Polygon,List>();
	
	public  WriteOutObject(Map s)
	{
		this.serializedPolygons=s;
		System.out.println("serialized polygon is"+this.serializedPolygons);
	}
	
	public WriteOutObject()
	{
		System.out.println("Checking for desereilaizing polygon file");
	}
	
	public void setSerializedPolygon(WriteOutObject o)
	{
		this.serializedPolygons=o.serializedPolygons;
	}
	
	public Map getSerializedPolygon()
	{
		System.out.println(" GETMETHOD   serialized file get method :"+this.serializedPolygons);
		return this.serializedPolygons;
	}
}