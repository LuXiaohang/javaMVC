package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Query_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head> \r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>北大周边美食</title>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("function check(value)\r\n");
      out.write("{\r\n");
      out.write("\tif(value==\"i\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById('a').style.display=\"block\";\r\n");
      out.write("\t\tdocument.getElementById(\"b\").style.display=\"none\";\r\n");
      out.write("\t}\t\r\n");
      out.write("\telse if(value==\"o\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tdocument.getElementById('b').style.display=\"block\";\r\n");
      out.write("\t\tdocument.getElementById(\"a\").style.display=\"none\";\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("  div#container{padding-top:80px; \r\n");
      out.write("  padding-left:96px; \r\n");
      out.write("  padding-right:96px; \r\n");
      out.write("  padding-bottom:40px; \r\n");
      out.write("  border: 1px solid 000000;}\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a:link,a:visited{\r\n");
      out.write(" text-decoration:none;  /*超链接无下划线*/\r\n");
      out.write("}\r\n");
      out.write("a:hover{\r\n");
      out.write(" text-decoration:underline;  /*鼠标放上去有下划线*/\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute; left:0; top:0; width:100%; height:100%\"><img src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\beijing4.jpg\" \r\n");
      out.write("width=100% height=100%></div>\r\n");
      out.write("<div style=\"position:absolute;\">\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\">\r\n");
      out.write("<FORM action=\"");
      out.print(request.getContextPath());
      out.write("/FoodServlet\" METHOD=\"post\">\r\n");
      out.write("<center>\r\n");
      out.write("<B><FONT SIZE = 5 face=\"迷你简启体\">北大周边美食</FONT></B>\r\n");
      out.write("</center>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<FONT face=\"华文仿宋\" size=4>\r\n");
      out.write("<select name=\"domestic\" style=\"background:#FFF7FB\" onChange=\"javascript:check(this.value)\"> \r\n");
      out.write("<option value=\"null\">请选择地区</option>\r\n");
      out.write("<option value=\"i\">国内</option> \r\n");
      out.write("<option value=\"o\">国外</option> \r\n");
      out.write("</select>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div id=\"a\" style=\"display: none\">\r\n");
      out.write("<B>地域</B>\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"苏菜\">苏菜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"闽菜\">闽菜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"川菜\">川菜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"鲁菜\">鲁菜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"粤菜\">粤菜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"湘菜\">湘菜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"浙菜\">浙菜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"徽菜\">徽菜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"西北\">西北\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"其他\">其他\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"b\" style=\"display: none\">\r\n");
      out.write("<B>国家</B>\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"日本\">日本\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"韩国\">韩国\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"欧美\">欧美\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"印度\">印度\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"泰国\">泰国\r\n");
      out.write("<INPUT TYPE=radio NAME=\"region\" value=\"其他\">其他\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("<B>类型</B>\r\n");
      out.write("<INPUT TYPE=radio NAME=\"type\" value=\"主食\">主食\r\n");
      out.write("<INPUT TYPE=radio NAME=\"type\" value=\"甜点\">甜点\r\n");
      out.write("<INPUT TYPE=radio NAME=\"type\" value=\"菜品\">菜品\r\n");
      out.write("<INPUT TYPE=radio NAME=\"type\" value=\"汤\">汤\r\n");
      out.write("<INPUT TYPE=radio NAME=\"type\" value=\"小吃\">小吃\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<B>口味</B>\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"脆\">脆\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"滑\">滑\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"焦\">焦\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"麻辣\">麻辣\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"绵\">绵\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"嫩\">嫩\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"特辣\">特辣\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"甜\">甜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"微辣\">微辣\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"酸\">酸  \r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"鲜\">鲜\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"咸\">咸&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"香\">香\r\n");
      out.write("<INPUT TYPE=radio NAME=\"favor\" value=\"鱼香\">鱼香\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<B>份量</B>\r\n");
      out.write("<INPUT TYPE=radio NAME=\"size\" value=\"1\">一人份\r\n");
      out.write("<INPUT TYPE=radio NAME=\"size\" value=\"2\">二人份\r\n");
      out.write("<INPUT TYPE=radio NAME=\"size\" value=\"3\">三人份\r\n");
      out.write("<INPUT TYPE=radio NAME=\"size\" value=\"4\">四人份\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<B>价钱</B>\r\n");
      out.write("<INPUT TYPE=radio NAME=\"price\" value=\"50\">50元以下\r\n");
      out.write("<INPUT TYPE=radio NAME=\"price\" value=\"100\">100元以下\r\n");
      out.write("<INPUT TYPE=radio NAME=\"price\" value=\"150\">150元以下\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<INPUT TYPE=submit style=\"background:#FFF7FB\" VALUE=\"来吧吃货\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</FONT>\r\n");
      out.write("<marquee direction=left height=80 onmouseout=this.start() onmouseover=this.stop() scrollamount=1 scrolldelay=40 width=500>\r\n");
      out.write("<font color=blue size=4 face=\"迷你简启体\">\r\n");
      out.write("<a href=\"http://localhost:8080/Delicious/Suggestion.jsp\" target=\"_blank\">有什么意见请点我~~~</a><br>\r\n");
      out.write("<a href=\"http://ele.me/place/4abd78800c02\" target=\"_blank\">想要外卖请点我~~</a><br>\r\n");
      out.write("制作人：吃遍天下\r\n");
      out.write("</font>\r\n");
      out.write(" </marquee>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
