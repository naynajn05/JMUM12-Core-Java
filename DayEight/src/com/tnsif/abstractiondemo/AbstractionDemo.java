package com.tnsif.abstractiondemo;

public class AbstractionDemo {

	public static void main(String[] args) {
		Shape s;
		
		s=new Square();
		s.calArea();
		s.show();
		
		s=new Circle(4.0f);
		s.calArea();
		s.show();
		

	}

}
