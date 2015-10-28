/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.dao.FollowItemDAO;
import com.auction.entity.FollowItem;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */
public class FollowItemBean {
    private FollowItemDAO fdao;
    
    public FollowItemBean()
    {
        fdao = new FollowItemDAO();
    }
    
    public List<FollowItem> queryFollowsByUserId(Integer userId){
        return fdao.queryFollowsByUserId(userId);
    }
    
    //Save new row to the Bids Follows table
    public <T> int save(T obj) {
        return fdao.save(obj);
    }
    
    // Delete a feedback from Feedbacks entity table with certain user id and listing id
    public int del(int userId, int listingId){
        return fdao.del(userId, listingId);
    }
}
