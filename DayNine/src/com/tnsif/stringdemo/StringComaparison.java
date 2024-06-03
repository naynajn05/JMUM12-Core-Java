package com.tnsif.stringdemo;

public class StringComaparison {

	public static void main(String[] args) {
		//creating strings i=using literals
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating strings using new operator
		String s3=new String("TNSIF");
		String s4=new String("tnsif");
		
		//== and equals
		//== -> Memory
		//equals ->Content
		System.out.println("Case 1 "+(s1==s2));//True
		System.out.println("Case 2 "+s1.equals(s2));//True
		System.out.println("Case 3 "+(s1==s3));//False
		System.out.println("Case 4 "+s1.equals(s3));//True
		System.out.println("Case 5 "+(s4==s3));//False
		System.out.println("Case 6 "+s4.equals(s3));//True
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//CompareTo-lexographically
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s4));
		
		
		

	}

}
