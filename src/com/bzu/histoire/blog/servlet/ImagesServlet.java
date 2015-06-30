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
import com.bzu.histoire.blog.server.impl.BackgroundImagesServerImpl;
import com.bzu.histoire.blog.server.impl.BackgroundMemberServerImpl;
import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Images;
import com.bzu.histoire.blog.pojo.Member;

@WebServlet(name="ImagesServlet",urlPatterns={"/web/Background/pages/ImagesServlet"})
public class ImagesServlet extends HttpServlet {

	private List<Images> acrticlelist;
	private BackgroundImagesServerImpl bapi;
	private String strHTML = null;
	private String strMethod = null;
	private PrintWriter out=null; 
	
	private Images images;
	private String strId = null;
	private String strTitle = null;
	private String strPath = null;
	private String strContent = null;
	
	private String strReturn = null;
	
	/**
	 * Constructor of the object.
	 */
	public ImagesServlet() {
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

		System.out.println("-----This is ImagesServlet.java-----");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		out = response.getWriter();
		strMethod=request.getParameter("method");
		bapi = new BackgroundImagesServerImpl();
		
		strId=request.getParameter("id");
		strTitle=request.getParameter("title");
		strPath=request.getParameter("path");
		strContent=request.getParameter("content");
		
		switch (strMethod) {
		
		case "select":
			acrticlelist = null;
			acrticlelist = bapi.BackgroundImagesServer();
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
				for (Images m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getTitle()+"</td>";
					strHTML+="<td>"+m.getPath()+"</td>";
					strHTML+="<td>"+m.getContent()+"</td>";
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
			images = new Images();
			images.setId(Integer.valueOf(strId));
			images.setTitle(strTitle);
			images.setPath(strPath);
			images.setContent(strContent);
			strReturn = bapi.BackgroundImagesServerInsert(images);
			out.print(strReturn);
			strReturn=null;
			break;

		case "delect":
			images = new Images();
			images.setId(Integer.valueOf(strId));
			images.setTitle(strTitle);
			images.setPath(strPath);
			images.setContent(strContent);
			strReturn = bapi.BackgroundImagesServerDelect(images);
			out.print(strReturn);
			strReturn=null;
			break;


		case "updata":
			images = new Images();
			images.setId(Integer.valueOf(strId));
			images.setTitle(strTitle);
			images.setPath(strPath);
			images.setContent(strContent);
			strReturn = bapi.BackgroundImagesServerupdata(images);
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
