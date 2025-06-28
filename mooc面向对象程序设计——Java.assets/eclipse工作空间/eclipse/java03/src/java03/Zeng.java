package java03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Zeng {

	public static void main(String[] args) throws Exception  {
		//1.利用反射注册mysql驱动
	    Class.forName("com.mysql.cj.jdbc.Driver");
	       

	    String url = "jdbc:mysql://localhost:3306/School2501?useSSL=true&serverTimezone=UTC";
	    //jdbc:mysql://localhost:3306/数据库名?useSSL=false&serverTimezone=UTC
	    String userName = "root";
	    String passWord = "1122334";
	       
	    //2.创建实例连接
	    Connection con = DriverManager.getConnection(url, userName, passWord);

	    //3.预编译
	    String sql = "insert into Student2501 values(?, ?, ? , ? ,? , ?)";
//	    insert into Student2501 values(2, "Tom", "男", "2025-1-10",0,202102)
	       

	     PreparedStatement ps = con.prepareStatement(sql);
	     ps.setObject(1, "3");
	     ps.setObject(2, "gao");
	     ps.setObject(3, "男");
	     ps.setObject(4, "2025-1-10");
	     ps.setObject(5, 0);
	     ps.setObject(6, 202103);
//	       
	     //4.执行sql语句
	     int num = ps.executeUpdate();//增删改都是
	     //5.判断操作是否成功
	     if (num > 0) {
	     	System.out.println("添加成功");
	     } else {
	    	 System.out.println("添加失败");
	     }
	    
	       
	     
	     //6，关闭相应的对象
	     ps.close();
	     con.close();
	  }

}


