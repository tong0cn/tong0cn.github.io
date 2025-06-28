package js;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.loginserviceimpl;

/**
 * Servlet implementation class selecjb
 */
@WebServlet("/selecjb")
public class selecjb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public selecjb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bm = request.getParameter("bm");
		loginserviceimpl ls = new loginserviceimpl();
		List list = null;
		try {
			list = ls.selecjb(bm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("xscj",list);
		response.sendRedirect("/myweb/js/book.jsp");
	}

	

}
