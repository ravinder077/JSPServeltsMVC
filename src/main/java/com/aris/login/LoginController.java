package com.aris.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aris.dao.LoginDAOImpl;
import com.aris.model.LoginDetailsModel;

public class LoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		LoginDetailsModel model=new LoginDetailsModel(username,password);
		
		LoginDAOImpl dao=new LoginDAOImpl();
		if(dao.checkForAuth(model))
		{
			//send the userdetails --username ,addesss,
			 
			 RequestDispatcher rd=req.getRequestDispatcher("welcome.jsp");
			 rd.forward(req, resp);	
		}
		else
		{
			req.setAttribute("msg","Username and password is incorrect");
			RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
			 rd.forward(req, resp);	
		}
		
		
	}

}
