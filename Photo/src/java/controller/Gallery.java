/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import entity.Image;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hungn
 */
@WebServlet(name = "Gallery", urlPatterns = {"/Gallery"})
public class Gallery extends HttpServlet {

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
            request.setAttribute("listShare", dao.getShare());

            String galleryID = request.getParameter("galleryID");
            String imgID = request.getParameter("imgID");
            String pageIndex = request.getParameter("index");

            int galID = 1;
            int imageID = dao.getFirstImageID(galID);

            int index = 1;

            try {
                if (galleryID != null) {
                    galID = Integer.parseInt(galleryID);
                } else {
                    galID = 1;
                }
            } catch (Exception e) {
                request.setAttribute("error", "The page is not existed");
            }
            //get galleryID 
            try {
                if (imgID != null) {
                    imageID = Integer.parseInt(imgID);
                }
              
                else {
                    imageID = dao.getFirstImageID(galID);
                }

            } catch (Exception e) {
                request.setAttribute("error", "Image is not available!");
            }
             if(!dao.checkImageExist(imageID, galID)){
                request.setAttribute("error", "The image is not existed");
            }
            //get image by imageID
            try {
                if (pageIndex != null) {
                    index = Integer.parseInt(pageIndex);
                } else {
                    index = 1;
                }
            } catch (Exception e) {
                request.setAttribute("error", "The page is not existed");
            }
            //get pageIndex
            int pageSize = 8;
            int countImage = dao.countImage(galID);
            if (countImage <= 0) {
                request.setAttribute("error", "The page is not existed");
            }
            int maxpage = countImage / pageSize;
            if (countImage % pageSize != 0) {
                maxpage++;
            }
           
            if (index > maxpage || index <= 0) {
                request.setAttribute("errorPage", "The page is not existed");
            }
            //paging for image in gallery
            request.setAttribute("firstImg", dao.getImageID(imageID, galID));
            request.setAttribute("maxpage", maxpage);
            request.setAttribute("index", index);
            request.setAttribute("galleryID", galID);
            request.setAttribute("gallery", dao.getGalleryByID(galID));
            List<Image> img = dao.getImageByGalleryID(galID, pageSize, index);
            request.setAttribute("listImg", img);
            
            request.setAttribute("listGallery", dao.getGallery());
          
            request.getRequestDispatcher("Gallery.jsp").forward(request, response);
//gallery --> index --> imageid
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
