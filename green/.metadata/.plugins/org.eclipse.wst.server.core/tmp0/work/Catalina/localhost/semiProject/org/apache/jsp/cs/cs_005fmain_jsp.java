/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-23 10:33:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.cs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cs_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("<link rel=\"icon\" href=\"favicon.ico\">\r\n");
      out.write("<title>Tiny Dashboard - A Bootstrap Dashboard Template</title>\r\n");
      out.write("    <!-- 부트스트랩 CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\r\n");
      out.write("<!-- Simple bar CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/simplebar.css\">\r\n");
      out.write("<!-- Fonts CSS -->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Overpass:ital,wght@0,100;0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Icons CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/feather.css\">\r\n");
      out.write("<!-- Date Range Picker CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/daterangepicker.css\">\r\n");
      out.write("<!-- App CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/app-light.css\" id=\"lightTheme\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/app-dark.css\" id=\"darkTheme\" disabled>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	li{\r\n");
      out.write("		display: inline-block;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"vertical  light  \">\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("              <div class=\"w-50 mx-auto text-center justify-content-center py-5 my-5\">\r\n");
      out.write("                <h2 class=\"page-title mb-0\">How can we help?</h2>\r\n");
      out.write("                <p class=\"lead text-muted mb-4\">궁금한점을 찾아보세요</p>\r\n");
      out.write("                <!-- <form class=\"searchform searchform-lg\">\r\n");
      out.write("                  <input class=\"form-control form-control-lg bg-white rounded-pill pl-5\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                  <p class=\"help-text mt-2 text-muted\">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                </form> -->\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"row my-4\">\r\n");
      out.write("                <div class=\"col-6 col-md-4\">\r\n");
      out.write("                  <div class=\"card shadow mb-4\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                      <i class=\"fe fe-info fe-32 text-primary\"></i>\r\n");
      out.write("                      <a href=\"qna/qnaList_u.jsp\">\r\n");
      out.write("                        <h3 class=\"h5 mt-4 mb-1\">QnA</h3>\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <p class=\"text-muted\">궁금한 점을 문의하세요</p>\r\n");
      out.write("                    </div> <!-- .card-body -->\r\n");
      out.write("                  </div> <!-- .card -->\r\n");
      out.write("                </div> <!-- .col-md-->\r\n");
      out.write("                <div class=\"col-6 col-md-4\">\r\n");
      out.write("                  <div class=\"card shadow mb-4\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                      <i class=\"fe fe-help-circle fe-32 text-success\"></i>\r\n");
      out.write("                      <a href=\"faq/faq_main.jsp\">\r\n");
      out.write("                        <h3 class=\"h5 mt-4 mb-1\">FAQ</h3>\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <p class=\"text-muted\">자주 묻는 질문을 확인해주세요</p>\r\n");
      out.write("                    </div> <!-- .card-body -->\r\n");
      out.write("                  </div> <!-- .card -->\r\n");
      out.write("                </div> <!-- .col-md-->\r\n");
      out.write("                <div class=\"col-6 col-md-4\">\r\n");
      out.write("                  <div class=\"card shadow mb-4\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                      <i class=\"fe fe-globe fe-32 text-warning\"></i>\r\n");
      out.write("                      <a href=\"notice/noticeList_u.jsp\">\r\n");
      out.write("                        <h3 class=\"h5 mt-4 mb-1\">Notice</h3>\r\n");
      out.write("                      </a>\r\n");
      out.write("                      <p class=\"text-muted\">공지사항을 확인해주세요</p>\r\n");
      out.write("                    </div> <!-- .card-body -->\r\n");
      out.write("                  </div> <!-- .card -->\r\n");
      out.write("                </div> <!-- .col-md-->\r\n");
      out.write("              </div> <!-- .row -->\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"row my-4\">\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                  <div class=\"card shadow bg-primary text-center mb-4\">\r\n");
      out.write("                    <div class=\"card-body p-5\">\r\n");
      out.write("                      <span class=\"circle circle-md bg-primary-light\">\r\n");
      out.write("                        <i class=\"fe fe-navigation fe-24 text-white\"></i>\r\n");
      out.write("                      </span>\r\n");
      out.write("                      <h3 class=\"h4 mt-4 mb-1 text-white\">마이 페이지</h3>\r\n");
      out.write("                      <p class=\"text-white mb-4\">마이 페이지에서 회원 정보를 확인하세요</p>\r\n");
      out.write("                      <a href=\"#\" class=\"btn btn-lg bg-primary-light text-white\">My Page<i class=\"fe fe-arrow-right fe-16 ml-2\"></i></a>\r\n");
      out.write("                    </div> <!-- .card-body -->\r\n");
      out.write("                  </div> <!-- .card -->\r\n");
      out.write("                </div> <!-- .col-md-->\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                  <div class=\"card shadow bg-success text-center mb-4\">\r\n");
      out.write("                    <div class=\"card-body p-5\">\r\n");
      out.write("                      <span class=\"circle circle-md bg-success-light\">\r\n");
      out.write("                        <i class=\"fe fe-message-circle fe-24 text-white\"></i>\r\n");
      out.write("                      </span>\r\n");
      out.write("                      <h3 class=\"h4 mt-4 mb-1 text-white\">장바구니</h3>\r\n");
      out.write("                      <p class=\"text-white mb-4\">장바구니에 담아둔 제품을 구매해 보세요</p>\r\n");
      out.write("                      <a href=\"#\" class=\"btn btn-lg bg-success-light text-white\">Basket<i class=\"fe fe-arrow-right fe-16 ml-2\"></i></a>\r\n");
      out.write("                    </div> <!-- .card-body -->\r\n");
      out.write("                  </div> <!-- .card -->\r\n");
      out.write("                </div> <!-- .col-md-->\r\n");
      out.write("              </div> <!-- .row -->\r\n");
      out.write("            </div> <!-- .col-12 -->\r\n");
      out.write("          </div> <!-- .row -->\r\n");
      out.write("        </div> <!-- .container-fluid -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "faq/faq.jsp", out, false);
      out.write("\r\n");
      out.write("    </div> <!-- .wrapper -->\r\n");
      out.write("	    </div> <!-- .wrapper -->\r\n");
      out.write("    <script src=\"../js/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/moment.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/simplebar.min.js\"></script>\r\n");
      out.write("    <script src='../js/daterangepicker.js'></script>\r\n");
      out.write("    <script src='../js/jquery.stickOnScroll.js'></script>\r\n");
      out.write("    <script src=\"../js/tinycolor-min.js\"></script>\r\n");
      out.write("    <script src=\"../js/config.js\"></script>\r\n");
      out.write("    <script src=\"../js/apps.js\"></script>\r\n");
      out.write("    <!-- Global site tag (gtag.js) - Google Analytics -->\r\n");
      out.write("    <script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-56159088-1\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      window.dataLayer = window.dataLayer || [];\r\n");
      out.write("\r\n");
      out.write("      function gtag()\r\n");
      out.write("      {\r\n");
      out.write("        dataLayer.push(arguments);\r\n");
      out.write("      }\r\n");
      out.write("      gtag('js', new Date());\r\n");
      out.write("      gtag('config', 'UA-56159088-1');\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
