package TangramPuzzle.Model;

import java.awt.Polygon;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class maintains the state of a shape
 * 
 * @author cpai
 *
 */
public class ShapeState {
	/**
	 * map storing the polygons
	 */
	static Map<Polygon, Integer> mapShapes = new HashMap<Polygon, Integer>();

	/**
	 * map storing the serializable polygons
	 */
	static Map<Polygon, List> serializablePolygons = new HashMap<Polygon, List>();

	/**
	 * Stores a shape into the map.
	 * 
	 * @param p
	 *            is polygon object
	 */
	public void setShapeState(Polygon p) {
		mapShapes.put(p, 1);
	}

	/**
	 * Retrieves the shapes from the map
	 * 
	 * @return Map of Polygon objects
	 */
	public Map getShapeState() {
		return mapShapes;
	}

	public void setShapeForSerialize(Polygon p, List state) {
		serializablePolygons.put(p, state);
	}

	/**
	 * Retrived the serialized state of a shape
	 * 
	 * @return Map containing the serialized state of a shape
	 */

	public Map getSerializedShape() {
		return serializablePolygons;
	}

	/**
	 * clears the state of the serializedPolygons
	 */
	public void clearSerializeShape() {
		serializablePolygons = new HashMap<Polygon, List>();
	}

	/**
	 * clears the state of the shapes
	 */
	public void clearShapeState() {
		mapShapes = new HashMap<Polygon, Integer>();
	}
}
