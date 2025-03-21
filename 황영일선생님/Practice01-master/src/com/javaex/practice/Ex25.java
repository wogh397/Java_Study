package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {
		
		int a = 13;
		
		System.out.println( (a>13) && (a>=13) );
		//F && T => F
		
		System.out.println( (a>13) || (a>=13) );
		//F || T ==> T
		
		System.out.println( (a/3 == 4 ) && (a%3 == 2) );
		//T && F ==> F
		
		System.out.println( (a/3 == 4 ) || (a%3 == 2) );
		//T || F ==> T
		
		System.out.println( (a/3 == 4) && (a%3 == 2) || ( a/3 == 4 ));
		//T && F ==> F    F || T ==> T
	}


}
