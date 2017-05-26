import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.hibernate.query.Query;

//import javax.management.Query;
import java.util.Arrays;
import  java.util.List;



/**
 * Created by dann on 26.05.17.
 */
public class TestLogger {
    private static Logger logger = Logger.getLogger("TestLogger.class");

    @Test
    public void getSessionFactory() throws Exception{
        SessionFactory factory = HibernateUtil.getSessionFactory();
        logger.info("Beans" + Arrays.toString(factory.getStatistics().getEntityNames()));
    }
    @Test
    public void namedQuery() throws Exception{
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        Query query = session.getNamedQuery("TableNames");
        logger.info("Table names" + query.list());
        tx.commit();
    }
}
