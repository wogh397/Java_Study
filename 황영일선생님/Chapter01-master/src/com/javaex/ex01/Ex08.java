package com.javaex.ex01;

//클래스
public class Ex08 {

	//메소드
	public static void main(String[] args) {
		
		//자동형변환
		int var01 = 2;
		double var02 = 3.5;
		
		// 2 +3.5 ==> 2.0 + 3.5   ==> 2(int) -> 2.0(doble) -->자동형변환
		System.out.println(var01 + var02);
		
		// dobule + double
		double result01 = var01 + var02;
		System.out.println(result01);
		
		//------------------------------------------
		//강제형변환
		//실수-->정수 (소수점 아래없어짐)
		double var03 = 13.212;
		int var04 = (int)var03;
		System.out.println(var04);
		
		//정수-->실수
		int var05 = 123;
		double var06 = (double)var05;
		System.out.println(var06);
		
		//------------------------------------------
		
		
		
		
		
		
	}
	
	
}
