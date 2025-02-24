package com.imagesaving;

import java.io.FileInputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		ImageSaving img = new ImageSaving();
		img.setName("Deepesh Prajapati");
		img.setPassword("dlrtppj@Deepesh");
		
		FileInputStream fis = new FileInputStream("src/main/java/com/imagesaving/profile.png");
		byte[] image = new byte[fis.available()];
		fis.read(image);
		img.setImage(image);
		System.out.println(fis);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(img);

		tx.commit();
		session.close();
		factory.close();
		
	}
}
