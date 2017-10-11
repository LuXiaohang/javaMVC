<%@ page  contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
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
        margin-top:300px;
        margin-left:410px;
        width: 800px; 
        height:50px;
    } 

    .search_key{ 
        font-style:"微软雅黑";
        font-size:20px;
        width: 500px; 
        height: 35px; 
        border: 2px solid CornflowerBlue;
    } 

    .submit{ 
        font-style:"微软雅黑";
        font-size:20px;
        color:Azure;
        background:CornflowerBlue ; 
        width:100px; 
        height: 35px;  
    } 
     .button
    {
    	width:100px;
    	height:50px;
    	font-style:"微软雅黑";
        font-size:20px;
        background:White ;
        border:0;
        text-decoration:underline;
    }
  div#container{
  margin:auto; 
  padding-top:160px;}
</style>

</head>
<body>
<div id="container">
<div style="text-align:center;margin:auto;">
<img src="<%=request.getContextPath()%>\images\1.jpg" width=280px height=93px>
</div>
<div align="center">
<FORM action="<%=request.getContextPath()%>/FilmServlet" METHOD="post">
          <input type="button" class="button" value="内容" onclick="javascript:check(this.value);">
		  <input type="button" class="button" value="导演" onclick="javascript:check(this.value);">
		  <input type="button" class="button" value="主演" onclick="javascript:check(this.value);">
		  <input type="button" class="button" value="上映时间" onclick="javascript:check(this.value);">
	      <input type="button" class="button" value="类型" onclick="javascript:check(this.value);">
	      <input type="button" class="button" value="评分" onclick="javascript:check(this.value);">
	      
<div id="name" style="display: block;text-align:center;margin:auto;">
  <input type="text" name="name" class="search_key" value="内容搜索" > 
  <input type="submit" class="submit" value="搜索">
</div>
<div id="director" style="display: none;text-align:center;margin:auto;">
<input type="text" name="director" class="search_key" value="导演搜索" > 
<input type="submit" class="submit" value="搜索">
</div>
<div id="role" style="display: none;text-align:center;margin:auto;">
 <input type="text" name="role" class="search_key" value="主演搜索" > 
 <input type="submit" class="submit" value="搜索">
</div>
<div id="type" style="display: none;text-align:center;margin:auto;">
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
<div id="score" style="display: none;text-align:center;margin:auto;">
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
<div id="time" style="display:none;text-align:center;margin:auto;">
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
<div align="center">
	<br><br><br><br><br><br><br><br><br><br><br><br><%out.print("@Copyright-Momovie团队"); %>
</div>
</div>
</body> 

</html>