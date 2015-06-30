package com.bzu.histoire.blog.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bzu.histoire.blog.server.impl.ForegroundAcrticleBlogServerImpl;
import com.bzu.histoire.blog.server.impl.ForegroundAcrticleClassicalServerImpl;
import com.bzu.histoire.blog.server.impl.ForegroundAcrticleHistoryServerImpl;
import com.bzu.histoire.blog.server.impl.ForegroundAcrticleOpinionServerImpl;
import com.bzu.histoire.blog.server.impl.ForegroundAcrticleProjectServerImpl;
import com.bzu.histoire.blog.pojo.Acrticle;

@WebServlet(name="ForegroundAcrticleServlet",urlPatterns={"/web/Foreground/acrticle/ForegroundAcrticleServlet"})
public class ForegroundAcrticleServlet extends HttpServlet {

	private List<Acrticle> acrticlelist;
	private ForegroundAcrticleBlogServerImpl ACRTIICLE_BLOG_SERVER;
	private ForegroundAcrticleOpinionServerImpl ACRTIICLE_OPINION_SERVER;
	private ForegroundAcrticleProjectServerImpl ACRTIICLE_PROJECT_SERVER;
	private ForegroundAcrticleClassicalServerImpl ACRTIICLE_CLASSICAL_SERVER;
	private ForegroundAcrticleHistoryServerImpl ACRTIICLE_HISTORY_SERVER;
	private String strHTML = null;
	private String strMethod;
	private PrintWriter out=null; 
	
	/**
	 * Constructor of the object.
	 */
	public ForegroundAcrticleServlet() {
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
		System.out.println("-----This is ForegroundAcrticleServlet.java-----");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		out = response.getWriter();
		strMethod=request.getParameter("method");
		
		acrticlelist = null;
		switch (strMethod) {
		case "blog":
			ACRTIICLE_BLOG_SERVER = new ForegroundAcrticleBlogServerImpl();
			acrticlelist = ACRTIICLE_BLOG_SERVER.ForegroundAcrticleBlogServer();
			if (acrticlelist.size()>0) {
				for (Acrticle m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getTitle()+"</td>";
					strHTML+="<td>"+m.getPath()+"</td>";
					strHTML+="<td>"+m.getAcrticletype()+"</td>";
					strHTML+="<td>"+m.getAddTime()+"</td>";
					strHTML+="</tr>";
				}
				out.print(strHTML);
				System.out.println(strHTML);
//				response.getWriter().print(strHTML);
				strHTML = null;
			}
			else {
				out.println("No data");
			}
			break;
		case "opinion":
			ACRTIICLE_OPINION_SERVER = new ForegroundAcrticleOpinionServerImpl();
			acrticlelist = ACRTIICLE_OPINION_SERVER.ForegroundAcrticleOpinionServer();
			if (acrticlelist.size()>0) {
				for (Acrticle m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getTitle()+"</td>";
					strHTML+="<td>"+m.getPath()+"</td>";
					strHTML+="<td>"+m.getAcrticletype()+"</td>";
					strHTML+="<td>"+m.getAddTime()+"</td>";
					strHTML+="</tr>";
				}
				out.print(strHTML);
				System.out.println(strHTML);
//				response.getWriter().print(strHTML);
				strHTML = null;
			}
			else {
				out.println("No data");
			}
			break;
		case "project":
			ACRTIICLE_PROJECT_SERVER = new ForegroundAcrticleProjectServerImpl();
			acrticlelist = ACRTIICLE_PROJECT_SERVER.ForegroundAcrticleProjectServer();
			if (acrticlelist.size()>0) {
				for (Acrticle m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getTitle()+"</td>";
					strHTML+="<td>"+m.getPath()+"</td>";
					strHTML+="<td>"+m.getAcrticletype()+"</td>";
					strHTML+="<td>"+m.getAddTime()+"</td>";
					strHTML+="</tr>";
				}
				out.print(strHTML);
				System.out.println(strHTML);
//				response.getWriter().print(strHTML);
				strHTML = null;
			}
			else {
				out.println("No data");
			}
			break;
		case "classical":
			ACRTIICLE_CLASSICAL_SERVER = new ForegroundAcrticleClassicalServerImpl();
			acrticlelist = ACRTIICLE_CLASSICAL_SERVER.ForegroundAcrticleClassicalServer();
			if (acrticlelist.size()>0) {
				for (Acrticle m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getTitle()+"</td>";
					strHTML+="<td>"+m.getPath()+"</td>";
					strHTML+="<td>"+m.getAcrticletype()+"</td>";
					strHTML+="<td>"+m.getAddTime()+"</td>";
					strHTML+="</tr>";
				}
				out.print(strHTML);
				System.out.println(strHTML);
//				response.getWriter().print(strHTML);
				strHTML = null;
			}
			else {
				out.println("No data");
			}
			break;
		case "history":
			ACRTIICLE_HISTORY_SERVER = new ForegroundAcrticleHistoryServerImpl();
			acrticlelist = ACRTIICLE_HISTORY_SERVER.ForegroundAcrticleHistoryServer();
			if (acrticlelist.size()>0) {
				for (Acrticle m : acrticlelist) {
					strHTML+="<tr class='odd gradeA'>";
					strHTML+="<td>"+m.getId()+"</td>";
					strHTML+="<td>"+m.getTitle()+"</td>";
					strHTML+="<td>"+m.getPath()+"</td>";
					strHTML+="<td>"+m.getAcrticletype()+"</td>";
					strHTML+="<td>"+m.getAddTime()+"</td>";
					strHTML+="</tr>";
				}
				out.print(strHTML);
				System.out.println(strHTML);
//				response.getWriter().print(strHTML);
				strHTML = null;
			}
			else {
				out.println("No data");
			}
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
