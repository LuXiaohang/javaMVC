package robot;


import robot.URLQueue;


public class ThreadController {
	
	private int maxThreads;//最大线程数
	
	private URLQueue queue;//URL队列
	
	private Class<SearcherThread> threadClass;	//网页处理线程类
	
	private int nThreads;//当前运行的线程数量
	
	/* 
	 * 最大线程数缺省时的构造方法
	 * 只指定网页处理线程类和URL队列
	 * 最大线程数为10
	 */
	public ThreadController(Class<SearcherThread> threadClass,
			URLQueue queue)
	throws InstantiationException, IllegalAccessException {
		
		this(threadClass,queue,10);
	}
	/*
	 * 线程管理器构造方法
	 * 指定网页处理线程类、URL队列和最大线程数量
	 */

	public ThreadController(Class<SearcherThread> threadClass,
							URLQueue queue,
							int maxThreads)
				throws InstantiationException, IllegalAccessException {		
		this.threadClass = threadClass;//初始化线程类
		this.maxThreads = maxThreads;//初始化最大线程数		
		this.queue = queue;//初始化URL队列		
		nThreads = 0;//初始化当前运行的线程数量
		
		startThreads();//调用开始线程的方法
	}

     //返回最大线程数
	public int getMaxThreads() {
		return maxThreads;
	}

	//返回当前正在运行的线程数量
	public int getRunningThreads() {
		return nThreads;
	}

	//开始线程
	public synchronized void startThreads()
	throws InstantiationException, IllegalAccessException {
		
		// 计算剩余线程数
		int m = maxThreads - nThreads;
		//获取URL队列中的链接数
		int ts = queue.getQueueSize();
		
		/*
		 * 如剩余的线程数大于队列中的URL数，就只创建
		 *与URL队列中URL个数相同的线程数
		 */

		if (ts <=m ) {
			m = ts;
		}

		//开启m个线程
		for (int n = 0; n < m; n++) {
			//创建网页处理线程类实例
			SearcherThread thread =	threadClass.newInstance();
			//为网页处理线程注册线程管理器
			thread.setThreadController(this);
			//为网页处理线程注册URL队列
			thread.setQueue(queue);	
			//开始线程
			thread.start();
			//增加当前线程数量
			nThreads++;

			
		}
	}
	
	/*
	 * 结束当前线程
	 * 判断是否达到了程序结束的条件	 
	 * 如果当前线程数为0且URL队列不为空，继续开启线程
	 */
	public synchronized void finished() {
		//当前线程结束，运行的线程数减1
		nThreads--;
		//判断是否达到程序结束条件
		if (nThreads == 0) {
			if (queue.getQueueSize()==0) {
				//已达到程序结束条件，程序结束
				System.out.println("All threads finished");
				return;
			}
			try {
				//URL队列不为空且当前线程数为0，继续开启线程
				startThreads();
			} catch (InstantiationException e) {
				//忽略异常
				//Something has gone wrong on the way, because if it hadn't
				// worked at all we wouldn't be here. Anyway, we can do
				// nothing about it, so we just quit instead of moving to
				// a new level.
			} catch (IllegalAccessException e) {
				//忽略异常
				//Something has gone wrong on the way, because if it hadn't
				// worked at all we wouldn't be here. Anyway, we can do
				// nothing about it, so we just quit instead of moving to
				// a new level.
			}
		}
	}
}
