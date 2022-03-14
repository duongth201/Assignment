/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Course;
import model.Doctor;
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
            String sql = "select patientID, patientName, patientEmail, patientPhone from Patient where username = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Patient p = new Patient();
                p.setPatientID(rs.getString("patientID"));
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

    public ArrayList<Course> getPatientCourse(String patientID) {
        ArrayList<Course> c = new ArrayList<>();
        try {
            String sql = "select * from Course c inner join Patient_Course p\n"
                    + "on c.courseID = p.courseID inner join Doctor d\n"
                    + "on d.doctorID = c.doctorID\n"
                    + "where patientID = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, patientID);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                Course p = new Course();
                p.setCourseID(rs.getString("courseID"));
                p.setCourseImg(rs.getString("courseImg"));
                p.setCourseInfo(rs.getString("courseInfo"));
                p.setCourseName(rs.getString("courseName"));
                p.setCoursePrice(rs.getString("coursePrice"));
                p.setCourseTime(rs.getString("courseTimeWorking"));
                p.setD(new Doctor(rs.getString("doctorName")));
                c.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    public static void main(String[] args) {
        PatientDAO pdao = new PatientDAO();
        ArrayList<Course> x = pdao.getPatientCourse("7");
        System.out.println(x);

    }
}
