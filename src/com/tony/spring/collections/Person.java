package com.tony.spring.collections;

import java.util.List;

import com.tony.spring.beans.Car;

public class Person {
	private String name;
	private int age;
	private List<Car> cars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + cars + "]";
	}



	public Person(String name, int age, List<Car> car) {
		super();
		this.name = name;
		this.age = age;
		this.cars = car;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> car) {
		this.cars = car;
	}

	public Person() {
		super();
	}

}
