package ServletA1.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.EmployeeDao;
import dto.Employee;

@WebServlet("/pc")
public class deleteid extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("first");
		System.out.println(id);
	    int cid=Integer.parseInt(id);
	
//		
////		Employee e=new Employee();
////
		EmployeeDao dao = new EmployeeDao();
		dao.deleteid(cid);
//		
		List<Employee> list=dao.fetchall();
		req.setAttribute("objects", list);
//		
//		
	    RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
	    rd.forward(req, res);
		

	}

}
