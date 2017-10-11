package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      out.write("<html> \t\r\n");
      out.write("<head> \r\n");
      out.write("    <title>");
 out.print("Momovie"); 
      out.write("</title>  \r\n");
      out.write("    <style> \r\n");
      out.write("    *{ \r\n");
      out.write("        margin: 0; \r\n");
      out.write("        padding: 0; \r\n");
      out.write("    } \r\n");
      out.write("\r\n");
      out.write("    .search{ \r\n");
      out.write("        margin-top:300px;\r\n");
      out.write("        margin-left:410px;\r\n");
      out.write("        width: 800px; \r\n");
      out.write("        height:50px;\r\n");
      out.write("    } \r\n");
      out.write("\r\n");
      out.write("    .search_key{ \r\n");
      out.write("        font-style:\"微软雅黑\";\r\n");
      out.write("        font-size:20px;\r\n");
      out.write("        width: 500px; \r\n");
      out.write("        height: 35px; \r\n");
      out.write("        border: 2px solid CornflowerBlue;\r\n");
      out.write("    } \r\n");
      out.write("\r\n");
      out.write("    .submit{ \r\n");
      out.write("        font-style:\"微软雅黑\";\r\n");
      out.write("        font-size:20px;\r\n");
      out.write("        color:Azure;\r\n");
      out.write("        background:CornflowerBlue ; \r\n");
      out.write("        width:100px; \r\n");
      out.write("        height: 35px;  \r\n");
      out.write("    } \r\n");
      out.write("    .table{\r\n");
      out.write("        margin-top:5px;\r\n");
      out.write("        height:55px;\r\n");
      out.write("        width:500px;    \r\n");
      out.write("    }\r\n");
      out.write("    .button\r\n");
      out.write("    {\r\n");
      out.write("    \twidth:100px;\r\n");
      out.write("    \theight:50px;\r\n");
      out.write("    \tfont-style:\"微软雅黑\";\r\n");
      out.write("        font-size:20px;\r\n");
      out.write("        background:White ;\r\n");
      out.write("        border:0;\r\n");
      out.write("    }\r\n");
      out.write("    </style> \r\n");
      out.write("<script>\r\n");
      out.write("function n(){\r\n");
      out.write("\t  document.getElementById('name').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function director(){\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function role(){\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function t(){\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function score(){\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("function time(){\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write(" <style>\r\n");
      out.write("#name{display:none;margin:auto;}\r\n");
      out.write("#director{display:none;margin:auto;}\r\n");
      out.write("#role{display:none;margin:auto;}\r\n");
      out.write("#type{display:none;margin:auto;}\r\n");
      out.write("#score{display:block;margin:auto;}\r\n");
      out.write("#time{display:none;margin:auto;}\r\n");
      out.write("#x{}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head> \r\n");
      out.write("\r\n");
      out.write("<body> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute; left:550px; top:170px; width:200px; height:200px\">\r\n");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\1.jpg\" width=280px height=93px></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form id=\"name\" action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\" method=\"post\">\r\n");
      out.write("  <input type=\"text\" name=\"name\" class=\"search_key\" value=\"内容搜索\" > \r\n");
      out.write("    <input type=\"submit\" class=\"submit\" value=\"搜索\"> \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form id=\"director\" action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\" method=\"post\">\r\n");
      out.write(" <input type=\"text\" name=\"director\" class=\"search_key\" value=\"导演搜索\" > \r\n");
      out.write("    <input type=\"submit\" class=\"submit\" value=\"搜索\"> \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form id=\"role\" action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\" method=\"post\">\r\n");
      out.write("<input type=\"text\" name=\"role\" class=\"search_key\" value=\"主演搜索\" > \r\n");
      out.write("    <input type=\"submit\" class=\"submit\" value=\"搜索\"> \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form id=\"time\" action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\" method=\"post\">\r\n");
      out.write(" <FONT face=\"华文仿宋\" size=4>\r\n");
      out.write("    <select name=\"time\" class=\"search_key\" onChange=\"javascript:check(this.value)\"> \r\n");
      out.write("       <option value=\"null\">请选择时间(该时间之后上映的电影)</option>\r\n");
      out.write("       <option value=\"1900\">1900</option> \r\n");
      out.write("       <option value=\"1950\">1950</option>\r\n");
      out.write("       <option value=\"1990\">1990</option>\r\n");
      out.write("       <option value=\"1995\">1995</option>\r\n");
      out.write("       <option value=\"2000\">2000</option>\r\n");
      out.write("       <option value=\"2005\">2005</option>\r\n");
      out.write("       <option value=\"2010\">2010</option>\r\n");
      out.write("       <option value=\"2012\">2012</option>\r\n");
      out.write("       <option value=\"2014\">2014</option>\r\n");
      out.write("       <option value=\"2015\">2015</option>\r\n");
      out.write("    </select></FONT>\r\n");
      out.write("    <input type=\"submit\" class=\"submit\" value=\"搜索\"> \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form id=\"type\" action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\" method=\"post\">\r\n");
      out.write(" <FONT face=\"华文仿宋\" size=4>\r\n");
      out.write("    <select name=\"type\" class=\"search_key\" onChange=\"javascript:check(this.value)\"> \r\n");
      out.write("       <option value=\"null\">请选择类型</option>\r\n");
      out.write("       <option value=\"科幻\">科幻</option> \r\n");
      out.write("       <option value=\"悬疑\">悬疑</option>\r\n");
      out.write("       <option value=\"喜剧\">喜剧</option>\r\n");
      out.write("       <option value=\"爱情\">爱情</option>\r\n");
      out.write("       <option value=\"惊悚\">惊悚</option>\r\n");
      out.write("       <option value=\"动作\">动作</option>\r\n");
      out.write("       <option value=\"剧情\">剧情</option>\r\n");
      out.write("       <option value=\"犯罪\">犯罪</option>\r\n");
      out.write("       <option value=\"冒险\">冒险</option>\r\n");
      out.write("       <option value=\"传记\">传记</option>\r\n");
      out.write("    </select></FONT>\r\n");
      out.write("    <input type=\"submit\" class=\"submit\" value=\"搜索\"> \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form id=\"score\" action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\" method=\"post\">\r\n");
      out.write(" <FONT face=\"华文仿宋\" size=4>\r\n");
      out.write("    <select name=\"score\" class=\"search_key\" onChange=\"javascript:check(this.value)\"> \r\n");
      out.write("       <option value=\"null\">请选择评分</option>\r\n");
      out.write("       <option value=\"5\">5.0-6.0</option> \r\n");
      out.write("       <option value=\"6\">6.0-7.0</option> \r\n");
      out.write("       <option value=\"7\">7.0-8.0</option> \r\n");
      out.write("       <option value=\"8\">8.0-9.0</option> \r\n");
      out.write("       <option value=\"9\">9.0-10.0</option> \r\n");
      out.write("    </select></FONT>\r\n");
      out.write("    <input type=\"submit\" class=\"submit\" value=\"搜索\"> \r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form id=\"x\">\r\n");
      out.write("<input type=\"button\" class=\"button\" value=\"内容\" onclick=\"n();\">\r\n");
      out.write("\t\t  <input type=\"button\" class=\"button\" value=\"导演\" onclick=\"director();\">\r\n");
      out.write("\t\t  <input type=\"button\" class=\"button\" value=\"主演\" onclick=\"role();\">\r\n");
      out.write("\t\t  <input type=\"button\" class=\"button\" value=\"上映时间\" onclick=\"time();\">\r\n");
      out.write("\t      <input type=\"button\" class=\"button\" value=\"类型\" onclick=\"t();\">\r\n");
      out.write("\t      <input type=\"button\" class=\"button\" value=\"评分\" onclick=\"score();\">\r\n");
      out.write("</form>\r\n");
      out.write(" \r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("\t<br><br><br><br><br><br><br><br><br>");
out.print("版权所有：Momovie团队"); 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body> \r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
