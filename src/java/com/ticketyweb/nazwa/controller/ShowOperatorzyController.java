
package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.OperatorDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowOperatorzyController extends HttpServlet {

    OperatorDao oDao = new OperatorDao();
    
//    
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       request.setAttribute("operatorzy", oDao.getAll());
//       request.getRequestDispatcher("WEB-INF/jsp/showOperators.jsp").forward(request, response);
//    }
    @RequestMapping("showoperators.io")
    public String showTickets(Model model) {
      
        model.addAttribute("operators", oDao.getAll());
        System.out.println("pokazuje operatora");
        return "showOperators";
    }
}
