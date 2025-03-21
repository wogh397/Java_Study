package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
		Point p01 = new Point();
		Point p02 = new Point();

		p01.setX(2);
		p01.setY(3);

		p02.setX(100);
		p02.setY(200);

		p01.draw();
		p02.draw();

		System.out.println("-------------------------");
		/* 구별할수 없다
		Point p03 = new Point(100); //x값만 세팅
		Point p04 = new Point(500); //y값만 세팅
		*/
	}

}
