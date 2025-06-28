package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.stu;
import bean.uesr;
import service.loginserviceimpl;

/**
 * Servlet implementation class seleone
 */
@WebServlet("/seleone")
public class seleone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public seleone() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//uesr use = (uesr) request.getSession().getAttribute("user");
		String name = request.getParameter("name");
		loginserviceimpl ls = new loginserviceimpl();
		try {
			stu stu = ls.seleone(name);
			request.getSession().setAttribute("stu",stu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/myweb/admin/list.jsp");
	}

	

}
