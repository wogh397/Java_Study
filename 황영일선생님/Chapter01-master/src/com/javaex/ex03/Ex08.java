package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력해주세요");
		
		int point = sc.nextInt();
		
		if(point>0) {
			
			if(point%2==0) { //짝수야?
				System.out.println("짝수");
			
			}else {
				System.out.println("홀수");
			}
			
		}else if(point<0){
			System.out.println("음수");
			
		}else {
			System.out.println("0");
			
		}
		
		
		sc.close();
	}

}
