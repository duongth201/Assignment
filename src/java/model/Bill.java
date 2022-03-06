/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author ADMIN
 */
public class Bill {
    private String bill_ID;
    Date date;
    int price;

    public Bill() {
    }

    public Bill(String bill_ID, Date date, int price) {
        this.bill_ID = bill_ID;
        this.date = date;
        this.price = price;
    }

    public String getBill_ID() {
        return bill_ID;
    }

    public void setBill_ID(String bill_ID) {
        this.bill_ID = bill_ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bill{" + "bill_ID=" + bill_ID + ", date=" + date + ", price=" + price + '}';
    }
    
    
}
