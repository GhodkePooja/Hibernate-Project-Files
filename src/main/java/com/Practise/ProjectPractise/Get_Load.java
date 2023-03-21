package com.Practise.ProjectPractise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Get_Load
{
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("NewFile.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	
	Session session=factory.openSession();
    //retrieve data from our database
	Student std=(Student)session.get(Student.class, 1);
	System.out.println("student table details are:"+std);
	System.out.println("(1)Name:"+ "-" + std.getName() +  "(2)"  + "Marks:" + "-" +  std.getMarks());
	
	
	Employee emp=(Employee)session.load(Employee.class,1);
	System.out.println("Employee table details are:"+emp);
	System.out.println("(1)Department:"+ "-" + emp.getDepartment() +  "(2)"  + "Salary:"+ "-" +emp.getSalary());
	
	session.close();
	factory.close();
}
}
