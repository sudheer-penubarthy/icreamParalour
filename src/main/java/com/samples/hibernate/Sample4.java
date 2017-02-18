package com.samples.hibernate;

import com.samples.pojo.Employees;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
public class Sample4 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration (  );
        configuration.configure ("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory (  );
        Session session = sessionFactory.openSession ();

        Transaction transaction = session.beginTransaction ();
        List<Employees> employeesList = session.createQuery ( "FROM Employees WHERE first_name like 'Sudh%'" ).list ();
        for (Employees employee:employeesList) {
            System.out.println ( employee );
        }

        /*Criteria criteria = session.createCriteria ( Employees.class );
        criteria.add ( Restrictions.like ( "first_name", "su%" ) );

        List<Employees> result = criteria.list ();
        for (Employees employee:result) {
            System.out.println ( employee );
        }*/

        transaction.commit ();
        session.close ();

    }
}
