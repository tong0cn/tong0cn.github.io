package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import bean.kc;
import bean.kcinfo;
import bean.stu;
import bean.stuxk;
import bean.uesr;
import getconn.conn;

public class logindaoimpl implements logindao {
	public uesr sele(String num,String pass) throws Exception {
	DruidDataSource dds=new DruidDataSource();
	dds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dds.setUrl("jdbc:mysql://localhost:3306/glxt");
	dds.setUsername("root");
	dds.setPassword("123456");
	DruidPooledConnection conn = dds.getConnection();
	PreparedStatement ps = conn.prepareStatement("select * from user where usernum=? and password=?");
	ps.setString(1, num);ps.setString(2, pass);
	ResultSet res = ps.executeQuery();
	uesr use = new uesr();
	while(res.next()) {
		use.setNum(res.getString("usernum"));
		use.setPass(res.getString("password"));
		use.setIdentity(res.getString("identity"));
	}
	return use;
	}
	
	
	public String selename(String num) throws Exception{
		conn conn = new conn();
		DruidPooledConnection con = conn.retconn();
		PreparedStatement ps = con.prepareStatement("select name from stuinfo where num=?");
		ps.setString(1, num);
		ResultSet res = ps.executeQuery();
		String name=null;
		while(res.next()) {
			name=res.getString("name");
		}
		return name;
		
	}
	
	
	
	public stu seleone(String num) throws Exception {
		conn con = new conn();
		DruidPooledConnection conn = con.retconn();
		QueryRunner qr = new QueryRunner();
		Object[] a= {num }; 
		stu list = qr.query(conn,"select * from stuinfo where num=?",new BeanHandler<stu>(stu.class),a);
		return list;
		
	}
	
	public void formatuser() throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		PreparedStatement ps = conn.prepareStatement("select num from stuinfo ");
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			PreparedStatement ps1 = conn.prepareStatement("insert into user (usernum,identity) values (?,'学生')");
			ps1.setString(1,res.getString("num"));
			ps1.executeUpdate();
		}
		PreparedStatement ps2 = conn.prepareStatement("select jsgh from teachinfo ");
		ResultSet res1 = ps2.executeQuery();
		while(res1.next()) {
			PreparedStatement ps3 = conn.prepareStatement("insert into user (usernum,identity) values (?,'教师')");
			ps3.setString(1,res1.getString("jsgh"));
			ps3.executeUpdate();
		}
	}
	
	public List selestuall() throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		List<stu> list = qr.query(conn,"select * from stuinfo",new BeanListHandler<stu>(stu.class));
		return list;
	}
	
	public void updatestu(String x1,String x2,String x3,String x4,String x5,String x6)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		qr.update(conn,"update stuinfo set num=?,name=?,gender=?,yx=?,bj=? where num=?",x1,x2,x3,x4,x5,x6);
	}
	
	public void delestuone(String num)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		qr.update(conn,"delete from stuinfo where num=?",num);
	}
	public void delestusele(String[] num)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		for(String a:num) {
			qr.update(conn,"delete from stuinfo where num=?",a);
		}
		
	}
	
	public List selexkinfo(String num)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		List<stuxk> list = qr.query(conn,"select stuandkc.kcdm,zt,kcmc from stuandkc,kcinfo where stuandkc.kcdm=kcinfo.kcdm and num=?",new BeanListHandler<stuxk>(stuxk.class),num);
		return list;
	}
	
	public void xsxk(String num,String kcdm)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		qr.update(conn,"update stuandkc set zt='已选' where num=? and kcdm=?",num,kcdm);
		String bm = qr.query(conn,"select biaoming from kcinfo where kcdm=?",new ScalarHandler<String>(),kcdm);
		qr.update(conn,"insert into "+bm+"(xh) values (?)",num);
	}
	
	public void xstk(String num,String kcdm)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		qr.update(conn,"update stuandkc set zt='未选' where num=? and kcdm=?",num,kcdm);
		String bm = qr.query(conn,"select biaoming from kcinfo where kcdm=?",new ScalarHandler<String>(),kcdm);
		qr.update(conn,"delete from "+bm+" where xh=?",num);
	}
	
	public List selexjskc(String num)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		List<kcinfo> list = qr.query(conn,"select * from kcinfo where jsgh=?",new BeanListHandler<kcinfo>(kcinfo.class),num);
		return list;
	}
	
	public List selecjb(String bm)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		List<kc> list = qr.query(conn,"select * from "+bm,new BeanListHandler<kc>(kc.class));
		return list;
	}
	
	public void cjlr(String kcdm,String[] xh,String[] cj)throws Exception{
		conn co =new conn();
		DruidPooledConnection conn = co.retconn();
		QueryRunner qr = new QueryRunner();
		int j = 0;
		String bm = qr.query(conn, "select biaoming from kcinfo where kcdm?",new ScalarHandler<String>(),kcdm);
		for(String i:cj) {
			qr.update(conn,"update "+bm+" set cj=? where xh=?",i,xh[j]);
			j=j+1;
		}
	}
	
}
