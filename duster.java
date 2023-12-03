package ServletA1.controller;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.EmployeeDao;
import dto.Employee;
@WebServlet("/register")
public class duster implements Servlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String empid = req.getParameter("id");
		String empname = req.getParameter("name");
		String empemail = req.getParameter("email");
		String emppwd = req.getParameter("password");
		String empdob = req.getParameter("dob");
		String empgender = req.getParameter("gender");
		String empacc = req.getParameter("check");

		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empemail);
		System.out.println(emppwd);
		System.out.println(empdob);
		System.out.println(empgender);
		System.out.println(empacc);

		Employee employee=new Employee();
		employee.setName(empname);
		int cid=Integer.parseInt(empid);
		employee.setId(cid);
		employee.setEmail(empemail);
		employee.setPwd(emppwd);
		employee.setDate(empdob);
		employee.setGender(empgender);
		employee.setCheck(empacc);
		System.out.println(employee);
		
		EmployeeDao employeeDao=new EmployeeDao();
		employeeDao.insert(employee);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
