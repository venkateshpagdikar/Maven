package com.gwpt.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwpt.cs.entity.Address;
import com.gwpt.cs.entity.Student;

@Service
public class StudentService {

	private Student stud;

	private Address ad;

	public StudentService() {

	}

//Autowired Annotation is used for injecting the object
	@Autowired
	public StudentService(Student s, Address ad) {

		this.stud = s;
		this.ad = ad;
	}

	public void getStudentDetails() {
		System.out.println(stud.getName() + " : " + ad.getCity());
	}
}