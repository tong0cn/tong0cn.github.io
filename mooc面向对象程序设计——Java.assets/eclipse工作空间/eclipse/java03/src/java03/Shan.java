package java03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Shan {

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
	    String sql = "delete from Student2501 where studentID = ?";
	       

	     PreparedStatement ps = con.prepareStatement(sql);
	     ps.setObject(1, 3);
       
	     //4.执行sql语句
	     int num = ps.executeUpdate();//增删改都是
	     //5.判断操作是否成功
	     if (num > 0) {
	     	System.out.println("删除成功");
	     } else {
	    	 System.out.println("删除失败");
	     }
	    
	       
	     
	     //6，关闭相应的对象
	     ps.close();
	     con.close();
	  }

}
