package js;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.loginserviceimpl;

/**
 * Servlet implementation class cjlr
 */
@WebServlet("/cjlr")
public class cjlr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cjlr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] cj = request.getParameterValues("cj");
		String[] xh = request.getParameterValues("xh");
		String kcdm = request.getParameter("kcdm");
		loginserviceimpl ls = new loginserviceimpl();
		try {
			ls.cjlr(kcdm, xh, cj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
