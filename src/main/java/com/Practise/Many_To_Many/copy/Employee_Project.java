package com.Practise.Many_To_Many.copy;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Employee_Project {
public static void main(String[] args) {
		
		System.out.println("project started");
		Configuration cfg=new Configuration();
		cfg.configure("com/Practise/Many_To_Many/NewFile.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee e =new Employee();
		e.setEid(1);
		e.setName("priya");
		System.out.println("Employee 1 detalis"+e);
		
		Employee e1=new Employee();
		e1.setEid(2);
		e1.setName("pooja");
		System.out.println("Employee 2 detalis"+e1);
		
	
		
		Project p=new Project();
		p.setPid(101);
		p.setProject_Name("database");
		System.out.println("project 1 details"+p);
		
		Project p1=new Project();
		p1.setPid(102);
		p1.setProject_Name("hibernate");
		System.out.println("project 2 details"+p1);
		
		List<Employee> list1=new ArrayList<Employee>();
		list1.add(e);
		list1.add(e1);
		System.out.println("employee list"+list1);
		
		List<Project>  list2=new ArrayList<Project>();
		list2.add(p);
		list2.add(p1);
		System.out.println("project list"+list2);
		
		p.setEmp(list1);
		e.setProjects(list2);
		e1.setProjects(list2);
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(p);
		session.save(p1);
		session.save(e);
		session.save(e1);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
}
}