package com.oto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		TableOne t1 = new TableOne();
		t1.setName("Deepesh Prajapat");
		t1.setAge(24);
		
		TableTwo t2 = new TableTwo();
		t2.setWifeName("Nisha Singh");
		t2.setWifeAge(24);
		
		t2.setHusbandName(t1);
		t1.setWife(t2);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(t1);
		session.save(t2);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
