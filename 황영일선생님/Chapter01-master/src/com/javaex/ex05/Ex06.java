package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		//char형일때
		char[] charArr = new char[3];
		
		/*
		charArr[0] = 65;
		charArr[1] ='b';
		charArr[2] ='c';
		*/
		
		//입력
		for(int i=0; i<charArr.length; i++) {
			int charCode = 65+i;
			charArr[i] = (char)charCode;
		}
		
		
		//출력
		for(int i=0; i<charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		
	}
}
