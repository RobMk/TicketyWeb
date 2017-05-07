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
public class Operator {

    private Long nrOperatora;
    private String imie;
    private String nazwisko;

    public String getImieINazwisko(){
        return imie+" "+nazwisko;
    }
    
    
    public Operator() {
    }

    public Operator(Long nrOperatora, String imie, String nazwisko) {
        this.nrOperatora = nrOperatora;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Operator{" + "nrOperatora=" + getNrOperatora() + ", imie=" + getImie() + ", nazwisko=" + getNazwisko() + '}';
    }

  
    public Long getNrOperatora() {
        return nrOperatora;
    }

   
    public void setNrOperatora(Long nrOperatora) {
        this.nrOperatora = nrOperatora;
    }

   
    public String getImie() {
        return imie;
    }

   
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

}
