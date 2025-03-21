package com.javaex.practice;

public class Ex16 {

	public static void main(String[] agrgs) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x *2;
		int b = y++ *2;
		
		System.out.println("a=" + a); // x(1->2) * 2 후 대입
		System.out.println("b=" + b); // y(1)*2 대입후 y(1->2)
		System.out.println("x=" + x); // 현재 x=2
		System.out.println("y=" + y); // 현재 y=2
		
	}

}
