/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticketyweb.nazwa.model;

/**
 *
 * @author Robo
 */
public class Priorytet {



    private Long nrPriorytetu;
    private String nazwaPriorytetu;

  

    @Override
    public String toString() {
        return "Priorytet{" + "nrPriorytetu=" + getNrPriorytetu() + ", nazwaPriorytetu=" + getNazwaPriorytetu() + '}';
    }

  
    public Long getNrPriorytetu() {
        return nrPriorytetu;
    }

   
    public void setNrPriorytetu(Long nrPriorytetu) {
        this.nrPriorytetu = nrPriorytetu;
    }

    public String getNazwaPriorytetu() {
        return nazwaPriorytetu;
    }

    
    public void setNazwaPriorytetu(String nazwaPriorytetu) {
        this.nazwaPriorytetu = nazwaPriorytetu;
    }

}
