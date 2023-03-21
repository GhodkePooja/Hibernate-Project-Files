package com.Practise.Hql_Pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Practise.ProjectPractise.Employee;

public class HqlPagination {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("NewFile.cfg.xml");
	SessionFactory factory =cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	session.beginTransaction();
	
	Query qu=session.createQuery("from Employee");
	qu.setFirstResult(1);
	qu.setMaxResults(5);	
	List<Employee> list = qu.list();
	for(Employee e : list)
	{
		System.out.println(e.getEmp_id() + "  "  +  e.getDesignation() +  "   "  + e.getSalary());
	}
	
	session.close();
	factory.close();
}
}
