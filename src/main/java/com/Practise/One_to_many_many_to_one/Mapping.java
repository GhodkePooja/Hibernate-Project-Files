package com.Practise.One_to_many_many_to_one;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Mapping {
public static void main(String[] args) {
	System.out.println("project started");
	Configuration cfg=new Configuration();
	cfg.configure("com/Practise/One_to_many_many_to_one/NewFile.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	
	Standard_10th std=new Standard_10th();
	std.setRoll_no(3);
	std.setName("sanjyot");
	std.setAge(23);
	System.out.println("student 1 data details"+std);
	
	
	Standard_10th std1=new Standard_10th();
	std1.setRoll_no(4);
	std1.setName("sachin");
    std1.setAge(14);
	System.out.println("student 2 data details"+std1);
	
	
	City c=new City();
	c.setCid(102);
	c.setCity("pune");
	System.out.println("city table details:"+c);
	
	std.setCity(c);
	std1.setCity(c);
	
	List<Standard_10th> list=new ArrayList();
	list.add(std);
	list.add(std1);
	c.setStd(list);
	
	
	
	
	Session session=factory.openSession();
	session.beginTransaction();
	
	session.save(std);
	session.save(std1);
	session.save(c);
	session.getTransaction().commit();
	session.close();
	factory.close();
	System.out.println("project closed");
}
}
