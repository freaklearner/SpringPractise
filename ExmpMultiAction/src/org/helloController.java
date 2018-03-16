package org;

import java.util.Hashtable;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class helloController extends MultiActionController {

	public ModelAndView empsave(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		String name = req.getParameter("empName");
		String cont = req.getParameter("empCont");
		String adrs = req.getParameter("empAddrs");
		Map<String, String> m = new Hashtable<>();
		m.put("empName", name);
		m.put("empCont", cont);
		m.put("empAddr", adrs);
		return new ModelAndView("success",m);
	}
	
	public ModelAndView empupdate(HttpServletRequest req, HttpServletResponse res) throws Exception{
		String name = req.getParameter("empName");
		String cont = req.getParameter("empCont");
		String adrs = req.getParameter("empAddrs");
		String id = req.getParameter("empId");
		Map<String, String> m = new Hashtable<>();
		m.put("empName", name);
		m.put("empCont", cont);
		m.put("empAddr", adrs);
		m.put("empId", id);
		return new ModelAndView("success",m);
	}
}
