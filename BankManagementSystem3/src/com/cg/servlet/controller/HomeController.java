package com.cg.servlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import com.cg.bean.bank.BankBean;
import com.cg.service.bank.BankServiceImpl;
import com.cg.service.bank.IBankService;


@WebServlet("*.obj")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String target=null;
		
		BankBean bean=new BankBean();
		IBankService service=new BankServiceImpl();
		String path=request.getServletPath();
		System.out.println(path);
		switch(path)
		{
		case "/insert.obj":
			target="NewCustomer.html";
			RequestDispatcher rd=request.getRequestDispatcher(target);
			rd.forward(request, response);
			break;
			
			
		case "/details.obj":
		String customerName=request.getParameter("custName");
		String phone=request.getParameter("phoneNo");
		String password=request.getParameter("pwd");
		String reenterPassword=request.getParameter("rpwd");	
		bean.setCustomerName(customerName);	
		bean.setPhoneNo(phone);
		bean.setPassword(password);
		bean.setReenterPassword(reenterPassword);
		int res=service.insertDetails(bean);
		if(res==1){
			target="Success.html";
		}
		else
		{
			target="Error.html";
		}
		break;
		}
		RequestDispatcher rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
		
		
		}
	}



