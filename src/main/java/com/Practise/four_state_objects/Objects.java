package com.Practise.four_state_objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Objects {
public static void main(String[] args) {
	System.out.println("project open");
	Configuration cfg =new Configuration();
	cfg.configure("com/Practise/four_state_objects/Hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	//Transient state//only setting data
	Student std=new Student();
	std.setSid(105);
	std.setName("Satish");
    std.setCity("hyderabad");
    System.out.println("student details:"+std);
    
	Session session=factory.openSession();
	session.beginTransaction();
	session.save(std);//persistent state//saving data
	session.getTransaction().commit();
	session.close();
	std.setSid(106);//detached
	std.setName("prasad");
    std.setCity("hyderabad");
    System.out.println("student details:"+std);//removed
    
	factory.close();
	System.out.println("project closed");
}
}
