/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.GalleryDAO;
import entity.Contact;
import entity.Galery;
import entity.Share;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class HomeServlet extends HttpServlet {

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
        try{
            GalleryDAO dao = new GalleryDAO();
            int pageSize = 3;
            String pageIndex = request.getParameter("index");
            int index = 0;
            //check index page
            if (pageIndex != null) {
                try {
                    index = Integer.parseInt(pageIndex);
                } catch (Exception e) {
                    request.setAttribute("errorHome", "This page is invalid!!");
                }
            }else{
                index = 1;
            }
            //count total gallery 
            int totalGallery = dao.count();
            if(totalGallery <= 0){
                request.setAttribute("errorHome", "No result!!");
            }
            int maxPage = totalGallery / pageSize;
            if ((totalGallery % pageSize) != 0) {
                maxPage++;
            }
            //get list galery with paging 
            List<Galery> listGallery = dao.getListGalleryWithPaging(index, pageSize);
            request.setAttribute("listGallery", listGallery);
            request.setAttribute("index", index);
            request.setAttribute("maxPage", maxPage);
            request.setAttribute("totalGallery", totalGallery);
           //get top 3 galery
            List<Galery> top3 = dao.getTop3Gallery();
            request.setAttribute("top3", top3);   
           //get contact infor
           Contact contact = dao.getContact();
           request.setAttribute("contact", contact);
           
            List<Share> share  = dao.getShare();
            request.setAttribute("listShare", share);
            
           request.setAttribute("activeHome", "activeHome");
           request.getRequestDispatcher("homepage.jsp").forward(request, response);
       }catch(Exception ex){
           request.setAttribute("error", ex); 
           request.getRequestDispatcher("error.jsp").forward(request, response);
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