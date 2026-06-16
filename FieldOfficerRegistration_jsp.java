package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FieldOfficerRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script>\n");
      out.write("            function fun1(state){\n");
      out.write("                if (window.ActiveXObject)\n");
      out.write("                    xhr = new ActiveXObject(\"Microsoft.XMLHttp\");\n");
      out.write("                else\n");
      out.write("                    xhr = new XMLHttpRequest();\n");
      out.write("\n");
      out.write("                xhr.onreadystatechange = op;\n");
      out.write("                xhr.open(\"GET\", \"getconstituency.jsp?state=\" + state);\n");
      out.write("                xhr.send();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function op()\n");
      out.write("            {\n");
      out.write("                if (xhr.readyState == 4)\n");
      out.write("                {\n");
      out.write("                    //alert(xhr.responseText)\n");
      out.write("                    data = xhr.responseText;\n");
      out.write("                    alert(data);\n");
      out.write("                    //items = data.split(\",\", 2);\n");
      out.write("                    //document.getElementById(\"t1\").value = items[0];\n");
      out.write("                    //document.getElementById(\"t2\").value = items[1];\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
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
      out.write("                        <li><a href=\"VoterInfo.jsp\"><span>Voter Info</span></a></li>\n");
      out.write("                        <li><a href=\"FiledOfficerInfo.jsp\"><span>Field Officer Info</span></a></li>\n");
      out.write("                        <li><a href=\"DeclareResult.jsp\"><span>Declare Result</span></a></li>\n");
      out.write("                        <li><a href=\"ResetResult.jsp\"><span>Reset Result</span></a></li>\n");
      out.write("                        <li><a href=\"logout.jsp\"><span>Logout</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"content-wrap\">\n");
      out.write("                <div id=\"main\"> <a name=\"TemplateInfo\"></a>\n");
      out.write("                    <h1>E-Voting</h1>\n");
      out.write("                    <form name=\"form1\" action=\"ElectionDate.jsp\" method=\"post\">\n");
      out.write("                        <table cellspacing=\"10\" align=\"center\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th colspan=\"2\" style=\"font-size: 20px;\">Field Officer Registration Form</th>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Field Officer Id</td>\n");
      out.write("                                <td><input type=\"text\" name=\"fo_id\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Field Officer Name</td>\n");
      out.write("                                <td><input type=\"text\" name=\"fo_name\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Username</td>\n");
      out.write("                                <td><input type=\"text\" name=\"username\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Password</td>\n");
      out.write("                                <td><input type=\"password\" name=\"pwd\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>State</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <select name=\"state\" onchange=\"fun1(this.value)\">\n");
      out.write("                                        <option>--Select State--</option>\n");
      out.write("                                        <option value=\"Tamilnadu\">Tamilnadu</option>\n");
      out.write("                                        <option value=\"Kerala\">Kerala</option>\n");
      out.write("                                        <option value=\"Andhra Pradesh\">Andhra Pradesh</option>\n");
      out.write("                                        <option value=\"Karnataka\">Karnataka</option>\n");
      out.write("                                        <option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("                                        <option value=\"Gujarat\">Gujarat</option>\n");
      out.write("                                        <option value=\"Orissa\">Orissa</option>\n");
      out.write("                                        <option value=\"Delhi\">Delhi</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <select name=\"constituency\">\n");
      out.write("                                        <option value=\"\"></option>\n");
      out.write("                                    </select>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Election Date</td>\n");
      out.write("                                <td><input type=\"date\" name=\"edate\"/></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td>\n");
      out.write("                                    <input type=\"submit\" name=\"s1\" value=\"Submit\"/>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                    <br><br><br><br><br><br><br><br><br><br><br><br><br><br></br><br></br>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"sidebar\" style=\"line-height: 35px\">\n");
      out.write("                    <h1>Admin Links</h1>\n");
      out.write("                    <ul class=\"sidemenu\">\n");
      out.write("                        <li><a href=\"index.jsp\">Election Date</a></li>\n");
      out.write("                        <li><a href=\"AdminLogin.jsp\">Nominee Info</a></li>\n");
      out.write("                        <li><a href=\"AdminLogin.jsp\">Voter Info</a></li>\n");
      out.write("                        <li><a href=\"NewUser.jsp\">Field Officer Info</a></li>\n");
      out.write("                        <li><a href=\"UserLogin.jsp\">Declare Result</a></li>\n");
      out.write("                        <li><a href=\"Contact.jsp\">Reset Result</a></li>\n");
      out.write("                        <li><a href=\"About.jsp\">Logout</a></li>\n");
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
