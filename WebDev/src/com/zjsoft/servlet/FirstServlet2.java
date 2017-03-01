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
			
			// ���ʸ� Servlet �� URI
			String requestURI = request.getRequestURI();
			// ���ʸ� Servlet �ķ�ʽ���� GET ���� POST
			String method = request.getMethod();
			// �ͻ����ύ�Ĳ��� param ֵ
			String param = request.getParameter("param");
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY>");
			out.println("	�� " + method + " ��ʽ���ʸ�ҳ�档ȡ���� param ����Ϊ��" + param + "<br/>");
			
			out.println("	<form action='" + requestURI + "' method='get'><input type='text' name='param' value=''><input type='submit' value='�� GET ��ʽ���� RequestServlet'></form>");
			out.println("	<form action='" + requestURI + "' method='post'><input type='text' name='param' value=''><input type='submit' value='�� POST ��ʽ���� RequestServlet'></form>");
			
			// �ɿͻ����������ȡ���ĵ��ĸ���ʱ��
			out.println("	<script>document.write('��ҳ��������ʱ�䣺' + document.lastModified + '<br />'); </script>");
			out.println("	<script>document.write('��ҳ��URL��' + location + '<br/>' ); </script>");
			
			out.println("  </BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
			
		}

}
