package example.controller;

import example.dao.StringsDao;
import example.entity.Statistic;
import example.entity.Strings;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("/strings")
public class StringsService {
    StringsDao stringsDao = new StringsDao();
    @Produces({"application/json"})
    @GET
    public List<Strings> getAllStrings() {
        return stringsDao.getStrings();
    }
}
