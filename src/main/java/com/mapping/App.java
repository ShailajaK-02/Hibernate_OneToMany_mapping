package com.mapping;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.Vehicle;
import com.mapping.Entity.student;
import com.mapping.Utility.HibernateUtility;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = HibernateUtility.getSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Vehicle v = new Vehicle();
    	v.setName("Pulsar");
    	v.setColor("Blue");
    	
    	Vehicle v1 = new Vehicle();
    	v1.setName("R15");
    	v1.setColor("Black");
    	
    	Vehicle v2 = new Vehicle();
    	v2.setName("xyz");
    	v2.setColor("Gray");
    	
    	List<Vehicle> vlist = Arrays.asList(v,v1);
    	
    	student s = new student();
    	s.setFname("om");
    	s.setLname("chavan");
    	s.setVehicle(vlist);
//    	
//    	List<student> stulist = session.createQuery("select v from student v",student.class).getResultList();
//    	stulist.stream().forEach(a->System.out.println(a));
    	
    	session.persist(s);
    	
    	transaction.commit();
    	session.close();
    }
}
