package bussiness;

import dao.StudentDao;
import model.Student;

public class StudentBoImpl implements StudentBo {

	private StudentDao ds;
	
	public void setDs(StudentDao ds) {
		this.ds = ds;
	}
	
	@Override
	public int create(Student st) {
		return ds.save(st);
	}
	

}
