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
public class Ticket {

    private Long nrTicketa;
    private String tytulTicketa;
    private String opisTicketa;
    private TypTicketu typTickety = new TypTicketu();
    private Priorytet priorytet = new Priorytet();
    private Status status = new Status();
    private Operator operator = new Operator();

    public Ticket(Long nrTicketa, String tytulTicketa, String opisTicketa) {
        this.nrTicketa = nrTicketa;
        this.tytulTicketa = tytulTicketa;
        this.opisTicketa = opisTicketa;
    }
    

    public Ticket() {
    }

    @Override
    public String toString() {
        return "Ticket{" + "nrTicketa=" + getNrTicketa() + ", tytulTicketa=" + getTytulTicketa() + ", opisTicketa="
                + getOpisTicketa() + ", typTickety=" + getTypTickety() + ", priorytet=" + getPriorytet() + ", status="
                + getStatus() + ", operator=" + getOperator() + '}';
    }

    public Long getNrTicketa() {
        return nrTicketa;
    }

    public void setNrTicketa(Long nrTicketa) {
        this.nrTicketa = nrTicketa;
    }

    public String getTytulTicketa() {
        return tytulTicketa;
    }

    public void setTytulTicketa(String tytulTicketa) {
        this.tytulTicketa = tytulTicketa;
    }

    public String getOpisTicketa() {
        return opisTicketa;
    }

    public void setOpisTicketa(String opisTicketa) {
        this.opisTicketa = opisTicketa;
    }

    public TypTicketu getTypTickety() {
        return typTickety;
    }

    public void setTypTickety(TypTicketu typTickety) {
        this.typTickety = typTickety;
    }

    public Priorytet getPriorytet() {
        return priorytet;
    }

    public void setPriorytet(Priorytet priorytet) {
        this.priorytet = priorytet;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

}
