package com.auction.db;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author gp12-mvr2 group
 */

public class DbManager {
	private Connection con;

	private Statement stat;

	private ResultSet rs;

	public DbManager() {
		con = DBAccess.getCon();
	}

        // Use a sql statement to get a result set
	public ResultSet getRs(String sql) {
		try {
			stat = con.createStatement();
			rs = stat.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

        // update the database with certain sql statement
	public int updb(String sql) {
		int count = 0;
		try {
			stat = con.createStatement();
			count = stat.executeUpdate(sql);
                        destory();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

        // Close the connection
	public void destory() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
