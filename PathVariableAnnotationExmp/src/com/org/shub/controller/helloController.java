package com.org.shub.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/great")
public class helloController {
	
	@RequestMapping("/controllerAnno.sh/{username}/{country}")
	public ModelAndView result(@PathVariable("username") String name, @PathVariable("country") String nation) throws Exception
	{
		Map<String, String> m = new HashMap<>();
		m.put("msg", "Hello "+name+". Welcome to "+nation);
		return new ModelAndView("success",m);
		
	}
	

}
