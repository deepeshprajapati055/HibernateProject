package com.starting;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Student student = new Student();
		student.setName("Deepesh Prajapati");
		student.setAge(24);
		
		Student student1 = new Student();
		student1.setName("Rahul Prajapati");
		student1.setAge(30);
		
		Student student2 = new Student();
		student2.setName("Jyoti Soni Prajapati");
		student2.setAge(28);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(student);
		session.save(student1);
		session.save(student2);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
