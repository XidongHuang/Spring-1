package com.tony.spring.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// return bean's object
	@Override
	public Car getObject() throws Exception {

		return new Car(brand, 500000);
	}

	/**
	 * return bean's type
	 * 
	 */
	@Override
	public Class<?> getObjectType() {

		return Car.class;
	}

	@Override
	public boolean isSingleton() {

		return true;
	}

}
