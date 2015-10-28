/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 */

public class Listing {
    private int lId;
    private int userId;
    private int tid;
    private String listingTitle;
    private double startPrice;
    private double postagePrice;
    private String description;
    private String startTime;
    private String endTime;
    private String imagePath;
    
    public int getId(){
        return lId;
    }
    
    public int getTypeId(){
        return tid;
    }
    
    public int getUserId(){
        return userId;
    }
    
    public String getListingTitle(){
        return listingTitle;
    }
    
    public double getPostagePrice(){
        return postagePrice;
    }
    
    public double getStartPrice(){
        return startPrice;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getStartTime(){
        return startTime;
    }
    
    public String getEndTime(){
        return endTime;
    }
    
    public String getImagePath(){
        return imagePath;
    }
    
    public void setId(int lId){
        this.lId = lId;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    public void setTypeId(int tid){
        this.tid = tid;
    }
    
    public void setListingTitle(String listingTitle){
        this.listingTitle = listingTitle;
    }
    
    public void setPostagePrice(double postagePrice){
        this.postagePrice = postagePrice;
    }
    
    public void setStartPrice(double startPrice){
        this.startPrice = startPrice;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setStartTime(String startTime){
        this.startTime = startTime;
    }
    
    public void setEndTime(String endTime){
        this.endTime = endTime;
    }
    
    public void setImagePath(String imagePath){
        this.imagePath = imagePath;
    }
}
