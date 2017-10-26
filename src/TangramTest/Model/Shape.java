package TangramTest.Model;

import java.awt.*;

public class Shape {
 int[] xCoordinates;
 int[] yCoordinates;
 Polygon p = new Polygon();
 
 public Shape(int[] xCoordinates,int[] yCoordinates) {
  this.xCoordinates = xCoordinates;
  this.yCoordinates = yCoordinates;
 }
 
 public Polygon createShape() {
  p.reset();
  if (this.xCoordinates.length != this.yCoordinates.length) {
   return p;
  }
  else {
   p = new Polygon(this.xCoordinates, this.yCoordinates,this.xCoordinates.length);
   return p;
  }
  }
 }