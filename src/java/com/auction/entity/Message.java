/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * 
 * This class is the class of Message entity in database
 */

public class Message {
    private int mid;
    private int senderId;
    private int receiverId;
    private String messageContent;
    private String timeSent;
    
    public int getMid(){
        return mid;
    }
    
    public int getSenderId(){
        return senderId;
    }
    
    public int getReceiverId(){
        return receiverId;
    }
    
    public String getMessageContent(){
        return messageContent;
    }
    
    public String getTimeSent(){
        return timeSent;
    }
    
    public void setMid(int mid){
        this.mid = mid;
    }
    
    public void setSenderId(int senderId){
       this.senderId = senderId;
    }
    
    public void setReceiverId(int receiverId){
        this.receiverId = receiverId;
    }
    
    public void setMessageContent(String messageContent){
        this.messageContent = messageContent;
    }
    
    public void setTimeSent(String timeSent){
        this.timeSent = timeSent;
    }
}
    
