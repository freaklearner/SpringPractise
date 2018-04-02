package com.shub.helper;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("com/shub/resources/spring.xml");
	Coach obj = cap.getBean("Coach",Coach.class);
		
	System.out.println(obj.getDailyWorkOut());
	
	cap.close();

	}

}
