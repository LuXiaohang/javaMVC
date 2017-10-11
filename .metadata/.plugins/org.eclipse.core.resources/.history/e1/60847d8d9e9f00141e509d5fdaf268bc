package robot;//1行
import java.net.URL;
import java.util.*;
/*
 * URL队列管理类  //5行
 * 负责管理待爬行队列和查重队列
 * 提供出队和入队方法 
 * 
 */
public class URLQueue {	//10行
	//待爬行链接队列	
	private LinkedList<Link> toVisitURL;
	//已获得URL队列,用于查重
	private Set<URL> duplicateCheckingURL;	
	//最大搜索层数限制  //15行
	private int maxLevel;
	//最大抓取网页数限制	
	private int maxPageNum;
	//构造方法，缺省不限制爬行网页数量和最大爬行层数	
	public URLQueue() {	//20行	
		toVisitURL=new LinkedList<Link>();	
		duplicateCheckingURL= new HashSet<URL>();
		maxLevel =-1;//缺省值，不限制最大搜索层数限制	
		maxPageNum = -1;//缺省值，不限制抓取页面数
	} //25行
	//设置最大抓取网页数
	public void setMaxElements(int maxPageNum) {
		this.maxPageNum= maxPageNum;
	}
	//设置最大访问层数  //30行
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	//返回最大访问层数
	public int getMaxLevel() {  //35行
		return maxLevel;
	}	
	//返回爬行队列中的元素个数		
	public int getQueueSize() {		
		return toVisitURL.size();//40行
	}
	//入队的方法
	public boolean push(Link link) {
		//获得当前链接的URL
		URL url = link.getURL(); //45行
		//获得当前链接的层数
		int level = link.getDepth();
		// 实现最大抓取数量控制
		if (maxPageNum != -1 && maxPageNum<= duplicateCheckingURL.size())
			return false; //50行
		// 实现最大访问层数控制
		if (maxLevel != -1 && level > maxLevel)
			return false;
		// 实现重复访问控制，如果不重复追加到爬行队列的末尾
		if (duplicateCheckingURL.add(url)) {//55行						
			toVisitURL.addLast(link);//追加到爬行队列的末尾			
			return true;
		}else return false;
	}
	//宽度优先出队方法 //60行
	public Link popBFS() {
		//出队操作，移除并返回待爬行队列的第一个元素
		Link link = toVisitURL.removeFirst();
		return link;
	}//65行
	//深度优先出队方法
	public Link popDFS() {
		//出队操作，移除并返回待爬行队列的最后一个元素
		Link link = toVisitURL.removeLast();
		return link;//70	
	}
}

