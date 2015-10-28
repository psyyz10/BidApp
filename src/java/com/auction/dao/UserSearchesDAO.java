/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.db.DbManager;
import com.auction.entity.Feedback;
import com.auction.entity.UserSearches;
import com.auction.factory.IDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */
public class UserSearchesDAO implements IDAO{
    public int delete(Integer id) {
        String sql = "";
        return update(sql);
    }
    
    // Save a search to database
    public <T> int save(T obj) {
        UserSearches userSearch = (UserSearches)obj;
        String sql = "insert into UserSearches ("
                + "UserID, SearchText, Time) "
                + "values("
                + userSearch.getUserId() + ", '"
                + userSearch.getSearchText() + "', '"
                + userSearch.getTime() + "');";
        return update(sql);
    }
    
    // delete certain feedback from database
    public int del(int feedbackId)
    {
        String sql="delete from UserSearches where Searchid='"
                +feedbackId+"';";
        return update(sql);
    }
    
    // Query some user with his id
    public List<UserSearches> queryByUserId(int userId){
        String sql="select * from UserSearches where UserID =" + userId + ";";
        return query(sql);
    }
    
    // Query the searches list
    private List<UserSearches> query(String sql)
    {
        DbManager db=new DbManager();
        ResultSet rs=null;
        List<UserSearches> list=new ArrayList<UserSearches>();
        rs = db.getRs(sql);
        try {
            while(rs.next())
            {
                UserSearches userSearch = new UserSearches();
                userSearch.setSearch(rs.getInt("SearchID"));
                userSearch.setSearchText(rs.getString("SearchText"));
                userSearch.setTime(rs.getString("Time"));
                userSearch.setUserId(rs.getInt("UserId"));        
                
                list.add(userSearch);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
    
    private int update(String sql)
    {
        DbManager db=new DbManager();
        return db.updb(sql);
    }
}
