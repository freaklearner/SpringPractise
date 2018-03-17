package Driver;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bussiness.StudentBo;
import bussiness.StudentBoImpl;
import model.Student;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/web.xml");
		StudentBo ab = (StudentBoImpl)cap.getBean("buss");
		Student st = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter name:");
		st.setName(scan.nextLine());
		System.out.println("enter Email:");
		st.setEmail(scan.nextLine());
		System.out.println("enter Address:");
		st.setAddress(scan.nextLine());
		int i = ab.create(st);
		if(i>0) {
			System.out.println("Record created Successfully");
			
		}else {
			System.out.println("Record creation failed");
		}
		scan.close();
		cap.close();
		
	}
}
