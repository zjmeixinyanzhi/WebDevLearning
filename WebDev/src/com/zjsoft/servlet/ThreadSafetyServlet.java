package com.zjsoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ThreadSafetyServlet")
public class ThreadSafetyServlet extends HttpServlet {

	private static final long serialVersionUID = 2957055449370562943L;

	private String name;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		name = request.getParameter("name");

		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
		}
		
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
		out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		out.println("您好, " + name + ". 您使用了 GET 方式提交数据");				
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		name = request.getParameter("name");
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
		out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		out.println("您好, " + name + ". 您使用了 POST 方式提交数据");
				
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();		

	}
}
