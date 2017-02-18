package com.samples.hibernate;

import com.samples.pojo.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
public class Sample3 {

    public static void main(String[] args) {
        Configuration configuration=new Configuration (  );
        configuration.configure ("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory (  );
        Session session=sessionFactory.openSession ();
        Transaction transaction=session.beginTransaction ();
        Department d1=new Department ("d010", "training" );
        session.persist ( d1 );
        transaction.commit ();
        System.out.println (transaction.getStatus () );
        session.close ();


    }
}
