/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.TicketDao;
import com.ticketyweb.nazwa.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Robo
 */
@Controller
public class DeleteTIcketController {

    @Autowired
    TicketDao tDao;

    @RequestMapping("deleteticket.io")
    public String deleteTicket(@RequestParam Long id, Model model) {

        Ticket t = tDao.getOne(id);
        tDao.delete(t);
        return "redirect:showTickets.io";
    }
}
