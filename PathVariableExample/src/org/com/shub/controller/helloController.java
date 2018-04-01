package org.com.shub.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class helloController {
	
	@RequestMapping("/welcome/{username}")
	public ModelAndView request(@PathVariable("username") String name) throws Exception {
		
		System.out.println(name);
		Map<String, String> m = new HashMap<>();
		m.put("username", name);
		return new ModelAndView("success",m);
		
	}
}
