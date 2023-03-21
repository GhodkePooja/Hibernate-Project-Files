package com.Practise.Emb;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Embeddable {
public static void main(String[] args) {
	
	
	Configuration cfg=new Configuration();
	cfg.configure("com/Practise/Emb/NewFile.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	//Student
	Student std=new Student();
	std.setId(02);
	std.setName("Diyara");
	std.setStd("Nusery");
	System.out.println("student details are:"+std);
	
	//Address
	Address add=new Address();
	add.setStreet("near_bus_stop");
	add.setState("MH");
	add.setPincode(423702);
	System.out.println("Address details are:"+add);
	std.setAdd(add);
	System.out.println("add details"+std);
	
	Session session=factory.openSession();
	session.beginTransaction();
	
	session.save(std);
	session.getTransaction().commit();
	session.close();
	factory.close();
}
}
