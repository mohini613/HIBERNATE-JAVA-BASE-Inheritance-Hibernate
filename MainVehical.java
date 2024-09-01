package com.InheritanceHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class MainVehical {
	 public static void main(String[] args) {
	        SessionFactory sf = HibernateUtilll.getSessionFactory();
	        Session session = sf.openSession();
	        
	        Vehical v=new Vehical();
	        v.setV_Type("Mahindra");
	        
	        Four_Wheeler f= new Four_Wheeler();
	        f.setV_Type("CAR");
	        f.setSterring_Type("wheel");
	        
	        Two_Wheeler t= new Two_Wheeler();
	        t.setV_Type("bike");
	        t.setSterring_Type("handle");
	        
	        session.save(v);
	        session.save(t);
	        session.save(f);
	        session.beginTransaction().commit();
	        
	        
	        
	        
	        session.close();
	        sf.close();
}
}