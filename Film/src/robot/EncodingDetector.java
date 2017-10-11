package robot;
import info.monitorenter.cpdetector.io.CodepageDetectorProxy;
import info.monitorenter.cpdetector.io.ASCIIDetector;
import info.monitorenter.cpdetector.io.JChardetFacade;
import info.monitorenter.cpdetector.io.ParsingDetector;//5行
import info.monitorenter.cpdetector.io.UnicodeDetector;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
public class EncodingDetector {//10行
	public static String getCharset(URL pageURL){
		InputStream in=null;
		try {
			in = pageURL.openStream();		
			//获得CodepageDetectorProxy实例  //15行
			CodepageDetectorProxy detector = CodepageDetectorProxy.getInstance(); 		
			//添加ParsingDetector检测器实例  		 
			detector.add(new ParsingDetector()); 
			//添加JChardetFacade检测器实例    
			detector.add(JChardetFacade.getInstance()); //20行		
			//添加ASCIIDetector检测器实例  
			detector.add(ASCIIDetector.getInstance());  
			//添加UnicodeDetector检测器实例
			detector.add(UnicodeDetector.getInstance());  
			Charset charset=null; //25行		 
			//检测输入流的编码类型		
			charset = detector.detectCodepage(new BufferedInputStream(in),1000); 		
			in.close();
			if(charset.name()!="void")	
				return charset.name();  //返回编码类型
			else //30行
				return null;  //编码类型未知 
		} catch (IllegalArgumentException e) {
			return null;  
		} catch (IOException e) { //35行	
			return null; 	
		}	
	}	
}
