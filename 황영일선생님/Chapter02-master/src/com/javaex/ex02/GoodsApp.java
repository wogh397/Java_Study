package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		//컴퓨터
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		//컵
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.price = 2000;
		
		//니콘추가
		Goods camera = new Goods();
		camera.name = "니콘";
		camera.price = -400000;
		
		
		////////////////////////////////////
		//컴퓨터가격
		System.out.println(computer.price);
		
		//컵이름
		System.out.println(cup.name);
		
		//컴퓨터이름
		System.out.println(computer.name);
		
		//컵가격
		System.out.println(cup.price);
		
		//컴퓨터가격 --> 필요할때 불러와서 쓸수있다
		System.out.println(computer.price);
		
		//카메라 이름
		System.out.println(camera.name);
		
		//카메라 가격
		System.out.println(camera.price);
		
	}

}
