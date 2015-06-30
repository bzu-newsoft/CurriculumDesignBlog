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
import com.bzu.histoire.blog.server.impl.BackgroundMessagesServerImpl;
import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Message;

@WebServlet(name="MessageServlet",urlPatterns={"/web/Background/pages/MessageServlet"})
public class MessageServlet extends HttpServlet {

	private List<Message> acrticlelist;
	private BackgroundMessagesServerImpl bapi;
	private String strHTML = null;
	private String strMethod = null;
	private PrintWriter out=null; 
	
	
	private Message message;
	private String strId = null;
	private String strContent = null;
	private String strTime = null;
	private String strName = null;
	private String strEmail = null;
	
	private String strReturn = null;
	
	private static java.sql.Date DATATIME=new java.sql.Date(new java.util.Date().getTime());
	private static Timestamp TIMESTAMP = new Timestamp(System.currentTimeMillis());
	
	/**
	 * Constructor of the object.
	 */
	public MessageServlet() {
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

		System.out.println("-----This is MessageServlet.java-----");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		out = response.getWriter();
		strMethod = request.getParameter("method");
		bapi = new BackgroundMessagesServerImpl();

		strId = request.getParameter("Id");
		strContent = request.getParameter("comtent");
		strTime = request.getParameter("time");
		strName = request.getParameter("name");
		strEmail = request.getParameter("email");

		switch (strMethod) {
		case "select":
			acrticlelist = null;
			acrticlelist = bapi.BackgroundMessagesServer();
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
				for (Message m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getContent()+"</td>";
					strHTML+="<td>"+m.getAddTime()+"</td>";
					strHTML+="<td>"+m.getVisitorName()+"</td>";
					strHTML+="<td>"+m.getVistorEmail()+"</td>";
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
			message = new Message();
			message.setId(Integer.valueOf(strId));
			message.setContent(strContent);
			message.setVisitorName(strName);
			message.setVistorEmail(strEmail);
			if(strTime==""){
				message.setAddTime(TIMESTAMP);
			}else{
				message.setAddTime(Timestamp.valueOf(strTime));
			}
			
			strReturn = bapi.BackgroundMessagesServerInsert(message);
			out.print(strReturn);
			strReturn=null;
			break;

		case "delect":
			message = new Message();
			message.setId(Integer.valueOf(strId));
			message.setContent(strContent);
			message.setVisitorName(strName);
			message.setVistorEmail(strEmail);
			if(strTime==""){
				message.setAddTime(TIMESTAMP);
			}else{
				message.setAddTime(Timestamp.valueOf(strTime));
			}
			
			strReturn = bapi.BackgroundMessagesServerDelect(message);
			out.print(strReturn);
			strReturn=null;
			break;


		case "updata":
			message = new Message();
			message.setId(Integer.valueOf(strId));
			message.setContent(strContent);
			message.setVisitorName(strName);
			message.setVistorEmail(strEmail);
			if(strTime==""){
				message.setAddTime(TIMESTAMP);
			}else{
				message.setAddTime(Timestamp.valueOf(strTime));
			}
			
			strReturn = bapi.BackgroundMessagesServerUpdata(message);
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
