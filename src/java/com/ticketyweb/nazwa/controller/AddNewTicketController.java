/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.OperatorDao;
import com.ticketyweb.nazwa.dao.PriorytetDao;
import com.ticketyweb.nazwa.dao.TicketDao;
import com.ticketyweb.nazwa.dao.TypyTicketuDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Robo
 */
public class AddNewTicketController extends HttpServlet {

    OperatorDao oDao = new OperatorDao();
    PriorytetDao pDao = new PriorytetDao();
    TypyTicketuDao ttDao = new TypyTicketuDao();
    TicketDao tDao = new TicketDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("ao", oDao.getAll());
        request.setAttribute("att", ttDao.getAll());
        request.setAttribute("ap", pDao.getAll());

        request.getRequestDispatcher("WEB-INF/jsp/addTicket.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nazwa = request.getParameter("nazwa");
        String opis = request.getParameter("opis");
        String typ = request.getParameter("typTicketu");
        String priorytet = request.getParameter("priorytet");
        String operator = request.getParameter("operator");

        System.out.println("nr: " + nazwa);
        System.out.println("opis: " + opis);
        System.out.println("typ: " + typ);
        System.out.println("prior: " + priorytet);
        System.out.println("oper: " + operator);
        System.out.println(" ************************************ ");

        String tytTicketa = request.getParameter("nazwa");
        String opisTicketa = request.getParameter("opis");
        Long idTypTicketu = new Long(request.getParameter("typTicketu"));
        Long idPriorytetu = new Long(request.getParameter("priorytet"));
        Long idOperatora = new Long(request.getParameter("operator"));

        tDao.addNewTicket(tytTicketa, opisTicketa, idTypTicketu, idPriorytetu, idOperatora);

        response.sendRedirect("showTickets.do");

    }
}
