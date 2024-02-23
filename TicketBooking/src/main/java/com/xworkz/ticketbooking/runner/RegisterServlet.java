package com.xworkz.ticketbooking.runner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/Register")
public class RegisterServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 res.setContentType("text/html");
	        
	        PrintWriter writer = res.getWriter();
	        writer.println("<html>");
	        writer.println("<head>");
	        writer.println("<title>Registration Response</title>");
	        writer.println("</head>");
	        writer.println("<body>");

	        
	        String username = req.getParameter("username");
	        String contactNumber = req.getParameter("contactNumber");
	        String email = req.getParameter("email");
	        String alternativeNumber = req.getParameter("alternativeNumber");
	        String time = req.getParameter("time");
	        String amount = req.getParameter("amount");
	        String place = req.getParameter("place");
	        String numberOfPeople = req.getParameter("numberOfPeople");

	     
	        writer.println("<h2>Registration Response</h2>");
	        writer.println("<p>Username: " + username + "</p>");
	        writer.println("<p>Contact Number: " + contactNumber + "</p>");
	        writer.println("<p>Email: " + email + "</p>");
	        writer.println("<p>Alternative Number: " + alternativeNumber + "</p>");
	        writer.println("<p>Time: " + time + "</p>");
	        writer.println("<p>Amount: " + amount + "</p>");
	        writer.println("<p>Place: " + place + "</p>");
	        writer.println("<p>Number of People: " + numberOfPeople + "</p>");

	        writer.println("</body>");
	        writer.println("</html>");
	    }
	}


