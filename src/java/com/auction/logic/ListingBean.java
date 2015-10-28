/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;
import com.auction.dao.Listing_DAO;
import com.auction.entity.Listing;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */

public class ListingBean {
    private Listing_DAO ldao;
    
    public ListingBean()
    {
        ldao = new Listing_DAO();
    }
    
    public Listing queryListingByListingid(Integer listingid){
        return ldao.queryListingByListingid(listingid);
    }
    
    // Query listings with the same user id
    public List<Listing> queryListingByUserid(Integer userid){
        return ldao.queryListingByUserid(userid);
    }
    
    // Query all listings
    public List<Listing> queryAllListing(){
        return ldao.queryAllListing();
    }
    
    // Query a lisitng list with certain liting title and category
    public List<Listing> queryListingByListingidAndTypeid(String listingTitle,Integer tid){
        return ldao.queryListingByListingTitleAndTypeid(listingTitle, tid);
    }
    
    // Query a listing with certain listing title
    public List<Listing> queryListingByListingTitle(String listingTitle){
        return ldao.queryListingByListingTitle(listingTitle);
    }
    
    // Query a list of listings with specific page number, listing title, category and filter
    public List<Listing> queryPageByListingTitleAndTypeid(int page, String listingTitle, int tid, int filter){
        return ldao.queryPageByListingTitleAndTypeid(page, listingTitle, tid, filter);
    }
    
    // Query a list of listings with specific page number, listing title and filter
    public List<Listing> queryListingByListingTitle(int page, String listingTitle, int filter){
        return ldao.queryListingByListingTitle(page, listingTitle, filter);
    }
    
    // Query a listing list with certain sender id and receiver ids from Bids table
    public List<Listing> queryListingByBids(int senderId, int receiverId){
        return ldao.queryListingByBids(senderId, receiverId);
    }
    
    //Save new row to the Listing table
    public <T> int save(T obj){
        return ldao.save(obj);
    }
    
    // Delete a feedback from Feedbacks entity table with certainlisting id
    public int del(int listingid){
        return ldao.del(listingid);
    }
    
    // Get how many page for a listing
    public int getPage(List<Listing> listinglist){
        int rowcount = listinglist.size();
        return (rowcount%10==0)?rowcount/10:rowcount/10+1;
    }
}
