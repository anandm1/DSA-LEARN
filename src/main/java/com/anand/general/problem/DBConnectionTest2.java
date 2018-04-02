/**
 * 
 */
package com.anand.general.problem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author U45999
 *
 */
public class DBConnectionTest2 {

	private final static String DB_URL = "jdbc:oracle:thin:@<hostname>:<Port>:<SERVICEID>";
	  private final static String USER = "USERNAME";
	  private final static String PASS = "PWD";

	  public static void main(String[] args) {
	    Connection conn = null;  
	    try {    
	      Class.forName("oracle.jdbc.driver.OracleDriver");    
	      System.out.println("Connecting to database...");    
	      conn = DriverManager.getConnection(DB_URL,USER,PASS); 
	      boolean reachable = conn.isValid(10);// 10 sec
	      System.out.println(reachable);
	    } catch (Exception e) {    
	      e.printStackTrace();    
	    } finally {    
	      if (conn != null) {    
	        try {    
	          conn.close();    
	        } catch (SQLException e) {    
	          // ignore    
	        }    
	      }    
	    }            
	  }    

}
