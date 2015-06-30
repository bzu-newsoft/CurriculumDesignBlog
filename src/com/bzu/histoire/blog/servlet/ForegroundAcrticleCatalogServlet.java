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

@WebServlet(name="ForegroundAcrticleCatalogServlet",urlPatterns={"/web/Foreground/acrticle/ForegroundAcrticleCatalogServlet"})
public class ForegroundAcrticleCatalogServlet extends HttpServlet {

	private List<Acrticle> acrticlelist;
	private ForegroundAcrticleBlogServerImpl ACRTIICLE_BLOG_SERVER;
	private ForegroundAcrticleOpinionServerImpl ACRTIICLE_OPINION_SERVER;
	private ForegroundAcrticleProjectServerImpl ACRTIICLE_PROJECT_SERVER;
	private ForegroundAcrticleClassicalServerImpl ACRTIICLE_CLASSICAL_SERVER;
	private ForegroundAcrticleHistoryServerImpl ACRTIICLE_HISTORY_SERVER;
	private String strHTML = "";
	private String strMethod;
	private PrintWriter out=null; 
	
	/**
	 * Constructor of the object.
	 */
	public ForegroundAcrticleCatalogServlet() {
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

		System.out.println("-----This is ForegroundAcrticleCatalogServlet.java-----");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		out = response.getWriter();
		strMethod=request.getParameter("method");
		
		//----------------This is Acrticle of Blog---------------
		acrticlelist = null;
		ACRTIICLE_BLOG_SERVER = new ForegroundAcrticleBlogServerImpl();
		acrticlelist = ACRTIICLE_BLOG_SERVER.ForegroundAcrticleBlogServer();
		strHTML+="<h1 class='entry-title'>";
		strHTML+="Blog";
		strHTML+="</h1>";
		if (acrticlelist.size()>0) {
			for (Acrticle m : acrticlelist) {
				strHTML+="<h2 id='hello-worle'>";
				strHTML+="<a href='"+m.getPath()+"' ";
				strHTML+="title='"+m.getTitle()+"'>";
				strHTML+=m.getTitle();
				strHTML+="</a>";
				strHTML+="</h2>";
			}
		}
		else {
				strHTML+="<h2>Blog is null</h2>";
		}
		//----------------This is Acrticle of Opinion---------------
		acrticlelist = null;
		ACRTIICLE_OPINION_SERVER = new ForegroundAcrticleOpinionServerImpl();
		acrticlelist = ACRTIICLE_OPINION_SERVER.ForegroundAcrticleOpinionServer();
		strHTML+="<h1 class='entry-title'>";
		strHTML+="Opinion";
		strHTML+="</h1>";
		if (acrticlelist.size()>0) {
			for (Acrticle m : acrticlelist) {
				strHTML+="<h2 id='hello-worle'>";
				strHTML+="<a href='"+m.getPath()+"' ";
				strHTML+="title='"+m.getTitle()+"'>";
				strHTML+=m.getTitle();
				strHTML+="</a>";
				strHTML+="</h2>";
			}
		}
		else {
			strHTML+="Opinion is null";
		}
		//----------------This is Acrticle of Project---------------
		acrticlelist = null;
		ACRTIICLE_PROJECT_SERVER = new ForegroundAcrticleProjectServerImpl();
		acrticlelist = ACRTIICLE_PROJECT_SERVER.ForegroundAcrticleProjectServer();
		strHTML+="<h1 class='entry-title'>";
		strHTML+="Project";
		strHTML+="</h1>";
		if (acrticlelist.size()>0) {
			for (Acrticle m : acrticlelist) {
				strHTML+="<h2 id='hello-worle'>";
				strHTML+="<a href='"+m.getPath()+"' ";
				strHTML+="title='"+m.getTitle()+"'>";
				strHTML+=m.getTitle();
				strHTML+="</a>";
				strHTML+="</h2>";
			}
		}
		else {
			strHTML+="Project is null";
		}
		
		out.print(strHTML);
		System.out.println(strHTML);
//		response.getWriter().print(strHTML);
		strHTML = null;
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
