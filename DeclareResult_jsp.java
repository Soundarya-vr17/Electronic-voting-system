package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DeclareResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>E-Voting</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"images/Techmania.css\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <h1 id=\"logo-text\">E-Voting<span class=\"gray\">&nbsp;using Block Chain</span></h1>\n");
      out.write("                <h2 id=\"slogan\">E-Voting</h2>\n");
      out.write("                <div id=\"header-tabs\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"ElectionDate.jsp\"><span>Election Date</span></a></li>\n");
      out.write("                        <li><a href=\"NomineeInfo.jsp\"><span>Nominee Info</span></a></li>\n");
      out.write("                        <li><a href=\"VoterInfoByAdmin.jsp\"><span>Voter Info</span></a></li>\n");
      out.write("                        <li><a href=\"FieldOfficerInfo.jsp\"><span>Field Officer Info</span></a></li>\n");
      out.write("                        <li><a href=\"DeclareResult.jsp\"><span>Declare Result</span></a></li>\n");
      out.write("                        <li><a href=\"ResetResult.jsp\"><span>Reset Result</span></a></li>\n");
      out.write("                        <li><a href=\"logout.jsp\"><span>Logout</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content-wrap\">\n");
      out.write("                <div id=\"main\"> <a name=\"TemplateInfo\"></a>\n");
      out.write("                    <h1>E-Voting</h1>\n");
      out.write("                    \n");
      out.write("                    <br><br><br>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"sidebar\" style=\"line-height: 35px\">\n");
      out.write("                    <h1>Admin Links</h1>\n");
      out.write("                    <ul class=\"sidemenu\">\n");
      out.write("                        <li><a href=\"ElectionDate.jsp\">Election Date</a></li>\n");
      out.write("                        <li><a href=\"FieldOfficerRegistration.jsp\">Field Officer Registration</a></li>\n");
      out.write("                        <li><a href=\"NomineeInfo.jsp\">Nominee Info</a></li>\n");
      out.write("                        <li><a href=\"VoterInfoByAdmin.jsp\">Voter Info</a></li>\n");
      out.write("                        <li><a href=\"FieldOfficerInfo.jsp\">Field Officer Info</a></li>\n");
      out.write("                        <li><a href=\"DeclareResult.jsp\">Declare Result</a></li>\n");
      out.write("                        <li><a href=\"ResetResult.jsp\">Reset Result</a></li>\n");
      out.write("                        <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\"> <span id=\"footer-left\"> &copy; 2019 <strong>SR InfoTech</strong> | Design by: <strong><a href=\"http://www.styleshout.com/\">AMS</a></strong> | Valid: <a href=\"http://validator.w3.org/check?uri=referer\">XHTML</a> | <a href=\"http://jigsaw.w3.org/css-validator/check/referer\">CSS</a> </span> <span id=\"footer-right\"> <a href=\"#\">Home</a> | <a href=\"#\">About Us</a> | <a href=\"#\">Contact Us</a> </span> </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
