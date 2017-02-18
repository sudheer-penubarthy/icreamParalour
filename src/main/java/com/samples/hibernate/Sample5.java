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
public class Sample5 {
    public static void main(String[] args) {
        Configuration configuration=new Configuration (  );
        configuration.configure ("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory (  );
        Session session=sessionFactory.openSession ();
        Transaction transaction=session.beginTransaction ();

        Query<Employees> nameQuery = getBy ( "'s%r'", session ).setMaxResults ( 1 );
        List<Employees> result1=nameQuery.list ();
        System.out.println ( Arrays.toString ( result1.toArray () ) );

        List<Employees> result2=getBy ( "last_name", "'k%u%r'", session ).setMaxResults ( 1 ).list ();
        System.out.println ( Arrays.toString ( result2.toArray () ) );

        Employees emp1 = session.get ( Employees.class, new Integer ( 1 ));
        Department emp2 = session.get ( Department.class, "d002");

        System.out.println (emp1 );
        System.out.println (emp2 );

        transaction.commit ();
        session.close ();

    }

    public static Query<Employees> getBy(String name, Session session){
        return session.createQuery ( "from Employees where first_name like "+name );
    }

    public static Query<Employees> getBy(String colName, String search, Session session){
        return session.createQuery ( "from Employees where "+colName+" like "+search );
    }
}
