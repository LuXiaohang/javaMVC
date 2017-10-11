<%@ page  contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>北大周边美食</title>

<script language="javascript" type="text/javascript">
function check(value)
{
	if(value=="i")
	{
		document.getElementById('a').style.display="block";
		document.getElementById("b").style.display="none";
	}
	else if(value=="o")
	{
		document.getElementById('b').style.display="block";
		document.getElementById("a").style.display="none";
	}
}
</script>


<style type="text/css">
  #form1 {}
  div#container{padding-top:30px; 
  padding-left:96px; 
  padding-right:96px; 
  padding-bottom:40px; 
  border: 1px solid 000000;}
</style>
<style type="text/css">
a:link,a:visited{
 text-decoration:none;  /*超链接无下划线*/
}
a:hover{
 text-decoration:underline;  /*鼠标放上去有下划线*/
}
</style>

</head>
<body>

<br>
<div style="position:absolute; left:0; top:0; width:100%; height:150%"><img src="<%=request.getContextPath()%>\images\beijing4.jpg" 
width=100% height=100%></div>
<div style="position:absolute;">

<div id="container">
<FORM action="<%=request.getContextPath()%>/FoodServlet" METHOD="post" id="form1">
<center>
<B><FONT SIZE = 5 face="迷你简启体">北大周边美食</FONT></B>
</center>
<br>
<br>
<FONT face="华文仿宋" size=4>
<select name="domestic" style="background:#FFF7FB" onChange="javascript:check(this.value)"> 
<option value="null">请选择地区</option>
<option value="i">国内</option> 
<option value="o">国外</option> 
</select>
<br>
<br>

<div id="a" style="display: none">
<B>地域</B>
<INPUT TYPE=radio NAME="region" value="苏菜">苏菜
<INPUT TYPE=radio NAME="region" value="闽菜">闽菜
<INPUT TYPE=radio NAME="region" value="川菜">川菜
<INPUT TYPE=radio NAME="region" value="鲁菜">鲁菜
<INPUT TYPE=radio NAME="region" value="粤菜">粤菜
<INPUT TYPE=radio NAME="region" value="湘菜">湘菜
<INPUT TYPE=radio NAME="region" value="浙菜">浙菜
<INPUT TYPE=radio NAME="region" value="徽菜">徽菜
<INPUT TYPE=radio NAME="region" value="西北">西北
<INPUT TYPE=radio NAME="region" value="其他">其他
<br>
<%-- 
<br>
<B>餐馆</B>
<INPUT TYPE=radio NAME="restaurant" value="麻辣诱惑">麻辣诱惑
<INPUT TYPE=radio NAME="restaurant" value="傣家风味">傣家风味
<INPUT TYPE=radio NAME="restaurant" value="阿娜尓罕">阿娜尓罕
<INPUT TYPE=radio NAME="restaurant" value="和园港式茶餐厅">和园港式茶餐厅
<INPUT TYPE=radio NAME="restaurant" value="磁福酒楼">磁福酒楼
<br>
--%>
</div>
<div id="b" style="display: none">
<B>国家</B>
<INPUT TYPE=radio NAME="region" value="日本">日本
<INPUT TYPE=radio NAME="region" value="韩国">韩国
<INPUT TYPE=radio NAME="region" value="欧美">欧美
<INPUT TYPE=radio NAME="region" value="印度">印度
<INPUT TYPE=radio NAME="region" value="泰国">泰国
<INPUT TYPE=radio NAME="region" value="其他">其他
<br>
<%-- 
<br>
<B>餐馆</B>
<INPUT TYPE=radio NAME="restaurant" value="明洞排骨">明洞排骨
<INPUT TYPE=radio NAME="restaurant" value="拌30">拌30
<INPUT TYPE=radio NAME="restaurant" value="全州屋">全州屋
<INPUT TYPE=radio NAME="restaurant" value="熊家成">熊家成
<INPUT TYPE=radio NAME="restaurant" value="舍廊房">舍廊房
<INPUT TYPE=radio NAME="restaurant" value="坦坦大炉">坦坦大炉


<br>
--%>
</div>
<br>
<B>口味</B>
<INPUT TYPE=radio NAME="favor" value="脆">脆
<INPUT TYPE=radio NAME="favor" value="滑">滑
<INPUT TYPE=radio NAME="favor" value="焦">焦
<INPUT TYPE=radio NAME="favor" value="麻辣">麻辣
<br>
<br>
<INPUT TYPE=radio NAME="favor" value="绵">绵
<INPUT TYPE=radio NAME="favor" value="嫩">嫩
<INPUT TYPE=radio NAME="favor" value="特辣">特辣
<INPUT TYPE=radio NAME="favor" value="甜">甜
<INPUT TYPE=radio NAME="favor" value="微辣">微辣
<br>
<br>
<INPUT TYPE=radio NAME="favor" value="酸">酸  
<INPUT TYPE=radio NAME="favor" value="鲜">鲜
<INPUT TYPE=radio NAME="favor" value="咸">咸&nbsp;&nbsp;&nbsp;&nbsp;
<INPUT TYPE=radio NAME="favor" value="香">香
<INPUT TYPE=radio NAME="favor" value="鱼香">鱼香
<br>
<br>
<B>份量</B>
<INPUT TYPE=radio NAME="size" value="1">一人份
<INPUT TYPE=radio NAME="size" value="2">二人份
<INPUT TYPE=radio NAME="size" value="3">三人份
<INPUT TYPE=radio NAME="size" value="4">四人份
<br>
<br>
<B>价钱</B>
<INPUT TYPE=radio NAME="price" value="50">50元以下
<INPUT TYPE=radio NAME="price" value="100">100元以下
<INPUT TYPE=radio NAME="price" value="150">150元以下
<br>
<br>
<INPUT TYPE=submit style="background:#FFF7FB" VALUE="来吧吃货">

</form>
</FONT>
<marquee direction=left height=80 onmouseout=this.start() onmouseover=this.stop() scrollamount=1 scrolldelay=40 width=500>
<font color=blue size=4 face="迷你简启体">
<a href="http://localhost:8080/Delicious/Suggestion.jsp">有什么意见请点我~~~</a><br>
<a href="http://ele.me/place/4abd78800c02">想要外卖请点我~~</a><br>
制作人：吃遍天下
</font>
 </marquee>

<jsp:useBean id="foodBean" type="beans.FoodBean" scope="session"/>
<H3><CENTER><FONT SIZE = 5 COLOR = red face="迷你简启体">上菜啦！！！</FONT></CENTER>
<br>
<br>
目前在第<FONT SIZE = 4>
		<%= foodBean.getShowPage() %></FONT>&nbsp;&nbsp;页, 共有
		<FONT SIZE = 4>
		<%= foodBean.getPageCount() %></FONT>&nbsp;&nbsp;页</H3>
<%for(int i=0;i<foodBean.getNumber();i++){ %>
<table>
	<tr>
		<td><img src="<%=request.getContextPath()%>\images\<%=foodBean.get(i).getPic() %>" width="120" height="100" /></td>
		<td>
			<table>
				<tr>
					<th width="220"></th>
					<th></th>
				</tr>
				<tr>
				    <td width="200"><a href="<%=request.getContextPath()%>\images\<%=foodBean.get(i).getHref()%>" target="_blank"><font face="迷你简启体" size="4" color=red>名称：<%=foodBean.get(i).getName()%></font></a></td>
					<td width="300"><font face="迷你简启体" size="4" color=red>餐馆：<%=foodBean.get(i).getRestaurant()%></font></td>
					<td width="300"><font face="迷你简启体" size="4" color=red>评分：<%=foodBean.get(i).getScore()%></font></td>
				</tr>
			</table>
		<%--</td>
	</tr>--%>
</table>
<br>
<%} %>
<!--显示翻页导航 -->	
	<form method="POST" action="<%=request.getContextPath()%>/FoodServlet">
		<p align="center">	
		<%if(foodBean.getShowPage()!= 1){%><%--50行--%>
		<A Href=<%=request.getContextPath()%>/FoodServlet?ToPage=<%= 1 %>>首页</A>&nbsp;&nbsp; 
		<A Href=<%=request.getContextPath()%>/FoodServlet?ToPage=<%= foodBean.getShowPage() - 1 %>>
		上一页</A>&nbsp;&nbsp;	
		<%}%>
		转到：<%--55行--%>
		<INPUT type="text" name="ToPage" size="5" value=<%= foodBean.getShowPage()%> > 
		页&nbsp;	
		<%if(foodBean.getShowPage()!= foodBean.getPageCount()){ %>	
		<A Href=<%=request.getContextPath()%>/FoodServlet?ToPage=<%= foodBean.getShowPage() + 1%>>
		下一页</A>&nbsp; <%--60行--%>
		<A Href=<%=request.getContextPath()%>/FoodServlet?ToPage=<%= foodBean.getPageCount() %>>
		尾页</A></p>
		<%} %>
	</form>
	</div>
	</div>

</body>
</html>