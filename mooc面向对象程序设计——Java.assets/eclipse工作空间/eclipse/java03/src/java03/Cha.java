package java03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cha {

	public static void main(String[] args) throws Exception {
//		try {
			//1.利用反射注册mysql驱动
		    Class.forName("com.mysql.cj.jdbc.Driver");
		       
	
		    String url = "jdbc:mysql://localhost:3306/School2501?useSSL=true&serverTimezone=UTC";
		    //jdbc:mysql://localhost:3306/数据库名?useSSL=false&serverTimezone=UTC
		    String userName = "root";
		    String passWord = "1122334";
		       
		    //2.创建实例连接
		    Connection con = DriverManager.getConnection(url, userName, passWord);
	
		    //3.预编译
		    String sql = "select * from Student2501";
		     
		     PreparedStatement ps = con.prepareStatement(sql);
	    
		     //4.执行查询语句，生成结果集 
		     ResultSet rs = ps.executeQuery(); 
		       
		     //5.取出数据
		     while (rs.next()) {
		    	 System.out.println(rs.getString(1)+"\t"+rs.getString(2));
		     }
	
		     //关闭响应的对象
		     rs.close();
		     ps.close();
		     con.close();
//		 } catch (ClassNotFoundException e) {
//			 System.out.println("运行失败");
		 }
	
}
