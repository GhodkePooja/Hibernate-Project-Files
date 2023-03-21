package com.Practise.Many_To_Many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Employeee_Project {
public static void main(String[] args) {
		
		System.out.println("project started");
		Configuration cfg=new Configuration();
		cfg.configure("com/Practise/Many_To_Many/NewFile.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employeee e =new Employeee();
		e.setEid(3);
		e.setName("priyanka");
		System.out.println("Employee 1 detalis"+e);
		
		Employeee e1=new Employeee();
		e1.setEid(4);
		e1.setName("diyara");
		System.out.println("Employeee 2 detalis"+e1);
		
	
		
		Project p=new Project();
		p.setPid(103);
		p.setProject_Name("spring");
		System.out.println("project 1 details"+p);
		
		Project p1=new Project();
		p1.setPid(104);
		p1.setProject_Name("css");
		System.out.println("project 2 details"+p1);
		
		List<Employeee> list1=new ArrayList<Employeee>();
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