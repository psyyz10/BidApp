package com.auction.logic;

import com.auction.dao.UserinfoDAO;
import com.auction.entity.Userinfo;

/**
 *
 * @author gp12-mvr2 group
 */

public class RegisterBean {
	private UserinfoDAO udao;
        
	public RegisterBean()
	{
		udao=new UserinfoDAO();
	}
        
        /* Save the user to the database*/
	public int saveCommonUser(Userinfo user)
	{
		return udao.save(user);
	}
        
        // Check where a string is a username
	public boolean isUser(String username)
	{
		boolean isfalg=false;
		Userinfo user=udao.queryUserinfoByUsername(username);
		if(user!=null)
		{
			isfalg=true;
		}
		return isfalg;
	}
}
