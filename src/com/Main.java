package com;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Main {
	public static void main(String[] args) {
		// loads configuration and mappings
				Configuration configuration = new Configuration().configure();
				ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
				registry.applySettings(configuration.getProperties());
				ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
				
				// builds a session factory from the service registry
				SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				
				// obtains the session
				Session session = sessionFactory.openSession();
				session.beginTransaction();
				
				//create different authors
				Author author1 = new Author("Brian"); 		       
		        Author author2 = new Author("John");  
		         
		     //create different set of authors   
		        
		Set<Author> javaAuthors = new HashSet<Author>();  
        Set<Author> cAuthors = new HashSet<Author>();  
        Set<Author> pascalAuthors = new HashSet<Author>();  
        //put different  authors to different set of authors
        javaAuthors.add(author1);
        javaAuthors.add(author2);
        cAuthors.add(author1);
        pascalAuthors.add(author2); 
        
        //create different books
        Book book1 = new Book(" Java");         
        Book book2 = new Book(" C");                   
        Book book3 = new Book("Pascal");  
                 
       
        
        //attach different set of authors  to different books        
                 
        book1.setAuthors(javaAuthors);  
        book2.setAuthors(cAuthors );  
        book3.setAuthors(pascalAuthors);  
        
      //save child(not parent)
        session.save(book1);  
        session.save(book2);
        session.save(book3);  
        
        session.getTransaction().commit();
		session.close();
	}

}
