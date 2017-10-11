package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import beans.*;

public class FilmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FilmDBBean filmDBBean;
    public FilmServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8"); 
	    request.setCharacterEncoding("UTF-8"); 
	    String name = request.getParameter("name"); //获得查询条件
	    String director = request.getParameter("director");
	    String role = request.getParameter("role");
	    String score = request.getParameter("score");
	    String time = request.getParameter("time");
	    String type = request.getParameter("type");
	    System.out.println(name+director+role+score+time+type);
	    String toPage = request.getParameter("ToPage");
	    if ((name != null)&&(!name.equals("内容搜索"))) {
	    	filmDBBean=new beans.FilmDBBean(1,name,director,role,score,time,type);//创建查询对象，执行查询，
			FilmBean filmBean=filmDBBean.getResult("1");//获得第1页的结果	
			if(filmBean==null){//若无查询结果，调用error.jsp页面
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20行
			}
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("filmBean", filmBean);//保存FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);//页面跳转		
		} 
	    else if ((director != null)&&(!director.equals("导演搜索"))){
	    	filmDBBean=new FilmDBBean(2,name,director,role,score,time,type);//创建查询对象，执行查询，
			FilmBean filmBean=filmDBBean.getResult("1");//获得第1页的结果	
			if(filmBean==null){//若无查询结果，调用error.jsp页面
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20行
			}
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("filmBean", filmBean);//保存FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
	    else if ((role != null)&&(!role.equals("主演搜索"))){
	    	FilmDBBean filmDBBean=new FilmDBBean(3,name,director,role,score,time,type);//创建查询对象，执行查询，
			FilmBean filmBean=filmDBBean.getResult("1");//获得第1页的结果	
			if(filmBean==null){//若无查询结果，调用error.jsp页面
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20行
			}
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("filmBean", filmBean);//保存FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
	    else if ((score != null)&&(!score.equals("null"))){
	    	filmDBBean=new FilmDBBean(4,name,director,role,score,time,type);//创建查询对象，执行查询，
			FilmBean filmBean=filmDBBean.getResult("1");//获得第1页的结果	
			if(filmBean==null){//若无查询结果，调用error.jsp页面
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20行
			}
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("filmBean", filmBean);//保存FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
	    else if ((time != null)&&(!time.equals("null"))){
	    	filmDBBean=new FilmDBBean(5,name,director,role,score,time,type);//创建查询对象，执行查询，
			FilmBean filmBean=filmDBBean.getResult("1");//获得第1页的结果	
			if(filmBean==null){//若无查询结果，调用error.jsp页面
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20行
			}
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("filmBean", filmBean);//保存FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
	    else if ((type != null)&&(!type.equals("null"))){
	    	filmDBBean=new FilmDBBean(6,name,director,role,score,time,type);//创建查询对象，执行查询，
			FilmBean filmBean=filmDBBean.getResult("1");//获得第1页的结果	
			if(filmBean==null){//若无查询结果，调用error.jsp页面
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20行
			}
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("filmBean", filmBean);//保存FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
		else if(toPage == null){//页面跳转
			response.sendRedirect("http://localhost:8080/Film/error.jsp");
		}
		else{//执行翻页
			FilmBean filmBean=filmDBBean.getResult(toPage);//获得第toPage页的结果
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("filmBean", filmBean);//保存FilmBean				
			request.getRequestDispatcher("/result.jsp").forward(request, response);	//页面跳转		
		}		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
