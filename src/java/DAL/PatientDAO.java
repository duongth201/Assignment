/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Patient;

/**
 *
 * @author ADMIN
 */
public class PatientDAO extends BaseDAO<Patient> {

    public void updatePatient(Patient p) {
        try {
            String sql = "UPDATE [dbo].[Patient]\n"
                    + "   SET [patientName] = ?\n"
                    + "      ,[patientPhone] = ?\n"
                    + "      ,[patientEmail] = ?\n"
                    + " WHERE username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, p.getPatientName());
           statement.setString(2, p.getPatientPhone());
           statement.setString(3, p.getPatientEmail());
           statement.setString(4, p.getAccount().getUsername());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Patient getPatient(String username) {
       try {
           String sql = "select patientName, patientEmail, patientPhone from Patient where username = ?";
           PreparedStatement statement = connection.prepareStatement(sql);
           statement.setString(1, username);
           ResultSet rs = statement.executeQuery();
           if (rs.next()) {
               Patient p = new Patient();
               p.setPatientName(rs.getString("patientName"));
               p.setPatientEmail(rs.getString("patientEmail"));
               p.setPatientPhone(rs.getString("patientPhone"));
               return p;
           }

       } catch (SQLException ex) {
           Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
   }

}
