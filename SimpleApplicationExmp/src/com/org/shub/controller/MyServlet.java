package com.org.shub.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.shub.business.StudentBo;
import com.org.shub.business.StudentBoImpl;
import com.org.shub.model.Student;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ConfigurableApplicationContext cap;
	
	public void init() throws ServletException {
		cap = new ClassPathXmlApplicationContext("resources/test.xml");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("name");
		String address = request.getParameter("name");
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
