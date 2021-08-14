/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.NewsDAO;
import entity.News;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP
 */
public class SearchServlet extends HttpServlet {

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
        try {
            NewsDAO ndao = new NewsDAO();

            // get latest news
            try {
                News news = ndao.getNews();
                request.setAttribute("top1", news);
            } catch (Exception e) {
                request.setAttribute("err_top1", "Can not show latest news");
            }

            try {
                ArrayList<News> data = ndao.getTopFiveLinkNews();
                request.setAttribute("top5", data);
            } catch (Exception e) {
                request.setAttribute("err_top5", "Can not show top 5 latest news");
            }

            // text want to search
            String txt = request.getParameter("txtSearch");
            request.setAttribute("txt", txt);

            // count total news when search
            int count = 0;
            try {
                count = ndao.count(txt);
            } catch (Exception e) {
            }

            int numberNewsEachPage = 3;
            int endPage = count / numberNewsEachPage;       // max of paging

            if (count % numberNewsEachPage != 0) {
                endPage++;
            }
            request.setAttribute("endPage", endPage);

            int index = 1;

            try {
                index = Integer.parseInt(request.getParameter("index"));
            } catch (Exception e) {
                request.setAttribute("err_index", "Do not have this index");
            }

            // check index page
            if (index > endPage) {
                index = endPage;
            }

            request.setAttribute("index", index);       // index of page user selected

            // list news found by searching
            try {
                ArrayList<News> list = ndao.search(txt, index, numberNewsEachPage);
                request.setAttribute("listS", list);
            } catch (Exception e) {
                request.setAttribute("err_search_paging", "An error orcus when searching");
            }
            
            //get and set context path
            String contextPath = getServletContext().getContextPath();
            request.setAttribute("contextPath", contextPath);
            
            request.getRequestDispatcher("/view/SearchPage.jsp").forward(request, response);
        } catch (Exception e) {
            request.getRequestDispatcher("/view/Error.jsp").forward(request, response);
        }
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
//        try {
//            String txt = request.getParameter("txtSearch");
//            int index = Integer.parseInt(request.getParameter("index"));
//
//            NewsDAO ndao = new NewsDAO();
//            int count = ndao.count(txt);
//
//            int numberNewsEachPage = 3;
//            int endPage = count / numberNewsEachPage;
//            if (count % numberNewsEachPage != 0) {
//                endPage++;
//            }
//
//            ArrayList<News> list = ndao.search(txt, index);
//
//            request.setAttribute("endPage", endPage);
//            request.setAttribute("listS", list);
//            request.setAttribute("txt", txt);
//
//            request.getRequestDispatcher("/view/SearchPage.jsp").forward(request, response);
//
//        } catch (Exception e) {
//        }
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
