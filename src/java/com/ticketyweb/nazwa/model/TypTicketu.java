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
public class TypTicketu {
    private Long nrTt;
    private String nazwaTt;

    public TypTicketu(Long nrTt, String nazwaTt) {
        this.nrTt = nrTt;
        this.nazwaTt = nazwaTt;
    }

    public TypTicketu() {
    }

    
    
    @Override
    public String toString() {
        return "TypTicketu{" + "nrTt=" + getNrTt() + ", nazwaTt=" + getNazwaTt() + '}';
    }

    
    public Long getNrTt() {
        return nrTt;
    }

  
    public void setNrTt(Long nrTt) {
        this.nrTt = nrTt;
    }

   
    public String getNazwaTt() {
        return nazwaTt;
    }

   
    public void setNazwaTt(String nazwaTt) {
        this.nazwaTt = nazwaTt;
    }
    
}
