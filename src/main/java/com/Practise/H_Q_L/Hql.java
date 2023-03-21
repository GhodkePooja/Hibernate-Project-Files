package com.Practise.H_Q_L;

import java.util.Arrays;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Practise.ProjectPractise.Employee;


public class Hql {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("com/Practise/Many_To_Many/NewFile.cfg.xml");
	SessionFactory factory =cfg.buildSessionFactory();
	
	Session session=factory.openSession();
	session.beginTransaction();
	
	//HQL query
	//String query ="from Employee";
	//String query ="from Employee where Employee_id<=5";
	//String query ="from Employee where Employee_id=10";
	//String query ="from Employee as emp where emp.id=:A and emp.salary>20000";
	
	
Query que=session.createQuery("from Employee as emp where emp.id=:A and emp.salary>20000");
que.setParameter("A", 3);

 List<Employee>list=que.list();
 for(Employee e : list)
 {
	
	   System.out.println(e.getEmp_id());
	  System.out.println(e.getDepartment());
   }
   
   
 //  System.out.println("selected");
	//Delete
//   Query del=session.createQuery("delete from Employee where id = :i");
//	del.setParameter("i", 10);
//	
//	int d=del.executeUpdate();
//	System.out.println("Deleted...");
//	System.out.println(d);
	
	//update
//	Query up=session.createQuery("update  Employee set designation=:d where id=:i");
//	up.setParameter("d", "IT engineer");
//	up.setParameter("i", 2);
//	
//	int upd=up.executeUpdate();
//	System.out.println("updated");
//	System.out.println(upd); 
//	
	//join
Query q1=session.createQuery("select e1.eid, e1.name ,p1.Project_Name from Employeee as e1 inner join e1.projects as p1");
List<Object[]>list1=q1.getResultList();
	
for(Object[]ob: list1) {
		System.out.println(Arrays.toString(ob));
	System.out.println(q1);
	
	session.close();
	factory.close();
}
}}
