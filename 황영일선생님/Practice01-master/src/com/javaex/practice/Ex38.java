package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] agrgs) {

		int totalPrice;
		int resultPrice;
		
		Scanner sc = new Scanner(System.in);

		// 전체금액입력
		System.out.print("전체금액을 입력해주세요:  ");
		totalPrice = sc.nextInt();

		// 계산
		resultPrice = totalPrice/1000 * 1000;
		System.out.println("실제지불금액은 " + resultPrice + " 입니다.");

		sc.close();

	}

}
