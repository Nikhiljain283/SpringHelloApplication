package com.bridgelabz.hello1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	HelloService hello = new HelloService();
	
	@GetMapping("/hello")
	public String sayHello(){
		return hello.getHello();
	}
	
}
