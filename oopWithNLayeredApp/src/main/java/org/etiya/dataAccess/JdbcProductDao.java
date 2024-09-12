package org.etiya.dataAccess;

import org.etiya.entities.Product;

public class JdbcProductDao {

    public void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
