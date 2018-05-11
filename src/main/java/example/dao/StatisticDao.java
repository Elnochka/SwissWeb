package example.dao;

import example.entity.Statistic;
import example.entity.Strings;
import example.persistence.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class StatisticDao {
    public List<Statistic> getStatistic(){
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("from Statistic");
        List<Statistic> stringsList =  query.list();
        session.close();
        return stringsList;

    }
}
