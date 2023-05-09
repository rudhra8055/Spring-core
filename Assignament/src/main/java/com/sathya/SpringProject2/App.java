package com.sathya.SpringProject2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello Everyone");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring-config.xml");

		Student student = context.getBean("student", Student.class);
		System.out.println("The student info: " + student.getRollno() + " " + student.getName());

		Marks marks = student.getMarks();
		System.out.println("The marks are : " + marks.getSocial() + " " + marks.getScience() + " " + marks.getMaths());
		marks.TotalMarks();

		School school = student.getSchool();
		System.out
				.println("The school info: " + school.getsId() + " " + school.getSname() + " " + school.getSlocation());

		context.close();

	}
}
