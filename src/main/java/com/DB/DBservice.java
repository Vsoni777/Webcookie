package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.Dao.User;

public class DBservice {
	
	Connection con=null;
	public DBservice(){
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vivek1","vivek","Vi_soni777@&");
		}catch(Exception e) {
			
		}
	}
	
	
	public boolean check(User log)
	{
		boolean isValid=false;
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from login where username = ? and password = ?");

			ps.setString(1, log.getUser());
			ps.setString(2, log.getPass());
			ResultSet rs = ps.executeQuery();
			if(rs.next()==true)
			{
				isValid=true;
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return isValid;
	}
}
