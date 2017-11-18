package TangramPuzzle.Model;

import java.awt.Point;
import java.awt.Polygon;
import java.util.Stack;


/**
 * This class stores the states of the active shapes in move so that they are retrieved at any given point of time from a numerous Controller classes. Undo and redo stackss are also maintained here
 * @author jdsouza
 *
 */
public class ControllerState {
	static Polygon activeShape;
	static Stack<int[]> undoStackx = new Stack<int[]>();
	static Stack<int[]> undoStacky = new Stack<int[]>();
	static Stack<Polygon> undoStackID = new Stack<Polygon>();
	static Stack<int[]> redoStackx = new Stack<int[]>();
	static Stack<int[]> redoStacky = new Stack<int[]>();
	static Stack<Polygon> redoStackID = new Stack<Polygon>();
	
	
	/**
	 * sets the state of the active shape 
	 * @param activeShape shape is set here
	 */
	public void setActiveShape(Polygon activeShape) {
		this.activeShape = activeShape;
	}
	/**
	 * Sets the undo stack	
	 * @param x int[] that stores the x points of the polygon
	 * @param y int[] that stores the y points of the polygon
	 * @param p Polygon object
	 */
	public void setUndoStack(int[]x,int[]y,Polygon p) {
		this.undoStackID.push(p);
		this.undoStackx.push(x);
		this.undoStacky.push(y);
	}
	
	/**
	 * set method for redo
	 * @param x parameter
	 * @param y parameter
	 * @param p parameter
	 */
	public void setRedoStack(int[]x,int[]y,Polygon p) {
		this.redoStackID.push(p);
		this.redoStackx.push(x);
		this.redoStacky.push(y);
	}
	
	/**
	 * get method for active shape
	 * @return active shape 
	 */
	public Polygon getActiveShape() {
		return this.activeShape;
	}
	
	/**
	 * get method for undo x
	 * @return returns undo for x
	 */
	public int[] getUndoX() {
		return this.undoStackx.pop();
	}
	
	/**
	 * get method for undo y
	 * @return stack undo y returned
	 */
	
	public int[] getUndoY() {
		return this.undoStacky.pop();
	}
	
	/**
	 * get method for undo polygon
	 * @return undo stack id returned
	 */
	public Polygon getUndoPolygon() {
		return this.undoStackID.pop();
	}
	
	/**
	 * get method for undo stack
	 * @return stack undo returned
	 */
	public Stack<int[]> getUndoStack() {
		return this.undoStackx;
	}
	
	/**
	 * get method for redo stack
	 * @return redo stack
	 */
	public Stack<int[]> getRedoStack() {
		return this.redoStackx;
	}
	
	/**
	 * 
	 * @return redo stack x
	 */
	public int[] getRedoX() {
		return this.redoStackx.pop();
	}
	
	/**
	 * returns get redo stack y
	 * @return redo stack y
	 */
	public int[] getRedoY() {
		return this.redoStacky.pop();
	}
	
	/**
	 * 
	 * @return redo polygon stack
	 */
	public Polygon getRedoPolygon() {
		return this.redoStackID.pop();
		
	}
	
	
}