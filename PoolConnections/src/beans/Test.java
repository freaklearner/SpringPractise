package beans;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		org.apache.tomcat.dbcp.dbcp.BasicDataSource bds = new org.apache.tomcat.dbcp.dbcp.BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost/test");
		bds.setUsername("root");
		bds.setPassword("root123");
		bds.setMaxActive(10);
		bds.setMinIdle(5);
		bds.setMaxWait(1000*5);
		Date d1 = new Date();
		for(int i=0;i<200000;i++) {
			try {
				
					java.sql.Connection con = bds.getConnection();
					System.out.println( con +" "+i);
					con.close();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
		Date d2 = new Date();
		System.out.println("Start Date: "+d1);
		System.out.println("End Date: "+d2);
	}
}

