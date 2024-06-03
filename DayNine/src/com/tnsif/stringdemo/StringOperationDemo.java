//demonstrate method of the string class
package com.tnsif.stringdemo;

public class StringOperationDemo {
	public static void main(String[] args) {
		//create string
		char c[]= {'I','N','D','I','A'};
		String s=new String(c);
		System.out.println(s);
		
		//More ways to create string
		String s1=new String(" indian ");
		String s2=s1.toUpperCase();//convert the string in upper case
		System.out.println(s1);
		System.out.println(s2);
		
		int count=s1.length();
		System.out.println(count);
		String s3=s1.substring(1);
		System.out.println(s3);
		char c1=s3.charAt(3);
		System.out.println(c1);
		
		System.out.println(s1.substring(1, 6));
		System.out.println(s1.trim());
		System.out.println(s1.isEmpty());
			
		
		//String Comparison
		s1="Good Afternoon";
		s2="Good Afternoon";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		
	}
	
	}


