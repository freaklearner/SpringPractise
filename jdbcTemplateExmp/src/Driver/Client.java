package Driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bussiness.StudentBo;
import bussiness.StudentBoImpl;
import model.Student;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/web.xml");
		StudentBo ab = (StudentBoImpl)cap.getBean("buss");
		int i = ab.create(new Student("abhi", "abhi@gmail.com", "Delhi"));
		if(i>0) {
			System.out.println("Record created Successfully");
			
		}else {
			System.out.println("Record creation failed");
		}
		
	}
}
