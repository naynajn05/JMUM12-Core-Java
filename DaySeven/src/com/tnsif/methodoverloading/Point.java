package com.tnsif.methodoverloading;

public class Point {
	
	private float x;
	private float y;
	
	public Point() {
		this.x=1;
		this.y=2;
		
	}

	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point(float x) {
		super();
		this.x = x;
		this.y= x;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
	
	

}
