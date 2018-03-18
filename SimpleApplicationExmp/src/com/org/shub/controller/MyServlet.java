package com.org.shub.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.shub.business.StudentBo;
import com.org.shub.business.StudentBoImpl;
import com.org.shub.model.Student;

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ConfigurableApplicationContext cap;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		cap = new ClassPathXmlApplicationContext("resources/test.xml");
		super.init(config);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("adrs");
		StudentBo ob = (StudentBoImpl)cap.getBean("buss");
		Student st =new Student();
		st.setName(name);
		st.setEmail(email);
		st.setAddress(address);
		int i = ob.save(st);
		if(i!=0) {
			response.getWriter().println("Record Created Successfully");
		}
		else {
			response.getWriter().println("Record Creation failed");
		}
		
	}


}
