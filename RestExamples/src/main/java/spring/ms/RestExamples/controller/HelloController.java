package spring.ms.RestExamples.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/HelloWorld")
	public String helloWorld() {
		return "Hello world Spring boot";
	}
}
