package com.cg.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.User;
import com.cg.service.ServiceImpl;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet(
		urlPatterns = { "/MainServlet" }, 
		initParams = { 
				@WebInitParam(name = "servlet", value = "active")
		})
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	User u=new User();
	ServiceImpl sr=new ServiceImpl();
	List<String> error= new ArrayList();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		String name=config.getInitParameter("servlet");
		System.out.println("Server is "+ name);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name= request.getParameter("name");
		int age= Integer.parseInt(request.getParameter("age"));
		long contact= Long.parseLong(request.getParameter("contact"));
		if(sr.nameValidate(name) && sr.ageValidate(age) && sr.contactValidate(contact)){
			u.setName(name);
			u.setAge(age);
			u.setContact(contact);
			request.setAttribute("user", u);
			RequestDispatcher rd =request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}
		else{
			error.add("Name field is blank");
			error.add("Age should be positive");
			error.add("Contact pattern invalid");
			request.setAttribute("error", error);
			RequestDispatcher rd =request.getRequestDispatcher("ErrorServlet");
			rd.forward(request, response);
			
		}
	}

}
