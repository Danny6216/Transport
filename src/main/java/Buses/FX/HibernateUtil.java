package Buses.FX;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class HibernateUtil {
    private static SessionFactory SessionFactory;
    public static SessionFactory getSessionFactory(){
        if (SessionFactory == null){
            // loads configuration and mappings
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            MetadataSources metadataSources = new  MetadataSources(serviceRegistry);
            //metadataSources.addAnnotatedClass(TestEntity.class); // Аннотированная сущность
            metadataSources.addResource("named-queries.hbm.xml");// Именованные запросы
            SessionFactory = metadataSources.buildMetadata().buildSessionFactory();
        }
        return SessionFactory;
    }
}
