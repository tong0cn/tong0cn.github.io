package java03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cha {

	public static void main(String[] args) throws Exception {
//		try {
			//1.���÷���ע��mysql����
		    Class.forName("com.mysql.cj.jdbc.Driver");
		       
	
		    String url = "jdbc:mysql://localhost:3306/School2501?useSSL=true&serverTimezone=UTC";
		    //jdbc:mysql://localhost:3306/���ݿ���?useSSL=false&serverTimezone=UTC
		    String userName = "root";
		    String passWord = "1122334";
		       
		    //2.����ʵ������
		    Connection con = DriverManager.getConnection(url, userName, passWord);
	
		    //3.Ԥ����
		    String sql = "select * from Student2501";
		     
		     PreparedStatement ps = con.prepareStatement(sql);
	    
		     //4.ִ�в�ѯ��䣬���ɽ���� 
		     ResultSet rs = ps.executeQuery(); 
		       
		     //5.ȡ������
		     while (rs.next()) {
		    	 System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		     }
	
		     //�ر���Ӧ�Ķ���
		     rs.close();
		     ps.close();
		     con.close();
//		 } catch (ClassNotFoundException e) {
//			 System.out.println("����ʧ��");
		 }
	
}
