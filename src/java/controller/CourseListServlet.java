/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.CourseDAO;
import DAL.DoctorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Course;
import model.Doctor;

/**
 *
 * @author ADMIN
 */
public class CourseListServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        page
        response.setContentType("text/html;charset=UTF-8");
        CourseDAO db = new CourseDAO();
        int pagesize = 4;
        String page = request.getParameter("page");
        if(page == null || page.trim().length() ==0)
            page = "1";
        int pageIndex = Integer.parseInt(page);
        int totalrecords = db.getCount();
        int totalpage = (totalrecords % pagesize == 0) ? totalrecords/pagesize : (totalrecords/pagesize)+1; 
        
        ArrayList<Course> numbercourse = db.getPageCourses(pageIndex, pagesize);
        request.setAttribute("numbercourse", numbercourse);
        request.setAttribute("totalpage", totalpage);
        request.setAttribute("pageIndex", pageIndex);
        
        
//        attribute info
//        DoctorDAO ddao = new DoctorDAO();
//        ArrayList<Doctor> doctors = ddao.getDoctors();
//        request.setAttribute("doctor", doctors);
        
        
        ArrayList<Course> courses = new ArrayList<>();
        courses = db.getCourses();
        request.setAttribute("courses", courses);
//        response.getWriter().println(courses);
        request.getRequestDispatcher("course.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
