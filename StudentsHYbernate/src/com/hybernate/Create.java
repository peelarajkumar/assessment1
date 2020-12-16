package com.hybernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Student rahul = new Student(); // creates new table as hbm2ddl is given as create 
		rahul.setId(109);
		rahul.setName("vikas ");
		rahul.setAge("21");
		rahul.setMarks("730");
		
		Transaction tx = se.beginTransaction();
		se.save(rahul);
		tx.commit();
		
		se.close();
		sf.close();

	}

}
