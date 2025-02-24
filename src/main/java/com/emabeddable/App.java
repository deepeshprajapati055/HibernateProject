package com.emabeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*Important Notes-
1. For @Embeddable annotation.
2. We don't need to mark salary as @Entity,
3. We don't need to save salary object,
4. We don't need to do mapping in hibernate.cfg.xml configuration file.
*/

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Employee e1 = new Employee();
		e1.setId(102);
		e1.setName("Rahul Prajapati");
		e1.setAge(30);
		e1.setCity("Pune");
		
		Salary s1 = new Salary();
		s1.setFixedSalary(600000);
		s1.setCurrentSalary(578970);
		s1.setBonus(4000);
		s1.setIncrement(10000);
		s1.setTotalSalary(592970);
		
		e1.setSalary(s1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		
		tx.commit();
		session.close();
		factory.close();
	}
}


