/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import com.hasz.bean.dw.*;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Wizard
 */
public class HibernateUtilWS {

    private static SessionFactory sessionFactory;
    private static Configuration configuration;
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            configuration = new Configuration().configure();
            
            configuration.setProperty("hibernate.connection.url", "jdbc:sqlserver://localhost:1433;databaseName=HaszDW");
            configuration.setProperty("hibernate.connection.username", "sa");
            configuration.setProperty("hibernate.connection.password", "123");
            configuration.setProperty("hibernate.hbm2ddl.auto","create-drop");//create-drop ou update
            
            configuration.addAnnotatedClass(FatosReserva.class);
            configuration.addAnnotatedClass(DimTempo.class);
            configuration.addAnnotatedClass(DimCidade.class);
            configuration.addAnnotatedClass(DimHotel.class);
            configuration.addAnnotatedClass(DimEmpresa.class);
            configuration.addAnnotatedClass(DimQuartoTipo.class);
            
            // config file.
            sessionFactory = configuration.buildSessionFactory();
            
        } catch (Exception ex) {
            // Log the exception. 
            ex.printStackTrace();
            sessionFactory=null;
        }
    }
    
    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
