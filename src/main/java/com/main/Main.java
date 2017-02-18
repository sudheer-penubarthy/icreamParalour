package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Class for icreamParalour project
 * Created by sudheer on 16/2/17.
 */
public class Main {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder ()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        SessionFactory sessionFactory = new MetadataSources ( registry ).buildMetadata ().buildSessionFactory ();
        Session session = sessionFactory.openSession ();
        session.beginTransaction ();
        //List result = session.createQuery ( "from Employees" ).list ();



    }
}
