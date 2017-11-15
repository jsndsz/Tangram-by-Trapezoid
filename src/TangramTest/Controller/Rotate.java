package TangramTest.Controller;

import java.util.ArrayList;
import java.util.List;

public class Rotate extends SolveScreenController {
	
	public static double angleRadpositive = Math.toRadians(15);
	public static double angleRadnegative = Math.toRadians(345);
	static Undo undo = new Undo();
	
	public Rotate()
	{
		//Default constructor
	}

	//static Polygon activeShape; 
	//static Polygon dragShape; 
	
	public static List<Integer> centroid(int[]newx, int[] newy) {
		int x = 0;
		int y = 0;
		List<Integer> p = new ArrayList<Integer>();
		for(int i = 0; i<newx.length;i++) {
			x+=newx[i];
			y+=newy[i];
		}
		p.add((int)(x/newx.length));
		p.add((int)(y/newy.length));
		
		return p;
	}
	
	public static void rotateLeft() {
		double gx = 0;
		double gy = 0;	
		
		double costheta = Math.cos(angleRadnegative);
		double sintheta = Math.sin(angleRadnegative);
		
		//activeShape = SolveScreenController.getActiveShape();
		//dragShape = SolveScreenController.getDragShape();
		double allx[]=new double[xMap.size()];
		double ally[]=new double[yMap.size()];
		for(int i=0;i<xMap.size();i++){
			allx[i] = xMap.get(i);}
		
		for(int i=0;i<yMap.size();i++){
			ally[i] = yMap.get(i);}
			
		double a=0,b=0;
		for (int i=0;i<allx.length;i++) {
			a+=allx[i];
			b+=ally[i];
		}
		
		
		
		gx=a/allx.length;
		gy=b/ally.length; //this finds the centroid of the polygon (gx,gy)

		gx=(double)Math.round(gx * 100d) / 100d;
		gy=(double)Math.round(gy * 100d) / 100d;
		
		
		int[] newx = new int[allx.length];
		int[] newy = new int[ally.length];
		
		for(int i=0;i<allx.length;i++) {
			double dx = allx[i] - gx;
			double dy = ally[i] - gy;
			double dx1;
			double dy1;
			double temp;
			temp = (dx * costheta) - (dy * sintheta);
			dy1 =  Math.ceil((dx *  sintheta) + (dy * costheta));
			dx1 = Math.ceil(temp);
			
			xMap.put(i, (gx+dx1));
			yMap.put(i,(gy+dy1));
			
			
			newx[i] = (int)(gx + dx) ;
			newy[i] = (int)(gy + dy) ;
		}
	
		//activeShape = new Polygon(newx,newy,newx.length);
		undo.stackUndo(activeShape);
		
		activeShape.xpoints = newx;
		activeShape.ypoints = newy;
		dragShape = activeShape;
		if (newx.length>0)
		{
		List<Integer> p = centroid(newx,newy); 
		activeLocation.x = p.get(0);
		activeLocation.y = p.get(1);
		}
		lastLocation = activeLocation;
		view4.repaint();
		
		
	}

	
	public static void rotateRight() {
		int gx = 0;
		int gy = 0;	
		
		double costheta = Math.cos(angleRadpositive);
		double sintheta = Math.sin(angleRadpositive);
		
		//activeShape = SolveScreenController.getActiveShape();
		//dragShape = SolveScreenController.getDragShape();
		int allx[] = activeShape.xpoints;
		int ally[] = activeShape.ypoints;

		for (int i=0;i<allx.length;i++) {
			gx+=allx[i];
			gy+=ally[i];
		}
		gx=gx/allx.length;
		gy=gy/ally.length; //this finds the centroid of the polygon (gx,gy)

		
		int[] newx = new int[allx.length];
		int[] newy = new int[ally.length];
		double temp;
		for(int i=0;i<allx.length;i++) {
			double dx = allx[i] - gx;
			double dy = ally[i] - gy;
			
			
			temp = (dx* costheta) - (dy*sintheta);
			dy = (dy* costheta) + (dx*sintheta);
			dx = temp;
			newx[i] = (int)Math.ceil(gx + dx) ;
			newy[i] = (int)Math.ceil(gy + dy) ;
		}
	
		//activeShape = new Polygon(newx,newy,newx.length);
		undo.stackUndo(activeShape);
		activeShape.xpoints = newx;
		activeShape.ypoints = newy;
		dragShape = activeShape;
		
		if (newx.length>0)
		{
		List<Integer> p = centroid(newx,newy); 
		activeLocation.x = p.get(0);
		activeLocation.y = p.get(1);
		}
		
		lastLocation = activeLocation;
		view4.repaint();
		
		
	}
}
