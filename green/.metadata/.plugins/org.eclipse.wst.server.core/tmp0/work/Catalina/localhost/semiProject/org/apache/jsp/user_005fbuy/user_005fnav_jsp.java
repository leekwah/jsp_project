/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-09-23 10:53:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user_005fbuy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fnav_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	if(session.getAttribute("Member") == null){ 
	// member가 null(초기화)되면  main으로 들어갈 수 없게 
	// jsp:forward로 login으로 돌아감.

      out.write("\r\n");
      out.write("		");
      if (true) {
        _jspx_page_context.forward("../login/login.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

	}

      out.write('\r');
      out.write('\n');

	String id = (String)session.getAttribute("id"); // 타입을 맞도록 해야함.
	String name = (String)session.getAttribute("name");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<ul class=\"navbar-nav flex-fill w-100 mb-2\">\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a href=\"../user/user_index.jsp\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"nav-link\">\r\n");
      out.write("                <i class=\"fe fe-home fe-16\"></i>\r\n");
      out.write("                <span class=\"ml-3 item-text\">홈</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a href=\"#contact\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle nav-link\">\r\n");
      out.write("                <i class=\"fe fe-briefcase fe-16\"></i>\r\n");
      out.write("                <span class=\"ml-3 item-text\">상품</span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"collapse list-unstyled pl-4 w-100\" id=\"contact\">\r\n");
      out.write("                <a class=\"nav-link pl-3\" href=\"#\"><span class=\"ml-1\">주문 관리</span></a>\r\n");
      out.write("                <a class=\"nav-link pl-3\" href=\"#\"><span class=\"ml-1\">환불 관리</span></a>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a href=\"#profile\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle nav-link\">\r\n");
      out.write("                <i class=\"fe fe-smile fe-16\"></i>\r\n");
      out.write("                <span class=\"ml-3 item-text\">고객 센터</span>\r\n");
      out.write("              </a>\r\n");
      out.write("              <ul class=\"collapse list-unstyled pl-4 w-100\" id=\"profile\">\r\n");
      out.write("                <a class=\"nav-link pl-3\" href=\"adminIndex.jsp?pages=qnaList\"><span class=\"ml-1\">문의 관리</span></a>\r\n");
      out.write("                <a class=\"nav-link pl-3\" href=\"adminIndex.jsp?pages=listNotice\"><span class=\"ml-1\">공지사항 관리</span></a>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item w-100\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"adminIndex.jsp?pages=listMember\">\r\n");
      out.write("                <i class=\"fe fe-calendar fe-16\"></i>\r\n");
      out.write("                <span class=\"ml-3 item-text\">회원관리</span>\r\n");
      out.write("              </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <div class=\"btn-box w-100 mt-1 mb-1\">\r\n");
      out.write("            <a href=\"../login/login.jsp\" target=\"_blank\" class=\"btn mb-2 btn-primary btn-lg btn-block\">\r\n");
      out.write("              <i class=\"fe fe-shopping-cart fe-12 mx-2\"></i><span class=\"small\">로그인</span>\r\n");
      out.write("            </a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"btn-box w-100 mb-1\">\r\n");
      out.write("            <a href=\"../login/register.jsp\" target=\"_blank\" class=\"btn mb-2 btn-secondary btn-lg btn-block\">\r\n");
      out.write("              <i class=\"fe fe-user-plus fe-12 mx-2\"></i><span class=\"small\">회원가입</span>\r\n");
      out.write("            </a>	\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"btn-box w-100 mb-1\">\r\n");
      out.write("              <i class=\"fe fe-user-plus fe-12 mx-2\"></i>\r\n");
      out.write("              <span class=\"small\"> 안녕하세요. ");
      out.print( name );
      out.write(' ');
      out.write('(');
      out.print( id );
      out.write(")님\r\n");
      out.write("              </span>\r\n");
      out.write("          </div>\r\n");
      out.write("	</ul>\r\n");
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