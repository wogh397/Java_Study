package com.javaex.ex12;

public class Point {

	//필드
	private int x;  //protected
	private int y;  //protected

	//생성자  
	public Point() {
	}

	//메소드 gs  
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

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

	//메소드 일반
	@Override
	public String toString() {  //개발용
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void showInfo() { //실제 서비스되는 화면
		System.out.println("점[x="+x+ ", y="+y+ "]를 그렸습니다.");
	}
	
}
