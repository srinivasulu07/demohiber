package demo.hiber.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.hiber.Model.User;


public class HiberUtil {
	static SessionFactory sessionfactory;
	static Session session;
 
    static {
        try {
        	
        	sessionfactory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
    		System.out.println("session is created....");
    		
    		} catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static Session openSession() {
        return sessionfactory.openSession();
    }

	

}
