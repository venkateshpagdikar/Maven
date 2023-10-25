package com.gwpt.cs.entity;
public abstract class Student {
private int rollNo;
private String name;
public abstract Address getAddressObject(); 
public int getRollNo() {
return rollNo;
}
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public void displayStudentDetails() {
System.out.println("ROLLNO="+rollNo+" : NAME="+name+" : CITY="+getAddressObject().getCity());
}
}
