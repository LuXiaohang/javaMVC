package beans;
import java.sql.*;
import beans.FoodBean;;
public class FoodDBBean {
	int pageSize = 3; //每页显示记录数，这里为每页显示条记录
	int showPage = 1; //当前显示页
	int rowCount = 0; //总记录数
	int pageCount = 0; //记录分页后的总页数
	FoodBean allFood = new FoodBean();//存放全部查询结果
	FoodBean results = new FoodBean();//存放每页上查询结果 
	Connection conn = null;
	Statement stmt = null;
    ResultSet rset = null;
    String sql;
	public FoodDBBean(){}
	public FoodDBBean(String region, String type,String favor,String size,String price){//15行
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","abc");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					   ResultSet.CONCUR_READ_ONLY);//创建语句对象	
			sql="select * from finish where location='"+region+"' and favor='"+favor+"' and type='"+type+"' and amount='"+size+"' and price <"+price+" order by restaurant asc;";
			System.out.println(sql);
			rset = stmt.executeQuery (sql);//构造SQL语句
			if (rset== null || !rset.next()){//找不到结果
				allFood=null;
				return;
			}		
			do{//找到结果，将全部的查询结果保存到allPes
				Food foodtmp=new Food();							 
				foodtmp.setName(rset.getString("name"));  
				foodtmp.setHref(rset.getString("id")+".xml");
				foodtmp.setPic(rset.getString("id")+".jpg");  
				foodtmp.setScore(rset.getString("score")); 
				foodtmp.setRegion(region);
				foodtmp.setRestaurant(rset.getString("restaurant"));
				foodtmp.setType(type);
				foodtmp.setFavor(favor);
				foodtmp.setSize(size);
				foodtmp.setPrice(price);
				allFood.add(foodtmp);
			}while(rset.next());
			allFood.setRegion(region);
			//allFood.setRestaurant(restaurant);
			allFood.setType(type);
			allFood.setFavor(favor);
			allFood.setSize(size);
			allFood.setPrice(price);//保存检索式
			rset.last(); //将指针移至最后一条记录
			rowCount = rset.getRow(); //取得结果集中记录的条数 
			//计算显示的页数 
			pageCount = ((rowCount % pageSize) == 0 ?(rowCount/pageSize) : (rowCount/pageSize)+1);
		}catch (SQLException e) { 
		      e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {//释放资源
				if (rset!= null) rset.close();
				if (stmt!= null) stmt.close(); 
				if (conn!= null) conn.close();
			} catch (SQLException ignored) {}
		}		
	}//50行	
	public FoodBean getResult(String toPage) {//获取每页实际要显示的结果
		showPage = Integer.parseInt(toPage); //要作为当前页显示的页数
		System.out.println(showPage);
		if(allFood==null) //没有结果
			return null;				
		if(toPage != null){
			if(showPage > pageCount){ //指定页数大于总页数, 则显示最后一页 
				System.out.println(pageCount);
				showPage = pageCount;	
			}
			else if(showPage <= 0){//若指定页数小于0, 则显示第一页
				showPage = 1;//60行
			} 
		}
		System.out.println(showPage);
		int pos=(showPage - 1) * pageSize ;	//显示页中记录的起始位置	
		System.out.println(pos);
		int i = 0; //记录显示的记录数 
		results.clear();//清空已有内容
		while(i< pageSize && pos<allFood.getNumber()){ //从全部结果中取出当前页上要显示的结果
			Food bb = new Food();  
			System.out.println(pos);
  			bb=allFood.get(pos);			  
  			results.add(bb);	
			i++;//70行
			pos++;		
		}//while循环结束   
		results.setRegion(allFood.getRegion());
		results.setRestaurant(allFood.getRestaurant());
		results.setType(allFood.getType());
		results.setFavor(allFood.getFavor());
		results.setSize(allFood.getSize());
		results.setPrice(allFood.getPrice());
		results.setShowPage(showPage);//设置当前页页码
		results.setPageCount(pageCount);//设置总页数
		return results;
		}
	}
