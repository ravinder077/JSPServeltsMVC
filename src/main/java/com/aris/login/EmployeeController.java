package com.aris.login;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aris.dao.LoginDAOImpl;
import com.aris.model.EmployeeModel;

public class EmployeeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LoginDAOImpl dao=new LoginDAOImpl();
		List<EmployeeModel> list =dao.getAllUser();
		System.out.println(list);
		req.setAttribute("employeList", list);
		RequestDispatcher rd=req.getRequestDispatcher("employeelist.jsp");
		rd.forward(req, resp);
	}

}
