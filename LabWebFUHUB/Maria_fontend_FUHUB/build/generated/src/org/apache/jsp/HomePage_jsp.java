package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_end_begin.release();
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
      out.write("                    <div class=\"intro\">\n");
      out.write("                        <div class=\"intro_image\">\n");
      out.write("                            <img src=\"images/intro.jpg\" alt=\"\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"intro_content\">\n");
      out.write("                            <div class=\"intro_title\">\n");
      out.write("                                Maria's Cosy Cafe\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"intro_des\">\n");
      out.write("                                Lorem ipsum dolor sit amet, consectetuer \n");
      out.write("                                adipiscing elit, sed diam nonummy nibh \n");
      out.write("                                euismod tincidunt ut laoreet dolore magna \n");
      out.write("                                aliquam erat volutpat. Ut wisi enim ad \n");
      out.write("                                minim veniam, quis nostrud exerci tation \n");
      out.write("                                ullamcorper suscipit lobortis nisl ut \n");
      out.write("                                aliquip ex ea commodo consequat.\n");
      out.write("                                Claritas est etiam processus dynamicus, \n");
      out.write("                                qui sequitur mutationem consuetudium \n");
      out.write("                                lectorum. Mirum est notare quam littera \n");
      out.write("                                gothica\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"top2\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"infor\">\n");
      out.write("                        <div class=\"infor_title\">\n");
      out.write("                            Visit my cafe\n");
      out.write("                        </div>\n");
      out.write("                        <p>\n");
      out.write("                            Lorem ipsum dolor sit amet, consectetuer adipiscing elit.\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            Gammel Torv, Copenhagen, Denmark\n");
      out.write("                        </p>\n");
      out.write("                        <p>\n");
      out.write("                            Phone:0345666656\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"signature\">\n");
      out.write("                        Kind regards\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setBegin(1);
    _jspx_th_c_forEach_0.setEnd(2);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"perTop2\">\n");
          out.write("                                <div class=\"top2_image\">\n");
          out.write("                                    <a href=\"CakeDetail.jsp\">\n");
          out.write("                                        <img src=\"images/product1.jpg\" alt=\"\"/>\n");
          out.write("                                    </a>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"top2_title\">\n");
          out.write("                                    In the Afternoon\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"top2_description\">\n");
          out.write("                                    Lorem ipsum dolor sit amet, \n");
          out.write("                                    consectetuer adipiscing elit, \n");
          out.write("                                    sed diam nonummy nibh euismod \n");
          out.write("                                    tincidunt ut laoreet dolore magna \n");
          out.write("                                    aliquam erat volutpat. Ut wisi \n");
          out.write("                                    enim ad minim veniam, quis nostrud \n");
          out.write("                                    exerci tation ullamcorper suscipit \n");
          out.write("                                    lobortis nisl ut aliquip ex ea commodo \n");
          out.write("                                    consequat.\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
