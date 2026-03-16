package servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.jdbcconection;
import hungerbirdsmodels.cardsmodel;
import service.cardsservice;

@WebServlet("/cards")
public class cardsservelet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String src=req.getParameter("src");
		String alt=req.getParameter("alt");
		String title=req.getParameter("title");
		String descripition=req.getParameter("descripition");
				
		String priceStr = req.getParameter("price");
		int price = 0;

		if(priceStr != null && !priceStr.isEmpty()){
		    price = Integer.parseInt(priceStr);
		}
		String button1=req.getParameter("button1");
		String button2=req.getParameter("button2");
		
		cardsmodel c= new  cardsmodel(0, src, alt, title, descripition, price, button1, button2);
		cardsservice service=new cardsservice(jdbcconection.getconnection() ); 
		boolean f=service.addcarddetails(c);
				if(f) {
					resp.sendRedirect("cards.jsp");
				}
				else {
					resp.sendRedirect("cards.jsp");
				}
	}

}
