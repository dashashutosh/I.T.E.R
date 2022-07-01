package DivideNConquer;

import java.util.*;

public class ClosestPair {
  
  private double[][] points;
  Point p1, p2;
  
  public static void main(String[] args) {
    double[][] points = new double[500][2];
    
    for (int i = 0; i < points.length; i++) {
      points[i][0] = Math.random() * 100;
      points[i][1] = Math.random() * 100;      
    }
    
    ClosestPair closestPair = new ClosestPair(points);
    System.out.println("shortest distance is " + 
      closestPair.getMinimumDistance());
    
    System.out.print("(" + closestPair.p1.x + ", " + 
      closestPair.p1.y + ") to ");
    
    System.out.println("(" + closestPair.p2.x + ", " + 
      closestPair.p2.y + ")"); 
  }

  ClosestPair() {
  }   
  
  public ClosestPair(double[][] points) {
    setPoints(points);
  } 
  
  public void setPoints(double[][] points) {
    this.points = points;
  }
  
  public double getMinimumDistance() {    
    Point[] pointsOrderedOnX = new Point[points.length];
    
    for (int i = 0; i < pointsOrderedOnX.length; i++)
      pointsOrderedOnX[i] = new Point(points[i][0], points[i][1]);
    
    Arrays.sort(pointsOrderedOnX);

    if (checkIdentical(pointsOrderedOnX))
      return 0;
    
    Point[] pointsOrderedOnY = pointsOrderedOnX.clone();
    Arrays.sort(pointsOrderedOnY, new CompareY());
    
    return distance(pointsOrderedOnX, 0, 
        pointsOrderedOnX.length - 1, pointsOrderedOnY);
  }
  
  public boolean checkIdentical(Point[] pointsOrderedOnX) {
  
	for (int i = 0; i < pointsOrderedOnX.length - 1; i++) {
      
		if (pointsOrderedOnX[i].compareTo(pointsOrderedOnX[i + 1]) == 0) {
			p1 = pointsOrderedOnX[i];
			p2 = pointsOrderedOnX[i + 1];
			return true;        
        }
    }
    
    return false;
  }

  public double distance(
      Point[] pointsOrderedOnX, int low, int high,
      Point[] pointsOrderedOnY) {
	  
    if (low >= high) 
      return Double.MAX_VALUE;
    
    else if (low + 1 == high) {
     
      p1 = pointsOrderedOnX[low];
      p2 = pointsOrderedOnX[high];
      return distance(pointsOrderedOnX[low], pointsOrderedOnX[high]);
    }
 
    int mid = (low + high) / 2;
    Point[] pointsOrderedOnYL = new Point[mid - low + 1];
    Point[] pointsOrderedOnYR = new Point[high - mid];
    int j1 = 0; int j2 = 0;
  
    for (int i = 0; i < pointsOrderedOnY.length; i++) {
   
      if (pointsOrderedOnY[i].compareTo(pointsOrderedOnX[mid]) <= 0)
        pointsOrderedOnYL[j1++] = pointsOrderedOnY[i];
      else
        pointsOrderedOnYR[j2++] = pointsOrderedOnY[i];
    }

    double d1 = distance(
      pointsOrderedOnX, low, mid, pointsOrderedOnYL);
    double d2 = distance(
      pointsOrderedOnX, mid + 1, high, pointsOrderedOnYR);
    double d = Math.min(d1, d2);

    int count = 0;
    
    for (int i = 0; i < pointsOrderedOnYL.length; i++)
      if (pointsOrderedOnYL[i].x >= pointsOrderedOnX[mid].x - d)
        count++;
    
    Point[] stripL = new Point[count];
    
    count = 0;
    
    for (int i = 0; i < pointsOrderedOnYL.length; i++)
      if (pointsOrderedOnYL[i].x >= pointsOrderedOnX[mid].x - d)
        stripL[count++] = pointsOrderedOnYL[i];

    count = 0;
    
    for (int i = 0; i < pointsOrderedOnYR.length; i++)
      if (pointsOrderedOnYR[i].x <= pointsOrderedOnX[mid].x + d)
        count++;
    
    Point[] stripR = new Point[count];
    
    count = 0;
    
    for (int i = 0; i < pointsOrderedOnYR.length; i++)
      if (pointsOrderedOnYR[i].x <= pointsOrderedOnX[mid].x + d)
        stripR[count++] = pointsOrderedOnYR[i];

    double d3 = d;
    int j = 0;
    
    for (int i = 0; i < stripL.length; i++) {
      while (j < stripR.length && stripL[i].y > stripR[j].y + d)
        j++;

      int k = j; 
      
      while (k < stripR.length && stripR[k].y <= stripL[i].y + d) {
        
    	 if (d3 > distance(stripL[i], stripR[k])) {
          d3 = distance(stripL[i], stripR[k]);
          p1 = stripL[i];
          p2 = stripR[k];
        }
        k++;
      }
    }

    return Math.min(d, d3);
  }

  public static double distance(Point p1, Point p2) {
    return distance(p1.x, p1.y, p2.x, p2.y);
  }

  public static double distance(
      double x1, double y1, double x2, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }

  static class Point implements Comparable<Point> {
    double x;
    double y;

    Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public int compareTo(Point p2) {
      if (this.x < p2.x)
        return -1;
      else if (this.x == p2.x) {
       
    	  if (this.y < p2.y)
          return -1;
        else if (this.y == p2.y)
          return 0;
        else
          return 1;
      } 
      else
        return 1;
    }
  }
  
  static class CompareY implements java.util.Comparator<Point> {
    public int compare(Point p1, Point p2) {
      if (p1.y < p2.y)
        return -1;
      else if (p1.y == p2.y) {
        
    	  if (p1.x < p2.x)
          return -1;
        else if (p1.x == p2.x)
          return 0;
        else
          return 1;
      } 
      else
        return 1;
    }
  }
}