package com.shapes;

public interface ITwoDShape {

	public void draw2d();
	public  default void message() {
	  System.out.println("Welcome To Shapes Application");
	
}
}
