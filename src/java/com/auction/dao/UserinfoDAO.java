package com.auction.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.auction.db.DbManager;
import com.auction.entity.Userinfo;
import com.auction.factory.IDAO;

/**
 *
 * @author gp12-mvr2 group
 * 
 */

public class UserinfoDAO implements IDAO {
	public int delete(Integer id) {
		String sql = "";
		return update(sql);
	}

        
        //save the list to the databse
	public <T> int save(T obj) {
		Userinfo user=(Userinfo)obj;
		String sql = "insert into User ("
                        + "UserName,IsAdmin,isBanned, PassWord, UserScore, FirstName, "
                        + "LastName, ProfilePicture, EmailAddress, HouseNumber"
                        + ", StreetName, Postcode, City, County, Country, MemberSince)"
                        + "values('"
                        + user.getUsername() + "',"
                        + user.isAmin() + ","
                        + user.isBanned() + ",'"
                        + user.getUserpwd() + "',"
                        + user.getUserscore() + ",'"
                        + user.getFistName() + "','"
                        + user.getLastName() + "','"
                        + user.getPhotoPath() + "','"
			+ user.getUseremail() + "',"
			+ user.getHouseNumber() + ",'"
			+ user.getStreetName() + "','"
			+ user.getPostcode() + "','"
                        + user.getCity() + "','"
                        + user.getCounty() + "','"
                        + user.getCountry() + "','"
                        + user.getMemberSince() + "');";
		return update(sql);
	}

	public <T> int merge(T obj) {
		String sql="";
		return update(sql);
	}
	public int del(int userid)
	{
		String sql="delete user where userid='"
			+userid+"'";
		return update(sql);
	}
	public int merge(String colname,String val,Integer userid)
	{
		String sql="update User set "+colname+"= "+val+" where userid="+userid+";";
		return update(sql);
	}
	
	public Userinfo queryUserinfoByUserid(Integer userid)
	{
		String sql="select * from User where userid="+userid+"";
		return query(sql).get(0);
	}
//	public List<Userinfo> queryUserinfoByPhotoid(Integer photoid)
//	{
//		String sql="select * from User where photoid="+photoid+"";
//		return query(sql);
//	}
	public Userinfo queryUserinfoByUsername(String username)
	{
		String sql="select * from User where username ='"+username+"'";
                
                if(query(sql) == null){
                    return null;
                }
		if(query(sql).size()<=0)
		{
			return null;
		}
		return query(sql).get(0);
	}
//	public List<Userinfo> queryUserinfoByUsername(String username)
//	{
//		String sql="select * from User where username like '%"+username+"%'";
//		return query(sql);
//	}
	
//	public List<Userinfo> queryUserinfoByUserunid(String userunid)
//	{
//		String sql="select * from User where userunid="+userunid+"";
//		return query(sql);
//	}
	public List<Userinfo> queryUserinfoByUseremail(String useremail)
	{
		String sql="select * from User where useremail='"+useremail+"'";
		return query(sql);
	}
//	public List<Userinfo> queryUserinfoByuserAddress(String useraddress)
//	{
//		String sql="select * from User where useraddress like '%"+useraddress+"%'";
//		return query(sql);
//	}
	
	public List<Userinfo> queryUserinfoByUserscore(Integer userscore)
	{
		String sql="select * from User where userscore="+userscore+"";
		return query(sql);
	}

	public List<Userinfo> queryAllUserinfo()
	{
		String sql="select * from User";
		return query(sql);
	}
	private List<Userinfo> query(String sql)
	{
		DbManager db=new DbManager();
		ResultSet rs=null;
		List<Userinfo> list=new ArrayList<Userinfo>();
		rs = db.getRs(sql);
		try {
			while(rs.next())
			{
				Userinfo user=new Userinfo();
				user.setUserid(rs.getInt("UserID"));
                                user.setUsername(rs.getString("UserName"));
                                user.setUserpwd(rs.getString("PassWord"));
                                user.setUserscore(rs.getInt("UserScore"));
                                user.setFirstName(rs.getString("FirstName"));
                                user.setLastName(rs.getString("LastName"));
                                user.setPhotoPath(rs.getString("ProfilePicture"));
				user.setUseremail(rs.getString("EmailAddress"));
                                user.setHouseNumber(rs.getInt("HouseNumber"));
				user.setStreetName(rs.getString("StreetName"));
                                user.setPostcode(rs.getString("Postcode"));
                                user.setCity(rs.getString("City"));
                                user.setCounty(rs.getString("County"));
                                user.setCountry(rs.getString("Country"));
                                user.setMemberSince(rs.getString("MemberSince"));
                                user.setAmin(rs.getBoolean("IsAdmin"));
                                user.setBanned(rs.getBoolean("isBanned"));
				list.add(user);
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
