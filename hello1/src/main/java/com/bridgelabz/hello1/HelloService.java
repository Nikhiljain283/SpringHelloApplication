package com.bridgelabz.hello1;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String getHello() {
		return "hello from bridgelabz";
	}
	
	

	public String getName(String name) {
		String response = "Hello : "+name;
		return response;
	}
}
