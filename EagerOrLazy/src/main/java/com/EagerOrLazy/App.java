package com.EagerOrLazy;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;






public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
    	Configuration con = new Configuration().configure()
    			.addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	Student student=session.get(Student.class,3);
    	Laptop laptop=session.get(Laptop.class,2);
    	System.out.println("The laptop data..........\n\n\n"+laptop+"\n\n\n");
    	  Collection<Student> stud=laptop.getStudent();
    	     for(Student s: stud)
    	     {
    	    	 System.out.println(s);
    	     }
    	System.out.println("\n\n\nThe Student data...........\n\n\n"+student);
    	  Collection<Laptop> lap=student.getLaptop();
    	    for(Laptop l:lap)
    	    {
    	    	System.out.println(l);
    	    }
    	
    	tx.commit();
    }
}
