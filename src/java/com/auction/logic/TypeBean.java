package com.auction.logic;

import java.util.ArrayList;

import com.auction.dao.TypeDAO;
import com.auction.entity.Type;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */

public class TypeBean {
	private TypeDAO tdao;
        
	public TypeBean()
	{
		tdao=new TypeDAO();
	}
        
        // query all types
	public ArrayList queryAllType()
	{
		return (ArrayList)tdao.queryAllType();
	}
        
        
        // Save the type the database
	public void save(Type type)
	{
		tdao.save(type);
	}
        
        // Query the type name
        public Type queryTypeByTypename(String typename){
            return tdao.queryTypeByTypename(typename);
        }
        
        // Query the type by tid
        public Type queryTypeByTid(Integer tid){
            return tdao.queryTypeByTid(tid);
        }
}
