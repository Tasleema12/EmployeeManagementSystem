package ServletA1.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.EmployeeDao;
import dto.Employee;
@WebServlet("/id")
public class Fetchbyid extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		
		Employee e=new Employee();
		
		
		EmployeeDao dao=new EmployeeDao();
		Object o=dao.fetchbyid(cid);
		res.getWriter().print(o);
		
		
		// TODO Auto-generated method stub
		
	}

}
