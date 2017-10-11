package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style type=\"text/css\">\r\n");
      out.write("  div#container{padding-top:40px; \r\n");
      out.write("  padding-left:700px;\r\n");
      out.write("  padding-right:96px; \r\n");
      out.write("  padding-bottom:40px; \r\n");
      out.write("  border: 1px solid 000000;}\r\n");
      out.write("  div#content{padding-top:100px;\r\n");
      out.write("  padding-left:96px;\r\n");
      out.write("  padding-right:96px; \r\n");
      out.write("  padding-bottom:40px; \r\n");
      out.write("  border: 1px solid 000000;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("a:link,a:visited{\r\n");
      out.write(" text-decoration:none;  \r\n");
      out.write("}\r\n");
      out.write("a:hover{\r\n");
      out.write(" text-decoration:underline; \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<bgsound src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\shangfeng.mp3\";loop=30>\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("<div style=\"position:absolute; left:0px; top:0px; width:100%; height:100%\"><img src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\beijing4.jpg\" \r\n");
      out.write("width=100% height=100%></div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute;\">\r\n");
      out.write("<div id=content>\r\n");
      out.write("\r\n");
      out.write("<B><FONT SIZE = 7 face=\"迷你简启体\">北    大    周    边    美    食</FONT></B>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("<FONT SIZE = 6 face=\"迷你简启体\" color=#6F00D2><a href=\"");
      out.print(request.getContextPath());
      out.write("\\images\\buchong\\aer.xml\" target=\"_blank\">按餐馆随便找找菜？</a></FONT>\r\n");
      out.write("<br><br>\r\n");
      out.write("<FONT SIZE = 6 face=\"迷你简启体\" color=#6F00D2><a href=\"http://localhost:8080/Delicious/Query.jsp\" target=\"_blank\">想吃什么菜找我啊！</a></FONT>\r\n");
      out.write("<br><br>\r\n");
      out.write("<FONT SIZE = 6 face=\"迷你简启体\" color=#6F00D2><a href=\"http://ele.me/place/4abd78800c02\" target=\"_blank\">懒？饿了吗等着你~</a></FONT>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute; left:60px; top:450px; width:15%; height:20%\"><img src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\h2.jpeg\" \r\n");
      out.write("width=100% height=100%></div>\r\n");
      out.write("<div style=\"position:absolute; left:130px; top:400px; width:15%; height:20%\"><img src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\32.jpg\" \r\n");
      out.write("width=100% height=100%></div>\r\n");
      out.write("<div style=\"position:absolute; left:164px; top:450px; width:15%; height:20%\"><img src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\33.jpg\" \r\n");
      out.write("width=100% height=100%></div>\r\n");
      out.write("<div style=\"position:absolute; left:96px; top:500px; width:15%; height:20%\"><img src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\34.jpg\" \r\n");
      out.write("width=100% height=100%></div>\r\n");
      out.write("<div style=\"position:absolute; left:224px; top:480px; width:15%; height:20%\"><img src=\"");
      out.print(request.getContextPath());
      out.write("\\images\\41.jpg\" \r\n");
      out.write("width=100% height=100%></div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=container>\r\n");
      out.write("<marquee direction=up height=200 onmouseout=this.start() onmouseover=this.stop() scrollamount=2 scrolldelay=40 width=500>\r\n");
      out.write("<center>\r\n");
      out.write("<B><FONT SIZE = 5 face=\"迷你简启体\" color=red>饿货，来盘菜吧！！</FONT></B>\r\n");
      out.write("</center>\r\n");
      out.write("<br><br>\r\n");
      out.write("<FONT SIZE = 5 face=\"迷你简启体\" color=red>\r\n");
      out.write("冬天，是一个该存脂冬眠的季节<br><br>\r\n");
      out.write("怎么可以被燕南的地方美食毁了心情<br><br>\r\n");
      out.write("不要再为吃什么发愁啦，点我嘛<br><br>\r\n");
      out.write("所有菜都亲自试吃过，保证无毒无公害哦~~~<br><br>\r\n");
      out.write("</FONT>\r\n");
      out.write("</marquee>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
