package flyaway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.UserLogin;

@SuppressWarnings("serial")
@WebServlet("/UserLogin")
public class UserLoginflyaway extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		UserLogin user= new UserLogin();
		if(user.check(email, pass)) {
			//out.println("User Logged In Successfully");
			resp.sendRedirect("SearchFlight.jsp");
		}else {
			out.println("<h2 style='color:red;'>INVALID EMAIL OR PASSWORD !</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("UserLogin.jsp");
			rd.include(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}