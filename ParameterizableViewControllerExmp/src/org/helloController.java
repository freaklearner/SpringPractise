package org;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.ParameterizableViewController;


public class helloController extends ParameterizableViewController{
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("str");
		Map<String, String> m = new HashMap<>();
		m.put("msg", "Hello "+name);
		return new ModelAndView(getViewName(),m);
	}
	
}
