package com.javaex.ex12;

public class ColorPoint extends Point{

	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
	}
	
	public ColorPoint(String color) {
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		//부모의 생성자 결정
		/*
		super( );           //부모의 기본생성자 사용
		super.setX(x);      //부모의 메소드사용
		super.setY(y);      //부모의 메소드사용 
		this.color = color; //대입
		*/
		
		super(x,y);         //부모의 다른생성자 사용
		this.color = color;
	}
	

	//메소드 -gs
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	//메소드-일반
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", getX()=" + super.getX() + ", getY()=" + super.getY() + "]";
	}

	public void showInfo() {  //같은이름으로 만든이유?
		System.out.println("점[x="+super.getX()+ ", y="+super.getY() + ", color="+ this.color + "]를 그렸습니다.");
	}
}
