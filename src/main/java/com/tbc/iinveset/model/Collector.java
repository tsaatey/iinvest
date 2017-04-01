/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tbc.iinveset.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Theodore Elikem Attigah
 */
@Entity
@Table(name = "collector")
public class Collector implements Serializable {
    
    @Id
    @Column(name = "collectorid")
    private String collectorId;
    
    @Column(name = "firstname")
    private String firstname;
    
    @Column(name = "lastname")
    private String lastname;
    
    @Column(name = "pin")
    private String pin;
    
    @Column(name = "phonenumber")
    private String phoneNumber;
    
    @Column(name = "address")
    private String address;

    public Collector() {
    }

    public Collector(String collectorId, String firstname, String lastname, String pin, String phoneNumber, String address) {
        this.collectorId = collectorId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.pin = pin;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getCollectorId() {
        return collectorId;
    }

    public void setCollectorId(String collectorId) {
        this.collectorId = collectorId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
