
package com.ticketyweb.nazwa.dao;

import com.ticketyweb.nazwa.model.Operator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import com.ticketyweb.nazwa.utils.DatabaseConnector;
import com.ticketyweb.nazwa.utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Robo
 */
public class OperatorDao {
    
    public void editOperator(Operator o){
      String sql = "update operatorzy set imie='" + o.getImie() + "', nazwisko= '" + o.getNazwisko() 
              + "' where nr_operatora= "+o.getNrOperatora();
        System.out.println(sql);
        PreparedStatement ps = null;
        try {
            Connection con= DatabaseConnector.getConnection();
            ps= con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }  
        
    }

    public void addOperator(Operator o) {
        String sql = "insert into operatorzy (imie, nazwisko)values ('" + o.getImie() + "', '" + o.getNazwisko() + "')";
        System.out.println(sql);
        PreparedStatement ps = null;
        try {
            Connection con= DatabaseConnector.getConnection();
            ps= con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
     public void delete(Operator o) {
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        sesja.beginTransaction();
        sesja.delete(o);
        sesja.getTransaction().commit();
    }
    
    public void update(Operator o) {
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        sesja.beginTransaction();
        sesja.update(o);
//    sesja.saveOrUpdate(string, p);
        sesja.getTransaction().commit();
    }
    
    
    
    public void save(Operator o) {
        Session sesja = HibernateUtil.getSessionFactory().openSession();
        sesja.beginTransaction();
        sesja.save(o);
        sesja.getTransaction().commit();
    }
    
    
    
     public Operator getOne(Long id) {
        Operator p = new Operator();
        try {
            Session sesja = HibernateUtil.getSessionFactory().openSession();
            String sql = "from Operator o where o.nrOperatora=" + id;
            //Produkt to nazwa klasy, (List<Produkt>)rzutowanie na liste produktu
            p = (Operator) sesja.createQuery(sql).uniqueResult();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return p;
    }
    
     public List<Operator> getAll(){
        List<Operator> operator = new ArrayList<Operator>();
        System.out.println("wykonuje getAll operator");
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            operator = (List<Operator>) session.createQuery("from Operator").list();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }catch (Exception e){
            
            System.out.println("#############################################################################S");
            System.out.println(e.getMessage());
        }
        return operator;
    }
    
   

  
}
