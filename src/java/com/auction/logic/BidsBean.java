/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.dao.BidsDAO;
import com.auction.entity.Bids;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */
public class BidsBean {
    BidsDAO bdao;
    
    public BidsBean(){
        bdao = new BidsDAO();
    }
    
    // Update bidAmout attribute in the a bid with certain bidId
    public int updateBidAmount(int bidId, double bidAmount){
        return bdao.updateBidAmount(bidId, bidAmount);
    }
    
    // Query all the bids from the Bids entity table with certain userId
    public List<Bids> queryBidsByUserid(Integer userid){
        return bdao.queryBidsByUserid(userid);
    }
    
    // Query the all bid with ceratin listing id
    public List<Bids> queryBidsByListingid(Integer listingId){
        return bdao.queryBidsByListingid(listingId);
    }    
    
    // Query the all bid with ceratin bids id
    public Bids queryBidsByBidid(Integer Bidid){
        return bdao.queryBidsByBidid(Bidid);
    }
    
    // Query the highest bidAount bid with ceratin listing id
    public Bids queryListingByHighestPrices(int listingId){
        return bdao.queryBidsByHighestPrices(listingId);
    }
    
    // Update won attribute in the a bid with certain bidId
    public int updateBidWon(int bidId, boolean won){
        return bdao.updateBidWon(bidId, won);
    }
    
    // Query all the bids from the Bids entity table with certain userId and won the bid
    public List<Bids> queryBidsByUseridAndWon(Integer userid){
        return bdao.queryBidsByUseridAndWon(userid);
    }
    
    //Save new row to the Bids entity table
    public <T> int save(T obj){
        return bdao.save(obj);
    }
    
    // Delete a bid from Bids entity table
    public int del(int bidid){
        return bdao.del(bidid);
    }
}
