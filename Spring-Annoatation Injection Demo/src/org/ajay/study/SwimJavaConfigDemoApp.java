package org.ajay.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read spring confing java class
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
		//call a method and the bean
		System.out.println(theCoach.getDailyFortune());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}
}
