package java03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Zeng {

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
	    String sql = "insert into Student2501 values(?, ?, ? , ? ,? , ?)";
//	    insert into Student2501 values(2, "Tom", "��", "2025-1-10",0,202102)
	       

	     PreparedStatement ps = con.prepareStatement(sql);
	     ps.setObject(1, "3");
	     ps.setObject(2, "gao");
	     ps.setObject(3, "��");
	     ps.setObject(4, "2025-1-10");
	     ps.setObject(5, 0);
	     ps.setObject(6, 202103);
//	       
	     //4.ִ��sql���
	     int num = ps.executeUpdate();//��ɾ�Ķ���
	     //5.�жϲ����Ƿ�ɹ�
	     if (num > 0) {
	     	System.out.println("��ӳɹ�");
	     } else {
	    	 System.out.println("���ʧ��");
	     }
	    
	       
	     
	     //6���ر���Ӧ�Ķ���
	     ps.close();
	     con.close();
	  }

}


