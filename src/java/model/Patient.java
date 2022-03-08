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
    String patientID;
    String patientName;
    boolean patientGender;
    String patientAddress;
    String patientPhone;
    String patientEmail;

    private Account account;
    
    public Patient() {
    }

    public Patient(String patientID, String patientName, boolean patientGender, String patientAddress, String patientPhone, String patientEmail, Account account) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientGender = patientGender;
        this.patientAddress = patientAddress;
        this.patientPhone = patientPhone;
        this.patientEmail = patientEmail;
        this.account = account;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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
