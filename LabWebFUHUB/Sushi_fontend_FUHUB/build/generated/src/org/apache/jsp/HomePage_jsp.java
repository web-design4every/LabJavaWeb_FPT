package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      out.write("                    <div class=\"image_top\">\n");
      out.write("                        <div class=\"image_child\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <div class=\"paging\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
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
    _jspx_th_c_forEach_0.setEnd(3);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"list_product\">\n");
          out.write("                            <div class=\"product_title\">\n");
          out.write("                                Lorem ipsum dolor\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"product_image\">\n");
          out.write("                                <a href=\"SushiDetail.jsp\">\n");
          out.write("                                    <img src=\"images/sushi/sushi1.jpg\" alt=\"\"/>\n");
          out.write("                                </a>\n");
          out.write("                            </div>\n");
          out.write("                            Lorem ipsum dolor \n");
          out.write("                            sit amet, consectetuer adipiscing elit, \n");
          out.write("                            sed diam nonummy nibh euismod tincidunt \n");
          out.write("                            ut laoreet dolore magna aliquam erat v\n");
          out.write("                            olutpat. Ut wisi enim ad minim veniam, \n");
          out.write("                            quis nostrud exerci tation ullamcorper \n");
          out.write("                            suscipit lobortis nisl ut aliquip ex ea \n");
          out.write("                            commodo consequat. Duis autem vel eum \n");
          out.write("                            iriure dolor in hendrerit in vulputate \n");
          out.write("                            velit esse molestie consequat, vel illum \n");
          out.write("                            dolore eu feugiat nulla facilisis at vero \n");
          out.write("                            eros et accumsan et iusto odio dignissim \n");
          out.write("                            qui blandit praesent luptatum zzril delenit\n");
          out.write("                            augue duis dolore te feugait nulla facilisi.\n");
          out.write("                            Nam liber tempor cum soluta nobis eleifend \n");
          out.write("                            option congue nihil imperdiet doming id \n");
          out.write("                            quod mazim placerat facer possim assum.\n");
          out.write("                        </div>\n");
          out.write("                    ");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(3);
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
