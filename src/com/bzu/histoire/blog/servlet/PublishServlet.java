package com.bzu.histoire.blog.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bzu.histoire.blog.server.impl.BackgroundAcrticlePublishImpl;
import com.bzu.histoire.blog.pojo.Acrticle;

@WebServlet(name="PublishServlet",urlPatterns={"/web/Background/pages/PublishServlet"})
public class PublishServlet extends HttpServlet {
	
	private List<Acrticle> acrticlelist;
	private BackgroundAcrticlePublishImpl bapi;
	private String strHTML = null;
	private String strMethod = null;
	private PrintWriter out = null; 
	
	private Acrticle acrticle;
	private String strId = null;
	private String strTitle = null;
	private String strPath = null;
	private String strType = null;
	private String strTime = null;
	
	private String strReturn = null;
	
	private static java.sql.Date DATATIME=new java.sql.Date(new java.util.Date().getTime());
	private static Timestamp TIMESTAMP = new Timestamp(System.currentTimeMillis());
	
	/**
	 * Constructor of the object.
	 */
	public PublishServlet() {
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
		
		System.out.println("-----This is PublishServlet.java-----");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		out = response.getWriter();
		strMethod=request.getParameter("method");
		bapi = new BackgroundAcrticlePublishImpl();
		System.out.println(strMethod);
		
		strId=request.getParameter("id");
		strTitle=request.getParameter("title");
		strPath=request.getParameter("path");
		strType=request.getParameter("type");
		strTime=request.getParameter("time");
		
		
		switch (strMethod) {
		case "select":
			acrticlelist = null;
			acrticlelist = bapi.BackgroundActriclePublish();
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
				for (Acrticle m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getTitle()+"</td>";
					strHTML+="<td>"+m.getPath()+"</td>";
					strHTML+="<td>"+m.getAcrticletype()+"</td>";
					strHTML+="<td>"+m.getAddTime()+"</td>";
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

			acrticle = new Acrticle();
			acrticle.setId(Integer.valueOf(strId));
			acrticle.setTitle(strTitle);
			acrticle.setPath(strPath);
			acrticle.setAcrticletype(strType);
			if(strTime==""){
				acrticle.setAddTime(TIMESTAMP);
			}else{
				acrticle.setAddTime(Timestamp.valueOf(strTime));
			}
			
			strReturn = bapi.BackgroundAcrticlePublishInsert(acrticle);
			out.print(strReturn);
			strReturn=null;
			break;

		case "delect":
			
			acrticle = new Acrticle();
			acrticle.setId(Integer.valueOf(strId));
			acrticle.setTitle(strTitle);
			acrticle.setPath(strPath);
			acrticle.setAcrticletype(strType);
			if(strTime==""){
				acrticle.setAddTime(TIMESTAMP);
			}else{
				acrticle.setAddTime(Timestamp.valueOf(strTime));
			}
			
			strReturn = bapi.BackgroundAcrticlePublishDelect(acrticle);
			out.print(strReturn);
			strReturn=null;
			break;

		case "updata":
			
			System.out.println(strId + "\n" + strTitle);
			acrticle = new Acrticle();
			acrticle.setId(Integer.valueOf(strId));
			acrticle.setTitle(strTitle);
			acrticle.setPath(strPath);
			acrticle.setAcrticletype(strType);
			if(strTime==""){
				acrticle.setAddTime(TIMESTAMP);
			}else{
				acrticle.setAddTime(Timestamp.valueOf(strTime));
			}
			
			strReturn = bapi.BackgroundAcrticlePublishUpdata(acrticle);
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
	@Override
	public void init() throws ServletException {
		// Put your code here
	}

}
