package beans;

import java.util.Date;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/web.xml");
		BasicDataSource bds =(BasicDataSource) cap.getBean("bds");
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

