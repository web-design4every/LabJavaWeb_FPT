/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import entity.Gallery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hungn
 */
@WebServlet(name = "Home", urlPatterns = {"/Home"})
public class Home extends HttpServlet {

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
        try {
            DAO dao = new DAO();
            int galleryCount = dao.countGallery();
            String pageIndex = request.getParameter("index");

            int index = 1;
            try {
 
                if (pageIndex != null) {
                    index = Integer.parseInt(pageIndex);
                } else {
                    index = 1;
                }
            } catch (Exception e) {         
               request.setAttribute("error", "There is no gallery in this page");
            }
            // get page index
            int pageSize = 3;
            int maxpage = galleryCount / pageSize;
            if ((galleryCount % pageSize != 0)) {
                maxpage++;
            }
            // divide galleries by page
            if (index > maxpage || index <= 0) {
                request.setAttribute("error", "There is no gallery in this page");
            }
            //check if page is out of index or not
            
            request.setAttribute("index", index);
            request.setAttribute("home", dao.getHomepage());
            request.setAttribute("activeHome", "activeHome");
            request.setAttribute("listShare", dao.getShare());
            List<Gallery> listGalleryByPage = dao.getGalleryByPage(pageSize, index);
            List<Gallery> listGallery = dao.getGallery();
            request.setAttribute("maxpage", maxpage);
          
            request.setAttribute("listGallery", listGallery);
            request.setAttribute("galleryCount", galleryCount);

            request.getRequestDispatcher("Homepage.jsp").forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("error", ex);
            request.getRequestDispatcher("Error.jsp").forward(request, response);
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
    