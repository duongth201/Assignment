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
import model.Patient;

/**
*
* @author fsoft
*/
public class AccountsDAO extends BaseDAO<Account> {

   public Account getAP(String username, String password) {
       try {
            String sql = "SELECT [username]\n" +
                        "      ,[password]\n" +
                        "      ,[role]\n" +
                        "  FROM [ass_prj].[dbo].[Account]\n" +
                        "\n" +
                        "  WHERE [username] = ? AND [password] = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, username);
           statement.setString(2, password);

           ResultSet rs = statement.executeQuery();
           if (rs.next()) {
               Account s = new Account();
               s.setUsername(rs.getString("username"));
               s.setPassword(rs.getString("password"));
               s.setRole(rs.getInt("role"));
               return s;
           }

       } catch (SQLException ex) {
           Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }

   
   public ArrayList<Doctor> getDoctors() {
       ArrayList<Doctor> students = new ArrayList<>();
       try {
           String sql = "SELECT [doctorID]\n" +
                        "      ,[departmentID]\n" +
                        "      ,[doctorName]\n" +
                        "      ,[doctorPosition]\n" +
                        "      ,[doctorAge]\n" +
                        "      ,[doctorGender]\n" +
                        "      ,[doctorPhone]\n" +
                        "	  ,a.[username]\n" +
                        "	  ,a.[password]\n" +
                        "	  ,a.[role]\n" +
                        "  FROM [ass_prj].[dbo].[Doctor] d inner join [ass_prj].[dbo].[Account] a \n" +
                        "  on d.[username] = a.[username]";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Doctor s = new Doctor();
               s.setDoctorID(rs.getString("doctorID"));
               s.setDepartmentID(rs.getString("departmentID"));
               s.setDoctorName(rs.getString("doctorName"));
               s.setDoctorAge(rs.getInt("doctorAge"));
               s.setDoctorGender(rs.getBoolean("doctorGender"));
               s.setDoctorPhone(rs.getString("doctorPhone"));
               s.setAccount(new Account(rs.getString("username"), rs.getString("password"), 1));
               students.add(s);
           }
       } catch (SQLException ex) {
           Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return students;
   }


   public void insertAccountPatient(Patient p) {
       try {
           String sql = "INSERT INTO [dbo].[Patient]\n" +
                        "           ([patientName]\n" +
                        "           ,[patientAddress]\n" +
                        "           ,[patientPhone]\n" +
                        "           ,[username])\n" +
                        "     VALUES\n" +
                        "           ?" +
                        "           ,?\n" +
                        "           ,?\n" +
                        "           ,?)";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, p.getPatientName());
           statement.setString(2, p.getPatientAddress());
           statement.setString(3, p.getPatientPhone());
           statement.setString(4, p.getAccount().getUsername());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public void insertAccountUser(Account a) {
       try {
           String sql = "INSERT INTO [dbo].[Account]\n" +
                        "           ([username]\n" +
                        "           ,[password]\n" +
                        "           ,[role])\n" +
                        "     VALUES(\n" +
                        "           ?\n" +
                        "           ,?\n" +
                        "           ,2)";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, a.getUsername());
           statement.setString(2, a.getPassword());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public Patient checkAccout(String user){
       try {
            String sql = "SELECT [patientName],[username] FROM [ass_prj].[dbo].[Patient] \n" +
                            "WHERE [username] = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, user);

           ResultSet rs = statement.executeQuery();
           if (rs.next()) {
               Patient p = new Patient();
               Account a = new Account();
               p.setPatientName(rs.getString("patientName"));
               a.setUsername(rs.getString("username"));
                return p;
           }
       } catch (SQLException ex) {
           Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }
    
    public static void main(String[] args) {
        AccountsDAO ac = new AccountsDAO();
        System.out.println(ac.getAP("s1", "1").getUsername());
    }
}