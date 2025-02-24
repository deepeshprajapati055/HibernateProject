package com.mtm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Account a1 = new Account();
		a1.setName("Deepesh Prajapati");
		a1.setMobileno(7724818791L);
		a1.setPassword("dlrtppj@Deepesh");
		a1.setAccountType("Saving Account");
		a1.setAccountNo("1235435325");
		
		Account a2 = new Account();
		a2.setName("Deepesh Prajapati");
		a2.setMobileno(7724818791L);
		a2.setPassword("dlrtppj@Deepesh");
		a2.setAccountType("Current Account");
		a2.setAccountNo("1235435325");
		
		Transactions t1 = new Transactions();
		t1.setTransactionType("Saving - Transaction1");
		
		Transactions t2 = new Transactions();
		t2.setTransactionType("Current - Transaction2");
		
		List<Transactions> transactionList = new ArrayList<Transactions>();
		transactionList.add(t1);
		transactionList.add(t2);
		
		List<Account> list = new ArrayList<Account>();
		list.add(a1);
		list.add(a2);
		
		a1.setTransaction(transactionList);
		a2.setTransaction(transactionList);
		t1.setAccount(list);
		t2.setAccount(list);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(a1);
		session.save(a2);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
