package com.auction.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.auction.db.DbManager;
import com.auction.entity.Type;
import com.auction.factory.IDAO;

/**
 *
 * @author gp12-mvr2 group
 * 
 */

public class TypeDAO implements IDAO {
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T> int merge(T obj) {
		// TODO Auto-generated method stub
		return 0;
	}

        // Save a type to database
	public <T> int save(T obj) {
		Type objType=(Type)obj;
		String sql="insert into Category(Category)values('"
			+objType.getTypename()+"')";
		return update(sql);
	}
        
        // query a type by tid
	public Type queryTypeByTid(Integer tid)
	{
		String sql="select * from Category where Categoryid="+tid+";";
		return query(sql).get(0);
	}
        
        // Query a type by type name
	public Type queryTypeByTypename(String typename)
	{
		String sql="select * from Category where Category= '"+typename+"';";
		return query(sql).get(0);
	}
        
	public List<Type> queryAllType()
	{
		String sql="select * from Category;";
		return query(sql);
	}
	
        // Query a list of type by sql string
	private List<Type> query(String sql)
	{
		DbManager db=new DbManager();
		List<Type> list=new ArrayList<Type>();
		ResultSet rs=db.getRs(sql);
		try {
			while(rs.next())
			{
				Type objType=new Type();
				objType.setTid(rs.getInt("Categoryid"));
				objType.setTypename(rs.getString("Category"));
				list.add(objType);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
            db.destory();
        }
		return list;
	} 
        
	private int update(String sql)
	{
		DbManager db=new DbManager();
		return db.updb(sql);
	}
}
