package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {

		//Resource resource = new ClassPathResource("applicationContext.xml");
	//	BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext apt=new ClassPathXmlApplicationContext("applicationContext.xml");
		

		Student student = (Student) apt.getBean("parvez");
		student.displayInfo();
		//Student student = (Student) factory.getBean("parvez");
	//	student.displayInfo();
	}

}
