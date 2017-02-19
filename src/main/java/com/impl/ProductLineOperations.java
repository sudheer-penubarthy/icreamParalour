package com.impl;

import com.entity.ProductLines;
import com.utils.DbUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
public class ProductLineOperations {
    public ProductLines getProductLinesByProductLine(String productLine){
        SessionFactory factory = new DbUtils ().getSessionFactory (  );
        Session session = factory.openSession ();
        Transaction transaction = session.beginTransaction ();
        Query<ProductLines> query = session.createQuery ( "from ProductLines where productLine like " + productLine );
        transaction.commit ();
        return query.getSingleResult ();
    }

}
