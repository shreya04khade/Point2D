package com.app.geometry;



import java.util.Scanner;
class Date{
	int day;
	int month;
	int year;
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayInfo() {
		System.out.println(day+" / "+month+" / "+year);
	}
}

public class DateTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day");
		int d=sc.nextInt();
		System.out.println("Enter month");
		int m=sc.nextInt();
		System.out.println("Enter year");
		int y=sc.nextInt();
		Date dte=new Date(d,m,y);
		dte.displayInfo();

	}

}
