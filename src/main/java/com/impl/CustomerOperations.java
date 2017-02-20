package com.impl;

import com.entity.Customer;
import com.utils.DbUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Class for icreamParalour project
 * Created by sudheer on 20/2/17.
 */
public class CustomerOperations {
    public List<Customer> getCustomers(String customerName){
        SessionFactory factory = new DbUtils ().getSessionFactory ( );
        Session session = factory.openSession ();
        Transaction transaction = session.beginTransaction ();
        Query<Customer> query1 = session.createQuery ( "from Customer where customerName = '" + customerName+"'" );
        transaction.commit ();
        return query1.list ();

    }
}
