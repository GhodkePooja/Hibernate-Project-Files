package com.Practise.One_to_many_many_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class FetchMapping {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
	    cfg.configure("com/practise/One_to_many_many_to_one/NewFile.cfg.xml");
	    SessionFactory factory=cfg.buildSessionFactory();
	    Session session=factory.openSession();  
	     
	    City c=(City)session.get(City.class,101);
	    System.out.println(c.getCid());
	    System.out.println(c.getCity());
	    
	   // System.out.println(c.getStd().size());
}
}