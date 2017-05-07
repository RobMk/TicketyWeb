package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.TicketDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Robo
 */
@Controller
public class ShowTicketsController extends HttpServlet {

     TicketDao tDao = new TicketDao();

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        request.setAttribute("tickety", tDao.getAll());
//        request.getRequestDispatcher("WEB-INF/jsp/showTickets.jsp").forward(request, response);
    
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
