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
import org.springframework.stereotype.Repository;

/**
 *
 * @author Robo
 */
@Repository
public class PriorytetDao {


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
