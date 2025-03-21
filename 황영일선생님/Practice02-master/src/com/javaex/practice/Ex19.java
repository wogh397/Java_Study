package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		//변수
		int thisYear = 2023;
		int year;
		int age;
		
		//태어난 년도를 입력받는다
		Scanner sc = new Scanner(System.in);
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		year = sc.nextInt();

		//나이를 계산합니다.
		age = thisYear-year;
		
		
		//조건식을 비교합니다.
		if( age<15 ||  age>=65 ) { // 15세미만  65세이상 둘중에 1개라도 해당되면 무료접종대상자 
			System.out.println(age + "살 무료예방접종 대상자 입니다");

		}else {  //위의 조건이 아닌 모든 경우
			System.out.println(age + "살 무료예방접종 대상자가 아닙니다");
		}
		
		sc.close();

	}



	
	
	
}
