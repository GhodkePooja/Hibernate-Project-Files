package com.Practise.Mapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Map {
	public static void main(String[] args) {
		
		System.out.println("project started");
		Configuration cfg=new Configuration();
		cfg.configure("com/Practise/Mapp/NewFile.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		System.out.println("Standad_9th class object started");
		
		Standard_9th std =new Standard_9th();
		std.setRoll_no(101);
		std.setName("pooja");
		std.setAge(25);
		System.out.println("std class"+std);
		
		System.out.println("city class object started");
		
		City c=new City();
		c.setCid(11);
		c.setCityName("Hyderabad");
		System.out.println("city class"+c);
		std.setCity(c);
		c.setStd(std);
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		session.save(std);
		session.save(c);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
}}




