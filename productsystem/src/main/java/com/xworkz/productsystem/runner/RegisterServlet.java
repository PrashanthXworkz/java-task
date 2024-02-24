package com.xworkz.productsystem.runner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/submit")
public class RegisterServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 
	        
	        
	        String productName = req.getParameter("inputname");
	        System.out.println("name:"+productName);
	        int Quantity= Integer.parseInt(req.getParameter("inputQuantity"));
	        System.out.println("quantity is:"+Quantity);
	        int priceperpiece= Integer.parseInt(req.getParameter("inputPrice"));
	        System.out.println("amount is:"+priceperpiece);
	        
	        double pay=0;
	        if(Quantity==10) {
	        	double discount=Quantity*0.05;
	        	pay=discount*priceperpiece-discount;
	        }else {
	        	pay=priceperpiece*Quantity;
	        }
	        
System.out.println(pay);
	        RequestDispatcher dispatcher=  req.getRequestDispatcher("/service.jsp");
	        req.setAttribute("price", pay);
	        dispatcher.forward(req, res);
	    }
	}



