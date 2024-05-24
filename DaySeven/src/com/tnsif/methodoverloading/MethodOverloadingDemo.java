package com.tnsif.methodoverloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		System.out.println(MethodOverloading.addition(12.6f, 65));
		int result=MethodOverloading.addition(13, 78);
		System.out.println(result);
		System.out.println(MethodOverloading.addition("Hello ", "All"));
		
		Point p1=new Point();
		System.out.println(p1);
		
		Point p2=new Point(6);
		System.out.println(p2);
		
		
	}

}
