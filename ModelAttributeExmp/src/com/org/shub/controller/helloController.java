package com.org.shub.controller;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.shub.model.Student;


@Controller
public class helloController {

	@RequestMapping(value="/admission.sh", method=RequestMethod.GET)
	public ModelAndView hello() {
		return new ModelAndView("AdmissionForm");
		
	}
	
	@RequestMapping(value="/formadmission.sh",method=RequestMethod.POST)
	public ModelAndView result(@ModelAttribute("student1") Student student1) {
		
		String name = student1.getUsername();
		String loc = student1.getLocation();
		Map<String, String> m = new Hashtable<>();
		m.put("msg", "Name: "+name+ " Location:"+loc);
		return new ModelAndView("success",m);
	}
}
