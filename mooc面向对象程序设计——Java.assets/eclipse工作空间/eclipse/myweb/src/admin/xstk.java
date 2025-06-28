package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.uesr;
import service.loginserviceimpl;


@WebServlet("/xstk")
public class xstk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public xstk() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kcdm = request.getParameter("kcdm");
		uesr us = (uesr)request.getSession().getAttribute("user");
		String num = us.getNum();
		loginserviceimpl ls = new loginserviceimpl();
		try {
			ls.xstk(num, kcdm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/myweb/selexkinfo");
	}

	

}
