/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import context.DBContext;
import dao.CakeDAO;
import dao.ShareDAO;
import entity.Cake;
import entity.Share;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jdt.internal.compiler.impl.Constant;

/**
 *
 * @author Hoan toan hanh phuc
 */
@WebServlet(name = "CakeControl", urlPatterns = {"/CakeControl"})
public class CakeControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String message="";
        try {
            //begin of set imagePath
            DBContext bContext = new DBContext();
            try {
                String imagePath = bContext.getImagePath();
                request.setAttribute("imagePath", imagePath);
            } catch (Exception e) {
                message = e.getMessage();
            }
            //end of set imagePath

            ShareDAO shareDAO = new ShareDAO();
            try {
                List<Share> share = shareDAO.getShare();
            request.setAttribute("share", share);
            } catch (Exception e) {
                request.setAttribute("error", e.getMessage());
            }

            String id = request.getParameter("id");
            int idCake = 0;
            try {
                idCake = Integer.parseInt(id);
            } catch (Exception e) {
                message = e.getMessage();
            }
            CakeDAO cakeDAO = new CakeDAO();
            Cake cake = cakeDAO.getCakeDetail(idCake);
            if (cake == null) {
                message = "not found";
            } else {
                request.setAttribute("cake", cake);
            }
            request.setAttribute("error", message);
            request.getRequestDispatcher("CakeDetail.jsp").forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("error", ex.getMessage());
            response.sendRedirect("Error.jsp");
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
