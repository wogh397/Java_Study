package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	/*
	if ~ else 문에서 모든 조건이 == 이면
	switch ~ case 문으로 표현할 수 있다
	
	아래는 switch ~ case 문으로 표현
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목번호:");
		
		int code = sc.nextInt();
		
		switch(code) {
			case 1:
				System.out.println("R101호");
				break;
				
			case 2:
				System.out.println("R202호");
				break;
				
			case 3:
				System.out.println("R303호");
				break;
			
			case 4:
				System.out.println("R404호");
				break;
				
			default:
				System.out.println("상담원");
				break;
		}
		
		
		
		sc.close();
	}

}
