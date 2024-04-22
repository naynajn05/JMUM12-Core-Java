package com.tnsif.controlstatementdemo;

public class NestedIfElse {

	public static void main(String[] args) {

		//to find max value

		int a = 100, b = 30, c = 52;
		
		System.out.println("Maximum value is ");
		if (a>b) //a
		{
			if(a>c)//a
			{
				System.out.println(a);
			}else //c
			{
				System.out.println(c);
			}
		}
		else//b
		{
			if(b>c)//b
			{
				System.out.println(b);
			}else //c
			{
				System.out.println(c);
			}
		}

	}

}
