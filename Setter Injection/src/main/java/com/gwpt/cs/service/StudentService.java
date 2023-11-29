package com.gwpt.cs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gwpt.cs.entity.Address;
import com.gwpt.cs.entity.Student;

@Component
public class StudentService {

	private Student s;

	private Address ad;

	public Student getS() {
		return s;
	}

	@Autowired
	public void setS(Student s) {
		this.s = s;
	}

	public Address getAd() {
		return ad;
	}

	@Autowired
	public void setAd(Address ad) {
		this.ad = ad;
	}

	public void getStudentDetails() {
		System.out.println(s.getName() + " : " + ad.getCity());
	}

}