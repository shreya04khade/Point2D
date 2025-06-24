package com.app.geometry;


	import java.util.Scanner;
	import com.app.geometry.*;

	public class TestPoint {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter cordinates of first point");
			int x=sc.nextInt();
			int y=sc.nextInt();
			Point2D p1=new Point2D(x,y);
			System.out.println("Enter cordinates of second point");
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			Point2D p2=new Point2D(x1,y1);
			
			if(p1.isEqual(p2)) {
				System.out.println("Point are same");			
			}
			else System.out.println("Point are not same ");
			
			double dist=p1.calculateDistance(p2);
			System.out.println("Diatance is "+dist);
			
			
			
			

		}

	}
