package org.com.shub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import java.util.HashMap;
import java.util.Map;

import org.com.shub.model.*;

@Controller
public class helloController {
	
	@InitBinder
	public void customPropertyEdit(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, "username", new StudentNameEditor());
	}
	
	
	@RequestMapping(value="/welcome.sh",method=RequestMethod.POST)
	public ModelAndView result(@ModelAttribute("student")Student student) throws Exception{
		
		Map<String, Student> m = new HashMap<>();
		m.put("student", student);
		return new ModelAndView("success",m);
	}

}
