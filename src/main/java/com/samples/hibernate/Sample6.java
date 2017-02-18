package com.samples.hibernate;

import com.samples.pojo.Department;
import com.samples.pojo.Employees;
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
public class Sample6 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration (  );
        configuration.configure ("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory (  );
        Session session=sessionFactory.openSession ();
        Transaction transaction=session.beginTransaction ();
        Query<Employees> q1=session.createQuery ( "from Employees where gender like 'F'" ).setMaxResults ( 5 );
        List<Employees> result=q1.list ();
       // System.out.println ( Arrays.toString ( result.toArray () ) );
        for (Employees e1:result) {
            System.out.println (e1 );

        }

        Query<Department> d1=session.createQuery ( "from Department  where dept_no='d010'" );
        List<Department> result2=d1.list ();
        System.out.println ( Arrays.toString ( result2.toArray () ) );

        Department d2 = d1.uniqueResult ();
        System.out.println ( d2 );

        Department d3 = session.get ( Department.class, "d002" );
        System.out.println ( d3 );

        Department d4 = session.load ( Department.class, "d002" );
        System.out.println ( d4 );
        transaction.commit ();
        session.close ();

    }
}
