package com.Practise.SqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.Practise.ProjectPractise.Employee;

public class SqlQuery {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("NewFile.cfg.xml");
	SessionFactory factory =cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	session.beginTransaction();
	
	String q1="select * from Employee_Details";
NativeQuery a=session.createSQLQuery(q1);
	
	List<Object[]> list=a.list();
	for(Object[] e: list)
	{
		System.out.println(Arrays.toString(e));
	}
	
	session.close();
	factory.close();
	
}
}
