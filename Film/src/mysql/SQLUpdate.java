package mysql;//1行
import java.sql.*;

import robot.Film;
import mysql.CreateStatement;
import mysql.JDBCConnection;
public class SQLUpdate {//5行
    private Statement stmt;
	public static void use(int args,Film film) {
		JDBCConnection dc=new JDBCConnection();//建立数据库连接    
		CreateStatement cst=new CreateStatement(dc);//创建语句对象 //10行
		SQLUpdate eu=new SQLUpdate(cst.stmt);
		switch(args){
			case 1:
				eu.createTable();//创建数据表
				break;//15行
			case 2:
				eu.insertData(film);//插入数据
				break;			
		}		
		cst.close();//关闭语句对象 //25行
		dc.close();//关闭数据库连接
	}
	public SQLUpdate(Statement stmt){
		this.stmt=stmt;
	}//30行
	public void createTable(){//创建数据表
		String s="CREATE TABLE film(id int AUTO_INCREMENT PRIMARY KEY ," +
				"name text,transname text,time text,score text,country text,type text,language text," +
				"minute text,role text,introduction text,site text,director text,picture text,href text);" ;
		try {//35行
			stmt.executeUpdate(s);//发送SQL语句
			System.out.println("132323132");
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
	}//40行
	//String chineseName;//中文名
	//String Name;//英文名
	//String onTime;//上映时间
	//String country;//国家
	//String classify;//分类
	//String language;//语言
	//String caption;//字幕
	//String score;//评分
	//String filmTime;//电影时长
	//String director;//导演
	//String leadingRole;//主演
	//String intoduction;//简介
	//transname,role,introduction,site,director,time,score" +
	//"country,type,picture,language,minute
	//," +
	//,'"+film.chineseName+"','"+film.leadingRole+"'"'film.chineseName', 'film.onTime', 'film.score','film.country'," +"'film.classify'
	public void insertData(Film film){//插入数据
		String s  = "INSERT INTO film (name,transname,time,score,country,type,language," +
				"minute,role,introduction,site,director,picture,href) " +
	"Values ('"+film.Name+"','"+film.chineseName+"','"+film.onTime+"','"+film.score+"'," +
			"'"+film.country+"','"+film.classify+"','"+film.language+"','"+film.filmTime+"'," +
			"'"+film.leadingRole+"','"+film.intoduction+"','"+film.site+"','"+film.director+"','"+film.picture+"','"+film.href+"')" ;
			/*" +
			"'"+film.intoduction+"','"+film.site+"','"+film.director+"','"+film.onTime+"','"+film.score+"','"+film.country+"'," +
			"'"+film.classify+"','"+film.picture+"','"+film.language+"','"+film.filmTime+"')";*/
		try {//45行
			stmt.executeUpdate(s);//发送SQL语句
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}//50行
	
}