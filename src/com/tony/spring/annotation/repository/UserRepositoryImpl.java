package com.tony.spring.annotation.repository;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tony.spring.annotation.TestObject;

@Repository
public class UserRepositoryImpl implements UserRepository, USER_EXCEPTION {

	@Autowired(required=false)
	private TestObject testObject;
	
	
	@Override
	public void save() {

		
		System.out.println("UserRepository save...");
		System.out.println(testObject);
	}

}
