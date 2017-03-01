package com.zjsoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置 request，response 编码方式
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		// 设置文档类型
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				
		System.out.print("Do Get!");
		// 输出到客户端浏览器
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
		out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		String requestURI = request.getRequestURI();
		out.println("<form action='" + requestURI + "' method='post'>");
		out.println("请输入您的名字：<input type='text' name='name' />");
		out.println("<input type='submit' />");
		out.println("</form>");
		out.println("");
		// 取浏览器提交的 name 参数
		String name = request.getParameter("name");
		
		// 如果 name 不为空且长度大于 0
		if(name != null && name.trim().length() > 0){
			out.println("您好, <b>" + name + "</b>. 欢迎来到 Java Web 世界. ");
		}
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
		
		
	}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
