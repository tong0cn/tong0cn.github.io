package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.stu;
import service.loginserviceimpl;

/**
 * Servlet implementation class updatestu
 */
@WebServlet("/updatestu")
public class updatestu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatestu() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x1 = request.getParameter("x1");
		String x2 = request.getParameter("x2");
		String x3 = request.getParameter("x3");
		String x4 = request.getParameter("x4");
		String x5 = request.getParameter("x5");
		stu n = (stu)request.getSession().getAttribute("stu");
		String x6 = n.getNum();
		loginserviceimpl ls = new loginserviceimpl();
		try {
			ls.updatestu(x1, x2, x3, x4, x5, x6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
