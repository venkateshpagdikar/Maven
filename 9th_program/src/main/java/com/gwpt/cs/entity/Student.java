package com.gwpt.cs.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("16")
	private int rollNo;
	@Value("Sami")
	private String name;
	@Autowired
	private Address addr;

	public void displayStudentDetails() {
		System.out.println("RollNO= " + rollNo);
		System.out.println("NAME= " + name);
		System.out.println("ADDRESS= " + addr.getCity());

	}
}