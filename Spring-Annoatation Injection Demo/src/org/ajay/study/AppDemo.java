package org.ajay.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {

	public static void main(String[] args) {
		
		//load the spring configure class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		//retrieve the bean
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		//call teh method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get 
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}
}
