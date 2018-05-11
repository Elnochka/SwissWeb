package example.controller;

import example.dao.StatisticDao;
import example.entity.Statistic;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.util.List;

@Path("/statistic")
public class StaticService {
    StatisticDao statisticDao = new StatisticDao();
    @Produces({"application/json"})
    @GET
    public List<Statistic> getAllStatistic() {

        return statisticDao.getStatistic();
    }
}
