package com.Practise.ProjectPractise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println("Welcome !!! ");
        Configuration cfg=new Configuration();
        cfg.configure("NewFile.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        System.out.println("project started");
        
        
        //Student Details
        Student s1=new Student();
        s1.setRoll_no(01);
        s1.setName("vedansh");
        s1.setSubject("Hindi");
        s1.setMarks(69);
        System.out.println("student table details are:"+s1);
        
        //Employee Details
        Employee emp=new Employee();
        emp.setEmp_id(01);
        emp.setDepartment("Police");
        emp.setDesignation("SAP");
        emp.setSalary(67000);
        System.out.println("Employee table details are:"+emp);
         
        //Address Details
        Address add=new Address();
        add.setAddress_id(100);
        add.setState("Himachal");
        add.setPincode(423902);
        add.setAbc(1);
        System.out.println("Address table details are:"+add);
        
        //Image 
        FileInputStream fis=new FileInputStream("src/main/java/Baby.jpg");
        byte[]data=new byte[fis.available()];
        fis.read(data);
        add.setImages(data);
        System.out.println("image added");
        
        
        
        
        
        //session is an interface
        Session session=factory.openSession();
        session.beginTransaction();
        session.save(s1);
        session.save(emp);
        session.save(add);
        session.getTransaction().commit();
        session.close();
        System.out.println("project closed");
    }
}
