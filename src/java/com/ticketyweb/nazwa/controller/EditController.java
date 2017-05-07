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
    
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        Long id = new Long(request.getParameter("id"));
//        request.setAttribute("et", tDao.getOne(id));
//        request.setAttribute("es", sDao.getAll());
//        request.setAttribute("ett", ttDao.getAll());
//        request.setAttribute("ep", pDao.getAll());
//        request.setAttribute("eo", oDao.getAll());
//        request.getRequestDispatcher("WEB-INF/jsp/editDetails.jsp").forward(request, response);
//    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        System.out.println("cos wyswietl");
//
//        String nr = request.getParameter("id");
//        String status = request.getParameter("status");
//        String typ = request.getParameter("typ");
//        String priorytet = request.getParameter("priorytet");
//        String operator = request.getParameter("operator");
//
//        System.out.println("nr: " + nr);
//        System.out.println("status: " + status);
//        System.out.println("typ: " + typ);
//        System.out.println("prior: " + priorytet);
//        System.out.println("oper: " + operator);
//        System.out.println(" ************************************ ");
//
//        Long idTicketu = new Long(request.getParameter("id"));
//
//        if (request.getParameter("status") != null) {
//            System.out.println("Zmiana statusu");
//            Long idStatusu = new Long(request.getParameter("status"));
//            tDao.editStatus(idTicketu, idStatusu);
//        } else if (request.getParameter("typ") != null) {
//            System.out.println("Zmiana typ ticketa");
//            Long idTypTicketu = new Long(request.getParameter("typ"));
//            tDao.editTypTicketu(idTicketu, idTypTicketu);
//        } else if ((request.getParameter("priorytet") != null)) {
//            System.out.println("Zmiana priorytetu");
//            Long idPriorytetu = new Long(request.getParameter("priorytet"));
//            tDao.editPriorytet(idTicketu, idPriorytetu);
//        } else if (request.getParameter("operator") != null) {
//            System.out.println("Zmiana operatora");
//            Long idOperatora = new Long(request.getParameter("operator"));
//            tDao.editOperator(idTicketu, idOperatora);
//        }
//
//        response.sendRedirect("showTickets.do");
//
//    }

}
