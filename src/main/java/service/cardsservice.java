package service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import hungerbirdsmodels.cardsmodel;

public class cardsservice {
public Connection con;

public cardsservice(Connection con) {
	super();
	this.con = con;
}
//code for insertion
public boolean addcarddetails(cardsmodel c){
	boolean f=false;
	try {
		String sql="insert into cards(src,alt,title,descripition,price,button1,button2) values(?,?,?,?,?,?,?)";
		PreparedStatement pmst=con.prepareStatement(sql);
		pmst.setString(1, c.getSrc());
		pmst.setString(2, c.getAlt());
		pmst.setString(3, c.getTitle());
		pmst.setString(4, c.getDescripition());
		pmst.setInt(5, c.getPrice());
		pmst.setString(6, c.getButton1());
		pmst.setString(7, c.getButton2());
		int i=pmst.executeUpdate();
		if(i>0) {
			f=true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
	
}
//code for getting data
public java.util.List<cardsmodel> grtallcarddetails(){
	java.util.List<cardsmodel>ll=new ArrayList<cardsmodel>();
	cardsmodel c=null;
	try {
		String sql="select * from cards";
		PreparedStatement pmst=con.prepareStatement(sql);
		ResultSet rs=pmst.executeQuery();
		while(rs.next()) {
			c=new cardsmodel();
					c.setSrc(rs.getString(1));
					c.setAlt(rs.getString(2));
					c.setTitle(rs.getString(3));
					c.setDescripition(rs.getString(4));
					c.setPrice(rs.getInt(5));
					c.setButton1(rs.getString(6));
					c.setButton2(rs.getString(7));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return ll;
}
//code for deletion
public boolean deletecards(int id) {
	boolean f=false;
	try {
		String sr="delete from cards where id=?";
		PreparedStatement pmst=con.prepareStatement(sr);
		pmst.setInt(1,id);
		int i=pmst.executeUpdate();
		if(i>0) {
			f=true;
		}
		} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}

public void singlecarddetail(int id) {
	cardsmodel c=null;
	try {
		String sql="select * from cards where id=?";
		PreparedStatement pmst=con.prepareStatement(sql);
		ResultSet rs=pmst.executeQuery();
		while(rs.next()) {
			c=new cardsmodel();
					c.setSrc(rs.getString(1));
					c.setAlt(rs.getString(2));
					c.setTitle(rs.getString(3));
					c.setDescripition(rs.getString(4));
					c.setPrice(rs.getInt(5));
					c.setButton1(rs.getString(6));
					c.setButton2(rs.getString(7));
		}
		
		
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
}
public boolean update(cardsmodel c,int id) {
	boolean f=false;
	try {
		String sql="update cards set src=?,alt=?,title=?,descripition=?,price=?,button1=?,button2=? where id=?";
		PreparedStatement pmst=con.prepareStatement(sql);
		pmst.setString(1, c.getSrc());
		pmst.setString(2, c.getAlt());
		pmst.setString(3, c.getTitle());
		pmst.setString(4, c.getDescripition());
		pmst.setInt(5, c.getPrice());
		pmst.setString(6, c.getButton1());
		pmst.setString(7, c.getButton2());
		pmst.setInt(8, id);
		int i=pmst.executeUpdate();
		if(i>0) {
			f=true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}
}
