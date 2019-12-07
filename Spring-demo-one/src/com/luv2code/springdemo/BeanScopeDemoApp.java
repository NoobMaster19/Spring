package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

	//load the Spring configuration file
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("beanScope-applicationContext2.xml");
	
		//retrieve beans from spring container
		Coach theCoach=context.getBean("myCoach",Coach.class);
				
		Coach alphaCoach=context.getBean("myCoach",Coach.class);
		
		//check if they are the same
		boolean results=(theCoach==alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object "+results);
	
		System.out.println("\nMemory location for the Coach "+theCoach);
		
		System.out.println("\nMemory location for the Coach "+alphaCoach+"\n");
		//close
		context.close();
	}

}
