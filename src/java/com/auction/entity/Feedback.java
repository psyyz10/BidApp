/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * 
 * This class is the class of feedback entity in database
 */

public class Feedback {
    private int  feedbackId;
    private int senderId;
    private int listingId;
    private int receiverId;
    private int feedbackScore;
    private String comments;
    private String timeSent;
    
    public int getFeedbackId(){
        return feedbackId;
    }
    
    public int getSenderId(){
        return senderId;
    }
    
    public int getReceiverId(){
        return receiverId;
    }
    
    public int getFeedbackScore(){
        return feedbackScore;
    }
    
    public String getComments(){
        return comments;
    }
    
    public String getTimeSent(){
        return timeSent;
    }
    
    public int getListingId(){
        return listingId;
    }
    
    public void setFeedbackId(int feedbackId){
        this.feedbackId = feedbackId;
    }
    
    public void setSenderId(int senderId){
        this.senderId = senderId;
    }
    
    public void setReceiverId(int receiverId){
        this.receiverId = receiverId;
    }
    
    public void setListingId(int listingId){
        this.listingId = listingId;
    }
    
    public void setFeedbackScore(int feedbackScore){
        this.feedbackScore = feedbackScore;
    }
    
    public void setComments(String comments){
        this.comments = comments;
    }
    
    public void setTimeSent(String timeSent){
        this.timeSent = timeSent;
    }
}
