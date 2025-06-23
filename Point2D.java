package com.app.geometry;
import java.util.Scanner;
public class Point2D {
	
		public int x;
		public int y;
		
		

		public Point2D() {
		}
		public Point2D(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		
		
		
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		
		public void accept()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter X Coordinate");
			this.x=sc.nextInt();
			this.y=sc.nextInt();
			
		}
		public boolean isEqual(Point2D p) {
			if(this.x==p.x && this.y==p.y) {
				return true;
			}
			else
				return false;
		}
		public double calculateDistance(Point2D p) {
			double x=Math.pow((this.x-p.x),2);
			double y=Math.pow((this.y-p.y), 2);
			return Math.sqrt((x+y));
			
			
		}

	}

