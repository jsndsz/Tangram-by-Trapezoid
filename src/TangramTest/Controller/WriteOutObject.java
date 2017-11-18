package TangramPuzzle.Controller;

import java.awt.Polygon;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class helps writing the serialized objects to a file.
 * @author sinamdar
 *
 */
public class WriteOutObject implements Serializable {
	/**
	 * Store the polygons in a map
	 */

	public Map<Polygon, List> serializedPolygons = new HashMap<Polygon, List>();



	public WriteOutObject(Map s) {
		this.serializedPolygons = s;
	}

/**
	 * Default constructor
	 */
	public WriteOutObject() {
	}


	public void setSerializedPolygon(WriteOutObject o) {
		this.serializedPolygons = o.serializedPolygons;
	}
/**
	 * This method returns a serilalized Polygon
	 * @return returns a map
	 */	

	public Map getSerializedPolygon() {
		return this.serializedPolygons;
	}
}