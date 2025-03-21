package com.javaex.ex01;

//클래스
public class Ex10 {

	//메소드
	public static void main(String[] args) {
		
		//대입연산자  =
		int a = 7;
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------------------");

		//산술연산자 
		int sum = a+b;
		System.out.println(sum);
		System.out.println(a+b);  // + 
		System.out.println(a-b);  // -
		System.out.println(a*b);  // *
		System.out.println(a/b);  // /  --> 몫     
		System.out.println(a%b);  // %  --> 나머지
		
		//산술연산자 ->자세히
		System.out.println(7/2);       // 3
		System.out.println(7.0/2);     // 3.5
		System.out.println(7.0/2.0);   // 3.5
		
		System.out.println("------------------------");
		
		//부호연산자
		int var = -3;
		int pVar = +var;   //  +(-3) --> -3
		int mVar = -var;   //  -(-3) --> +3
		System.out.println(pVar);
		System.out.println(mVar);
		
		
		System.out.println("------------------------");
		
		//증감연산자
		System.out.println(a);   // 7
		System.out.println(++a); // 7-->8  1올린다
		System.out.println(a);   // 값을 출력한다  
		
		System.out.println(b);   // 2
		System.out.println(--b); // 2-->1   1내린다
		System.out.println(b);   // 1   값을 출력한다
		
		System.out.println("------------------------");
		System.out.println(a);   // 8  
		System.out.println(a++); // 출력,  8->9
		System.out.println(a);   // 9출력
		
		System.out.println(b);   // 1
		System.out.println(b--); // 출력->1,  -1(맨마지막에 해야됨) 1-->0   
		System.out.println(b);   // 0을 출력
		
		System.out.println("------------------------");
		int c = 5;
		System.out.println(++c * 2);   
		System.out.println(c);  
		
		int d = 5;
		System.out.println(d++ * 2);   
		System.out.println(d);   
		
	}
	
}
