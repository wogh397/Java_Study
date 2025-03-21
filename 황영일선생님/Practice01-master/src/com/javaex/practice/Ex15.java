package com.javaex.practice;

public class Ex15 {

	public static void main(String[] args) {
		
		System.out.println( 12 / 5-3 );
		System.out.println( 5 + 19 % 3 );
		System.out.println( 2 + 2 / 2 );
		System.out.println( 29 % 3 + 29 / 3 );
		System.out.println( 29 % 3 + 18.0 / 4 );
		System.out.println( (14 + 7/2) / 4 );
		System.out.println( (14 + 7/2.0) / 5 );

		/*
		(1) 12/5=>2   2-3=>-1
		(2) 19%3=>1   5+1=>6
		(3) 2/2=>1    2+1=>3
		(4) 29%3=>2   29/3=>9   2+9=>11    
		(5) 29%3=>2   18.0/4=>4.5    2+4.5=>6.5 
		(6) 7/2=>3    14+3=>17     17/4=>4
		(6) 7/2.0=>3.5    14+3.5=>17.5     17.5/5=>3.5
		*/
	}

}
