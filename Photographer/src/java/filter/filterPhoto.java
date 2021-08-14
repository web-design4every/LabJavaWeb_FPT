/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class filterPhoto implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String url = req.getServletPath();
        
        if (url.endsWith("jsp") && !url.contains("error.jsp")) {
            if (url.endsWith("contact.jsp")) {
                res.sendRedirect("Contact");
            } else if (url.endsWith("homepage.jsp") || url.endsWith("footer.jsp") || url.endsWith("right.jsp") || url.endsWith("header.jsp")) {
                res.sendRedirect("HomePage");
            } else if (url.endsWith("gallery.jsp")) {
                res.sendRedirect("Gallery");
            } else {
                req.setAttribute("error", "Can not find with url is :" + url);
                req.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
        chain.doFilter(req, res);
    }

    @Override
    public void destroy() {

    }

}
