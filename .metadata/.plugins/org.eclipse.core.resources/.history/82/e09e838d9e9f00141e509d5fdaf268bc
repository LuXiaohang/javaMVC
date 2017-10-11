package robot;
import java.net.URL;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import robot.ParseHtlm;
import robot.Link;
import robot.URLQueue;
import robot.SavePage;
//网页线程处理类
public class SearcherThread extends Thread {
	private URLQueue queue; //URL队列
	private ThreadController tc;//线程管理器	
	//为当前线程的注册URL队列
	public void setQueue(URLQueue queue) {
		this.queue = queue;
	}
	//为当前线程的注册线程管理器
	public void setThreadController(ThreadController tc) {
		this.tc = tc;
	}	
	
	//接收线程管理器的开始指令后，实际运行的线程代码
	public void run() {
		while(queue.getQueueSize()!=0)	{
			//以宽度优先搜索为例
			Link newLink = queue.popBFS();		
			//处理当前链接
			process(newLink);			
			//判断是否到达最大线程上限，没有则继续打开新线程
			if (tc.getMaxThreads() > tc.getRunningThreads()) {
				try {
					tc.startThreads();//开启新线程
				} catch (Exception e) {
					//System.err.println(e.toString());
					//忽略异常
				}
			}
		}
		//结束当前线程
		//检查停止线程的条件，如果满足则停止线程
		//如果不满足，则继续启动线程
		tc.finished();

	}
	
	//实际处理网页的方法
	private void process(Link link) {
		URL pageURL=link.getURL();
		int currentLeve=link.getDepth();
		
		//创建ParseHtlm的实例
		ParseHtlm parseHtlm=new ParseHtlm();
		
		//获得网页中的链接
		List<URL> links = parseHtlm.getLinks(pageURL);
		
		//将链接存入URL队列
		for(int i=0;i<links.size();i++){
			Link pushLink=new Link();
			pushLink.setURL(links.get(i));
			pushLink.setDepth(currentLeve+1);
			queue.push(pushLink);
		}
		if (parseHtlm.isPageText(pageURL)){
			//获得网页的标题
			Film film=parseHtlm.getFilmInfo(pageURL);
			//保存网页
			if(film != null)SavePage.savePage(pageURL,film);	
			}	
		}
}
