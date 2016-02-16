package com.tony.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tony.spring.collections.NewPerson;

public class Main {

	
	public static void main(String[] args) {
		
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("Tony");
//		helloWorld.hello();
	
		
		
		//1. Create Spring IOC object container
		//ApplicationContext is the IOC container, it is an interface.
//		ClassPathXmlApplicationContext: It is the ApplicationContext's instance object. Load Configure file
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		System.out.println(applicationContext);
		//2. Gain Bean instance from IOC container
		//Locate container bean from id: the bean must be unique in the configure file
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
		
		
		//3. Invoke hello() method
		helloWorld.hello();
		
		
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
		Car car2 = (Car) applicationContext.getBean("car2");
		System.out.println(car2);
		
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);
		

		
	}
}
