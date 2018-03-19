package com.org.shub.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class helloController {
	
	@RequestMapping("/welcome.sh")
	public ModelAndView result()
	{
		Map<String, String> m = new HashMap<>();
		m.put("msg", "Welcome to Web");
		return new ModelAndView("success",m);
		
	}
	

}
