package mysql;//1��
import java.sql.*;

import robot.Film;
import mysql.CreateStatement;
import mysql.JDBCConnection;
public class SQLUpdate {//5��
    private Statement stmt;
	public static void use(int args,Film film) {
		JDBCConnection dc=new JDBCConnection();//�������ݿ�����    
		CreateStatement cst=new CreateStatement(dc);//���������� //10��
		SQLUpdate eu=new SQLUpdate(cst.stmt);
		switch(args){
			case 1:
				eu.createTable();//�������ݱ�
				break;//15��
			case 2:
				eu.insertData(film);//��������
				break;			
		}		
		cst.close();//�ر������� //25��
		dc.close();//�ر����ݿ�����
	}
	public SQLUpdate(Statement stmt){
		this.stmt=stmt;
	}//30��
	public void createTable(){//�������ݱ�
		String s="CREATE TABLE film(id int AUTO_INCREMENT PRIMARY KEY ," +
				"name text,transname text,time text,score text,country text,type text,language text," +
				"minute text,role text,introduction text,site text,director text,picture text,href text);" ;
		try {//35��
			stmt.executeUpdate(s);//����SQL���
			System.out.println("132323132");
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
	}//40��
	//String chineseName;//������
	//String Name;//Ӣ����
	//String onTime;//��ӳʱ��
	//String country;//����
	//String classify;//����
	//String language;//����
	//String caption;//��Ļ
	//String score;//����
	//String filmTime;//��Ӱʱ��
	//String director;//����
	//String leadingRole;//����
	//String intoduction;//���
	//transname,role,introduction,site,director,time,score" +
	//"country,type,picture,language,minute
	//," +
	//,'"+film.chineseName+"','"+film.leadingRole+"'"'film.chineseName', 'film.onTime', 'film.score','film.country'," +"'film.classify'
	public void insertData(Film film){//��������
		String s  = "INSERT INTO film (name,transname,time,score,country,type,language," +
				"minute,role,introduction,site,director,picture,href) " +
	"Values ('"+film.Name+"','"+film.chineseName+"','"+film.onTime+"','"+film.score+"'," +
			"'"+film.country+"','"+film.classify+"','"+film.language+"','"+film.filmTime+"'," +
			"'"+film.leadingRole+"','"+film.intoduction+"','"+film.site+"','"+film.director+"','"+film.picture+"','"+film.href+"')" ;
			/*" +
			"'"+film.intoduction+"','"+film.site+"','"+film.director+"','"+film.onTime+"','"+film.score+"','"+film.country+"'," +
			"'"+film.classify+"','"+film.picture+"','"+film.language+"','"+film.filmTime+"')";*/
		try {//45��
			stmt.executeUpdate(s);//����SQL���
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}//50��
	
}