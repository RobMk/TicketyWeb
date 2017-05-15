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
import org.springframework.stereotype.Repository;


/**
 *
 * @author robo
 */
@Repository
public class TypyTicketuDao {


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
