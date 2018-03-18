package com.org.shub.business;


import com.org.shub.dao.studentDao;
import com.org.shub.model.Student;

public class StudentBoImpl implements StudentBo {

	studentDao dao;
	public void setDao(studentDao dao) {
		this.dao = dao;
	}
	@Override
	public int save(Student st) {
		return dao.create(st);
	}
		
	

}
