package service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import hungerbirdsmodels.registration;



public class registrationservice {
	public Connection conn;

	public registrationservice(Connection conn) {
		super();
		this.conn = conn;
	}
  public boolean insertion(registration r) {
	  boolean f=false;
	  try {
		  String sql="insert into registration(firstname,lastname,username,email,password,conformpassword)values(?,?,?,?,?,?)";
		PreparedStatement pmst=conn.prepareStatement(sql);
		
		 
		       
		        pmst.setString(1, r.getFirstname());
		        pmst.setString(2, r.getLastame());
		        pmst.setString(3, r.getUsername());
		        pmst.setString(4, r.getEmail());
		        pmst.setString(5, r.getPasword());
		        pmst.setString(6, r.getConfirmpassword());

		        int j=pmst.executeUpdate();
		if (j==1) {
			f=true;
		}
	} catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	  return f;
	  
  }
}