package beans;
import java.sql.*;
import beans.FoodBean;;
public class FoodDBBean {
	int pageSize = 3; //ÿҳ��ʾ��¼��������Ϊÿҳ��ʾ����¼
	int showPage = 1; //��ǰ��ʾҳ
	int rowCount = 0; //�ܼ�¼��
	int pageCount = 0; //��¼��ҳ�����ҳ��
	FoodBean allFood = new FoodBean();//���ȫ����ѯ���
	FoodBean results = new FoodBean();//���ÿҳ�ϲ�ѯ��� 
	Connection conn = null;
	Statement stmt = null;
    ResultSet rset = null;
    String sql;
	public FoodDBBean(){}
	public FoodDBBean(String region, String type,String favor,String size,String price){//15��
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","abc");
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
					   ResultSet.CONCUR_READ_ONLY);//����������	
			sql="select * from finish where location='"+region+"' and favor='"+favor+"' and type='"+type+"' and amount='"+size+"' and price <"+price+" order by restaurant asc;";
			System.out.println(sql);
			rset = stmt.executeQuery (sql);//����SQL���
			if (rset== null || !rset.next()){//�Ҳ������
				allFood=null;
				return;
			}		
			do{//�ҵ��������ȫ���Ĳ�ѯ������浽allPes
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
			allFood.setPrice(price);//�������ʽ
			rset.last(); //��ָ���������һ����¼
			rowCount = rset.getRow(); //ȡ�ý�����м�¼������ 
			//������ʾ��ҳ�� 
			pageCount = ((rowCount % pageSize) == 0 ?(rowCount/pageSize) : (rowCount/pageSize)+1);
		}catch (SQLException e) { 
		      e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {//�ͷ���Դ
				if (rset!= null) rset.close();
				if (stmt!= null) stmt.close(); 
				if (conn!= null) conn.close();
			} catch (SQLException ignored) {}
		}		
	}//50��	
	public FoodBean getResult(String toPage) {//��ȡÿҳʵ��Ҫ��ʾ�Ľ��
		showPage = Integer.parseInt(toPage); //Ҫ��Ϊ��ǰҳ��ʾ��ҳ��
		System.out.println(showPage);
		if(allFood==null) //û�н��
			return null;				
		if(toPage != null){
			if(showPage > pageCount){ //ָ��ҳ��������ҳ��, ����ʾ���һҳ 
				System.out.println(pageCount);
				showPage = pageCount;	
			}
			else if(showPage <= 0){//��ָ��ҳ��С��0, ����ʾ��һҳ
				showPage = 1;//60��
			} 
		}
		System.out.println(showPage);
		int pos=(showPage - 1) * pageSize ;	//��ʾҳ�м�¼����ʼλ��	
		System.out.println(pos);
		int i = 0; //��¼��ʾ�ļ�¼�� 
		results.clear();//�����������
		while(i< pageSize && pos<allFood.getNumber()){ //��ȫ�������ȡ����ǰҳ��Ҫ��ʾ�Ľ��
			Food bb = new Food();  
			System.out.println(pos);
  			bb=allFood.get(pos);			  
  			results.add(bb);	
			i++;//70��
			pos++;		
		}//whileѭ������   
		results.setRegion(allFood.getRegion());
		results.setRestaurant(allFood.getRestaurant());
		results.setType(allFood.getType());
		results.setFavor(allFood.getFavor());
		results.setSize(allFood.getSize());
		results.setPrice(allFood.getPrice());
		results.setShowPage(showPage);//���õ�ǰҳҳ��
		results.setPageCount(pageCount);//������ҳ��
		return results;
		}
	}
