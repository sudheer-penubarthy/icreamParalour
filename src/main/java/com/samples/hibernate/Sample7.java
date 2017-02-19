package com.samples.hibernate;

import com.samples.pojo.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
public class Sample7 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration (  );
        configuration.configure ( "hibernate.cfg.xml" );
        SessionFactory factory = configuration.buildSessionFactory ();
        Session session = factory.openSession ();
        Transaction transaction = session.beginTransaction ();

        Query<Department> d1=session.createQuery ( "from Salaries  where emp_no=10001" );
        List<Department> result2=d1.list ();
        System.out.println ( Arrays.toString ( result2.toArray () ) );

        transaction.commit ();
        session.close ();
    }

}
