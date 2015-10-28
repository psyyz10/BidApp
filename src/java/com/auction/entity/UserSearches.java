/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * 
 * This class is the class of UserSearches entity in database
 */

public class UserSearches {
    private int searchId;
    private int userId;
    private String searchText;
    private String time;
    
    public int getSearchId(){
        return searchId;
    }
    
    public int getUserId(){
        return userId;
    }
    
    public String getSearchText(){
        return searchText;
    }
    
    public String getTime(){
        return time;
    }
    
    public void setSearch(int searchId){
        this.searchId = searchId;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    public void setSearchText(String searchText){
        this.searchText = searchText;
    }
    
    public void setTime(String time){
        this.time = time;
    }
}
