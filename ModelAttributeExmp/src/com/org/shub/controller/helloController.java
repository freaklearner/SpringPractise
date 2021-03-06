package com.org.shub.controller;

import java.util.Hashtable;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.org.shub.model.*;


@Controller
public class helloController {

	@RequestMapping(value="/admission.sh", method=RequestMethod.GET)
	public ModelAndView hello() {
		return new ModelAndView("AdmissionForm");
		
	}

	@ModelAttribute
	public void addingCommonObjects(Model m1) {
		m1.addAttribute("headerMessage", "Welcome to this Site");
	}

	
	@RequestMapping(value="/formadmission.sh",method=RequestMethod.POST)
	public ModelAndView result(@ModelAttribute("student1") Student student1) {
		Map<String, Student> m = new Hashtable<>();
		m.put("msg",student1);
		return new ModelAndView("success",m);
	}
	
	@RequestMapping(value="/testAdmission.sh", method=RequestMethod.GET)
	public ModelAndView testhello() {
		return new ModelAndView("testAdmission","student2",new TestStudent());
		
	}
	
	@RequestMapping(value="./test.sh",method=RequestMethod.POST)
	public ModelAndView testResult(@ModelAttribute("student2") TestStudent student2,BindingResult result) throws Exception{
		if(result.hasErrors()) {
			return new ModelAndView("AdmissionForm");
		}
		return null;
	}
	
}