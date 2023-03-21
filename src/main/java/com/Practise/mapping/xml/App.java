package com.Practise.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
public static void main(String[] args) {
	 Configuration cfg=new Configuration();
     cfg.configure("com/Practise/mapping/xml/NewFile.cfg.xml");
     SessionFactory factory=cfg.buildSessionFactory();
     System.out.println("project started");
     
     
     Books b1=new Books();
     b1.setAutId(05);
     b1.setAutName("satish");
     b1.setAutBook("happy");
     b1.setAutCity("pune");
     System.out.println(b1);
     
     
     Books b2=new Books();
     b2.setAutId(06);
     b2.setAutName("sachin");
     b2.setAutBook("funny");
     b2.setAutCity("mumbai");
     System.out.println(b2);
     
     
     Session session=factory.openSession();
		session.beginTransaction();
		
		session.save(b1);
		session.save(b2);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
     System.out.println("project closed");
}
}
