/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.test;

import com.ticketyweb.nazwa.dao.TicketDao;
import com.ticketyweb.nazwa.model.Ticket;

/**
 *
 * @author Robo
 */
public class Odpalamy {
    
    public static void main(String args[]){
       for(Ticket t: new TicketDao().getAll()){
           System.out.println(t.toString());
       }
        
        
    }
   
}
