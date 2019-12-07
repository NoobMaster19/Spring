package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);

		//check if they are same object
		boolean result=(theCoach==alphaCoach);
		
		//print out there results
		System.out.println("Pointing to the same object: "+result);
		
		System.out.println("Memory location for theCoach:"+theCoach);
		System.out.println("Memory location for alphaCoach: "+alphaCoach);
		
		//close the context
		context.close();
	
	}

}
