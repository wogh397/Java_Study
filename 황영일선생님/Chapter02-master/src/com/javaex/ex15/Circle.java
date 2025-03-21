package com.javaex.ex15;

public class Circle extends Shape {

	private int radius;

	public Circle() {
	}

	public Circle(int radius, String fillColor, String lineColor) {
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	public void draw() {
		System.out.println("====원을 그렸습니다=========");
		System.out.println("반지름:" + radius);
		System.out.println("면색:" + fillColor);
		System.out.println("선색:" + lineColor);
		System.out.println("================================");
	}
}
