package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SushiDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"left\">\n");
      out.write("                    <div class=\"cake\">\n");
      out.write("                        <div class=\"cake_title\">Intro Sushi</div>\n");
      out.write("                        <div class=\"cake_detail\">\n");
      out.write("                            <div class=\"cake_image\">\n");
      out.write("                                <img src=\"images/sushi/sushi10.jpg\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                            Lorem ipsum dolor sit amet,\n");
      out.write("                            consectetuer adipiscing elit, \n");
      out.write("                            sed diam nonummy nibh euismod \n");
      out.write("                            tincidunt ut laoreet dolore magna \n");
      out.write("                            aliquam erat volutpat. Ut wisi \n");
      out.write("                            enim ad minim veniam, quis nostrud \n");
      out.write("                            exerci tation ullamcorper suscipit \n");
      out.write("                            lobortis nisl ut aliquip ex ea \n");
      out.write("                            commodo consequat. Duis autem vel \n");
      out.write("                            eum iriure dolor in hendrerit in \n");
      out.write("                            vulputate velit esse molestie \n");
      out.write("                            consequat, vel illum dolore eu \n");
      out.write("                            feugiat nulla facilisis at vero \n");
      out.write("                            eros et accumsan et iusto odio \n");
      out.write("                            dignissim qui blandit praesent \n");
      out.write("                            luptatum zzril delenit augue duis \n");
      out.write("                            dolore te feugait nulla facilisi.\n");
      out.write("                            Nam liber tempor cum soluta nobis \n");
      out.write("                            eleifend option congue nihil \n");
      out.write("                            imperdiet doming id quod mazim \n");
      out.write("                            placerat facer possim assum. \n");
      out.write("                            Typi non habent claritatem insitam; \n");
      out.write("                            est usus legentis in iis qui facit \n");
      out.write("                            eorum claritatem. Investigationes\n");
      out.write("                            demonstraverunt lectores legere me \n");
      out.write("                            lius quod ii legunt saepius.\n");
      out.write("                            Claritas est etiam processus \n");
      out.write("                            dynamicus, qui sequitur mutationem \n");
      out.write("                            consuetudium lectorum. \n");
      out.write("                            Mirum est notare quam littera\n");
      out.write("                            gothica, quam nunc putamus\n");
      out.write("                            parum claram, anteposuerit \n");
      out.write("                            litterarum formas humanitatis \n");
      out.write("                            per seacula quarta decima et \n");
      out.write("                            quinta decima. Eodem modo typi, \n");
      out.write("                            qui nunc nobis videntur parum \n");
      out.write("                            clari, fiant sollemnes in futurum.\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"cake_price\">\n");
      out.write("                            Price: 5000 $\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Right.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
