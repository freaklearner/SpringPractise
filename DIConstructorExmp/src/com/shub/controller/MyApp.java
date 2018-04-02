package com.shub.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shub.model.Coach;

public class MyApp {

	public static void main(String[] args) {
	
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("com/shub/Resources/spring.xml");
		Coach obj = cap.getBean("baseballCoach",Coach.class);
		System.out.println(obj.getDailyWorkout());
		System.out.println(obj.getFortune());
		cap.close();
	}
}
