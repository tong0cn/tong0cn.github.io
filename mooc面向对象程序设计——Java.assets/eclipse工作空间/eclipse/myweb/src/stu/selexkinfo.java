package stu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.uesr;
import service.loginserviceimpl;

/**
 * Servlet implementation class selexkinfo
 */
@WebServlet("/selexkinfo")
public class selexkinfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private loginserviceimpl ls;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selexkinfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uesr a = (uesr)request.getSession().getAttribute("user");
		loginserviceimpl ls=new loginserviceimpl();
		
		List list=null;
		try {
			list = ls.selexkinfo(a.getNum());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("xklist",list);
		response.sendRedirect("/myweb/xs/xk.jsp");
	}

	

}
