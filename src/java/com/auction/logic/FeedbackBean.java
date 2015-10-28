/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.dao.FeedbackDAO;
import com.auction.entity.Feedback;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */
public class FeedbackBean {
    FeedbackDAO fdao  = new FeedbackDAO();
    
    // Query the number of feedbacks with certain revceiver id and feedback score
    public int queryNumberOfScoreByReceiverId(int receiverId, int score){
        return fdao.queryNumberOfScoreByReceiverId(receiverId, score);
    }
    
    // Query feedbacks with certain receiver id
     public List<Feedback> queryListingByReceiverId(Integer receiverId){
         return fdao.queryFeedbackByReceiverId(receiverId);
     }
     
     //Save new row to the Bids Feedback table
     public <T> int save(T obj) {
         return fdao.save(obj);
     }
}
