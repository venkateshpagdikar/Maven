package com.gwpt.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.gwpt.cs.entity.Address;
import com.gwpt.cs.entity.Student;

@Component
public class StudentService {

//injecting object by field Injection
	@Autowired
	private Student s;
	@Autowired
	private Address ad;

public void getStudentDetails() {
System.out.println(s.getRollNo()+" : "+s.getName()+" : "+ad.getCity());
}
}