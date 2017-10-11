package servlet;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import beans.*;//5行
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
		String toPage = request.getParameter("ToPage");//获得显示页
		if ((region != null)&&(!region.equals(""))||
				(type != null)&&(!type.equals(""))||
				(favor != null)&&(!favor.equals(""))||
				(size != null)&&(!size.equals(""))||
				(price != null)&&(!price.equals(""))) {//请求参数存在，则执行查询				
			foodDBBean=new FoodDBBean(region,type,favor,size,price);//创建查询对象，执行查询，
			FoodBean foodBean=foodDBBean.getResult("1");//获得第1页的结果	
			if(foodBean==null){//若无查询结果，调用error.jsp页面
				response.sendRedirect("http://localhost:8080/Delicious/Error.jsp");
				return;//20行
			}
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("foodBean", foodBean);//保存PeBean					
			request.getRequestDispatcher("/Result.jsp").forward(request, response);//页面跳转		
		} 
		else if(toPage == null){//页面跳转
			response.sendRedirect("http://localhost:8080/Delicious/Query.jsp");
		}
		else{//执行翻页
			FoodBean foodBean=foodDBBean.getResult(toPage);//获得第toPage页的结果
			HttpSession session=request.getSession();//获得会话对象
			session.setAttribute("foodBean", foodBean);//保存FoodBean				
			request.getRequestDispatcher("/Result.jsp").forward(request, response);	//页面跳转		
		}		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {
		doGet(request, response);
	}	

}
