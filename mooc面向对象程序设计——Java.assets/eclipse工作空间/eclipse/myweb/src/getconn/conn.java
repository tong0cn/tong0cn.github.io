package getconn;

import java.sql.SQLException;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

public class conn {
	public DruidPooledConnection retconn() {
		DruidDataSource dds=new DruidDataSource();
		dds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dds.setUrl("jdbc:mysql://localhost:3306/glxt");
		dds.setUsername("root");
		dds.setPassword("123456");
		DruidPooledConnection conn=null;
		try {
			conn = dds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
