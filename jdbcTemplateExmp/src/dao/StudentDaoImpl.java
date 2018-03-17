package dao;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate js;
	
	public void setJs(JdbcTemplate js) {
		this.js = js;
	}
	
	@Override
	public int save(Student st) {
		try {
			Object[] ar = {st.getName(),st.getEmail(),st.getAddress()};
			int i = js.update("insert into student(name,email,adrs) values(?,?,?)",ar);
			return i;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return 0;
	}

}
