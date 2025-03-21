package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	// 이렇게 줄여서 짤수 있으나 
	// 많은 생각을 해야 해석할 수 있는 코드는 "덜 좋은 코드"이다
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요:");
		
		int code = sc.nextInt();
		
		switch(code) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30일");
				break;	
				
			case 2:
				System.out.println("28일");
				break;	
				
			default:
				System.out.println("31일");
				break;	
		
		}
		

	}

}
