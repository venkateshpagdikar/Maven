package com.gwpt.cs.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("aobj")
public class Address {

	@Value("pittsburgh")
	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {

		this.city = city;
	}

}