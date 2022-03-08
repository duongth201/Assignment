/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class Supervisor {
    private int ID;
    private String supervisorCode;
    private String departmentID;
    private String supervisorName;
    private Date supervisorDob;
    private String supervisorPhone;
    private String username;

    public Supervisor() {
    }

    public Supervisor(int ID, String supervisorCode, String departmentID, String supervisorName, Date supervisorDob, String supervisorPhone, String username) {
        this.ID = ID;
        this.supervisorCode = supervisorCode;
        this.departmentID = departmentID;
        this.supervisorName = supervisorName;
        this.supervisorDob = supervisorDob;
        this.supervisorPhone = supervisorPhone;
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSupervisorCode() {
        return supervisorCode;
    }

    public void setSupervisorCode(String supervisorCode) {
        this.supervisorCode = supervisorCode;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public Date getSupervisorDob() {
        return supervisorDob;
    }

    public void setSupervisorDob(Date supervisorDob) {
        this.supervisorDob = supervisorDob;
    }

    public String getSupervisorPhone() {
        return supervisorPhone;
    }

    public void setSupervisorPhone(String supervisorPhone) {
        this.supervisorPhone = supervisorPhone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
