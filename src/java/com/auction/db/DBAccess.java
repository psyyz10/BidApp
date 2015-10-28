package com.auction.db;

//package com.jc.taobao.gjj.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gp12-mvr2 group
 */
/* This file is used to access to the database*/
public class DBAccess {
	private static Connection con;

	private DBAccess() {

	}

	public final static Connection getCon() {
		String sql = "jdbc:mysql://mysql.cs.nott.ac.uk/yxz02u";// host name and database name
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(sql, "yxz02u", "grp"); // database user name and password
                        //System.out.println("Database connected");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
