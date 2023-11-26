package com.gwpt.cs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.gwpt.cs.entity.Student;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ApplicationContext

		ac = SpringApplication.run(Application.class, args);
		Student s = ac.getBean("student", Student.class);
		s.displayStudentDetails();
	}
}