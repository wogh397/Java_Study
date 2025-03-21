package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] noArr = new int[2];
		
		noArr[0] = 3;
		noArr[1] = 6;
		
		System.out.println(noArr[0]);
		//System.out.println(noArr[2]);
		
		System.out.println("------------------------");

		System.out.println(noArr.length);
		System.out.println("------------------------");
		
		//전부출력
		for(int i=0 ; i<noArr.length; i++) {
			System.out.println(noArr[i]);
		}
		
		
	}

}
