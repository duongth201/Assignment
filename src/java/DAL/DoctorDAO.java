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
   public Doctor getDoctor(int id) {
       try {
           String sql = "SELECT s.id,s.name,s.gender,s.dob, s.email FROM Student s\n"
                   + "WHERE s.id = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           ResultSet rs = statement.executeQuery();
           if (rs.next()) {
//               Student s = new Student();
//               s.setId(rs.getInt("id"));
//               s.setName(rs.getString("name"));
//               s.setDob(rs.getDate("dob"));
//               s.setGender(rs.getBoolean("gender"));
//               s.setEmail(rs.getString("email"));
//               return s;
           }

       } catch (SQLException ex) {
           Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }


   public void insertStudent(Doctor s) {
       try {
           String sql = "INSERT INTO [Student](\n"
                   + "           [name]\n"
                   + "           ,[dob]\n"
                   + "           ,[gender]\n"
                   + "           ,[email])\n"
                   + "     VALUES(\n"
                   + "           ?\n"
                   + "           ,?\n"
                   + "           ,?\n"
                   + "           ,?)";
           PreparedStatement statement = connection.prepareStatement(sql);
//           statement.setInt(1, s.getId());
//           statement.setString(1, s.getName());
//           statement.setDate(2, (Date) s.getDob());
//           statement.setBoolean(3, s.isGender());
//           statement.setString(4, s.getEmail());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public void updateStudent(Doctor s) {
       try {
           String sql = "UPDATE [Student]\n"
                   + "   SET [name] = ?\n"
                   + "      ,[dob] = ?\n"
                   + "      ,[gender] = ?\n"
                   + "      ,[email] = ?\n"
                   + " WHERE [id] = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
//           statement.setString(1, s.getName());
//           statement.setDate(2, new java.sql.Date(s.getDob().getTime()));
//           statement.setBoolean(3, s.isGender());
//           statement.setString(4, s.getEmail());
//           statement.setInt(5, s.getId());
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }

   public void deleteStudent(int id) {
       try {
           String sql = "DELETE Student WHERE id=?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setInt(1, id);
           statement.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(DoctorDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
