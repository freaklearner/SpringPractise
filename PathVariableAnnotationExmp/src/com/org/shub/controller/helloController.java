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
	public ModelAndView result(@PathVariable Map<String,String> param) throws Exception
	{
		Map<String, String> m = new HashMap<>();
		m.put("msg", "Hello "+param.get("username")+". Welcome to "+param.get("country"));
		return new ModelAndView("success",m);
		
	}
	

}
