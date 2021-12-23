package com.vkakarla.grouph;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	
	
	
	@GetMapping("/employee/{name}")
	public @ResponseBody String greeting(@PathVariable String name) throws Exception {

		return "Hello " + name + " Welocome To Spring 5 MVC World";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public @ResponseBody String greet() throws Exception {

		return "Hello Welocome To Spring 5 MVC World";
	}
	
}
