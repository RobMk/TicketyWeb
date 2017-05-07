/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.dao;

import com.ticketyweb.nazwa.model.Priorytet;
import java.util.ArrayList;
import java.util.List;

import com.ticketyweb.nazwa.utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Robo
 */
public class PriorytetDao {

//    public List<Priorytet> getAll() {
//        String sql = "select * from priorytety";
//        List<Priorytet> wynik = new ArrayList<Priorytet>();
//        try {
//            Connection connection = DatabaseConnector.getConnection();
//            ResultSet rows = null;
//            Statement s = connection.createStatement();
//            rows = s.executeQuery(sql);
//            while (rows.next()) {
//                Priorytet p = new Priorytet();
//                p.setNrPriorytetu(rows.getLong("nr_priorytetu"));
//                p.setNazwaPriorytetu(rows.getString("nazwa_priorytetu"));
//                wynik.add(p);
//            }
//            rows.close();
//            s.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return wynik;
//    }
    public List<Priorytet> getAll() {
        List<Priorytet> priorytet = new ArrayList<Priorytet>();
        System.out.println("wykonuje getAll priorytet");
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            priorytet = (List<Priorytet>) session.createQuery("from Priorytet").list();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        } catch (Exception e) {

            System.out.println("#############################################################################S");
            System.out.println(e.getMessage());
        }
        return priorytet;
    }
}
