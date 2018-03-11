package org;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.deploy.ContextLocalEjb;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class helloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("str");
		Map<String, String> m = new HashMap<>();
		m.put("msg", "Hello "+ name);

		return new ModelAndView("success",m);
	}
	
}
