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

import com.bzu.histoire.blog.server.impl.BackgroundAcrticleTypeServerImpl;
import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Acrticletype;

@WebServlet(name="AcrticleTypeServlet",urlPatterns={"/web/Background/pages/AcrticleTypeServlet"})
public class AcrticleTypeServlet extends HttpServlet {

	private List<Acrticletype> acrticlelist;
	private BackgroundAcrticleTypeServerImpl bapi;
	private String strHTML = null;
	private String strMethod = null;
	private PrintWriter out=null; 
	
	private Acrticletype acrticletype;
	private String strId = null;
	private String strTitle = null;
	private String strType = null;
	
	private String strReturn = null;
	
	/**
	 * Constructor of the object.
	 */
	public AcrticleTypeServlet() {
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

		System.out.println("-----This is AcrticleTypeServlet.java-----");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		out = response.getWriter();
		strMethod=request.getParameter("method");
		bapi = new BackgroundAcrticleTypeServerImpl();
		
		strId=request.getParameter("id");
		strTitle=request.getParameter("title");
		strType=request.getParameter("type");

		switch (strMethod) {
		case "select":
			acrticlelist = null;
			acrticlelist = bapi.BackgroundActricleTypeServer();
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
				for (Acrticletype m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getType()+"</td>";
					strHTML+="<td>"+m.getTitle()+"</td>";
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
			acrticletype = new Acrticletype();
			acrticletype.setId(Integer.valueOf(strId));
			acrticletype.setTitle(strTitle);
			acrticletype.setType(strType);
			strReturn = bapi.BackgroundAcrticleTypeServerInsert(acrticletype);
			out.print(strReturn);
			strReturn=null;
			break;
			
		case "delect":
			acrticletype = new Acrticletype();
			acrticletype.setId(Integer.valueOf(strId));
			acrticletype.setTitle(strTitle);
			acrticletype.setType(strType);
			strReturn = bapi.BackgroundAcrticleTypeServerDelect(acrticletype);
			out.print(strReturn);
			strReturn=null;
			break;
			
		case "updata":
			acrticletype = new Acrticletype();
			acrticletype.setId(Integer.valueOf(strId));
			acrticletype.setTitle(strTitle);
			acrticletype.setType(strType);
			strReturn = bapi.BackgroundAcrticleTypeServerUpdata(acrticletype);
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
