package com.Practise.Cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {
public static void main(String[] args) {
	System.out.println("project started");
	Configuration cfg=new Configuration();
	cfg.configure("com/Practise/Cascading/NewFile.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	
	Standard_12th std=new Standard_12th();
	std.setRoll_no(1);
	std.setName("sanjyot");
	std.setAge(23);
	System.out.println("student 1 data details"+std);
	
	
	Standard_12th std1=new Standard_12th();
	std1.setRoll_no(2);
	std1.setName("sachin");
    std1.setAge(14);
	System.out.println("student 2 data details"+std1);
	
	Standard_12th std2=new Standard_12th();
	std2.setRoll_no(3);
	std2.setName("satish");
    std2.setAge(19);
	System.out.println("student 3 data details"+std2);
	
	
	City1 c=new City1();
	c.setCid(101);
	c.setCity("pune");
	System.out.println("city table details:"+c);
	
	std.setCity(c);
	std1.setCity(c);
	std2.setCity(c);
	
	List<Standard_12th> list=new ArrayList();
	list.add(std);
	list.add(std1);
	list.add(std2);
	c.setStd(list);
	
	
	
	
	Session session=factory.openSession();
	session.beginTransaction();
	
//	session.save(std);
//	session.save(std1);
//	session.save(std2);
	session.save(c);
	session.getTransaction().commit();
	session.close();
	factory.close();
	System.out.println("project closed");
}
}
