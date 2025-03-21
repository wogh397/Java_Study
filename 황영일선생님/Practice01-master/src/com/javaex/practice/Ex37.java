package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] agrgs) {

		int totalPen;
		int totalPerson;

		Scanner sc = new Scanner(System.in);

		// 전체연필갯수 입력
		System.out.print("전체 연필갯수를 입력해주세요:  ");
		totalPen = sc.nextInt();

		System.out.print("전체 인원수를 입력해주세요:  ");
		totalPerson = sc.nextInt();


		// 계산
		System.out.println("1인당 연필의 갯수는 " + totalPen/totalPerson + " 입니다.");
		System.out.println("연필의 나머지 갯수는 " + totalPen%totalPerson + " 입니다.");

		sc.close();

	}

}
