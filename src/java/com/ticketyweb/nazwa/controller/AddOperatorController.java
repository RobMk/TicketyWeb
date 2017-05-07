package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.OperatorDao;
import com.ticketyweb.nazwa.model.Operator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class AddOperatorController {
    OperatorDao oDao = new OperatorDao();
    
    @RequestMapping(value = "addOperator.io", method = RequestMethod.GET)
    public String showForm(Model model){
        model.addAttribute("addoperator", new Operator());
        return "addOperator";
    }

    @RequestMapping(value = "addOperator.io", method = RequestMethod.POST)
    public String getForm(@ModelAttribute("addoperator")Operator o){
        System.out.println("Zapisuję do bazy nowego operatora "+o.toString());
        oDao.save(o);
        return"redirect:/testspring/showoperators.io";
    }
}
