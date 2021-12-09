package com.aris.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {
	
	private  Connection con;
	public Connection getConnection()
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			 con=DriverManager.getConnection(StringConstant.url,StringConstant.username,StringConstant.password);
 
			}catch(Exception e){ 
				
				System.out.println(e);
			
			}  
		
		return con;
	}
	
	public void closeConnection()
	{
		try
		{
		this.con.close();
		}
		catch(Exception e)
		{
			
		}
	}
	
	
	

}
