<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Test</title>
<link href="layout.css" rel="stylesheet" type="text/css" /> <?xml-stylesheet href="layout.css" type="text/css"?>
</head>

<body>
<div id="container">
  <div id="header"><h1 style="font-family:verdana" align="center" valign="bottom"><font face="迷你简启体">客官，吃我吧</font></h1></div>
  <div id="mainContent">
   
	<div id="sidebar"> 

	<img  width="300" height="300" >
    <xsl:attribute name="src"><xsl:value-of select="item/pic" /></xsl:attribute>
	</img>

	<h2 align="center"><xsl:value-of select="item/feature/name"/></h2>
	<p align="center">价格：<xsl:value-of select="item/owner/price"/></p>

	<p align="center">分量：<xsl:value-of select="item/owner/size"/>人份</p>
	<p align="center">评分：<xsl:value-of select="item/owner/score"/></p>
	<p align="center">类型：<xsl:value-of select="item/feature/type"/></p>



	</div>
	
    <div id="content">
	<ul>
	<li>地域</li><p><xsl:value-of select="item/feature/domestic"/>——<xsl:value-of select="item/feature/region"/></p>
	<li>口味</li><p><xsl:for-each select="//favor"><xsl:value-of select="."/>;</xsl:for-each></p>
	<li>材料</li><p><xsl:for-each select="//material"><xsl:value-of select="."/>;</xsl:for-each></p>
	<li>提供餐厅</li><p><xsl:value-of select="item/owner/restaurant"/>——<xsl:value-of select="item/owner/location"/></p><p><xsl:value-of select="item/owner/howtoarrive"/></p>
	</ul>
	<hr/>
	<li>试吃评论</li><p><xsl:value-of select="item/owner/critique"/></p>
	<li>推荐配食</li><p><xsl:value-of select="item/owner/match"/></p>
	<li>点了这道菜的人还点了</li><p><xsl:value-of select="item/owner/connection"/></p>
  	</div>

  </div>
  
  <div id="footer"><h3>© 2014-2015 LZLNF 版权所有</h3><span style="display:none"><script language="javascript" type="text/javascript" src="http://js.users.51.la/1967272.js"></script></span></div>
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