package com.abc.servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ThirdServlet extends HttpServlet
{

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
			response.setContentType("text/html");
			
			PrintWriter out=response.getWriter();

			out.println("<html><head><title>HttpServlet</title></head><body>");
			out.println("<h1 style='color:red; text-align:center;'>HttpServlet Execution</h1>");
			out.println("</body></html>");
			out.close();

	}
	
}
