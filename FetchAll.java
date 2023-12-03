package ServletA1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;
@WebServlet("/fa")
public class FetchAll extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 EmployeeDao dao=new EmployeeDao();
	 List<Employee> list=dao.fetchall();
	 resp.getWriter().print(list);
	 
	 req.setAttribute("objects", list);
	 
	 RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
	 rd.forward(req, resp);
}
}
