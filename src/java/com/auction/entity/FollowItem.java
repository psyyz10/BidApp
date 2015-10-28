/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * 
 * This class is the class of FollowItem entity in database
 */

public class FollowItem {
    private int userId;
    private int listingId;
    
    public int getUserId(){
        return userId;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    public int getListingId(){
        return listingId;
    }
    
    public void setListingId(int listingId){
        this.listingId = listingId;
    }
    
}
