package com.impl;

import com.entity.Employees;
import com.utils.DbUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Class for icreamParalour project
 * Created by sudheer on 16/2/17.
 */
public class EmployeeOperations {


    public Employees getEmployee(String id) {
        Integer empNo = Integer.parseInt ( id );

        SessionFactory factory = new DbUtils ().getSessionFactory ( );
        Session session = factory.openSession ();
        Transaction transaction = session.beginTransaction ();
        Query<Employees> query1 = session.createQuery ( "from Employees where employeeNumber = "+empNo );
        transaction.commit ();
        return query1.getSingleResult ();
    }


}
