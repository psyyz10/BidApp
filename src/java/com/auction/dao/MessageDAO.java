/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.db.DbManager;
import com.auction.entity.Message;
import com.auction.factory.IDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */

public class MessageDAO implements IDAO{
    
    //Save new row to the Listing table
    public <T> int save(T obj) {
        Message message = (Message)obj;
        String sql = "insert into Message ("
                + "SenderID, ReceiverID, MessageContent, TimeSent)"
                + "values("
                + message.getSenderId() + ","
                + message.getReceiverId() + ", '"
                + message.getMessageContent() + "','"
                + message.getTimeSent() + " ');";
        return update(sql);
    }
    
    // Query message with ceratin user id
    public List<Message> queryByUserid(int userid){
        String sql = "select * from Message where senderid = " + userid +
                " or receiverid = " + userid  + " group by senderid, receiverid order by MessageID DESC;";
        return query(sql);
    }
    
    // Query message with page number and two user id
    public List<Message> queryPageByUserid(int page, int user1id, int user2id){
        page=(page-1)*10;
        String sql="select * from Message where (senderid = " + user1id +
                " and receiverid = " + user2id + ") or (senderid = " + user2id +
                " and receiverid = " + user1id + ") order by MessageID DESC limit " + page + ", 10;";
        return query(sql);
    }
    
    // Query a message list with tow user list
    public List<Message> queryMessageByUserid(int user1id, int user2id){
        String sql="select * from Message where ( senderid = " + user1id +
                " and receiverid = " + user2id + ") or (senderid = " + user2id +
                " and receiverid = " + user1id + ");";
        return query(sql);
    }
    
    // Query all messages 
    public List<Message> queryAllMessage(){
        String sql="select * from Message";
        return query(sql);
    }
    
    // Convert queary a Message table to a list of message 
    private List<Message> query(String sql)
    {
        DbManager db=new DbManager();
        List<Message> list=new ArrayList<Message>();
        ResultSet rs=null;
        rs=db.getRs(sql);
        
        try {
            while(rs.next())
            {
                Message message = new Message();
                message.setMid(rs.getInt("MessageID"));
                message.setSenderId(rs.getInt("SenderID"));
                message.setReceiverId(rs.getInt("ReceiverID"));
                message.setMessageContent(rs.getString("MessageContent"));
                message.setTimeSent(rs.getString("TimeSent"));
                
                list.add(message);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
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
