package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		//변수
		int thisYear = 2023;
		int year;
		int age;
		boolean isTest;
		
		//태어난 년도를 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		year = sc.nextInt();

		//나이를 계산합니다.
		age = thisYear-year;
		
		//홀수해, 짝수해로 검사대상인지 판단
		isTest = age%2 == 0;// 이면 검사대상
	    /*계산방법
	     	올해짝수해, 태어난해 짝수해일때
	     	2024(올해) - 1994(태어난해) = 30(나이)
	     	30 % 2==>0  나머지0  
	     	
	     	올해짝수해, 태어난해 홀수해일때
	     	2024(올해) - 1993(태어난해) = 31(나이)
	     	31 % 2==>1  나머지1
	     	
	     	올해홀수해, 태어난해 홀수해일때
	     	2021(올해) - 1993(태어난해) = 30(나이)
	     	30 % 2==>0  나머지0  
	     	
	     	올해홀수해, 태어난해 짝수해일때
	     	2021(올해) - 1994(태어난해) = 30(나이)
	     	30 % 2==>0  나머지0  
	     	
	     	
	     	결론: 나머지가0이면 검사받고 True
	     	     나머지가1이면 검사못받고 False
	    */
		                  
		System.out.println("올해:" + thisYear);
		System.out.println("태어난해:" + year);
		System.out.println("나이:" + age);
		System.out.println("==============================");				
		//조건식을 비교합니다.
		if( age >= 20) { //20살이상, 올해건강검진해, 
			System.out.println("20살이상");
			if(isTest) {
				System.out.println("건강검진해");
				
				if(age >= 40) {
					System.out.println("암 검사");
				}else {
					System.out.println("암 검사X");
	
				}
				
			}else {
				System.out.println("건강검진해 아님");
			}
			

		}else {  //20살미만
			System.out.println("20살미만 건강검진대상이 아님");
		}
		
		sc.close();

	}



	
	
	
}
