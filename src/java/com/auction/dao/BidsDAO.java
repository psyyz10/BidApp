/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.db.DbManager;
import com.auction.entity.Bids;
import com.auction.factory.IDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */

public class BidsDAO implements IDAO{
   
    //Save new row to the Bids entity table
    public <T> int save(T obj) {
        Bids bid = (Bids)obj;
        String sql = "insert into Bids ("
                + "userid,listingid,"
                + "bidamount,maximumbid,bidtime, Won, paid) "
                + "values("
                + bid.getUserId() + ","
                + bid.getListingId() + ","
                + bid.getBidAmount() + ","
                + bid.getMaximumBid() + ",'"
                + bid.getBidTime() + "', false, false);";
        return update(sql);
    }
    
    // Delete a bid from Bids entity table
    public int del(int bidid)
    {
        String sql = "delete from Bids where bidid="
                +bidid+";";
        return update(sql);
    }
    
    // Update bidAmout attribute in the a bid with certain bidId
    public int updateBidAmount(int bidId, double bidAmount){
        String sql = "update Bids set bidAmount = " + bidAmount + " where bidid="
                +bidId+";";
        return update(sql);
    }
    
    // Update won attribute in the a bid with certain bidId
    public int updateBidWon(int bidId, boolean won){
        String sql = "update Bids set Won = " + won + " where bidid="
                +bidId+";";
        return update(sql);
    }
            
    // Query all the bids from the Bids entity table with certain userId
    public List<Bids> queryBidsByUserid(Integer userid){
        String sql="select * from Bids where userid ="+userid+";";
        return query(sql);
    }
    
    // Query all the bids from the Bids entity table with certain userId and won the bid
    public List<Bids> queryBidsByUseridAndWon(Integer userid){
        String sql="select * from Bids where userid ="+userid+" and won = true;";
        return query(sql);
    }
    
    // Query the highest bidAount bid with ceratin listing id
    public Bids queryBidsByHighestPrices(int listingId){
        String sql="select * from Bids  where BidAmount = (select Max(BidAmount) from (select * from Bids where listingId = " + listingId + ") as T) ;";
        if (query(sql).size() == 0)
            return null;
        else
            return query(sql).get(0);
    }
    
    // Query the all bid with ceratin listing id
    public List<Bids> queryBidsByListingid(Integer listingId){
        String sql="select * from Bids where listingId ="+ listingId +";";
        return query(sql);
    } 
    
    // Query the all bid with ceratin bids id
    public Bids queryBidsByBidid(Integer Bidid){
        String sql="select * from Bids where Bidid ="+ Bidid +";";
        return query(sql).get(0);
    }
    
    // Convert queary a Bids table to a list of Bids
    private List<Bids> query(String sql)
    {
        DbManager db=new DbManager();
        ResultSet rs=null;
        List<Bids> list=new ArrayList<Bids>();
        rs = db.getRs(sql);
        try {
            while(rs.next())
            {
                Bids bid = new Bids();
                bid.setBidId(rs.getInt("BidId"));
                bid.setUserId(rs.getInt("UserId"));
                bid.setListingId(rs.getInt("ListingId"));
                bid.setBidAmount(rs.getDouble("BidAmount"));
                bid.setMaximumBid(rs.getDouble("MaximumBid"));
                bid.setBidTime(rs.getString("BidTime"));
                bid.setWon(rs.getBoolean("won"));
                bid.setWon(rs.getBoolean("paid"));
                
                list.add(bid);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            db.destory();
        }
        return list;
    }
    
    // Link to the database and do the sql statement
    private int update(String sql)
    {
        DbManager db=new DbManager();
        return db.updb(sql);
    }
}
