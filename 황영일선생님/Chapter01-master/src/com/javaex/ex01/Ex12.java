package com.javaex.ex01;

//클래스
public class Ex12 {

	//메소드
	public static void main(String[] args) {

		int a = 5;
		int b = 7;
		
		System.out.println("&&연산자-------");  //깐깐
		System.out.println(true && true);   // T && T --> T
		System.out.println(true && false);  // T && F --> F
		System.out.println(false && true);  // F && T --> F
		System.out.println(false && false);  // F && T --> F
		
		
		System.out.println("||연산자-------");  //널널
		System.out.println(true || true);   // T || T --> T
		System.out.println(true || false);  // T || F --> T
		System.out.println(false || true);  // F || T --> T
		System.out.println(false || false);  // F || T --> T
		
		System.out.println("! 연산자-------");  //반대
		System.out.println(!true);  // !T
		System.out.println(!false);  // !F
		
		System.out.println("응용-------");
		
		boolean result = a<b && a>b; //  5<7(T) && 5>7(F)            T&&F-->F
		System.out.println(result);
		
		System.out.println(true && false || true); // T&&F -> F,  F || T -> T
		System.out.println(true || false || true); 
		
		
		System.out.println( !(a>b) ); 
	}

}
