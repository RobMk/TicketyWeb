package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Robo
 */
@Controller
public class ShowTicketsController {

    @Autowired
    TicketDao tDao;
    
    @RequestMapping("showtickets.io")
    public String showTickets(Model model) {
      
        model.addAttribute("ticket", tDao.getAll());
        System.out.println("pokazuje ticket");
        return "showTickets";

    }
 @RequestMapping("/showdetails.io")
    public String pokazJeden(@RequestParam Long id, Model model) {
        model.addAttribute("showOne", tDao.getOne(id));

        return "showDetails";
    }
}
