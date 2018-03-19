package com.org.shub.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/great")
public class helloController {
	
	@RequestMapping("/controllerAnno.sh/{username}/{country}")
	public ModelAndView result(@PathVariable Map<String,String> arg)
	{
		String name = arg.get("username");
		String country = arg.get("country");
		Map<String, String> m = new HashMap<>();
		
		m.put("msg", "Hello "+name+". Welcome to "+country);
		return new ModelAndView("success",m);
		
	}
	

}
