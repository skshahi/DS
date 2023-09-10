package com.app.onetoone;



import java.io.Serializable;
import java.util.UUID;

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
		
    	AlienName an=new AlienName();
    	an.setFirstName("Sonu");
    	an.setMiddleName("kumar");
    	an.setLastName("Rao");
    	
		  Alien alien=new Alien(); UUID uuid=UUID.randomUUID(); //
		  System.out.println(uuid); alien.setAid(uuid); alien.setName(an);
		  alien.setColor("white");
		 
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf=cfg.buildSessionFactory();
        
        Session session=sf.getCurrentSession();
       Transaction t=session.beginTransaction();
     
    	  
           Serializable s= session.save(alien);
         
           System.out.println(s);
           
   
      
       t.commit();
    }
}
