package com.org.shub.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.org.shub.model.Student;

public class StudentDaoImpl implements studentDao {

	JdbcTemplate js;
	
	public void setJs(JdbcTemplate js) {
		this.js = js;
	}
	@Override
	public int create(Student st) {
	
		Object[] ar = {st.getName(),st.getEmail(),st.getAddress()};
		int i = js.update("insert into student(name,email,adrs) values(?,?,?)",ar);
		return i;
	}
	

}
