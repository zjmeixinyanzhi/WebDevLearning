﻿package com.zjsoft.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

@WebServlet("/IdentityServlet")
public class IdentityServlet extends HttpServlet {
	/**
	 * 图片验证码程序
	 */
	private static final long serialVersionUID = -479885884254942306L;

	private String checkCode;
	public static final char[] CHARS = { '2', '3', '4', '5', '6', '7', '8',
			'9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
			'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static Random random = new Random();

	public static String getRandomString() {
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			buffer.append(CHARS[random.nextInt(CHARS.length)]);
		}
		return buffer.toString();
	}

	public static Color getRandomColor() {
		return new Color(random.nextInt(255), random.nextInt(255), random
				.nextInt(255));
	}

	public static Color getReverseColor(Color c) {
		return new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c
				.getBlue());
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	
		response.setContentType("image/jpeg");

		String randomString = getRandomString();
		request.getSession(true).setAttribute("randomString", randomString);
		this.checkCode=randomString;

		int width = 100;
		int height = 30;
		
		
		Color color = getRandomColor();
		Color reverse = getReverseColor(color);

		BufferedImage bi = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = bi.createGraphics();
		g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
		g.setColor(color);
		g.fillRect(0, 0, width, height);
		g.setColor(reverse);
		g.drawString(randomString, 18, 20);
		System.out.println(new Date()+":"+randomString);
		for (int i = 0, n = random.nextInt(100); i < n; i++) {
			g.drawRect(random.nextInt(width), random.nextInt(height), 1, 1);
		}

		// 转成JPEG格式
		ServletOutputStream out = response.getOutputStream();		
		ImageIO.write(bi, "jpg", out);
		
		 
		 //JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
		//encoder.encode(bi);
		out.flush();
	}
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub		
		System.out.println("Do Post!");
		
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		// 设置文档类型
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		// 输出到客户端浏览器
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
		out.println("<HEAD><TITLE>验证结果</TITLE></HEAD>");
		out.println("  <BODY>");		
		out.println("");
		// 取浏览器提交的 name 参数
		String userInputCheckCode=request.getParameter("param");
		System.out.println(userInputCheckCode);

		if(userInputCheckCode== null ||!this.checkCode.equalsIgnoreCase(userInputCheckCode)){
			out.println("验证码校验失败！您输入验证为：<b>" +userInputCheckCode+ "</b>，正确验证码为："+this.checkCode);
		}
		else {
			out.println("验证码校验成功！");
		}		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
		
		
	}

	public static void main(String[] args) {
		System.out.println(getRandomString());
	}
}
