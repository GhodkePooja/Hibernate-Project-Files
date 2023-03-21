package com.Practise.H_Q_L;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Practise.Many_To_Many.Employeee;



public class Join {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("NewFile.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		session.beginTransaction();
		
		
		Query joins=session.createQuery("select e.eid, e.name ,p.Project_Name from Employeee as e inner join  projects as p");
		List<Object[]>list1=joins.getResultList();
		
		for(Object[]ob: list1) {
			System.out.println(Arrays.toString(ob));
			System.out.println(joins);
		}
		session.close();
		factory.close();
		
}
}