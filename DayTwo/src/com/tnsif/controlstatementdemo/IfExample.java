package com.tnsif.controlstatementdemo;

public class IfExample {

	public static void main(String[] args) {
		int year=2022;
		
		if((year % 400==0)||((year%4==0)&&(year%100!=0)))
				{
			System.out.println("This is the  leap year "+year);
			
				}
		else
		{
			System.out.println("This is not the  leap year "+year);
		}
	}

}
