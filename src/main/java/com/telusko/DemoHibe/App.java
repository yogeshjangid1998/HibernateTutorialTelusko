package com.telusko.DemoHibe;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AlienName an = new AlienName();
    	an.setFname("Yogesh");
    	an.setLname("Jangid");
    	
        Alien telusko = new Alien();
        telusko.setAid(103);
        telusko.setColor("Green");
        telusko.setAname(an);
        
        
//        telusko.setAid(102);
//        telusko.setAname("sarang");
//        telusko.setColor("blue");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf = con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(telusko);
//        telusko = (Alien) session.get(Alien.class, 102);
        
        tx.commit();
        
        System.out.println(telusko);
    }
}
