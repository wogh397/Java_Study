package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		
		int no = 1;
		
		while(true) {
			
			if( no%6==0 && no%14==0) {
				
				System.out.println(no);
				break;
			}
			
			no++;
		}
		
	}

}
