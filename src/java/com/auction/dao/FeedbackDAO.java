/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.db.DbManager;
import com.auction.entity.Feedback;
import com.auction.entity.Listing;
import com.auction.factory.IDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */

public class FeedbackDAO implements IDAO{
    public int delete(Integer id) {
        String sql = "";
        return update(sql);
    }
    
    //Save new row to the Bids Feedback table
    public <T> int save(T obj) {
        Feedback feedback = (Feedback)obj;
        String sql = "insert into Feedback ("
                + "SenderID, ReceiverID, ListingID, "
                + "FeedbackScore, AddedComments, TimeSent) "
                + "values("
                + feedback.getSenderId() + ", "
                + feedback.getReceiverId() + ", "
                + feedback.getListingId() + ", "
                + feedback.getFeedbackScore() + ", '"
                + feedback.getComments() + "', '"
                + feedback.getTimeSent() + "');";
        return update(sql);
    }
    
    // Delete a feedback from Feedbacks entity table
    public int del(int feedbackId)
    {
        String sql="delete from Feedback where Feedbackid='"
                +feedbackId+"';";
        return update(sql);
    }
    
    // Query the number of feedbacks with certain revceiver id and feedback score
    public int queryNumberOfScoreByReceiverId(int receiverId, int score){
        String sql = "select * from Feedback where ReceiverID =" + receiverId + " and " + "FeedbackScore = " + score + ";";
        return query(sql).size();
    }
    
    // Query feedbacks with certain receiver id
    public List<Feedback> queryFeedbackByReceiverId(Integer receiverID)
    {
        String sql="select * from Feedback where ReceiverID ="+receiverID+";";
        return query(sql);
    }
    
    // Convert queary a Feedback table to a list of Feedback
    private List<Feedback> query(String sql)
    {
        DbManager db=new DbManager();
        ResultSet rs=null;
        List<Feedback> list=new ArrayList<Feedback>();
        rs = db.getRs(sql);
        try {
            while(rs.next())
            {
                Feedback feedback = new Feedback();
                feedback.setComments(rs.getString("AddedComments"));
                feedback.setFeedbackId(rs.getInt("FeedbackID"));
                feedback.setFeedbackScore(rs.getInt("FeedbackScore"));
                feedback.setListingId(rs.getInt("ListingID"));
                feedback.setReceiverId(rs.getInt("ReceiverId"));
                feedback.setSenderId(rs.getInt("SenderId"));
                feedback.setTimeSent(rs.getString("TimeSent"));
                
                list.add(feedback);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
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
