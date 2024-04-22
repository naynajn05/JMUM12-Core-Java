package com.tnsif.hierarchical;

public class HieraDemo {

	public static void main(String[] args) {
		
		Person p1=new Person();//tight coupling
		
	Person p; //obj reference
	
	p=new Person();
	if(p instanceof Person)
		System.out.println(p);
	
	p=new Student(); //;Loose coupling//Dynamic Binding
	if(p instanceof Student)
		System.out.println(p);
	
	p=new Employee();
	if(p instanceof Employee)
		System.out.println(p);
	
		
		
		
	}

}
