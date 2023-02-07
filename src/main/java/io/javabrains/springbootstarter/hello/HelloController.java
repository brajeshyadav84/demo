package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//@RequestMapping map only to the GET method by default. for other you have to specify annotation.
	//npx kill-port 8080 command is use to kill port
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping("/welcome")
	public String sayWelcome() {
		return "Welcome Brajesh";
	}
}
