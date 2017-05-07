package com.ticketyweb.nazwa.dao;

import com.ticketyweb.nazwa.model.Status;
import com.ticketyweb.nazwa.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author robo
 */
public class StatusDao {

//    public List<Status> getAll() {
//        String sql = "select * from statusy";
//        List<Status> wynik = new ArrayList<Status>();
//        try {
//            Connection connection = DatabaseConnector.getConnection();
//            ResultSet rows = null;
//            Statement s = connection.createStatement();
//            rows = s.executeQuery(sql);
//            while (rows.next()) {
//                Status status = new Status();              
//                status.setNrStatusu(rows.getLong("nr_statusu"));
//                status.setNazwaStatusu(rows.getString("nazwa_statusu"));
//                wynik.add(status);
//            }
//            rows.close();
//            s.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return wynik;
//    }
    public List<Status> getAll() {
        List<Status> status = new ArrayList<Status>();
        System.out.println("wykonuje getAll  Statusu");
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            status = (List<Status>) session.createQuery("from Status").list();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (Exception e) {

            System.out.println("#############################################################################S");
            System.out.println(e.getMessage());
        }
        return status;
    }

}
