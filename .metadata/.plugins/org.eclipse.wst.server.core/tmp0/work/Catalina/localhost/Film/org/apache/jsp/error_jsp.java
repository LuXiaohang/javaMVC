package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class error_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <title>");
 out.print("Momovie"); 
      out.write("</title>  \r\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("function check(value)\r\n");
      out.write("{\r\n");
      out.write("\tif(value==\"内容\")\r\n");
      out.write("\t{\r\n");
      out.write("\t  document.getElementById('name').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("\t}\t\r\n");
      out.write("\telse if(value==\"导演\")\r\n");
      out.write("\t{\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(value==\"主演\")\r\n");
      out.write("\t{\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(value==\"类型\")\r\n");
      out.write("\t{\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(value==\"评分\")\r\n");
      out.write("\t{\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"block\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"none\";\r\n");
      out.write("\t}\r\n");
      out.write("\telse if(value==\"上映时间\")\r\n");
      out.write("\t{\r\n");
      out.write("\t  document.getElementById('name').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('director').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('role').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('type').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('score').style.display=\"none\";\r\n");
      out.write("\t  document.getElementById('time').style.display=\"block\";\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write("    .search{ \r\n");
      out.write("        margin-left:96px;\r\n");
      out.write("        width: 800px; \r\n");
      out.write("        height:50px;\r\n");
      out.write("    } \r\n");
      out.write("\r\n");
      out.write("    .search_key{ \r\n");
      out.write("    \tmargin-left:96px;\r\n");
      out.write("        font-style:\"微软雅黑\";\r\n");
      out.write("        font-size:12px;\r\n");
      out.write("        width: 400px; \r\n");
      out.write("        height: 28px; \r\n");
      out.write("        border: 2px solid CornflowerBlue;\r\n");
      out.write("    } \r\n");
      out.write("\r\n");
      out.write("    .submit{ \r\n");
      out.write("        font-style:\"微软雅黑\";\r\n");
      out.write("        font-size:12px;\r\n");
      out.write("        color:Azure;\r\n");
      out.write("        background:CornflowerBlue ; \r\n");
      out.write("        width:60px; \r\n");
      out.write("        height: 28px;  \r\n");
      out.write("    } \r\n");
      out.write("     .button\r\n");
      out.write("    {\r\n");
      out.write("    \twidth:60px;\r\n");
      out.write("    \theight:30px;\r\n");
      out.write("    \tfont-style:\"微软雅黑\";\r\n");
      out.write("        font-size:14px;\r\n");
      out.write("        color:Azure;\r\n");
      out.write("        background:White ;\r\n");
      out.write("        border:0;\r\n");
      out.write("        text-decoration:underline;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".tit {\r\n");
      out.write("\tfont-family: \"华文行楷\", \"微软雅黑\", \"微软雅黑\";\r\n");
      out.write("\tfont-size: xx-large;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button  {\r\n");
      out.write("\tcolor: #80bed6;  \r\n");
      out.write("\tbackground: -webkit-gradient(linear, left top, left bottom, from(#0078a5), to(#00adee));  \r\n");
      out.write("    background: -moz-linear-gradient(top,  #0078a5,  #00adee);  \r\n");
      out.write("    filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#0078a5', endColorstr='#00adee');  \r\n");
      out.write("\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .button1{\r\n");
      out.write("width:96px;\r\n");
      out.write("    \theight:30px;\r\n");
      out.write("    \tfont-style:\"微软雅黑\";\r\n");
      out.write("        font-size:12px;\r\n");
      out.write("        color:Azure;\r\n");
      out.write("        background:White ;\r\n");
      out.write("        border:0;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" .name{\r\n");
      out.write("    font-family: \"华文仿宋\";\r\n");
      out.write("\tfont-size: large;\r\n");
      out.write("\tfont-weight: 800;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<FORM action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\" METHOD=\"post\">\r\n");
      out.write("\t\t  <input type=\"button\" class=\"button1\">\r\n");
      out.write("          <input type=\"button\" style=\" color:black\" class=\"button\" value=\"内容\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t\t  <input type=\"button\" style=\" color:black\" class=\"button\" value=\"导演\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t\t  <input type=\"button\" style=\" color:black\" class=\"button\" value=\"主演\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t\t  <input type=\"button\" style=\" color:black\" class=\"button\" value=\"上映时间\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t      <input type=\"button\" style=\" color:black\" class=\"button\" value=\"类型\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t      <input type=\"button\" style=\" color:black\" class=\"button\" value=\"评分\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t      \r\n");
      out.write("<div id=\"name\" style=\"display: block;\">\r\n");
      out.write("  <input type=\"text\" name=\"name\" class=\"search_key\" value=\"内容搜索\" > \r\n");
      out.write("  <input type=\"submit\" class=\"submit\" value=\"搜索\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"director\" style=\"display: none;\">\r\n");
      out.write("<input type=\"text\" name=\"director\" class=\"search_key\" value=\"导演搜索\" > \r\n");
      out.write("<input type=\"submit\" class=\"submit\" value=\"搜索\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"role\" style=\"display: none;\">\r\n");
      out.write(" <input type=\"text\" name=\"role\" class=\"search_key\" value=\"主演搜索\" > \r\n");
      out.write(" <input type=\"submit\" class=\"submit\" value=\"搜索\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"type\" style=\"display: none;\">\r\n");
      out.write("<FONT face=\"华文仿宋\" size=4>\r\n");
      out.write("    <select name=\"type\" class=\"search_key\"\"> \r\n");
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
      out.write("    <input type=\"submit\" class=\"submit\" value=\"搜索\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"score\" style=\"display: none;\">\r\n");
      out.write("<FONT face=\"华文仿宋\" size=4>\r\n");
      out.write("    <select name=\"score\" class=\"search_key\"\"> \r\n");
      out.write("       <option value=\"null\">请选择评分</option>\r\n");
      out.write("       <option value=\"5\">5.0-6.0</option> \r\n");
      out.write("       <option value=\"6\">6.0-7.0</option> \r\n");
      out.write("       <option value=\"7\">7.0-8.0</option> \r\n");
      out.write("       <option value=\"8\">8.0-9.0</option> \r\n");
      out.write("       <option value=\"9\">9.0-10.0</option> \r\n");
      out.write("    </select></FONT>\r\n");
      out.write("    <input type=\"submit\" class=\"submit\" value=\"搜索\">\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"time\" style=\"display:none;\">\r\n");
      out.write("<FONT face=\"华文仿宋\" size=4>\r\n");
      out.write("    <select name=\"time\" class=\"search_key\"\"> \r\n");
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
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("          \r\n");
      out.write("</FORM>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<HR><P></P>\r\n");
      out.write("<center>\r\n");
      out.write("<B><FONT SIZE = 5 >很遗憾没有结果，搜一搜其他的吧~</FONT></B>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>  ");
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
