package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopedemoApp {

	public static void main(String[] args) {

		// load the spring configuration file 
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print result
		System.out.println("\n Pointing the same object : "+result);
		
		System.out.println("\n Memory location : "+theCoach);
		
		System.out.println("\n Memory location : "+alphaCoach +"\n");
		
		// close the context
		context.close();
	}

}
