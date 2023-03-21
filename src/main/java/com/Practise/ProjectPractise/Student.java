package com.Practise.ProjectPractise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_Details")
public class Student {
@Id
@GeneratedValue
private int roll_no;
private String name;
private String subject;
private int marks;
public Student(int roll_no, String name, String subject, int marks) {
	super();
	this.roll_no = roll_no;
	this.name = name;
	this.subject = subject;
	this.marks = marks;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll_no=" + roll_no + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
}
}
