package com.tony.spring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Static Factory method: Return a "bean" instance by invoking a class's static method
 * 
 * @author tony
 *
 */
public class StaticCarFactory {

	private static Map<String, Car> cars = new HashMap<>();
	
	static{
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford", 400000));
		
	}
	
	//satic factory method
	public  static Car getCar(String name) {
		
		return cars.get(name);
		
	}
}
