package com.mapping;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mapping.Entity.student;
import com.mapping.Utility.HibernateUtility;

public class UpdateData {
	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Delete data by id 
		student stu = session.find(student.class, 3);
		session.remove(stu);
		transaction.commit();
		session.close();
	}
}
