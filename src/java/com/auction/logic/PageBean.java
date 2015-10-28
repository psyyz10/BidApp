package com.auction.logic;

import java.util.HashMap;

/**
 *
 * @author gp12-mvr2 group
 */

public class PageBean {
	private PageBean()
	{
	}
        
	public static int[] getPage(int currentpage,int pagecount)
	{
		int[] i=new int[2];
		int star=1;
		int end=5;
		if(currentpage>5)
		{
			star=(currentpage/5)*5;
			int p=pagecount-star;
			end=p/5==0?star+p:star+5;
		}
		if(currentpage%5==0)
		{
			star=currentpage;
			int p=pagecount-star;
			end=p/5==0?star+p:star+5;
		}
		if(pagecount<=5)
		{
			end=pagecount;
		}
		i[0]=star;
		i[1]=end;
		return i;
	}
}
