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
	    String name = request.getParameter("name"); //��ò�ѯ����
	    String director = request.getParameter("director");
	    String role = request.getParameter("role");
	    String score = request.getParameter("score");
	    String time = request.getParameter("time");
	    String type = request.getParameter("type");
	    System.out.println(name+director+role+score+time+type);
	    String toPage = request.getParameter("ToPage");
	    if ((name != null)&&(!name.equals("��������"))) {
	    	filmDBBean=new beans.FilmDBBean(1,name,director,role,score,time,type);//������ѯ����ִ�в�ѯ��
			FilmBean filmBean=filmDBBean.getResult("1");//��õ�1ҳ�Ľ��	
			if(filmBean==null){//���޲�ѯ���������error.jspҳ��
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20��
			}
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("filmBean", filmBean);//����FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);//ҳ����ת		
		} 
	    else if ((director != null)&&(!director.equals("��������"))){
	    	filmDBBean=new FilmDBBean(2,name,director,role,score,time,type);//������ѯ����ִ�в�ѯ��
			FilmBean filmBean=filmDBBean.getResult("1");//��õ�1ҳ�Ľ��	
			if(filmBean==null){//���޲�ѯ���������error.jspҳ��
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20��
			}
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("filmBean", filmBean);//����FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
	    else if ((role != null)&&(!role.equals("��������"))){
	    	FilmDBBean filmDBBean=new FilmDBBean(3,name,director,role,score,time,type);//������ѯ����ִ�в�ѯ��
			FilmBean filmBean=filmDBBean.getResult("1");//��õ�1ҳ�Ľ��	
			if(filmBean==null){//���޲�ѯ���������error.jspҳ��
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20��
			}
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("filmBean", filmBean);//����FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
	    else if ((score != null)&&(!score.equals("null"))){
	    	filmDBBean=new FilmDBBean(4,name,director,role,score,time,type);//������ѯ����ִ�в�ѯ��
			FilmBean filmBean=filmDBBean.getResult("1");//��õ�1ҳ�Ľ��	
			if(filmBean==null){//���޲�ѯ���������error.jspҳ��
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20��
			}
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("filmBean", filmBean);//����FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
	    else if ((time != null)&&(!time.equals("null"))){
	    	filmDBBean=new FilmDBBean(5,name,director,role,score,time,type);//������ѯ����ִ�в�ѯ��
			FilmBean filmBean=filmDBBean.getResult("1");//��õ�1ҳ�Ľ��	
			if(filmBean==null){//���޲�ѯ���������error.jspҳ��
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20��
			}
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("filmBean", filmBean);//����FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
	    else if ((type != null)&&(!type.equals("null"))){
	    	filmDBBean=new FilmDBBean(6,name,director,role,score,time,type);//������ѯ����ִ�в�ѯ��
			FilmBean filmBean=filmDBBean.getResult("1");//��õ�1ҳ�Ľ��	
			if(filmBean==null){//���޲�ѯ���������error.jspҳ��
				response.sendRedirect("http://localhost:8080/Film/error.jsp");
				return;//20��
			}
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("filmBean", filmBean);//����FilmBean					
			request.getRequestDispatcher("/result.jsp").forward(request, response);
	    }
		else if(toPage == null){//ҳ����ת
			response.sendRedirect("http://localhost:8080/Film/error.jsp");
		}
		else{//ִ�з�ҳ
			FilmBean filmBean=filmDBBean.getResult(toPage);//��õ�toPageҳ�Ľ��
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("filmBean", filmBean);//����FilmBean				
			request.getRequestDispatcher("/result.jsp").forward(request, response);	//ҳ����ת		
		}		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}