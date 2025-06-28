package js;

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
 * Servlet implementation class selejskc
 */
@WebServlet("/selejskc")
public class selejskc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selejskc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uesr us = (uesr)request.getSession().getAttribute("user");
		String jsgh = us.getNum();
		loginserviceimpl ls = new loginserviceimpl();
		
		List list = null;
		try {
			ls.selexjskc(jsgh);
			list = ls.selexjskc(jsgh);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getSession().setAttribute("jskc", list);
		response.sendRedirect("/myweb/js/list.jsp");
	}


	}


