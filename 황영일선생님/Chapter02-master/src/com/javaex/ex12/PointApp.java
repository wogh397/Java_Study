package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {

		Point p01 = new Point(2, 2);	
		Point p02 = new Point(10, 10);
		//System.out.println(p01);
		p01.showInfo();
		p02.showInfo();
		
		
		//ColorPoint c00 = new ColorPoint("빨강");
		
		ColorPoint c01 = new ColorPoint(3,7,"빨강");
		System.out.println(c01.toString());
		c01.showInfo();
		
	}

}
