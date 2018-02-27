package Driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.hello;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("Resources/web.xml");
		hello ob = (hello)cap.getBean("h");
		ob.print();
		cap.close();
	
	}
}
