package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {

		int[] noArr = new int[6];
		
		//입력
		for(int i=0; i<noArr.length; i++) {
			noArr[i] = (int)(Math.random()*45)+1;
		}
		
		
		//출력
		for(int i=0; i<noArr.length; i++) {
			System.out.println(noArr[i]);
		}
		
		
	}

}
