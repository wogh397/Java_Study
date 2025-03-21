package com.javaex.ex04;

//클래스명
public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {}

	
	/* 아래 두개는 구별되지 않는다
	public Point(int x) {
		this.x = x;
	}
	
	public Point(int y) {
		this.y =y;
	}
	*/
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y =y;
	}
	
	
	
	// 메소드
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// 일반이름
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다." );
	}
}
