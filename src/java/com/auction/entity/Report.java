/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * 
 * This class is the class of Report entity in database
 */


public class Report {
    private int  reportId;
    private int senderId;
    private int receiverId;
    private String comments;
    private String timeSent;
    
    public String getTimeSent(){
        return timeSent;
    }
    
    public void setTimeSent(String timeSent){
        this.timeSent = timeSent;
    }
    
    public int getReportId(){
        return reportId;
    }
    
    public int getSenderId(){
        return senderId;
    }
    
    public int getReceiverId(){
        return receiverId;
    }
    
    public String getComments(){
        return comments;
    }
    
    public void setReportId(int reportId){
        this.reportId = reportId;
    }
    
    public void setSenderId(int senderId){
        this.senderId = senderId;
    }
    
    public void setReceiverId(int receiverId){
        this.receiverId = receiverId;
    }
    
    public void setComments(String comments){
        this.comments = comments;
    }
}
