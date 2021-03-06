package com.org.shub.controller;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class helloController {

	@RequestMapping(value="/admission.sh", method=RequestMethod.GET)
	public ModelAndView hello() {
		return new ModelAndView("AdmissionForm");
		
	}
	
	@RequestMapping(value="/formadmission.sh",method=RequestMethod.POST)
	public ModelAndView result(@RequestParam Map<String, String> reqParam) {
		
		Map<String, String> m = new Hashtable<>();
		m.put("msg", "Name: "+reqParam.get("username")+ " Location:"+reqParam.get("location"));
		return new ModelAndView("success",m);
	}
}
