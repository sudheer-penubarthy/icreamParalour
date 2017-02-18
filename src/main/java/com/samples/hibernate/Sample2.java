package com.samples.hibernate;

import com.samples.pojo.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Class for icreamParalour project
 * Created by sudheer on 18/2/17.
 */
public class Sample2 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration (  );
        configuration.configure ("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory (  );
        Session session=sessionFactory.openSession ();
        Transaction transaction=session.beginTransaction ();
        Employees e1=new Employees ();
        e1.setBirth_date ( new Date (  ) );
        e1.setGender ( "F" );
        e1.setHire_date ( new Date (  ) );
        e1.setFirst_name ("supriya");
        e1.setLast_name ( "piduru" );
        e1.setEmp_no (1 );
        session.persist ( e1 );
        transaction.commit ();
        session.close ();

    }
}
