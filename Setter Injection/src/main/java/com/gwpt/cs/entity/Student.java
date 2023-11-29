package com.gwpt.cs.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sobj")
public class Student {

	private int rollNo;
	private String name;

//add setter and getter methods for above variables
	public int getRollNo() {
		return rollNo;
	}

	@Value("13")
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	@Value("Sami")
	public void setName(String name) {
		this.name = name;
	}
}