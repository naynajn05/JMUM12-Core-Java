package com.tnsif.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		//Create obj of StringBuffer
		
		StringBuffer sb=new StringBuffer("Hello");
		
		System.out.println("String Buffer obj is "+sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		//append and insert
		String s;
		String s1="Hello";
		
		sb=new StringBuffer(40);
		s=sb.append("s =").append(s1).append(" Everyone ").append("!").append("How are you? ").toString();
		System.out.println(s);
		
		sb=new StringBuffer("I Java");
		System.out.println(sb);
		
		System.out.println(sb.insert(2, "like "));
		
		System.out.println(sb.delete(7, 11));
		
		System.out.println(sb.reverse());
		
	}

}
