package com.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Class for icreamParalour project
 * Created by sudheer on 19/2/17.
 */
public class DbUtils {
    public SessionFactory getSessionFactory( ) {
        Configuration configuration = new Configuration (  );
        configuration.configure ( "hibernate.sampledb.cfg.xml" );
        return configuration.buildSessionFactory ();
    }
}
