package com.att.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@Autowired
	private BasicCal basicCal;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "Hello World";
	}

	@RequestMapping("/cal")
	public String cal(@RequestParam("input1") String input1, @RequestParam("input2") String input2,
			@RequestParam("operation") String operation) {
		return String.valueOf(basicCal.checkOperation(input1, input2, operation));
	}

}