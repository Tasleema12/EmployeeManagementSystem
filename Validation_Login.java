package ServletA1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;
@WebServlet("/login")
public class Validation_Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		int frontend_id = Integer.parseInt(id);
		String frontend_pwd = req.getParameter("password");

		EmployeeDao employeeDao = new EmployeeDao();
		Employee e =employeeDao.fetchbyid(frontend_id);
		if (e != null)
		{
			if (frontend_pwd.equals(e.getPwd())) 
			{
				resp.getWriter().print("<h1> Welcome to Home Page</h1>");
			} else 
			{
				resp.getWriter().print("<h1> Please enter proper password</h1>");
			}
		}
		else
		{
			resp.getWriter().print("<h1> Please enter proper id</h1>");
			resp.getWriter().print("<a href= 'register.html'>if no account, click here to signup</a>");
		}

	}
}
