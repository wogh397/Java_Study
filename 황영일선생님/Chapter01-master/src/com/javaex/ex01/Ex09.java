package com.javaex.ex01;

//클래스
public class Ex09 {

	//메소드
	public static void main(String[] args) {
        /*
		1) 5/4 -> 1   (정수)/(정수) ->(정수)
		2) 1 을 실수형에 담는다   1 --> 1.0 
		*/
        double v01 = 5/4;
        System.out.println(5/4);    
       
        
        /*
        1)(double)5 --> 5.0
        2)5.0 / 4 --> 5.0 / 4.0(자동형변환)
        3)5.0/4.0 -->1.25
        4)1.25 --> double 
        */
        double v02 = (double)5 / 4 ;  
        System.out.println(v02);   

        //위문제랑 같음-->다르게 보이면 더 공부해
        double v03 = 5 / (double)4 ;  
        System.out.println(v03);     
 
        //이게 더쉬워야함 -->아니면 더 공부해
        double v04 = (double)5 / (double)4 ;  
        System.out.println(v04);    

        int v05 = (int)1.3 + (int)1.8 ;  
        System.out.println(v05);    
        
        int v06= (int)(1.3 + 1.8) ; 
        System.out.println(v06); 
        
       

        /////
        char c = 65;
        System.out.println(c);
        
        
        int i = 12;        
        System.out.println(c+i);
        
        
	}

}
