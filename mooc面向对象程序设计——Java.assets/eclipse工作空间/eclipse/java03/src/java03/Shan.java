package java03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Shan {

	public static void main(String[] args) throws Exception  {
		//1.���÷���ע��mysql����
	    Class.forName("com.mysql.cj.jdbc.Driver");
	       

	    String url = "jdbc:mysql://localhost:3306/School2501?useSSL=true&serverTimezone=UTC";
	    //jdbc:mysql://localhost:3306/���ݿ���?useSSL=false&serverTimezone=UTC
	    String userName = "root";
	    String passWord = "1122334";
	       
	    //2.����ʵ������
	    Connection con = DriverManager.getConnection(url, userName, passWord);

	    //3.Ԥ����
	    String sql = "delete from Student2501 where studentID = ?";
	       

	     PreparedStatement ps = con.prepareStatement(sql);
	     ps.setObject(1, 3);
       
	     //4.ִ��sql���
	     int num = ps.executeUpdate();//��ɾ�Ķ���
	     //5.�жϲ����Ƿ�ɹ�
	     if (num > 0) {
	     	System.out.println("ɾ���ɹ�");
	     } else {
	    	 System.out.println("ɾ��ʧ��");
	     }
	    
	       
	     
	     //6���ر���Ӧ�Ķ���
	     ps.close();
	     con.close();
	  }

}
