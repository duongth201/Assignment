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
* @author fsoft
*/
public class AccountsDAO extends BaseDAO<Account> {

   public Account getAPAdmin(String username, String password) {
       try {
            String sql = "SELECT[supervisorID]\n" +
                        "      ,[supervisorName]\n" +
                        "      ,[supervisorAccount]\n" +
                        "      ,[supervisorPass]\n" +
                        "  FROM [ass_prj].[dbo].[Supervisor]\n" +
                        "  WHERE [supervisorAccount] = '?' AND [supervisorPass] = '?'";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, username);
           statement.setString(2, password);

           ResultSet rs = statement.executeQuery();
           if (rs.next()) {
               Account s = new Account();
               s.setId(rs.getString("supervisorID"));
               s.setName(rs.getString("supervisorName"));
               s.setUsername(rs.getString("supervisorAccount"));
               s.setPassword(rs.getString("supervisorPass"));
               
               return s;
           }

       } catch (SQLException ex) {
           Logger.getLogger(AccountsDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }

    public Doctor getDoctorInfo(Account a) {
        String sql = "SELECT [doctorID]\n" +
"      ,[doctorName]\n" +
"      ,[doctorAccount]\n" +
"      ,[doctorPass]\n" +
"  FROM [dbo].[Doctor]";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getUsername());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                return new Doctor(a.getId(), a.getName(), a.getUsername(), a.getPassword());
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

}