package com.atos;

import com.shapes.Circle;
import com.shapes.Rectangle;
import com.shapes.Square;

public class InheritanceDemo {

	public static void main(String[] args) {
		Circle obj=new Circle(6);
		obj.draw();
		
		Rectangle rect=new Rectangle(4,5);
		rect.draw();
		
		Square squ=new Square(5);
		squ.draw();
		squ.display();
		squ.draw2d();
		
	}
	

}
