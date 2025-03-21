package com.javaex.ex07;

public class Math {

	// 필드 -- 없음

	// 생성자
	/*
	 * public Math() {} //자동으로 생긴다
	 */

	// 메소드 gs -- 없음

	// 메소드 일반
	// 메소드 오버로딩 사용
	public int plus(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public double plus(double a, int b) {
		double sum = a + b;
		return sum;
	}

	public double plus(int a, double b) {
		double sum = a + b;
		return sum;
	}

	public double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}

}
