/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.dao;

import com.ticketyweb.nazwa.model.TypTicketu;
import com.ticketyweb.nazwa.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author robo
 */
public class TypyTicketuDao {

//      public List<TypTicketu> getAll() {
//        String sql = "select * from typy_ticketow";
//        List<TypTicketu> wynik = new ArrayList<TypTicketu>();
//        try {
//            Connection connection = DatabaseConnector.getConnection();
//            ResultSet rows = null;
//            Statement s = connection.createStatement();
//            rows = s.executeQuery(sql);
//            while (rows.next()) {
//                TypTicketu o = new TypTicketu();              
//                o.setNrTt(rows.getLong("nr_tt"));
//                o.setNazwaTt(rows.getString("nazwa_tt"));
//                wynik.add(o);
//            }
//            rows.close();
//            s.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return wynik;
//    }
      public List<TypTicketu> getAll(){
        List<TypTicketu> typT = new ArrayList<TypTicketu>();
        System.out.println("wykonuje getAll TypuTicketu");
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            typT = (List<TypTicketu>) session.createQuery("from TypTicketu").list();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }catch (Exception e){
            
            System.out.println("#############################################################################S");
            System.out.println(e.getMessage());
        }
        return typT;
    }
    
}
