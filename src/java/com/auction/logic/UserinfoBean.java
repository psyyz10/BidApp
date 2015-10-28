package com.auction.logic;

import java.util.ArrayList;
import java.util.List;

import com.auction.dao.UserinfoDAO;
import com.auction.entity.Userinfo;

/**
 *
 * @author gp12-mvr2 group
 */

public class UserinfoBean {
	private UserinfoDAO udao;
        
	public UserinfoBean()
	{
		udao = new UserinfoDAO();
	}
        
        // Query a user by user id
	public Userinfo queryUserinfoByUserid(int userid)
	{
		return udao.queryUserinfoByUserid(userid);
	}

        // Get all users
	public ArrayList getAllUser()
	{
		return (ArrayList)udao.queryAllUserinfo();
	}
        
        // Get the user infomation by username
	public Userinfo getUserinfoByUserName(String username)
	{
		return (Userinfo)udao.queryUserinfoByUsername(username);
	}
        
        // save the user to the da database
        public <T> int save(T obj){
            return udao.save(obj);
        }
        
        // delete a user from a table
	public void del(int userid)
	{
		udao.del(userid);
	}
        
        // Change a attribute value from a user id
        public int merge(String colname,String val,Integer userid){
            return udao.merge(colname, val, userid);
        }
        
	public static void main(String[] args)
	{
		UserinfoBean u=new UserinfoBean();
		System.out.println(u.getAllUser().size());
	}
}
