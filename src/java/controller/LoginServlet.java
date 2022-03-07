/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAL.AccountsDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Doctor;

/**
 *
 * @author ADMIN
 */
public class LoginServlet extends HttpServlet {

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
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
//        String u = request.getParameter("username");
//        String p = request.getParameter("password");
//        AccountsDAO db = new AccountsDAO();
//        Account a = db.getAPAdmin(u, p);
//        if (u.isEmpty() || p.isEmpty()) {
//            request.setAttribute("errorLogin", "You need to fill all the blanks");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        } else {
//            if (a == null) {
//                //chua co hoac goc nham
//                request.setAttribute("errorLogin", "This Account does not exist!");
//                request.getRequestDispatcher("login.jsp").forward(request, response);
//            } else {
//                Doctor d = db.getDoctorInfo(a);
//                HttpSession session = request.getSession();
//                session.setAttribute("customer", d);
//                session.setAttribute("acc", a);
//                response.sendRedirect("detail.jsp");
//            }
//        }
        String username = request.getParameter("username");
       String password = request.getParameter("password");
       AccountsDAO db = new AccountsDAO();
       Account account =  db.getAPAdmin(username, password);
       if(account != null) // login successfully!
       {
           String remember = request.getParameter("remember");
           if(remember !=null)
           {
               Cookie c_user = new Cookie("username", username);
               Cookie c_pass = new Cookie("password", password);
               c_user.setMaxAge(3600*24*30);
               c_pass.setMaxAge(3600*24*30);
               response.addCookie(c_pass);
               response.addCookie(c_user);
           }
           HttpSession session = request.getSession();
           session.setAttribute("acc", account);
//           session.setMaxInactiveInterval(10);

           response.sendRedirect("index.html");
       }
       else //login fail
       {
           request.getRequestDispatcher("login.jsp").forward(request, response);
       }
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
