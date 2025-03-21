package com.javaex.ex18;

public class Ex03 {

	public static void main(String[] args) {
		
		Point p01= new Point(2,5);
		p01.draw();
		int a=0;
		try {
			a=3;
			Point p02=null;
			p02.draw();
		}catch(NullPointerException e) {
			System.out.println("[err code: 1111]");
		}
		
		System.out.println(a);
		System.out.println("프로그램 종료");
	}

}
