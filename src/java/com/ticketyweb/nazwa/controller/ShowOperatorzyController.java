package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.OperatorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowOperatorzyController {

    @Autowired
    OperatorDao oDao;

    @RequestMapping("showoperators.io")
    public String showTickets(Model model) {

        model.addAttribute("operators", oDao.getAll());
        System.out.println("pokazuje operatora");
        return "showOperators";
    }
}
