package com.abdelkhalek.benhoumine.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter() ; 
		out.print("<h1>Authentifcation</h1>");
		out.print("<form method='post' action='hello'>");
		out.print("<input type='text' name='username' placeholder='username'/>");
		out.print("<input type='password' name='password' placeholder='password'/>");
		out.print("<input type='submit' value='connexion'/>");
		out.print("</form>");
		out.close();
	}
	
	protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException{
		String username  = req.getParameter("username"); 
		String password  = req.getParameter("password"); 
		res.setContentType("text/html");
		PrintWriter out = res.getWriter() ; 
		if(username.equals("abdo") && password.equals("123")) {
			out.print("<h1>HOME</h1>");
		}else {
			out.print("<h1>ERROR</h1>");
		}
		out.close();	
	}

}
