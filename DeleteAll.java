package ServletA1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;
@WebServlet("/delete")
public class DeleteAll extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	EmployeeDao dao=new EmployeeDao();
    String  s=dao.deleteall();
    resp.getWriter().print(s);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
