package ServletA1.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import dto.Employee;
@WebServlet("/update")
public class Update extends HttpServlet {

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String empid = req.getParameter("id");
	String empname = req.getParameter("name");
	String empemail = req.getParameter("email");
	String emppwd = req.getParameter("password");
	String empdob = req.getParameter("dob");
	String empgender = req.getParameter("gender");
	
	Employee employee=new Employee();
	employee.setName(empname);
	int cid=Integer.parseInt(empid);
	employee.setId(cid);
	employee.setEmail(empemail);
	employee.setPwd(emppwd);
	employee.setDate(empdob);
	employee.setGender(empgender);
	System.out.println(employee);
	
	EmployeeDao employeeDao=new EmployeeDao();
	employeeDao.update(employee);
	
	resp.getWriter().print("Successfully Updated");
}

}
