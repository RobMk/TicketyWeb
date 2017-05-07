/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.dao;

import com.ticketyweb.nazwa.model.Ticket;
import com.ticketyweb.nazwa.utils.DatabaseConnector;
import com.ticketyweb.nazwa.utils.HibernateUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;




/**
 *
 * @author robo
 */
public class TicketDao {
    
    
    public void addNewTicket(String tytTicketa, String opisTicketa, Long idTypTicketu, Long idPriorytetu, Long idOperatora) {
        String sql = "insert into tickety (tytul_ticketa, opis_ticketa, nr_tt, nr_priorytetu, nr_statusu, nr_operatora)"
                + " values ('" + tytTicketa + "', " + "'" + opisTicketa + "', " + idTypTicketu + ", " + idPriorytetu + ", 10, " + idOperatora + ")";

        System.out.println(sql);
        try {
            Connection connection = DatabaseConnector.getConnection();
            PreparedStatement statement = null;
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
//    public void editTypTicketu(Long idTicketu, Long idTypTicketu){
//        String sql = "update tickety set nr_tt=" + idTypTicketu + " where nr_ticketa=" + idTicketu;
//        System.out.println(sql);
//        try{
//            Connection connection = DatabaseConnector.getConnection();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.executeUpdate();
//            statement.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//    public void editOperator(Long idTicketu, Long idOperatora) {
//        String sql = "update tickety set nr_operatora=" + idOperatora + " where nr_ticketa=" + idTicketu;
//        System.out.println(sql);
//        try {
//            Connection connection = DatabaseConnector.getConnection();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.executeUpdate();
//            statement.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void editPriorytet(Long idTicketu, Long idPriorytetu) {
//        String sql = "update tickety set nr_priorytetu=" + idPriorytetu + " where nr_ticketa=" + idTicketu;
//        System.out.println(sql);
//        try {
//            Connection connection = DatabaseConnector.getConnection();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.executeUpdate();
//            statement.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void editStatus(Long idTicketu, Long idStatusu) {
//        String sql = "update tickety set nr_statusu=" + idStatusu + " where nr_ticketa=" + idTicketu;
//        System.out.println(sql);
//        try {
//            Connection connection = DatabaseConnector.getConnection();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.executeUpdate();
//            statement.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public void delete(Ticket t) {
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        sesja.beginTransaction();
        sesja.delete(t);
        sesja.getTransaction().commit();
    }
    
    public void update(Ticket t) {
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        sesja.beginTransaction();
        sesja.update(t);
//    sesja.saveOrUpdate(string, p);
        sesja.getTransaction().commit();
    }
    
    
    
    public void save(Ticket t) {
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        sesja.beginTransaction();
        sesja.save(t);
        sesja.getTransaction().commit();
    }

    public Ticket getOne(Long id) {
        Ticket t = new Ticket();
        try {
            Session sesja = HibernateUtil.getSessionFactory().openSession();
            String sql = "from Ticket t where t.nrTicketa=" + id;
            //Produkt to nazwa klasy, (List<Produkt>)rzutowanie na liste produktu
            t = (Ticket) sesja.createQuery(sql).uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }


    public List<Ticket> getAll(){
        List<Ticket> ticket = new ArrayList<Ticket>();
        System.out.println("wykonuje getAll Ticketa ");
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            ticket = (List<Ticket>) session.createQuery("from Ticket").list();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }catch (Exception e){
            
            System.out.println("#############################################################################S");
            System.out.println(e.getMessage());
        }
        return ticket;
    }
    

}
