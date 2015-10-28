package com.auction.logic;

import com.auction.dao.UserinfoDAO;
import com.auction.entity.Userinfo;

/**
 *
 * @author gp12-mvr2 group
 */

public class LoginBean {
	private UserinfoDAO udao;
        
	public LoginBean()
	{
		udao=new UserinfoDAO();
	}
	public boolean isUser(String username,String userpwd)
	{
		boolean falg=false;
		Userinfo user=udao.queryUserinfoByUsername(username);
		if(userpwd.equalsIgnoreCase(user.getUserpwd()))
		{
			falg=true;
		}
		return falg;
	}
        
	public Userinfo getUserinfoByUsername(String username)
	{
		return udao.queryUserinfoByUsername(username);
	}
}
