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
import com.bzu.histoire.blog.server.impl.ForegroundAcrticlePhtotgraphyServerImpl;
import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Images;

@WebServlet(name="ForegroundImagesCatalogServlet",urlPatterns={"/web/Foreground/acrticle/ForegroundImagesCatalogServlet"})
public class ForegroundImagesCatalogServlet extends HttpServlet {

	private List<Images> acrticlelist;
	private ForegroundAcrticlePhtotgraphyServerImpl ACRTIICLE_PHOTOGRAPHY_SERVER;
	private String strHTML = null;
	private String strMethod;
	private PrintWriter out=null; 
	
	/**
	 * Constructor of the object.
	 */
	public ForegroundImagesCatalogServlet() {
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

		System.out.println("-----This is ForegroundImagesCatalogServlet.java-----");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		out = response.getWriter();
		strMethod=request.getParameter("method");
		
		acrticlelist = null;
		ACRTIICLE_PHOTOGRAPHY_SERVER = new ForegroundAcrticlePhtotgraphyServerImpl();
		acrticlelist = ACRTIICLE_PHOTOGRAPHY_SERVER.ForegroundAcrticlePhotographyServer();
		if (acrticlelist.size()>0) {
			for (Images m : acrticlelist) {
				strHTML+="<tr class='odd gradeA'>";
				strHTML+="<td>"+m.getId()+"</td>";
				strHTML+="<td>"+m.getTitle()+"</td>";
				strHTML+="<td>"+m.getPath()+"</td>";
				strHTML+="</tr>";
			}
			out.print(strHTML);
			System.out.println(strHTML);
//			response.getWriter().print(strHTML);
			strHTML = null;
		}
		else {
			out.println("No data");
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
