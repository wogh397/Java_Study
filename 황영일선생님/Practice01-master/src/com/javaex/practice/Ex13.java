package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		
		System.out.println(13/5);                  //(1)
		System.out.println((double)13/5);          //(2)
		System.out.println(13/(double)5);          //(3)
		System.out.println((double)13/(double)5);  //(4)
		System.out.println(13.0/5);                //(5)
		System.out.println(13/5.0);                //(6)
		System.out.println((double)(13/5));        //(7)  
		
		/*
		(1) 정수/정수 ==> 정수         		2
		(2) 13.0/5 ==> 13.0/5.0     	2.6
		(3) 13/5.0 ==> 13.0/5.0     	2.6
		(4) 13.0/5.0                	2.6
		(5) 13.0/5.0                	2.6
		(6) 13.0/5.0                	2.6
		(7) 13/5 ==> 2 ==> (double)2   	2.0
		*/
		
		
	}

}
