package com.bzu.histoire.blog.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bzu.histoire.blog.server.impl.BackgroundAcrticlePublishImpl;
import com.bzu.histoire.blog.server.impl.BackgroundMemberServerImpl;
import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Member;

@WebServlet(name="MemberServlet",urlPatterns={"/web/Background/pages/MemberServlet"})
public class MemberServlet extends HttpServlet {

	private List<Member> acrticlelist;
	private BackgroundMemberServerImpl bapi;
	private String strHTML = null;
	private String strMethod = null;
	private PrintWriter out=null; 
	
	private Member member;
	private String strId = null;
	private String strName = null;
	private String strPass = null;
	
	private String strReturn = null;
	
	
	/**
	 * Constructor of the object.
	 */
	public MemberServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("-----This is PublishServlet.java-----");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		out = response.getWriter();
		strMethod = request.getParameter("method");
		bapi = new BackgroundMemberServerImpl();
		
		strId=request.getParameter("id");
		strName=request.getParameter("name");
		strPass=request.getParameter("pass");
		
		switch (strMethod) {
		case "select":
			acrticlelist = null;
			acrticlelist = bapi.BackgroundMemberServer();
//			for (Acrticle m : acrticlelist) {
//				System.out.println(m.getId());
//			}
			if (acrticlelist.size()>0) {
//				strHTML="<div class='dataTable_wrapper'>";
//				strHTML+="<table class='table table-striped table-bordered table-hover' id='dataTables-example'>";
//				strHTML+="<thead>";
//				strHTML+="<tr>";                            
//				strHTML+="<th>Actricle Id</th>";
//				strHTML+="<th>Actricle Title</th>";
//				strHTML+="<th>Actricle Path</th>";
//				strHTML+="<th>Actricle Type</th>"; 
//				strHTML+="<th>Actricle Add Tiem</th>";
//				strHTML+="</tr>";
//				strHTML+="</thead>";
//				strHTML+="<tbody>";
				for (Member m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getUsername()+"</td>";
					strHTML+="<td>"+m.getPassword()+"</td>";
					strHTML+="</tr>";
				}
//				strHTML+="</tbody>";
//				strHTML+="</table>";
//				strHTML+="</div>";
				out.print(strHTML);
				System.out.println(strHTML);
//				response.getWriter().print(strHTML);
				strHTML = null;
			}
			else {
				out.println("No data");
			}
			break;

		case "insert":
			member = new Member();
			member.setId(Integer.valueOf(strId));
			member.setUsername(strName);
			member.setPassword(strPass);
			strReturn = bapi.BackgroundMemberServerInsert(member);
			out.print(strReturn);
			strReturn=null;
			break;

		case "delect":
			member = new Member();
			member.setId(Integer.valueOf(strId));
			member.setUsername(strName);
			member.setPassword(strPass);
			strReturn = bapi.BackgroundMemberServerDelect(member);
			out.print(strReturn);
			strReturn=null;
			break;

		case "updata":
			member = new Member();
			member.setId(Integer.valueOf(strId));
			member.setUsername(strName);
			member.setPassword(strPass);
			strReturn = bapi.BackgroundMemberServerUpdata(member);
			out.print(strReturn);
			strReturn=null;
			break;

		default:
			break;
		}
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
