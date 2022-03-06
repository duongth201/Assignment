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

/**
*
* @author fsoft
*/
public class AccountDAO extends BaseDAO<Account> {

   @Override
   public ArrayList<Account> getStudents() {
       ArrayList<Account> students = new ArrayList<>();
       try {
           String sql = "SELECT [id]\n" +
                   "      ,[name]\n" +
                   "      ,[gender]\n" +
                   "      ,[dob]\n" +
                   "  FROM [Student]";
           PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet rs = statement.executeQuery();
           while(rs.next())
           {
               Account s = new Account();
//               s.setId(rs.getInt("id"));
//               s.setName(rs.getString("name"));
//               s.setGender(rs.getBoolean("gender"));
//               s.setDob(rs.getDate("dob"));
               students.add(s);
           }
       } catch (SQLException ex) {
           Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return students;
   }
   public Account getStudent(int id) {
       try {
           String sql = "SELECT s.id,s.name,s.gender,s.dob FROM Student s\n"
                   + "WHERE s.id = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           ResultSet rs = statement.executeQuery();
           if (rs.next()) {
               Account s = new Account();
//               s.setId(rs.getInt("id"));
//               s.setName(rs.getString("name"));
//               s.setDob(rs.getDate("dob"));
//               s.setGender(rs.getBoolean("gender"));
               return s;
           }

       } catch (SQLException ex) {
           Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }


   public void insertStudent(Account s) {
       try {
           String sql = "INSERT INTO [Student](\n"
                   + "           [name]\n"
                   + "           ,[dob]\n"
                   + "           ,[gender])\n"
                   + "     VALUES(\n"
                   + "           ?\n"
                   + "           ,?\n"
                   + "           ,?)";
           PreparedStatement statement = connection.prepareStatement(sql);
//           statement.setInt(1, s.getId());
//           statement.setString(1, s.getName());
//           statement.setDate(2, (Date) s.getDob());
//           statement.setBoolean(3, s.isGender());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public void updateStudent(Account s) {
       try {
           String sql = "UPDATE [Student]\n"
                   + "   SET [name] = ?\n"
                   + "      ,[dob] = ?\n"
                   + "      ,[gender] = ?\n"
                   + " WHERE [id] = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
//           statement.setString(1, s.getName());
//           statement.setDate(2, new java.sql.Date(s.getDob().getTime()));
//           statement.setBoolean(3, s.isGender());
//           statement.setInt(4, s.getId());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }

   public void deleteStudent(int id) {
       try {
           String sql = "DELETE Student WHERE id=?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }

}