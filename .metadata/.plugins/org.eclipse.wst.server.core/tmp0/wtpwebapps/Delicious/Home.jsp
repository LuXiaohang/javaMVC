<%@ page  contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>北大周边美食</title>
<style type="text/css">
  div#container{padding-top:40px; 
  padding-left:700px;
  padding-right:96px; 
  padding-bottom:40px; 
  border: 1px solid 000000;}
  div#content{padding-top:100px;
  padding-left:96px;
  padding-right:96px; 
  padding-bottom:40px; 
  border: 1px solid 000000;
  }
</style>


<style type="text/css">
a:link,a:visited{
 text-decoration:none;  
}
a:hover{
 text-decoration:underline; 
}
</style>
</head>
<body>
<bgsound src="<%=request.getContextPath()%>\images\shangfeng.mp3";loop=30>
<div id="main">
<div style="position:absolute; left:0px; top:0px; width:100%; height:100%"><img src="<%=request.getContextPath()%>\images\beijing4.jpg" 
width=100% height=100%></div>
<br>

<div style="position:absolute;">
<div id=content>

<B><FONT SIZE = 7 face="迷你简启体">北    大    周    边    美    食</FONT></B>
<br><br><br><br>
<FONT SIZE = 6 face="迷你简启体" color=#6F00D2><a href="<%=request.getContextPath()%>\images\buchong\aer.xml" target="_blank">按餐馆随便找找菜？</a></FONT>
<br><br>
<FONT SIZE = 6 face="迷你简启体" color=#6F00D2><a href="http://localhost:8080/Delicious/Query.jsp" target="_blank">想吃什么菜找我啊！</a></FONT>
<br><br>
<FONT SIZE = 6 face="迷你简启体" color=#6F00D2><a href="http://ele.me/place/4abd78800c02" target="_blank">懒？饿了吗等着你~</a></FONT>

<div style="position:absolute; left:60px; top:450px; width:15%; height:20%"><img src="<%=request.getContextPath()%>\images\h2.jpeg" 
width=100% height=100%></div>
<div style="position:absolute; left:130px; top:400px; width:15%; height:20%"><img src="<%=request.getContextPath()%>\images\32.jpg" 
width=100% height=100%></div>
<div style="position:absolute; left:164px; top:450px; width:15%; height:20%"><img src="<%=request.getContextPath()%>\images\33.jpg" 
width=100% height=100%></div>
<div style="position:absolute; left:96px; top:500px; width:15%; height:20%"><img src="<%=request.getContextPath()%>\images\34.jpg" 
width=100% height=100%></div>
<div style="position:absolute; left:224px; top:480px; width:15%; height:20%"><img src="<%=request.getContextPath()%>\images\41.jpg" 
width=100% height=100%></div>

</div>

<div id=container>
<marquee direction=up height=200 onmouseout=this.start() onmouseover=this.stop() scrollamount=2 scrolldelay=40 width=500>
<center>
<B><FONT SIZE = 5 face="迷你简启体" color=red>饿货，来盘菜吧！！</FONT></B>
</center>
<br><br>
<FONT SIZE = 5 face="迷你简启体" color=red>
冬天，是一个该存脂冬眠的季节<br><br>
怎么可以被燕南的地方美食毁了心情<br><br>
不要再为吃什么发愁啦，点我嘛<br><br>
所有菜都亲自试吃过，保证无毒无公害哦~~~<br><br>
</FONT>
</marquee>
</div>

</div>


</div>


</body>
</html>