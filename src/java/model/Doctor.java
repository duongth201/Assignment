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
    private String departmentID;
    private String doctorName;
//    private String doctorPosition;
    private boolean doctorGender;
    private int doctorAge;
    private String doctorPhone;
    
    private Account account;
    
    public Doctor() {
    }

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public Doctor(String doctorID, String departmentID, String doctorName,int doctorAge, boolean doctorGender,  Account account) {
        this.doctorID = doctorID;
        this.departmentID = departmentID;
        this.doctorName = doctorName;
        this.doctorGender = doctorGender;
        this.doctorAge = doctorAge;
        this.account = account;
    }

    public Doctor(String doctorID, String departmentID, String doctorName, boolean doctorGender, int doctorAge, String doctorPhone, Account account) {
        this.doctorID = doctorID;
        this.departmentID = departmentID;
        this.doctorName = doctorName;
        this.doctorGender = doctorGender;
        this.doctorAge = doctorAge;
        this.doctorPhone = doctorPhone;
        this.account = account;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public boolean isDoctorGender() {
        return doctorGender;
    }

    public void setDoctorGender(boolean doctorGender) {
        this.doctorGender = doctorGender;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Doctor{" + "doctorID=" + doctorID + ", departmentID=" + departmentID + ", doctorName=" + doctorName + ", doctorGender=" + doctorGender + ", doctorAge=" + doctorAge + ", doctorPhone=" + doctorPhone + ", account=" + account + '}';
    }


   
    
    
}
