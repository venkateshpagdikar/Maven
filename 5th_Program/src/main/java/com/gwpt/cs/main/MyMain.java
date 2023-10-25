package com.gwpt.cs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gwpt.cs.entity.Student;

public class MyMain {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Student s1 = ac.getBean("sobj", Student.class);
        Student s2 = ac.getBean("sobj", Student.class);
        
        s1.displayStudentDetails();
        s2.displayStudentDetails();
    }
}
