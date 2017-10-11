<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Test</title>
<link href="restaurant.css" rel="stylesheet" type="text/css" /> <?xml-stylesheet href="restaurant.css" type="text/css"?>
<script src="js/jquery-1.7.2.min.js"></script>
<script src="js/jquery.movebg.js"></script>

</head>

<body>
<div id="container">
 



  <div class="wraper">
    <div class="nav">
        <ul>
            <li class="nav-item"><a href="quanzhou.xml" >全州屋</a></li>
            <li class="nav-item cur"><a href="aer.xml">阿娜尔罕</a></li>
            <li class="nav-item"><a href="ban.xml" >拌30</a></li>
            <li class="nav-item"><a href="cifu.xml">磁福酒楼</a></li> 
            <li class="nav-item"><a href="mala2.xml">麻辣诱惑</a></li> 
            <li class="nav-item"><a href="heyuan.xml">和园</a></li>
            <li class="nav-item"><a href="daijia.xml">傣家风味</a></li>
        </ul>
        <!--移动的滑动-->
        <div class="move-bg"></div>
        <!--移动的滑动 end-->
    </div>
</div>
<script>
$(function(){
	$(".nav").movebg({width:120/*滑块的大小*/,extra:40/*额外反弹的距离*/,speed:300/*滑块移动的速度*/,rebound_speed:400/*滑块反弹的速度*/});
})
</script>



  <div id="mainContent">
   
	
    <div id="content" align="left">

	<xsl:for-each select="//item">
	

	<img  width="35" height="35" >
    <xsl:attribute name="src"><xsl:value-of select="pic" /></xsl:attribute>
	</img>
	<big><xsl:value-of select="feature/name"/>------价格：<xsl:value-of select="owner/price"/>------类型：<xsl:value-of select="feature/type"/>------评分：<xsl:value-of select="owner/score"/>------</big>
	<a><xsl:attribute name="href"><xsl:value-of select="ID" />.xml</xsl:attribute>详情</a>
	<br/>
	
	
	</xsl:for-each>
  	</div>

  </div>
  
  <div id="footer"><h3>© 2014-2015 LZNF 版权所有</h3><span style="display:none"><script language="javascript" type="text/javascript" src="http://js.users.51.la/1967272.js"></script></span></div>
</div>

</body>
</html>

</xsl:template>

</xsl:stylesheet><!-- Stylus Studio meta-information - (c) 2004-2009. Progress Software Corporation. 保留所有权力.

<metaInformation>
	<scenarios/>
	<MapperMetaTag>
		<MapperInfo srcSchemaPathIsRelative="yes" srcSchemaInterpretAsXML="no" destSchemaPath="" destSchemaRoot="" destSchemaPathIsRelative="yes" destSchemaInterpretAsXML="no"/>
		<MapperBlockPosition></MapperBlockPosition>
		<TemplateContext></TemplateContext>
		<MapperFilter side="source"></MapperFilter>
	</MapperMetaTag>
</metaInformation>
-->