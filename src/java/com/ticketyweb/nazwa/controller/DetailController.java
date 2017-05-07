/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.TicketDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DetailController  {

    TicketDao tDao = new TicketDao();

 @RequestMapping(value = "/showdetail.io", method = RequestMethod.GET)
public String showForm(@RequestParam Long id, Model model){
    model.addAttribute("ticket", tDao.getOne(id));
     System.out.println("pokaz "+ tDao.getOne(id));
    return"showdetail.io";
}

}
