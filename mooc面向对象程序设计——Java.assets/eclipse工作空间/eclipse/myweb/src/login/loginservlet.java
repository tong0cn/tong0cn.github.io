package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.uesr;
import service.loginserviceimpl;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		String usercode = request.getParameter("cc");
		HttpSession sess = request.getSession();
		String syscode = (String)sess.getAttribute("check_code");
		if(usercode.equals(syscode)) {
			loginserviceimpl ls = new loginserviceimpl();
			
			uesr res=null;
			try {
				res = ls.uselogin(name,pass);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(res!=null) {
				uesr user = new uesr();
				user.setNum(res.getNum());
				user.setPass(res.getPass());
				user.setIdentity(res.getIdentity());
				sess.setAttribute("user",user);
				if(user.getIdentity().equals("学生")) {
					String na=null;
					try {
						na = ls.selename(name);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					sess.setAttribute("name",na);
					
					response.sendRedirect("/myweb/xs/xsinfo.jsp");
				}
				if(user.getIdentity().equals("教师")) {


					response.sendRedirect("/myweb/js/xsinfo.jsp");
				}
				if(user.getIdentity().equals("管理员")) {
					response.getWriter().print("登录成功");
					response.getWriter().close();
					response.sendRedirect("/admin/manger.html");
				}
				
			}else {
				response.getWriter().print("用户名或密码错误");
			}
		}else {
			response.getWriter().print("验证码错误");
		}
	}		
}






