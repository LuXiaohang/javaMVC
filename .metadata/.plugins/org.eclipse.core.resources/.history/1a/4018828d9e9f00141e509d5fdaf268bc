package robot;//1行
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.regex.*;//5行

import robot.EncodingDetector;
public class ParseHtlm {
	//判断网页是否是文本型
	public boolean isPageText(URL pageURL)  {
		String mimetype;//10行
		try {			
			mimetype = pageURL.openConnection().getContentType();
			if (!mimetype.startsWith("text")) return false;
			return true;
		}catch (NullPointerException e) {  //15行		
			return false;
		}
		catch (IOException e) {			
			return false;
		}//20行
	}	
	//返回网页标题
	public String getTitle(URL pageURL) {
		//按编码类型返回网页，保证能正确提取网页内容
		String page=getEcodedPage(pageURL);//25行
		if(page == null){//页面为null，返回空标题
			return "";
		}
		//构造正则表达式
		String regex ="<title>\\s*(.*?)\\s*</title>";	//30行	
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(page);	
		if(matcher.find()){	
			int gc = matcher.groupCount();
			if (gc>=1)  //35行	
				return  matcher.group(1);		
		    else return "";
		}
		return "";
	}  //40行
	//获取网页中包含的链接  
	public List<URL> getLinks(URL pageURL) {
		List<URL> links=new ArrayList<URL>();
		//按编码类型返回网页，保证能正确提取网页内容
		String page=getEcodedPage(pageURL);
		if(page == null){
			return links;
		}
		String regex ="(<a|<area) \\s*.*?\\s*>";
		Pattern pattern = Pattern.compile(regex);//50行
		Matcher matcher = pattern.matcher(page);
		while(matcher.find()){
			String anchor=matcher.group();
            //从锚标记中获取href属性及其内容 
           	String s="href\\s*=\\s*[\"|\'].*?\\s*[\"|\']"; //55行
			Matcher linkMatcher =Pattern.compile(s).matcher(anchor);
			while(linkMatcher.find()){	
				String link=linkMatcher.group();
				//替换掉href属性，获得网址  
				link=link.replaceAll("(href\\s*=\\s*[\"|\'])|\\s*[\"|\']", "");//60行
				//去掉网址中的#号及其后面的内容
				String ss[]=link.split("#");
				if (ss.length!=0){
					link=ss[0];
					if(!(link.startsWith("/html/gndy")||link.startsWith("http://www.dytt8.net/html/gndy")))   link="";
				}
				else link="";  
				URL urllink=null;
				try { //65行
					//获得绝对网址
					urllink = new URL(pageURL,link);
				}catch (MalformedURLException e) {
					// 忽略未知协议	 //70行					
				}								
				if((urllink!=null)&&(!links.contains(urllink)))
					links.add(urllink);
			} 		
		}	//75行	
		return links;
	} 
	//取出网页中的电影信息
	    public Film getFilmInfo(URL pageURL){
	    	Film film = new Film();
	    	String page=getEcodedPage(pageURL);
			if(page == null){
				return null;
			}
			String regex ="<div\\s*id=\"Zoom\".*\\s*>";
			Pattern pattern = Pattern.compile(regex,Pattern.DOTALL);//50行
			Matcher matcher = pattern.matcher(page);
			if(matcher.find()){
				String s = matcher.group();
				s = s.replaceAll("&middot;",".");
				s = s.replaceAll("&nbsp;","");			
				s = s.replaceAll("&ldquo;","“");
				s = s.replaceAll("&rdquo;","”");
				s = s.replaceAll("&hellip;","...");
				s = s.replaceAll("&mdash;","");
				String cp1="(译.*?名)(.)(.*?)<br />";
				Matcher Matcher1 =Pattern.compile(cp1,Pattern.DOTALL).matcher(s);
				if(Matcher1.find()) film.chineseName = Matcher1.group(3);
				else film.chineseName = "0";
				String cp2="(片.*?名)(.)(.*?)<br />";
				Matcher Matcher2 =Pattern.compile(cp2,Pattern.DOTALL).matcher(s);
				if(Matcher2.find()) film.Name = Matcher2.group(3);
				else film.Name = "0";
				String cp3="(年.*?代)(.)(.*?)<br />";
				Matcher Matcher3 =Pattern.compile(cp3,Pattern.DOTALL).matcher(s);
				if(Matcher3.find()) film.onTime = Matcher3.group(3);
				else film.onTime = "0";
				String cp4="(国.*?家)(.)(.*?)<br />";
				Matcher Matcher4 =Pattern.compile(cp4,Pattern.DOTALL).matcher(s);
				if(Matcher4.find()) film.country = Matcher4.group(3);
				else film.country = "0";
				String cp5="(类.*?别)(.)(.*?)<br />";
				Matcher Matcher5 =Pattern.compile(cp5,Pattern.DOTALL).matcher(s);
				if(Matcher5.find()) film.classify = Matcher5.group(3);
				else film.classify = "0";
				String cp6="(语.*?言)(.)(.*?)<br />";
				Matcher Matcher6 =Pattern.compile(cp6,Pattern.DOTALL).matcher(s);
				if(Matcher6.find()) film.language = Matcher6.group(3);
				else film.language = "0";
				String cp7="(主.*?演).(.*)(.)(简.*?介)";
				Matcher Matcher7 =Pattern.compile(cp7,Pattern.DOTALL).matcher(s);
				if(Matcher7.find()){
				String s7 = Matcher7.group(2);
				s7 = s7.replaceAll("\\.\\..*?<br />|<br />","");
				film.leadingRole = s7;
				}
				else film.leadingRole = "0";
				String cp8="(IMDB评分)(.)(.*?)<br />";
				Matcher Matcher8 =Pattern.compile(cp8,Pattern.DOTALL).matcher(s);
				if(Matcher8.find()) film.score = Matcher8.group(3);
				else film.score = "0";
				String cp9="(片.*?长)(.)(.*?)<br />";
				Matcher Matcher9 =Pattern.compile(cp9,Pattern.DOTALL).matcher(s);
				if(Matcher9.find()) film.filmTime = Matcher9.group(3);
				else film.filmTime = "0";
				String cp10="(导.*?演)(.)(.*?)<br />";
				Matcher Matcher10 =Pattern.compile(cp10,Pattern.DOTALL).matcher(s);
				if(Matcher10.find()) film.director = Matcher10.group(3);
				else film.director = "0";
				String cp11="(简.*?介).(.*?)<img";
				Matcher Matcher11 =Pattern.compile(cp11,Pattern.DOTALL).matcher(s);
				if(Matcher11.find()){
				String s11 = Matcher11.group(2);
				s11 = s11.replaceAll("[(br />)|(<br />)]","");
				film.intoduction = s11;
				}
				else film.intoduction = "0";
				String cp12="<img(.*?)src=\"(.*?)\"";
				Matcher Matcher12 =Pattern.compile(cp12,Pattern.DOTALL).matcher(s);
				if(Matcher12.find()){
				String s12 = Matcher12.group(2);
				film.picture = s12;
				}
				else film.picture = "0";
				String cp13="<a(\\s*)href=[\"|\'](.*?)[\"|\']>";
				Matcher Matcher13 =Pattern.compile(cp13,Pattern.DOTALL).matcher(s);
				if(Matcher13.find()){
				String s13 = Matcher13.group(2);
				film.site = s13;
				}
				else film.site = "0";
				return film;
			}
			else return null;
	    }
	//按编码获得网页的字符串
		private String getEcodedPage(URL pageURL) {
			String line ="";  // 80行
			String pageString ="";
			//返回网页的编码
			String charset=EncodingDetector.getCharset(pageURL);
			if(charset == null) {//编码为null，
				return null;
			}
			InputStream in;
			try {
				in = pageURL.openStream();	
				BufferedReader reader = new BufferedReader(new InputStreamReader(in,charset));//编码 //90行			
				while ((line = reader.readLine()) != null) {
					pageString+= line + "\r\n";//读取内容赋予pageString中
				}
				reader.close();
				in.close();//95行
				return pageString;
			} catch (IOException e) {
				return null;
			}		
		}//100行
}