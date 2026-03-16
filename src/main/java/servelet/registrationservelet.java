package servelet;





import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbconnections.jdbcconection;
import hungerbirdsmodels.registration;
import service.registrationservice;
@WebServlet("/register")
public class registrationservelet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String firstname=req.getParameter("firstname");	
	String lastname=req.getParameter("lastname");
	String username=req.getParameter("username");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	String confirmpassword=req.getParameter("confirmpassword");
	registration s=new registration(0, firstname,lastname, username, email, password, confirmpassword);
	registrationservice service=new registrationservice(jdbcconection.getconnection());
			boolean f=service.insertion(s);
			
			if(f) {
				resp.sendRedirect("wellcome.jsp");
				
			}
			else {
				resp.sendRedirect("register.jsp");
			}
	}
	
	

}