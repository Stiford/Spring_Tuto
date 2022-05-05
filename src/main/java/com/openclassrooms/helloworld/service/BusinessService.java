package com.openclassrooms.helloworld.service;

import org.springframework.stereotype.Component;

import com.openclassrooms.helloworld.model.HelloWorld;

@Component
public class BusinessService {

	public Object getHelloWorld() {
	 return	new HelloWorld();
	}
}
