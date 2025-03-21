package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		Drawable[] dArray = new Drawable[4];
		
		
		Drawable p01 = new Point(3,6);
		Drawable r01= new Rectangle(10, 10, "빨강", "검정");
		Drawable c01 = new Circle(10, "빨강", "검정");
		Drawable t01 = new Triangle(30, 30, "빨강", "검정");
		
		
		dArray[0] = t01;
		dArray[1] = r01;
		dArray[2] = c01;
		dArray[3] = p01;
		
		
		//dArray[0].draw();
		//r01.draw();
		/*
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		*/
		/////////////////////////////////////////////////////
		//System.out.println(((Shape)r01).area());  
		//System.out.println(((Shape)c01).area());  
		//System.out.println(((Shape)t01).area());  
		////////////////////////////////////////////////////////
		
		for(int i=0; i<dArray.length; i++) {
			
			if(dArray[i] instanceof Shape   ) {
				System.out.println(((Shape)dArray[i]).area());  
			}
			
		}
		
		
		
		
	}

}
