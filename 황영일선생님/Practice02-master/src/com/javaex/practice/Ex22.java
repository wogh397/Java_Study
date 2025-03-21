/*
#월 입력
#switch-case

월을 입력받아 해당월의 일수를 출력하는프로그램을 작성하세요
*/
package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		int max; //큰수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int num01 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num02 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int num03 = sc.nextInt();
		
		max = num01;
		if(max < num02) {
			max = num02;
		}   //if문 다음에 아래의 if문이 실행됩니다.(if~else문 X  비교해볼것)
		
		if(max < num03) {
			max = num03;
		}
		 
		System.out.println("가장 큰수는 " +  max + " 입니다." );
	
		sc.close();

	}
}
