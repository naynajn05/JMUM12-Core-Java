package com.tnsif.springiocdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		/*
		 * Airtel airtel=new Airtel(); airtel.calling(); airtel.browsing();
		 * 
		 * Jio jio=new Jio(); jio.calling(); jio.browsing();
		 */
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("Configuration is done");
		
		
		/*
		 * Airtel a= ac.getBean("airtel",Airtel.class); a.calling(); a.browsing();
		 */
		/*
		 * Jio j= ac.getBean("jio",Jio.class); j.calling(); j.browsing();
		 */
		 
		
		Sim s=ac.getBean("sim",Sim.class);
		s.calling();
		s.browsing();

	} 

}
