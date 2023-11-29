package com.gwpt.cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.gwpt.cs.config.AppConfig;
import com.gwpt.cs.service.StudentService;

public class MyMain {
	public static void main(String[] args) {
		ApplicationContext ac = new

		AnnotationConfigApplicationContext(AppConfig.class);
		StudentService sc = ac.getBean("studentService", StudentService.class);
		sc.getStudentDetails();
	}
}