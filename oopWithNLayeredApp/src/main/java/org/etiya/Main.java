package org.etiya;

import org.etiya.business.ProductManager;
import org.etiya.core.logging.DatabaseLogger;
import org.etiya.core.logging.FileLogger;
import org.etiya.core.logging.Logger;
import org.etiya.core.logging.MailLogger;
import org.etiya.dataAccess.HibernateProductDao;
import org.etiya.dataAccess.JdbcProductDao;
import org.etiya.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone Xr", 10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
    }
}