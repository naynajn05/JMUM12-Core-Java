package com.tnsif.multileveldemo;

//parent class
public class Notepad {
	
	protected String content;

	public Notepad() {
		
		this.content = "" ;
	}
	
	public void write(String text)
	{
		content+=text;
	}
	
	public void displayData()
	{
		System.out.println("Notepad Content is "+content);
	}
	
	

}
