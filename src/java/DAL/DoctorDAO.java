/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Doctor;

/**
 *
 * @author ADMIN
 */
public class DoctorDAO extends BaseDAO<Doctor> {

    public ArrayList<Doctor> getDoctors() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        try {
            String sql = "SELECT [doctorID]\n"
                    + "      ,[departmentID]\n"
                    + "      ,[doctorName]\n"
                    + "      ,[doctorAge]\n"
                    + "      ,[doctorGender]\n"
                    + "	  ,a.[username]\n"
                    + "	  ,a.[password]\n"
                    + "	  ,a.[role]\n"
                    + "  FROM [ass_prj].[dbo].[Doctor] d inner join [ass_prj].[dbo].[Account] a \n"
                    + "  on d.[username] = a.[username]";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Doctor s = new Doctor();
                s.setDoctorID(rs.getString("doctorID"));
                s.setDepartmentID(rs.getString("departmentID"));
                s.setDoctorName(rs.getString("doctorName"));
                s.setDoctorAge(rs.getInt("doctorAge"));
                s.setDoctorGender(rs.getBoolean("doctorGender"));
                s.setAccount(new Account(rs.getString("username"), rs.getString("password"), 1));
                doctors.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctors;
    }
//insert to Account + Doctor

    public void insertAccDoctor(Account a) {
        try {
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([username]\n"
                    + "           ,[password]\n"
                    + "           ,[role])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, a.getUsername());
            statement.setString(2, a.getPassword());
            statement.setInt(3, 1);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertDoctor(Doctor d) {
        try {
            String sql = "INSERT INTO [dbo].[Doctor]\n"
                    + "           ([doctorID]\n"
                    + "           ,[departmentID]\n"
                    + "           ,[doctorName]\n"
                    + "           ,[doctorAge]\n"
                    + "           ,[doctorGender]\n"
                    + "           ,[username])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, d.getDoctorID());
            statement.setString(2, d.getDepartmentID());
            statement.setString(3, d.getDoctorName());
            statement.setInt(4, d.getDoctorAge());
            statement.setBoolean(5, d.isDoctorGender());
            statement.setString(6, d.getAccount().getUsername());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //deleta doctor
    public void deleteAccDoctor(String username) {
        try {
            String sql = "DELETE FROM [dbo].[Account]\n"
                    + "      WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteDoctor(String doctorID) {
        try {
            String sql = "DELETE FROM [dbo].[Doctor]\n"
                    + "      WHERE doctorID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, doctorID);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        DoctorDAO d = new DoctorDAO();
//        d.deleteDoctor("x7");
//        d.deleteAccDoctor("x6");
//        ArrayList<Doctor> a = new ArrayList<>();
        Doctor a = new Doctor("x9999", "D02", "10", 20, false, new Account("dg", "100", 1));

        d.updateDoctor(a);
        System.out.println(d);
    }

    public Doctor getDoctor(String id) {
        try {
            String sql = "SELECT [doctorID]\n"
                    + "      ,[departmentID]\n"
                    + "      ,[doctorName]\n"
                    + "      ,[doctorAge]\n"
                    + "      ,[doctorGender]\n"
                    + "      ,a.[username]\n"
                    + "	  ,a.password\n"
                    + "	  ,a.role\n"
                    + "  FROM [dbo].[Doctor] d inner join Account a\n"
                    + "  on d.username = a.username\n"
                    + "  where d.doctorID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Doctor s = new Doctor();
                s.setDoctorID(rs.getString("doctorID"));
                s.setDepartmentID(rs.getString("departmentID"));
                s.setDoctorName(rs.getString("doctorName"));
                s.setDoctorAge(rs.getInt("doctorAge"));
                s.setDoctorGender(rs.getBoolean("doctorGender"));
                s.setAccount(new Account(rs.getString("username"), rs.getString("password"), 1));
                return s;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateDoctor(Doctor d) {
        try {
            String sql = "UPDATE [dbo].[Doctor]\n"
                    + "   SET [doctorID] = ?\n"
                    + "      ,[departmentID] = ?\n"
                    + "      ,[doctorName] = ?\n"
                    + "      ,[doctorAge] = ?\n"
                    + "      ,[doctorGender] = ?\n"
                    + "      ,[username] =?\n"
                    + " WHERE [username] =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, d.getDoctorID());
            statement.setString(2, d.getDepartmentID());
            statement.setString(3, d.getDoctorName());
            statement.setInt(4, d.getDoctorAge());
            statement.setBoolean(5, d.isDoctorGender());
            statement.setString(6, d.getAccount().getUsername());
            statement.setString(7, d.getAccount().getUsername());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateAPDoctor(Account d) {
        try {
            String sql = "UPDATE [dbo].[Account]\n"
                    + "   SET [username] = ?\n"
                    + "      ,[password] = ?\n"
                    + "      ,[role] = ?\n"
                    + " WHERE [username] = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, d.getUsername());
            statement.setString(2, d.getPassword());
            statement.setInt(3, 1);
            statement.setString(4, d.getUsername());

            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
