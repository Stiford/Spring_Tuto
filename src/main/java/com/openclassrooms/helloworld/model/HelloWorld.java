package com.openclassrooms.helloworld.model;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private String value = "Hello World !";
	
	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString(){
		return value;
	}

}
