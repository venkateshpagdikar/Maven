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

	@Value("101")
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	@Value("Itachi Uchiha")
	public void setName(String name) {
		this.name = name;
	}

}