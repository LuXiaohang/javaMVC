package mysql;//1��
import java.sql.*;
public class JDBCConnection {
	public Connection   connection;//���ݿ����Ӷ���
	public static void main(String[] args) { //5��            
		JDBCConnection dc=new JDBCConnection();//�������ݿ�����    
		dc.close();//�ر����ݿ�����
	}    
    public JDBCConnection() {  //�������ݿ�����      
    	try { //10��  
    		
    		//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//������������
        	Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������  
            System.out.println("���ڽ������ݿ����ӡ���");
			//connection = DriverManager.getConnection("jdbc:odbc:BookDB");//��������
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/film","root","abc");
          	System.out.println("���ݿ����ӳɹ�");			
			}//15��	
        catch (ClassNotFoundException ex) {//�Ҳ������ݿ���������
            System.out.println("�Ҳ������ݿ���������");            
        }
        catch (SQLException ex) {//�������ӵ����ݿ� 
        	System.out.println("���ܽ��������ݿ������"); //20��       
        }
    }   
    public void close()  { //�ر����ݿ�����
    	try{
    		System.out.println("���ڹر����ݿ����ӡ���"); //25��
    		connection.close();
    		System.out.println("���ݿ����ӹرճɹ�");			 
       } 
       catch(Exception e){
    	   System.out.println("���ݿ����ӹر�ʧ��"); //30��       
    }
  } 
}