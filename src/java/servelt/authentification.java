/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelt;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAMSUNG
 */
public class authentification extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String _username=request.getParameter("txtusername");
            String _pwd=request.getParameter("txtPassword");

            try {
                if (_username!=null) {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    Connection cnx=DriverManager.getConnection("jdbc:mysql://localhost/tp_jee","root","");
                    String sql="select * from login where username=? and pwd=?";
                    PreparedStatement psm=cnx.prepareStatement(sql);
                    psm.setString(1, _username);   
                    psm.setString(2, _pwd);
                    ResultSet rs=psm.executeQuery();
                    if (rs.next()) {
                        
                        HttpSession se=request.getSession(true);
                        se.setAttribute("login", _username);
                        se.setMaxInactiveInterval(30);
                        response.sendRedirect("welcom.jsp");
                    }
                    else{
                        out.println("error!");
                    }

                    
                    
                }
            } 
            catch (Exception ex) {
                out.println("Exeption : "+ ex.getMessage());
            }
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
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
