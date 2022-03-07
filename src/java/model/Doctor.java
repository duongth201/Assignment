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
public class Doctor {
    private String doctorID;
    private String doctorName;
    private String doctorPosition;
    private int doctorAge;
    private String doctorPhone;
    private String doctorAccount;
    private String doctorPass;
    
    
    public Doctor() {
    }

    public Doctor(String doctorID, String doctorName, String doctorAccount, String doctorPass) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.doctorAccount = doctorAccount;
        this.doctorPass = doctorPass;
    }

    public Doctor(String doctorID, String doctorName, String doctorPosition, int doctorAge, String doctorPhone, String doctorAccount, String doctorPass) {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.doctorPosition = doctorPosition;
        this.doctorAge = doctorAge;
        this.doctorPhone = doctorPhone;
        this.doctorAccount = doctorAccount;
        this.doctorPass = doctorPass;
    }
    
    public String getDoctorAccount() {
        return doctorAccount;
    }

    public void setDoctorAccount(String doctorAccount) {
        this.doctorAccount = doctorAccount;
    }

    public String getDoctorPass() {
        return doctorPass;
    }

    public void setDoctorPass(String doctorPass) {
        this.doctorPass = doctorPass;
    }



    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorPosition() {
        return doctorPosition;
    }

    public void setDoctorPosition(String doctorPosition) {
        this.doctorPosition = doctorPosition;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
