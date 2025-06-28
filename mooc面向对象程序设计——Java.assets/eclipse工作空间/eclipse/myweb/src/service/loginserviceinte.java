package service;

import java.util.List;

import bean.stu;
import bean.uesr;

public interface loginserviceinte {
	public uesr uselogin(String num,String pass)throws Exception;
	public String selename(String num)throws Exception;
	public stu seleone(String num)throws Exception;
	public void formatuser()throws Exception;
	public List selestuall()throws Exception;
	public void updatestu(String x1,String x2,String x3,String x4,String x5,String x6)throws Exception;
	public void delestusele(String[] num)throws Exception;
	public void delestuone(String num)throws Exception;
	public List selexkinfo(String num)throws Exception;
	public void xsxk(String num,String kcdm)throws Exception;
	public void xstk(String num,String kcdm)throws Exception;
	public List selexjskc(String num)throws Exception;
	public List selecjb(String bm)throws Exception;
	public void cjlr(String kcdm,String[] xh,String[] cj)throws Exception;
}
