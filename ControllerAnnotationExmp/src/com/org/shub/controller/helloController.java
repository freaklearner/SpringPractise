package com.org.shub.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class helloController {
	
	@RequestMapping("/controllerAnno.sh")
	public ModelAndView result(HttpServletRequest req, HttpServletResponse res) throws Exception
	{
		String name = req.getParameter("name");
		Map<String, String> m = new HashMap<>();
		m.put("msg", "Hello "+name+". Welcome to Web");
		return new ModelAndView("success",m);
		
	}
	

}
