package com.javaex.practice;

public class Ex14 {

	public static void main(String[] args) {
		
		int a = 5;
		
		System.out.println(a);      //a값 5
		System.out.println(++a);    //a 1증가먼저한 후 출력: a=>5-->6, 출력
		System.out.println(a);      //현재 a값=>6
		System.out.println(a++);    //a 출력후 나중에 1증가: 6출력, a=>6-->7 
		System.out.println(a);      //현재 a값=>7
		System.out.println(--a);    //a 1감소먼저한 후 출력: a=>7-->6, 출력
		System.out.println(a);      //현재 a값=>6 
		System.out.println(a--);    //a 출력후 나중에 1감소: 6출력, a=>6-->5
		System.out.println(a);      //현재 a값=>5
	}

}
