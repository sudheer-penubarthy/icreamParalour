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
public class Sample1 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration (  );
        configuration.configure ("hibernate.cfg.xml");

        SessionFactory factory = configuration.buildSessionFactory ();
        Session session = factory.openSession ();

        Transaction transaction = session.beginTransaction ();

        Employees employees = new Employees ();
        employees.setFirst_name ( "Sudheer" );
        employees.setLast_name ( "kumar" );
        employees.setHire_date ( new Date (  ) );
        employees.setBirth_date ( new Date (  ) );
        employees.setGender ( "M" );

        session.persist ( employees );
        transaction.commit ();

        session.close ();

        System.out.println ( "Success!!" );

    }
}
