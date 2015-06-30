package com.bzu.histoire.blog.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bzu.histoire.blog.server.impl.BackgroundMemberLoginImpl;

@WebServlet(name="admin_login",urlPatterns={"/admin_login"})
public class admin_login extends HttpServlet {

	private String stringweb = "";
	private BackgroundMemberLoginImpl bml = null;
	private String adminAccount = "";
	private String adminPassword = "";
	private String stringreturn = "";
	
	/**
	 * Constructor of the object.
	 */
	public admin_login() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	@Override
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		stringweb = request.getParameter("stringweb");
		bml = new BackgroundMemberLoginImpl();
		adminAccount = stringweb.split("~")[0].trim();
		adminPassword = stringweb.split("~")[1].trim();
		stringreturn = bml.BackGroundMemberLogin(adminAccount, adminPassword);
		if(stringreturn.equals("success")){
			response.sendRedirect("http://localhost:8080/Blog0.3.0/web/Background/pages/index.html");
		}else{
			response.sendRedirect("http://localhost:8080/Blog0.3.0/web/Background/pages/login_fail.jsp");
		}
		
		out.flush();
		out.close();
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	@Override
	public void init() throws ServletException {
		// Put your code here
	}

}



