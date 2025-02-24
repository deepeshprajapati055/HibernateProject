package com.otmmto;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		University u1 = new University();
		u1.setUniversityName("RGPV");
		u1.setUniversityCity("BHOPAL");
		u1.setUniversityState("MADHYA PRADESH");
		u1.setUniversityPincode(481055);
		
		College c1 = new College();
		c1.setCollegeName("VITM, Badagaon");
		c1.setCollegeCity("Gwalior");
		c1.setCollegeState("Madhya Pradesh");
		c1.setCollegePincode(474001);
		c1.setUniversity(u1);
		
		College c2 = new College();
		c2.setCollegeName("RJIT, Tekkanpur");
		c2.setCollegeCity("Gwalior");
		c2.setCollegeState("Madhya Pradesh");
		c2.setCollegePincode(464004);
		c2.setUniversity(u1);
		
		College c3 = new College();
		c3.setCollegeName("ITM, Sithouli");
		c3.setCollegeCity("Gwalior");
		c3.setCollegeState("Madhya Pradesh");
		c3.setCollegePincode(484009);
		c3.setUniversity(u1);
		
		List<College> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		u1.setCollege(list);
		
		University u2 = new University();
		u2.setUniversityName("AMITY");
		u2.setUniversityCity("DELHI");
		u2.setUniversityState("Uttar Pradesh");
		u2.setUniversityPincode(400191);
		
		College c4 = new College();
		c4.setCollegeName("MIT, racing road");
		c4.setCollegeCity("Gwalior");
		c4.setCollegeState("Madhya Pradesh");
		c4.setCollegePincode(474097);
		c4.setUniversity(u2);
		
		College c5 = new College();
		c5.setCollegeName("LNIT, racing raod");
		c5.setCollegeCity("Gwalior");
		c5.setCollegeState("Madhya Pradesh");
		c5.setCollegePincode(464004);
		c5.setUniversity(u2);
		
		College c6 = new College();
		c6.setCollegeName("IIITM, Murar");
		c6.setCollegeCity("Gwalior");
		c6.setCollegeState("Madhya Pradesh");
		c6.setCollegePincode(474550);
		c6.setUniversity(u2);
	
		List<College> list1 = new ArrayList<>();
		list1.add(c4);
		list1.add(c5);
		list1.add(c6);
		
		u2.setCollege(list1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(u1);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		session.save(u2);
		session.save(c4);
		session.save(c5);
		session.save(c6);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
