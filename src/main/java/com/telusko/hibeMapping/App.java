package com.telusko.hibeMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Student s = new Student();
		s.setName("Navin");
		s.setRollno(1);
		s.setMarks(50);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		session.save(s);
		
		session.getTransaction().commit();

	}

}
