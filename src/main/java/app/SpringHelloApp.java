package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lib.Coach;

public class SpringHelloApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		
		//step 1
		Coach theCoatch = context.getBean("myCoach1",Coach.class);
		System.out.println(theCoatch.getDailyWork());
	}
}
