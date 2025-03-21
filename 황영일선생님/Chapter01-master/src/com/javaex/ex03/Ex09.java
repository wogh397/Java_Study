package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

/*
	if ~ else 문에서 모든 조건이 == 이면
	switch ~ case 문으로 표현할 수 있다
	
	아래는 if ~ else 문으로 표현
*/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목번호:");

		int code = sc.nextInt();

		if(code==1) {
			System.out.println("R101호");
		 
		}else if(code==2) {
			System.out.println("R202호");
			
		}else if(code==3) {
			System.out.println("R303호");
			
		}else if(code==4) {
			System.out.println("R404호");
		
		}else {
			System.out.println("상담원");
		}

		sc.close();
	}

}
