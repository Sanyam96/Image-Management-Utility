/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-04 07:32:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("            href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script\n");
      out.write("            src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script\n");
      out.write("            src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        var check = function() {\n");
      out.write("            if (document.getElementById('passwordnew').value == document\n");
      out.write("                    .getElementById('passwordnewconfirm').value) {\n");
      out.write("                document.getElementById('message').style.color = 'white';\n");
      out.write("                document.getElementById('message').innerHTML = 'matching';\n");
      out.write("                return true;\n");
      out.write("            } else {\n");
      out.write("                document.getElementById('message').style.color = 'red';\n");
      out.write("                document.getElementById('message').innerHTML = 'Password does not match';\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <center>\n");
      out.write("            <h2>Image Management</h2>\n");
      out.write("            </center>\n");
      out.write("\n");
      out.write("            <form action=\"Login\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"username\">Username:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"Enter username\" name=\"username\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"pwd\">Password:</label>\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Enter password\" name=\"password\">\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            ");
 if (session.getAttribute("authorized") != null && session.getAttribute("authorized").equals("false"))
            { 
      out.write("\n");
      out.write("            <p style=\"color: crimson; text-align: center; font-weight: bold; font-family: Arial, Helvetica, sans-serif;\">Invalid credentials </p>\n");
      out.write("            ");
 session.setAttribute("authorized", null);
            } 
      out.write("\n");
      out.write("\n");
      out.write("            <button style=\"float: right\" type=\"button\"\n");
      out.write("                class=\"btn btn-info a-btn-slide-text\" data-toggle=\"modal\"\n");
      out.write("                data-target=\"#editModal\">Reset Password</button>\n");
      out.write("\n");
      out.write("            <!-- Modal -->\n");
      out.write("            <div class=\"modal fade\" id=\"editModal\" role=\"dialog\">\n");
      out.write("                <div class=\"modal-dialog\">\n");
      out.write("\n");
      out.write("                    <!-- Modal content-->\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("                            <center>\n");
      out.write("                            <h4 class=\"modal-title\">Reset Password</h4>\n");
      out.write("                            </center>\n");
      out.write("                        </div>\n");
      out.write("                        <center>\n");
      out.write("                        <div class=\"modal-body\">\n");
      out.write("                            <form action=\"ResetPassword\" method=\"post\"\n");
      out.write("                                onsubmit=\"return check()\">\n");
      out.write("                                <input type=\"text\" name=\"username\" placeholder=\"Confirm Username\" required>\n");
      out.write("                                <br />\n");
      out.write("                                <input type=\"text\" name=\"fullname\" placeholder=\"Confirm Full Name\" required>\n");
      out.write("                                <br />\n");
      out.write("                                <input type=\"password\" name=\"passwordnew\" id=\"passwordnew\" placeholder=\"New Password\" onkeyup='check();' required>\n");
      out.write("                                <br />\n");
      out.write("                                <input type=\"password\" name=\"passwordnewconfirm\" id=\"passwordnewconfirm\" placeholder=\"Confirm new password\" onkeyup='check();' required> <br /> <input type=\"submit\" value=\"Change Password\">\n");
      out.write("                                <hr />\n");
      out.write("                                <span id='message'>");
      out.print(session.getAttribute("message"));
      out.write("</span>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        </center>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        ");
 if(session.getAttribute("passwordmessage") != null)
            {
      out.write("\n");
      out.write("            <p style=\"color: blue; text-align: center; font-weight: bold; font-family: Arial, Helvetica, sans-serif;\">\n");
      out.write("            ");
      out.print( session.getAttribute("passwordmessage") );
      out.write("</p>\n");
      out.write("            ");
 session.setAttribute("passwordmessage", null);
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /index.jsp(96,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(false);
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("             <p>Message is :<p>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}