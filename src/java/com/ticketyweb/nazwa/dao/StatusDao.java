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
