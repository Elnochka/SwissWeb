package example.dao;


import example.entity.Strings;


import example.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class StringsDao {

    public List<Strings> getStrings(){
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("from Strings");
        List<Strings> stringsList =  query.list();
        session.close();
        return stringsList;

    }
}
