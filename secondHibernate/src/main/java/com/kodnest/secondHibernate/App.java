package com.kodnest.secondHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Student Id");
    	int id = sc.nextInt();
//		Student student = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
//		sc.close();
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
		Student s = session.get(Student.class, id);
		System.out.println("S_ID--> "+s.getId());
		System.out.println("DEP_ID--> "+s.getDep_id());
		System.out.println("S_NAME--> "+s.getName());
		System.out.println("EMAIL--> "+s.getEmail());
		}
		 catch(Exception e) {
				System.out.println("Enter a Valid id try again!!");
			}
		transaction.commit();
		session.close();
		factory.close();
    }
}
