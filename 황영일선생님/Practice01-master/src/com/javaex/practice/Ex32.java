package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		double width;
		double height;
		double area;
		Scanner sc = new Scanner(System.in);
		
		//가로 입력
		System.out.print("가로:  ");
		width = sc.nextDouble();
		
		
		//가로 입력
		System.out.print("세로:  ");
		height = sc.nextDouble();
				
		
		//삼각형의 넓이 구하기
		area = width*height/2;
		
		//구의 부피 출력
		System.out.println("삼각형의 넓이는 " + area + " 입니다." );
		
		sc.close();

	}


}
