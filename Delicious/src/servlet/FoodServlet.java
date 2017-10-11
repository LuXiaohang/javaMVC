package servlet;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import beans.*;//5��
public class FoodServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	FoodDBBean foodDBBean=null; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {	
		response.setContentType("text/html;charset=UTF-8"); 
	    request.setCharacterEncoding("UTF-8");  
	    String region=request.getParameter("region");
		//String restaurant=request.getParameter("restaurant");
		String type=request.getParameter("type");
		String favor=request.getParameter("favor");
		String size=request.getParameter("size");
		String price=request.getParameter("price");
		String toPage = request.getParameter("ToPage");//�����ʾҳ
		if ((region != null)&&(!region.equals(""))||
				(type != null)&&(!type.equals(""))||
				(favor != null)&&(!favor.equals(""))||
				(size != null)&&(!size.equals(""))||
				(price != null)&&(!price.equals(""))) {//����������ڣ���ִ�в�ѯ				
			foodDBBean=new FoodDBBean(region,type,favor,size,price);//������ѯ����ִ�в�ѯ��
			FoodBean foodBean=foodDBBean.getResult("1");//��õ�1ҳ�Ľ��	
			if(foodBean==null){//���޲�ѯ���������error.jspҳ��
				response.sendRedirect("http://localhost:8080/Delicious/Error.jsp");
				return;//20��
			}
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("foodBean", foodBean);//����PeBean					
			request.getRequestDispatcher("/Result.jsp").forward(request, response);//ҳ����ת		
		} 
		else if(toPage == null){//ҳ����ת
			response.sendRedirect("http://localhost:8080/Delicious/Query.jsp");
		}
		else{//ִ�з�ҳ
			FoodBean foodBean=foodDBBean.getResult(toPage);//��õ�toPageҳ�Ľ��
			HttpSession session=request.getSession();//��ûỰ����
			session.setAttribute("foodBean", foodBean);//����FoodBean				
			request.getRequestDispatcher("/Result.jsp").forward(request, response);	//ҳ����ת		
		}		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		doGet(request, response);
	}	

}
