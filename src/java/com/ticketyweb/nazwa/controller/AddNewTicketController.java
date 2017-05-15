/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.OperatorDao;
import com.ticketyweb.nazwa.dao.PriorytetDao;
import com.ticketyweb.nazwa.dao.StatusDao;
import com.ticketyweb.nazwa.dao.TicketDao;
import com.ticketyweb.nazwa.dao.TypyTicketuDao;
import com.ticketyweb.nazwa.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Robo
 */
@Controller
public class AddNewTicketController {

   
    PriorytetDao pDao = new PriorytetDao();
    TypyTicketuDao ttDao = new TypyTicketuDao();
    TicketDao tDao = new TicketDao();
    StatusDao sDao = new StatusDao();
    OperatorDao oDao = new OperatorDao();
    
    @RequestMapping(value = "/newticket.io", method = RequestMethod.GET)
    public String addNewTicket(Model model) {
        model.addAttribute("addticket", new Ticket());
        model.addAttribute("operator", oDao.getAll());
        model.addAttribute("priorytet", pDao.getAll());
        model.addAttribute("typticketu", ttDao.getAll());
        model.addAttribute("status", sDao.getAll());

        return "addTicket";
    }

    @RequestMapping(value = "newticket.io", method = RequestMethod.POST)
    public String getForm(Ticket t) {
        System.out.println("Zapisuję do bazy nowy ticket " + t.toString());
        tDao.save(t);
        return "redirect:/testspring/showtickets.io";
    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        request.setAttribute("ao", oDao.getAll());
//        request.setAttribute("att", ttDao.getAll());
//        request.setAttribute("ap", pDao.getAll());
//
//        request.getRequestDispatcher("WEB-INF/jsp/addTicket.jsp").forward(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        String nazwa = request.getParameter("nazwa");
//        String opis = request.getParameter("opis");
//        String typ = request.getParameter("typTicketu");
//        String priorytet = request.getParameter("priorytet");
//        String operator = request.getParameter("operator");
//
//        System.out.println("nr: " + nazwa);
//        System.out.println("opis: " + opis);
//        System.out.println("typ: " + typ);
//        System.out.println("prior: " + priorytet);
//        System.out.println("oper: " + operator);
//        System.out.println(" ************************************ ");
//
//        String tytTicketa = request.getParameter("nazwa");
//        String opisTicketa = request.getParameter("opis");
//        Long idTypTicketu = new Long(request.getParameter("typTicketu"));
//        Long idPriorytetu = new Long(request.getParameter("priorytet"));
//        Long idOperatora = new Long(request.getParameter("operator"));
//
//        tDao.addNewTicket(tytTicketa, opisTicketa, idTypTicketu, idPriorytetu, idOperatora);
//
//        response.sendRedirect("showTickets.do");
//
//    }
}
