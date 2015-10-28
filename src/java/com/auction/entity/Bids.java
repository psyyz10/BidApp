/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * This class is the class of Bids entity in database
 */
public class Bids {
    private int bidId;
    private int userId;
    private int listingId;
    private double bidAmount;
    private double maximumBid;
    private String bidTime;
    private boolean won;
    private boolean paid;
    
    public boolean isWon(){
        return won;
    }
    
    public boolean isPaid(){
        return paid;
    }
    
    public int getBidId(){
        return bidId;
    }
    
    public int getUserId(){
        return userId;
    }
    
    public int getListingId(){
        return listingId;
    }
    
    public double getBidAmount(){
        return bidAmount;
    }
    
    public double getMaximumBid(){
        return maximumBid;
    }
    
    public String getBidTime(){
        return bidTime;
    }
    
    public void setBidId(int bidId){
        this.bidId = bidId;
    }
    
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    public void setListingId(int listingId){
        this.listingId = listingId;
    }
    
    public void setBidAmount(double bidAmount){
        this.bidAmount = bidAmount;
    }
    
    public void setMaximumBid(double maximumBid){
        this.maximumBid = maximumBid;
    }
    
    public void setBidTime(String bidTime){
        this.bidTime = bidTime;
    }
    
    public void setWon(boolean won){
        this.won = won;
    }
    
    public void setPaid(boolean paid){
        this.paid = paid;
    }
}
