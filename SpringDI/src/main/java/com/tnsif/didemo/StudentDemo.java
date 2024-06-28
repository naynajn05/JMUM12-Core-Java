package com.tnsif.didemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student student1=ac.getBean("s1",Student.class);
		System.out.println(student1);
		
		Student student2=ac.getBean("s2",Student.class);
		System.out.println(student2);
		
	}

}
