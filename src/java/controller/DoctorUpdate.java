/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.DoctorDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Doctor;

/**
 *
 * @author ADMIN
 */
public class DoctorUpdate extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DoctorUpdate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DoctorUpdate at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String id = request.getParameter("id");
        Doctor d = new Doctor();
        DoctorDAO ddao = new DoctorDAO();
        d = ddao.getDoctor(id);
//        response.getWriter().print(d);
        request.setAttribute("d", d);
        request.getRequestDispatcher("updatedoctor.jsp").forward(request, response);
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
        String id = request.getParameter("id");
        String did = request.getParameter("did");
        String name = request.getParameter("name");
        boolean gender = Boolean.parseBoolean(request.getParameter("gender")) ;
        int age = Integer.parseInt(request.getParameter("age"));
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        DoctorDAO ddao = new DoctorDAO();
        Account a = new Account(account, password, 1);
        Doctor d = new Doctor(id, did, name, age, gender, new Account(account, password, 1));
        ddao.updateDoctor(d); 
        
        ddao.updateAPDoctor(a);
//        response.getWriter().print(d.getDoctorID());
//        response.getWriter().print(d);
        response.sendRedirect("doctorlist");
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
