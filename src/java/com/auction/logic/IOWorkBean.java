package com.auction.logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author gp12-mvr2 group
 */

public class IOWorkBean {
	public String writeImage(String servicepath,String clientpath)
	{
		servicepath+="\\"+getName(clientpath);
		File cfile=new File(clientpath);
		File sfile=new File(servicepath);
		
		try {
			FileInputStream in=new FileInputStream(cfile);
			FileOutputStream out=new FileOutputStream(sfile);
			
			byte[] b=new byte[1000];
			
			int i=in.read(b);
			while(i!=-1)
			{
				out.write(b);
				i=in.read(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return servicepath;
	}
	private String getName(String clientpath)
	{       System.out.println(clientpath);
		String endcode=clientpath.substring(clientpath.lastIndexOf("."),clientpath.length());
		String name="";
		Random r=new Random();
		for(int i=0;i<8;i++)
		{
			name+=String.valueOf(r.nextInt(10));
		}
		return name+endcode;
	}
}
