package com.javaex.ex04;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		int no = 15;
		
		if(no == 15) {
			System.out.println("같다");
		}
		
		System.out.println("--------------------");
		
		char ch = 'b';
		
		if(ch == 'a') {
			System.out.println("같다");
			
		}else {
			System.out.println("다르다");
			
		}
		
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if(str.equals("a")) {    //if(str == "a") 
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		sc.close();
		
	}

}
