package com.javaex.ex02;

import java.util.Scanner;

//클래스
public class Ex03 {

	//메소드
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		
		String name = sc.nextLine();
		
		//당신의 이름은 황일영 입니다.
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		sc.close();
		
	}

}
