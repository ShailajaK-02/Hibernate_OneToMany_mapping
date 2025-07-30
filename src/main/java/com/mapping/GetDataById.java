package com.mapping;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.student;
import com.mapping.Utility.HibernateUtility;

public class GetDataById {
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		//get data by id first fetch the data 
		student stu = session.find(student.class, 1);
		System.out.println(stu.toString());
		
		transaction.commit();
		session.close();
	}
}
