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
public class Status {
    private Long nrStatusu;
    private String nazwaStatusu;

    public Status() {
    }
   
    
    public Status(Long nrStatusu, String nazwaStatusu) {
        this.nrStatusu = nrStatusu;
        this.nazwaStatusu = nazwaStatusu;
    }

    
    
    @Override
    public String toString() {
        return "Status{" + "nrStatusu=" + nrStatusu + ", nazwaStatusu=" + nazwaStatusu + '}';
    }

    
    
    
    public Long getNrStatusu() {
        return nrStatusu;
    }

   
    public void setNrStatusu(Long nrStatusu) {
        this.nrStatusu = nrStatusu;
    }

   
    public String getNazwaStatusu() {
        return nazwaStatusu;
    }

   
    public void setNazwaStatusu(String nazwaStatusu) {
        this.nazwaStatusu = nazwaStatusu;
    }
    
    
}
