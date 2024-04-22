package com.tnsif.idetifiersdemo;

public class TypeCastingDemo {

	public static void main(String[] args) {
	//widening type casting
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=12.7f;
		double d=f;
		System.out.println(d);
		
		char ch='a';
		int a=ch;
		System.out.println(a);
		
		//narrowing Type casting
		
		double varD=6789.988d;
		float w=(float)varD;
		System.out.println(w);
		

	}

}
