<%@ page 	 contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<html>
<head>
 <title><% out.print("Momovie"); %></title>  
	<script language="javascript" type="text/javascript">
function check(value)
{
	if(value=="内容")
	{
	  document.getElementById('name').style.display="block";
	  document.getElementById('director').style.display="none";
	  document.getElementById('role').style.display="none";
	  document.getElementById('type').style.display="none";
	  document.getElementById('score').style.display="none";
	  document.getElementById('time').style.display="none";
	}	
	else if(value=="导演")
	{
	  document.getElementById('name').style.display="none";
	  document.getElementById('director').style.display="block";
	  document.getElementById('role').style.display="none";
	  document.getElementById('type').style.display="none";
	  document.getElementById('score').style.display="none";
	  document.getElementById('time').style.display="none";
	}
	else if(value=="主演")
	{
	  document.getElementById('name').style.display="none";
	  document.getElementById('director').style.display="none";
	  document.getElementById('role').style.display="block";
	  document.getElementById('type').style.display="none";
	  document.getElementById('score').style.display="none";
	  document.getElementById('time').style.display="none";
	}
	else if(value=="类型")
	{
	  document.getElementById('name').style.display="none";
	  document.getElementById('director').style.display="none";
	  document.getElementById('role').style.display="none";
	  document.getElementById('type').style.display="block";
	  document.getElementById('score').style.display="none";
	  document.getElementById('time').style.display="none";
	}
	else if(value=="评分")
	{
	  document.getElementById('name').style.display="none";
	  document.getElementById('director').style.display="none";
	  document.getElementById('role').style.display="none";
	  document.getElementById('type').style.display="none";
	  document.getElementById('score').style.display="block";
	  document.getElementById('time').style.display="none";
	}
	else if(value=="上映时间")
	{
	  document.getElementById('name').style.display="none";
	  document.getElementById('director').style.display="none";
	  document.getElementById('role').style.display="none";
	  document.getElementById('type').style.display="none";
	  document.getElementById('score').style.display="none";
	  document.getElementById('time').style.display="block";
	}
}
</script>

 <style type="text/css">
    .search{ 
        margin-left:96px;
        width: 800px; 
        height:50px;
    } 

    .search_key{ 
    	margin-left:96px;
        font-style:"微软雅黑";
        font-size:12px;
        width: 400px; 
        height: 28px; 
        border: 2px solid CornflowerBlue;
    } 

    .submit{ 
        font-style:"微软雅黑";
        font-size:12px;
        color:Azure;
        background:CornflowerBlue ; 
        width:60px; 
        height: 28px;  
    } 
     .button
    {
    	width:60px;
    	height:30px;
    	font-style:"微软雅黑";
        font-size:12px;
        color:Azure;
        background:White ;
        border:0;
        text-decoration:underline;
    }
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style type="text/css">
.tit {
	font-family: "华文行楷", "微软雅黑", "微软雅黑";
	font-size: xx-large;
}

.button  {
	color: #80bed6;  
	background: -webkit-gradient(linear, left top, left bottom, from(#0078a5), to(#00adee));  
    background: -moz-linear-gradient(top,  #0078a5,  #00adee);  
    filter:  progid:DXImageTransform.Microsoft.gradient(startColorstr='#0078a5', endColorstr='#00adee');  

 }
 
 .button1{
width:96px;
    	height:30px;
    	font-style:"微软雅黑";
        font-size:12px;
        color:Azure;
        background:White ;
        border:0;
 }
 
 .name{
    font-family: "华文仿宋";
	font-size: large;
	font-weight: 800;
 }
 
</style>


</head>
<body>
<div style="">

<FORM action="<%=request.getContextPath()%>/FilmServlet" METHOD="post">
		  <input type="button" class="button1">
          <input type="button" class="button"  style="color:black" value="内容" onclick="javascript:check(this.value);">
		  <input type="button" class="button"  style="color:black" value="导演" onclick="javascript:check(this.value);">
		  <input type="button" class="button"  style="color:black" value="主演" onclick="javascript:check(this.value);">
		  <input type="button" class="button"  style="color:black" value="上映时间" onclick="javascript:check(this.value);">
	      <input type="button" class="button"  style="color:black" value="类型" onclick="javascript:check(this.value);">
	      <input type="button" class="button"  style="color:black" value="评分" onclick="javascript:check(this.value);">
	      
<div id="name" style="display: block;">
  <input type="text" name="name" class="search_key" value="内容搜索" > 
  <input type="submit" class="submit" value="搜索">
</div>
<div id="director" style="display: none;">
<input type="text" name="director" class="search_key" value="导演搜索" > 
<input type="submit" class="submit" value="搜索">
</div>
<div id="role" style="display: none;">
 <input type="text" name="role" class="search_key" value="主演搜索" > 
 <input type="submit" class="submit" value="搜索">
</div>
<div id="type" style="display: none;">
<FONT face="华文仿宋" size=4>
    <select name="type" class="search_key""> 
       <option value="null">请选择类型</option>
       <option value="科幻">科幻</option> 
       <option value="悬疑">悬疑</option>
       <option value="喜剧">喜剧</option>
       <option value="爱情">爱情</option>
       <option value="惊悚">惊悚</option>
       <option value="动作">动作</option>
       <option value="剧情">剧情</option>
       <option value="犯罪">犯罪</option>
       <option value="冒险">冒险</option>
       <option value="传记">传记</option>
    </select></FONT>
    <input type="submit" class="submit" value="搜索">
</div>
<div id="score" style="display: none;">
<FONT face="华文仿宋" size=4>
    <select name="score" class="search_key""> 
       <option value="null">请选择评分</option>
       <option value="5">5.0-6.0</option> 
       <option value="6">6.0-7.0</option> 
       <option value="7">7.0-8.0</option> 
       <option value="8">8.0-9.0</option> 
       <option value="9">9.0-10.0</option> 
    </select></FONT>
    <input type="submit" class="submit" value="搜索">
</div>
<div id="time" style="display:none;">
<FONT face="华文仿宋" size=4>
    <select name="time" class="search_key""> 
       <option value="null">请选择时间(该时间之后上映的电影)</option>
       <option value="1900">1900</option> 
       <option value="1950">1950</option>
       <option value="1990">1990</option>
       <option value="1995">1995</option>
       <option value="2000">2000</option>
       <option value="2005">2005</option>
       <option value="2010">2010</option>
       <option value="2012">2012</option>
       <option value="2014">2014</option>
       <option value="2015">2015</option>
    </select></FONT>
    <input type="submit" class="submit" value="搜索"> 
</div>
    
          
</FORM>
</div>

<HR><P></P><CENTER>
<jsp:useBean id="filmBean" type="beans.FilmBean" scope="session"/>
<jsp:useBean id="replace" scope="page" class="beans.Replace" />
<H3>“<I><jsp:getProperty name="filmBean" property="searchCondition"/>
      ”的查询结果     </I>
目前在第<FONT SIZE = 4 COLOR = blue>
		<%= filmBean.getShowPage() %></FONT>页, 共有
		<FONT SIZE = 4 COLOR = blue>
		<%= filmBean.getPageCount() %></FONT>页</H3>
	<P></P></CENTER>
	
<%for(int i=0; i< filmBean.getSize();i++){ 	%> <!--将记录显示到页面上-->	
	<table>
	
		<tr>
		    <td rowspan="4" width="96px">
		    </td>		    
			<td colspan="4">
			<p class="name"><A Href=<%=filmBean.get(i).getHref()%> target="_blank"><%= replace.replace(filmBean.get(i).getTransname(),filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>")%>(<%= replace.replace(filmBean.get(i).getName(),filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>")%>)下载-电影天堂</A>	</p>
			</td>			
			
		</tr>
		
		<tr>
		   <td rowspan="3"width="150">
		   <img src="<%=filmBean.get(i).getPicture()%>" width=150px height=250px>	   
		   </td>
		   <td rowspan="3" width="30px">
		    </td>
			<td width="200">
				<script src="http://pstatic.xunlei.com/js/webThunderDetect.js"></script>
                <script src="http://pstatic.xunlei.com/js/base64.js"></script>
                <script language="javascript">
    					var thunder_url = "ftp://8:8@d3.dl1234.com:8006/[电影天堂www.dy2018.com]幻世追踪HD中英双字.rmvb";
    					var thunder_pid = "57029";
    					var restitle = "";
    					document.write('<table border="0" rules="none" bgcolor="#F0FFF0"><tr><td><a href="#" thunderHref="' + ThunderEncode(thunder_url) 
    	   		 + '" thunderPid="' 
    	   		 + thunder_pid 
    	   		 + '" thunderResTitle="' 
    	   		 + restitle 
    	    	 + '" onClick="return OnDownloadClick_Simple(this,2,4)" oncontextmenu="ThunderNetwork_SetHref(this)">Download</a></td></tr></table>');
               </script>
													
		      　</td>
		    <td width=20%>
		       <%String s1 = filmBean.get(i).getMinute();  
		       if (s1.length()>20)    
		          {    
		             s1 = s1.substring(0,20)+"...";    
		         } 
		        %>
		        <p> 上映时间：<%=filmBean.get(i).getTime() %></p>
		    	<p> 时长：<%= s1%> </p>
		    </td>
		    <td width="150">
		    <%String s2 = filmBean.get(i).getLanguage();    
		       if (s2.length()>15)    
		          {    
		             s2 = s2.substring(0,15)+"...";    
		         } 
		      %>
		    	<p> 语言：<%= s2%> </p>
		    	<p> 评分：<%=filmBean.get(i).getScore() %></p>
		    </td>
		    <td width="96" rowspan="3">
		    </td>
		</tr>
		
		<tr>
			<td >
			<%String st = filmBean.get(i).getType();    
		       if (st.length()>20)    
		          {    
		             st = st.substring(0,20)+"...";    
		         } 
		      %>
			<p>类型：<%= replace.replace(st,filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>") %></p>
			</td>
			<td>
			<%String sr = filmBean.get(i).getRole();  
		       if (sr.length()>60)    
		          {    
		             sr = sr.substring(0,60)+"...";    
		         } 
		      %>
			<p>主演：<%= replace.replace(sr,filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>") %></p>
			</td>
			<td >
			<%String sd = filmBean.get(i).getDirector();    
		       if (sd.length()>80)    
		          {    
		             sd = sd.substring(0,80)+"...";    
		         } 
		      %>
			<p>导演：<%= replace.replace(sd,filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>") %></p>
			</td>
		</tr>
		
		<tr>
		    <%String s = filmBean.get(i).getIntroduction();    
		       if (s.length()>150)    
		          {    
		             s = s.substring(0,150)+"...";    
		         } 
		      %>
			<td rowspan="3" colspan="3"><p>剧情介绍：<%= replace.replace(s,filmBean.getSearchCondition(),"<font color=red><strong>" + filmBean.getSearchCondition() + "</strong></font>")%></p></td>
		</tr>
		
	
	<%}//for循环结束 	%>
	</table>			
	<p></p><p align="center">　</p><!--显示翻页导航 -->	
	<form method="POST" action="<%=request.getContextPath()%>/FilmServlet">
		<p align="center">	
		<%if(filmBean.getShowPage()!= 1){%><%--50行--%>
		<A Href=<%=request.getContextPath()%>/FilmServlet?ToPage=<%= 1 %>>首页</A>&nbsp;&nbsp; 
		<A Href=<%=request.getContextPath()%>/FilmServlet?ToPage=<%= filmBean.getShowPage() - 1 %>>
		上一页</A>&nbsp;&nbsp;	
		<%}%>
		转到：
		<INPUT type="text" name=ToPage value=<%= filmBean.getShowPage()%> > 
		页&nbsp;	
		<%if(filmBean.getShowPage()!= filmBean.getPageCount()){ %>	
		<A Href=<%=request.getContextPath()%>/FilmServlet?ToPage=<%= filmBean.getShowPage() + 1%>>
		下一页</A>&nbsp; <%--60行--%>
		<A Href=<%=request.getContextPath()%>/FilmServlet?ToPage=<%= filmBean.getPageCount() %>>
		尾页</A></p>
		<%} %>
	</form>
</body>
</html>  