package robot;

import java.net.URL;

import mysql.SQLUpdate;

import robot.Link;
import robot.URLQueue;
//搜索程序客户端
public class SearcherClient {	
	public static void main(String[] args) {
		try {
			//String urlstring="http://127.0.0.1:8080/searchtest/A.htm";
			String urlstring="http://www.dytt8.net/";
			//String urlstring="http://book.51cto.com/art/200812/101131.htm";
		    //创建表示种子地址的Link对象
			SQLUpdate.use(1, new Film());
			Link link=new Link();
		    link.setURL(new URL(urlstring));
		    link.setDepth(0);
			//初始化最大访问层数
		    int maxLevel = 5;
			//初始化最大线程数量
			int maxThreads = 20;
			//初始化最大抓取网页数量，-1代表不限制
			int maxDoc = -1;
			//int maxDoc = 10;
			//初始化URL队列
			URLQueue q = new URLQueue();
			//设定最大抓取网页数量
			q.setMaxElements(maxDoc);
			//设定最大访问层数
			q.setMaxLevel(maxLevel);
			//将种子地址加入队列
			q.push(link);			
			//向线程管理器传递搜索参数，并开始抓取线程
			new ThreadController(SearcherThread.class,q,maxThreads);			
			//return;
		} catch (Exception e) {
				System.err.println("An error occured: ");
				e.printStackTrace();
				// System.err.println(e.toString());
		}	
	
	}

}
