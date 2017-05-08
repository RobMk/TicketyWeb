package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.OperatorDao;
import com.ticketyweb.nazwa.dao.PriorytetDao;
import com.ticketyweb.nazwa.dao.StatusDao;
import com.ticketyweb.nazwa.dao.TicketDao;
import com.ticketyweb.nazwa.dao.TypyTicketuDao;
import com.ticketyweb.nazwa.model.Ticket;
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
public class EditController {

    TicketDao tDao = new TicketDao();
    StatusDao sDao = new StatusDao();
    TypyTicketuDao ttDao = new TypyTicketuDao();
    PriorytetDao pDao = new PriorytetDao();
    OperatorDao oDao = new OperatorDao();

    @RequestMapping(value = "/editdetails.io", method = RequestMethod.GET)
    public String showForm (@RequestParam Long id, Model model){
        
        System.out.println("@#$@#$@#^@&#$*"+tDao.getOne(id));
        model.addAttribute("tickety", tDao.getOne(id));
        model.addAttribute("status", sDao.getAll());
        model.addAttribute("typTicketu", ttDao.getAll());    
        model.addAttribute("priorytet", pDao.getAll());
        model.addAttribute("operator", oDao.getAll());
        
        return "editDetails";
      
    }
    
     @RequestMapping(value = "/editdetails.io", method = RequestMethod.POST)
    public String getForm(Ticket t){
        System.out.println("zapisuje do bazy produkt " + t.toString());
        tDao.update(t);
        return"redirect:/testspring/showtickets.io";
    }
    

}
