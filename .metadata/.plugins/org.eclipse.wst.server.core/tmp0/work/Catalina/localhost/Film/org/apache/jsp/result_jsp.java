package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        font-size:12px;\r\n");
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
      out.write("<div style=\"\">\r\n");
      out.write("\r\n");
      out.write("<FORM action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\" METHOD=\"post\">\r\n");
      out.write("\t\t  <input type=\"button\" class=\"button1\">\r\n");
      out.write("          <input type=\"button\" class=\"button\"  style=\"color:black\" value=\"内容\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t\t  <input type=\"button\" class=\"button\"  style=\"color:black\" value=\"导演\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t\t  <input type=\"button\" class=\"button\"  style=\"color:black\" value=\"主演\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t\t  <input type=\"button\" class=\"button\"  style=\"color:black\" value=\"上映时间\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t      <input type=\"button\" class=\"button\"  style=\"color:black\" value=\"类型\" onclick=\"javascript:check(this.value);\">\r\n");
      out.write("\t      <input type=\"button\" class=\"button\"  style=\"color:black\" value=\"评分\" onclick=\"javascript:check(this.value);\">\r\n");
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
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<HR><P></P><CENTER>\r\n");
      beans.FilmBean filmBean = null;
      synchronized (session) {
        filmBean = (beans.FilmBean) _jspx_page_context.getAttribute("filmBean", PageContext.SESSION_SCOPE);
        if (filmBean == null){
          throw new java.lang.InstantiationException("bean filmBean not found within scope");
        }
      }
      out.write('\r');
      out.write('\n');
      beans.Replace replace = null;
      synchronized (_jspx_page_context) {
        replace = (beans.Replace) _jspx_page_context.getAttribute("replace", PageContext.PAGE_SCOPE);
        if (replace == null){
          replace = new beans.Replace();
          _jspx_page_context.setAttribute("replace", replace, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<H3>“<I>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((beans.FilmBean)_jspx_page_context.findAttribute("filmBean")).getSearchCondition())));
      out.write("\r\n");
      out.write("      ”的查询结果     </I>\r\n");
      out.write("目前在第<FONT SIZE = 4 COLOR = blue>\r\n");
      out.write("\t\t");
      out.print( filmBean.getShowPage() );
      out.write("</FONT>页, 共有\r\n");
      out.write("\t\t<FONT SIZE = 4 COLOR = blue>\r\n");
      out.write("\t\t");
      out.print( filmBean.getPageCount() );
      out.write("</FONT>页</H3>\r\n");
      out.write("\t<P></P></CENTER>\r\n");
      out.write("\t\r\n");
for(int i=0; i< filmBean.getSize();i++){ 	
      out.write(" <!--将记录显示到页面上-->\t\r\n");
      out.write("\t<table>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t    <td rowspan=\"4\" width=\"96px\">\r\n");
      out.write("\t\t    </td>\t\t    \r\n");
      out.write("\t\t\t<td colspan=\"4\">\r\n");
      out.write("\t\t\t<p class=\"name\"><A Href=");
      out.print(filmBean.get(i).getHref());
      out.write(" target=\"_blank\">");
      out.print( replace.replace(filmBean.get(i).getTransname(),filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>"));
      out.write('(');
      out.print( replace.replace(filmBean.get(i).getName(),filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>"));
      out.write(")下载-电影天堂</A>\t</p>\r\n");
      out.write("\t\t\t</td>\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t   <td rowspan=\"3\"width=\"150\">\r\n");
      out.write("\t\t   <img src=\"");
      out.print(filmBean.get(i).getPicture());
      out.write("\" width=150px height=250px>\t   \r\n");
      out.write("\t\t   </td>\r\n");
      out.write("\t\t   <td rowspan=\"3\" width=\"30px\">\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t\t<td width=\"200\">\r\n");
      out.write("\t\t\t\t<script src=\"http://pstatic.xunlei.com/js/webThunderDetect.js\"></script>\r\n");
      out.write("                <script src=\"http://pstatic.xunlei.com/js/base64.js\"></script>\r\n");
      out.write("                <script language=\"javascript\">\r\n");
      out.write("    \t\t\t\t\tvar thunder_url = \"ftp://8:8@d3.dl1234.com:8006/[电影天堂www.dy2018.com]幻世追踪HD中英双字.rmvb\";\r\n");
      out.write("    \t\t\t\t\tvar thunder_pid = \"57029\";\r\n");
      out.write("    \t\t\t\t\tvar restitle = \"\";\r\n");
      out.write("    \t\t\t\t\tdocument.write('<table border=\"0\" rules=\"none\" bgcolor=\"#F0FFF0\"><tr><td><a href=\"#\" thunderHref=\"' + ThunderEncode(thunder_url) \r\n");
      out.write("    \t   \t\t + '\" thunderPid=\"' \r\n");
      out.write("    \t   \t\t + thunder_pid \r\n");
      out.write("    \t   \t\t + '\" thunderResTitle=\"' \r\n");
      out.write("    \t   \t\t + restitle \r\n");
      out.write("    \t    \t + '\" onClick=\"return OnDownloadClick_Simple(this,2,4)\" oncontextmenu=\"ThunderNetwork_SetHref(this)\">Download</a></td></tr></table>');\r\n");
      out.write("               </script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t      　</td>\r\n");
      out.write("\t\t    <td width=20%>\r\n");
      out.write("\t\t       ");
String s1 = filmBean.get(i).getMinute();  
		       if (s1.length()>20)    
		          {    
		             s1 = s1.substring(0,20)+"...";    
		         } 
		        
      out.write("\r\n");
      out.write("\t\t        <p> 上映时间：");
      out.print(filmBean.get(i).getTime() );
      out.write("</p>\r\n");
      out.write("\t\t    \t<p> 时长：");
      out.print( s1);
      out.write(" </p>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t    <td width=\"150\">\r\n");
      out.write("\t\t    ");
String s2 = filmBean.get(i).getLanguage();    
		       if (s2.length()>15)    
		          {    
		             s2 = s2.substring(0,15)+"...";    
		         } 
		      
      out.write("\r\n");
      out.write("\t\t    \t<p> 语言：");
      out.print( s2);
      out.write(" </p>\r\n");
      out.write("\t\t    \t<p> 评分：");
      out.print(filmBean.get(i).getScore() );
      out.write("</p>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t    <td width=\"96\" rowspan=\"3\">\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t");
String st = filmBean.get(i).getType();    
		       if (st.length()>20)    
		          {    
		             st = st.substring(0,20)+"...";    
		         } 
		      
      out.write("\r\n");
      out.write("\t\t\t<p>类型：");
      out.print( replace.replace(st,filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>") );
      out.write("</p>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t");
String sr = filmBean.get(i).getRole();  
		       if (sr.length()>60)    
		          {    
		             sr = sr.substring(0,60)+"...";    
		         } 
		      
      out.write("\r\n");
      out.write("\t\t\t<p>主演：");
      out.print( replace.replace(sr,filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>") );
      out.write("</p>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td >\r\n");
      out.write("\t\t\t");
String sd = filmBean.get(i).getDirector();    
		       if (sd.length()>80)    
		          {    
		             sd = sd.substring(0,80)+"...";    
		         } 
		      
      out.write("\r\n");
      out.write("\t\t\t<p>导演：");
      out.print( replace.replace(sd,filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>") );
      out.write("</p>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t    ");
String s = filmBean.get(i).getIntroduction();    
		       if (s.length()>150)    
		          {    
		             s = s.substring(0,150)+"...";    
		         } 
		      
      out.write("\r\n");
      out.write("\t\t\t<td rowspan=\"3\" colspan=\"3\"><p>剧情介绍：");
      out.print( replace.replace(s,filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>"));
      out.write("</p></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
}//for循环结束 	
      out.write("\r\n");
      out.write("\t</table>\t\t\t\r\n");
      out.write("\t<p></p><p align=\"center\">　</p><!--显示翻页导航 -->\t\r\n");
      out.write("\t<form method=\"POST\" action=\"");
      out.print(request.getContextPath());
      out.write("/FilmServlet\">\r\n");
      out.write("\t\t<p align=\"center\">\t\r\n");
      out.write("\t\t");
if(filmBean.getShowPage()!= 1){
      out.write("\r\n");
      out.write("\t\t<A Href=");
      out.print(request.getContextPath());
      out.write("/FilmServlet?ToPage=");
      out.print( 1 );
      out.write(">首页</A>&nbsp;&nbsp; \r\n");
      out.write("\t\t<A Href=");
      out.print(request.getContextPath());
      out.write("/FilmServlet?ToPage=");
      out.print( filmBean.getShowPage() - 1 );
      out.write(">\r\n");
      out.write("\t\t上一页</A>&nbsp;&nbsp;\t\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t转到：\r\n");
      out.write("\t\t<INPUT type=\"text\" name=ToPage value=");
      out.print( filmBean.getShowPage());
      out.write(" > \r\n");
      out.write("\t\t页&nbsp;\t\r\n");
      out.write("\t\t");
if(filmBean.getShowPage()!= filmBean.getPageCount()){ 
      out.write("\t\r\n");
      out.write("\t\t<A Href=");
      out.print(request.getContextPath());
      out.write("/FilmServlet?ToPage=");
      out.print( filmBean.getShowPage() + 1);
      out.write(">\r\n");
      out.write("\t\t下一页</A>&nbsp; ");
      out.write("\r\n");
      out.write("\t\t<A Href=");
      out.print(request.getContextPath());
      out.write("/FilmServlet?ToPage=");
      out.print( filmBean.getPageCount() );
      out.write(">\r\n");
      out.write("\t\t尾页</A></p>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</form>\r\n");
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
