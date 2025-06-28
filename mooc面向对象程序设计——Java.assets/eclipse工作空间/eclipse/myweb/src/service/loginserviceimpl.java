package service;

import java.util.List;

import bean.stu;
import bean.uesr;
import dao.logindaoimpl;

public class loginserviceimpl implements loginserviceinte {
	public uesr uselogin(String num,String pass)throws Exception {
		logindaoimpl usedao = new logindaoimpl();
		uesr use = usedao.sele(num, pass);
		return use;
	}
	
	
	public String selename(String num)throws Exception {
		logindaoimpl usedao = new logindaoimpl();
		String name= usedao.selename(num);
		return name;
	}
	
	public stu seleone(String num)throws Exception {
		logindaoimpl ls = new logindaoimpl();
		 stu list = ls.seleone(num);
		return list;
	} 
	public void formatuser()throws Exception {
		logindaoimpl ls = new logindaoimpl();
		ls.formatuser();;
		
	} 
	public List selestuall()throws Exception {
		logindaoimpl ls = new logindaoimpl();
		List list = ls.selestuall();
		return list;
	}
	
	public void updatestu(String x1,String x2,String x3,String x4,String x5,String x6)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		ls.updatestu(x1, x2, x3, x4, x5, x6);
	}
	
	public void delestusele(String[] num)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		ls.delestusele(num);
	}
	public void delestuone(String num)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		ls.delestuone(num);
	}
	public List selexkinfo(String num)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		List list = ls.selexkinfo(num);
		return list;
	}
	public void xsxk(String num,String kcdm)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		ls.xsxk(num, kcdm);
	}
	
	public void xstk(String num,String kcdm)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		ls.xstk(num, kcdm);
	}
	public List selexjskc(String num)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		List list = ls.selexjskc(num);
		return list;
	}
	public List selecjb(String bm)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		List list = ls.selecjb(bm);
		return list;
	}
	public void cjlr(String kcdm,String[] xh,String[] cj)throws Exception{
		logindaoimpl ls = new logindaoimpl();
		ls.cjlr(kcdm, xh, cj);
	}
}
