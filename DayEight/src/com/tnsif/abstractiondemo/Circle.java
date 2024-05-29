package com.tnsif.abstractiondemo;

public class Circle extends Shape {
	private float radius;

	public Circle(float radius) {

		this.radius = radius;
	}

	@Override
	void calArea() {
		super.area =  3.14 * radius * radius;

	}

}
