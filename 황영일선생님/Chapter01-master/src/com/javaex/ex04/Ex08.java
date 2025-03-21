package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		//y가상의 y축위치
		for(int y=1; y<=6; y++) {
			
			//x축 별찍는 횟수
			for(int x=1; x<=y; x++) {
				System.out.print("*");
			}
			System.out.println(""); //진짜줄바꿈
		}

	}

}
