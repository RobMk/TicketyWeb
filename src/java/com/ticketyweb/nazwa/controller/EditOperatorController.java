/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.controller;

import com.ticketyweb.nazwa.dao.OperatorDao;
import com.ticketyweb.nazwa.model.Operator;
import org.springframework.beans.factory.annotation.Autowired;
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
public class EditOperatorController {

    @Autowired
    OperatorDao oDao;

    @RequestMapping(value = "/editOperator.io", method = RequestMethod.GET)
    public String wyswietlForm(@RequestParam Long id, Model model) {
        model.addAttribute("operator", oDao.getOne(id));
        System.out.println("pokaz" + oDao.getOne(id));
        return "editOperator";
    }

    @RequestMapping(value = "/editOperator.io", method = RequestMethod.POST)
    public String odbierzForm(Operator o) {
        System.out.println("zapisuje do bazy operatora " + o.toString());
        oDao.update(o);
        return "redirect:/testspring/showoperators.io";
    }
}
