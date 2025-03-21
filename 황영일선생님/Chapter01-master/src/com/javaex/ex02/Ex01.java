package com.javaex.ex02;

//클래스
public class Ex01 {

	// 메소드
	public static void main(String[] args) {

		System.out.println("안녕");
		System.out.println("하세요");

		System.out.print("안녕");
		System.out.println("하세요");

		System.out.println("----------------------");

		int i = 2345;
		double d = 3.14;
		char c = '한'; // 실제값을 가지고 있다

		String s = "한"; // 주소를 가지고 있다
		String str = "굿모닝";
		String name = "황일영";

		System.out.println(str);
		System.out.println(str + name + str);
		System.out.println(i + i);  //정수+정수
		System.out.println(i + d);  //정수+실수   정수(자동형변환->실수) + 실수
		System.out.println(str + i);
	
		String str2 = str + i;  //문자열 + 숫자(실수, 정수)  --> 문자열
		
		//굿모닝랑황일영   str랑name
		System.out.println(str+"랑"+ name);
		
		//굿모닝 황일영
		System.out.println(str+" "+ name);
		
		//제이름은 황일영입니다.
		System.out.println("제이름은 " + name + " 입니다"); 
	
		//char형은 + 연산자가 더하기로 계산됨   
		System.out.println(c);
		System.out.println(c + c);
		
		System.out.println("----------------------");
		
		// 제이름은 "황일영" 입니다.
		System.out.println("제이름은 \"" + name + "\" 입니다.");
		
		// 제이름은 \황일영\ 입니다.
		System.out.println("제이름은 \\" + name + "\\ 입니다.");
		
		// 제이름은	황일영 입니다.
	    System.out.println("제이름은	" + name + " 입니다.");
		
	    // 제이름은 
	    // 황일영 입니다.
	    System.out.println("제이름은");
	    System.out.println(name + " 입니다.");
	    
	    System.out.println("제이름은\n" + name + " 입니다.");
	    
	}

}
