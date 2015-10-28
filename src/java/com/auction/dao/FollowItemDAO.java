/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.db.DbManager;
import com.auction.entity.Feedback;
import com.auction.entity.FollowItem;
import com.auction.factory.IDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */

public class FollowItemDAO implements IDAO{
    public int delete(Integer id) {
        String sql = "";
        return update(sql);
    }
    
    //Save new row to the Bids Follows table
    public <T> int save(T obj) {
        FollowItem followItem = (FollowItem)obj;
        String sql = "insert into Follows ("
                + "UserID, ListingID) "
                + "values("
                + followItem.getUserId() + ","
                + followItem.getListingId() + ");";
        return update(sql);
    }
    
    // Delete a feedback from Feedbacks entity table with certain user id and listing id
    public int del(int userId, int listingId)
    {
        String sql="delete from Follows where userId=" 
                +userId+ " and listingid = " + listingId +  ";";
        return update(sql);
    }
    
    // Query follows with certain user id
    public List<FollowItem> queryFollowsByUserId(Integer userId)
    {
        String sql="select * from Follows where userid ="+ userId + ";";
        return query(sql);
    }
    
    // Convert queary a Feedback table to a list of Feedback
    private List<FollowItem> query(String sql)
    {
        DbManager db=new DbManager();
        ResultSet rs=null;
        List<FollowItem> list=new ArrayList<FollowItem>();
        rs = db.getRs(sql);
        try {
            while(rs.next())
            {
                FollowItem followItem = new FollowItem();
                followItem.setUserId(rs.getInt("UserID"));
                followItem.setListingId(rs.getInt("ListingID"));
                
                list.add(followItem);
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
