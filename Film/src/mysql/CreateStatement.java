package mysql;//1行	
import mysql.JDBCConnection;
import java.sql.*;
public class CreateStatement {
	public Statement stmt;//5行	
	public static void main(String[] args) {
		JDBCConnection dc=new JDBCConnection();//建立数据库连接    
		CreateStatement cst=new CreateStatement(dc);//创建语句对象 
		cst.close();//关闭语句对象
		dc.close();//关闭数据库连接
	}
	public CreateStatement(JDBCConnection dc){
		try {
			stmt=dc.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,//10行	
					ResultSet.CONCUR_UPDATABLE);
			System.out.println("语句对象创建成功");	
		} catch (SQLException e) {
			System.out.println("不能建立语句对象");//15行				
		}
	} 
	public void close()  { //关闭语句对象
		try{ 
			System.out.println("正在关闭语句对象……");//20行
			stmt.close();
			System.out.println("语句对象关闭成功");			 
	       }
	       catch(Exception e){//25行
	    	   System.out.println("语句对象关闭失败");       
	    }
	}
}
