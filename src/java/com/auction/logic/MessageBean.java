/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;
import com.auction.dao.MessageDAO;
import com.auction.entity.Message;
import java.util.List;
/**
 *
 * @author gp12-mvr2 group
 */

public class MessageBean {
    private MessageDAO mdao;
    
    public MessageBean(){
        mdao = new MessageDAO();
    }
    
    //Save new row to the Listing tables
    public <T> int save(T obj){
        return mdao.save(obj);
    }
    
    // Query message with ceratin user id
    public List<Message> queryByUserid(int userid){
        return mdao.queryByUserid(userid);
    }
    
    // Query message with page number and two user id
    public List<Message> queryPageByUserid(int page, int user1id, int user2id){
        return mdao.queryPageByUserid(page, user1id, user2id);
    }
    
    // Query all messages 
    public List<Message> queryAllMessage(){
        return mdao.queryAllMessage();
    }
    
    // Query a message list with tow user list
    public int getPage(int user1id, int user2id){
        int rowcount = mdao.queryMessageByUserid(user1id, user2id).size();
        return (rowcount%10==0)?rowcount/10:rowcount/10+1;
    }
}
