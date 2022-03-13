/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author ADMIN
 */
public class Patient {
    private String patientID;
    private String roomID, bill_ID;
    private String patientName;
    private boolean patientGender;
    private String patientAddress;
    private String patientPhone;
    private String patientEmail;
    
    private Account account;
    
    public Patient() {
    }

    public Patient(String patientName, String patientPhone, String patientEmail, Account account) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.patientEmail = patientEmail;
        this.account = account;
    }
    
    public Patient(String patientName, String patientAddress, String patientPhone, String patientEmail, Account account) {
        this.patientName = patientName;
        this.patientAddress = patientAddress;
        this.patientPhone = patientPhone;
        this.patientEmail = patientEmail;
        this.account = account;
    }
    
    
    public Patient(String patientID, String roomID, String bill_ID, String patientName, boolean patientGender, String patientAddress, String patientPhone, String patientEmail, Account account) {
        this.patientID = patientID;
        this.roomID = roomID;
        this.bill_ID = bill_ID;
        this.patientName = patientName;
        this.patientGender = patientGender;
        this.patientAddress = patientAddress;
        this.patientPhone = patientPhone;
        this.patientEmail = patientEmail;
        this.account = account;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }


    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }


    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getBill_ID() {
        return bill_ID;
    }

    public void setBill_ID(String bill_ID) {
        this.bill_ID = bill_ID;
    }

    public boolean isPatientGender() {
        return patientGender;
    }

    public void setPatientGender(boolean patientGender) {
        this.patientGender = patientGender;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
