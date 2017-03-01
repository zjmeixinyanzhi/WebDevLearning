package com.zjsoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet2
 */
//@WebServlet("/FirstServlet2")
@WebServlet(name="exampleServlet", urlPatterns="/servlet/example")
public class FirstServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.execute(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	private void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

			response.setCharacterEncoding("UTF-8");
			request.setCharacterEncoding("UTF-8");
			
			// 访问该 Servlet 的 URI
			String requestURI = request.getRequestURI();
			// 访问该 Servlet 的方式，是 GET 还是 POST
			String method = request.getMethod();
			// 客户端提交的参数 param 值
			String param = request.getParameter("param");
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY>");
			out.println("	以 " + method + " 方式访问该页面。取到的 param 参数为：" + param + "<br/>");
			
			out.println("	<form action='" + requestURI + "' method='get'><input type='text' name='param' value=''><input type='submit' value='以 GET 方式访问 RequestServlet'></form>");
			out.println("	<form action='" + requestURI + "' method='post'><input type='text' name='param' value=''><input type='submit' value='以 POST 方式访问 RequestServlet'></form>");
			
			// 由客户端浏览器读取该文档的更新时间
			out.println("	<script>document.write('本页面最后更新时间：' + document.lastModified + '<br />'); </script>");
			out.println("	<script>document.write('本页面URL：' + location + '<br/>' ); </script>");
			
			out.println("  </BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
			
		}

}
