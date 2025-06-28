package java03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Gai {

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
	    String sql = "update Student2501 set studentName = ?,studentSex = ? where studentID = ?";
	       

	     PreparedStatement ps = con.prepareStatement(sql);
	     ps.setObject(1, "name");
	     ps.setObject(2, "Ů");
	     ps.setObject(3, 3);

//	       
	     //4.ִ��sql���
	     int num = ps.executeUpdate();//��ɾ�Ķ���
	     //5.�жϲ����Ƿ�ɹ�
	     if (num > 0) {
	     	System.out.println("�޸ĳɹ�");
	     } else {
	    	 System.out.println("�޸�ʧ��");
	     }
	    
	       
	     
	     //6���ر���Ӧ�Ķ���
	     ps.close();
	     con.close();
	  }

}
