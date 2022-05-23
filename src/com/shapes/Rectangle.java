package com.shapes;

public class Rectangle extends Shape{
	
	public Rectangle(int l, int b) {
	      length=l;
	      breadth=b;
	      
}

	@Override
	public void draw() {
		int area=length*breadth;
		System.out.println("Area of the Rectangle is "+ area);
	}

	}