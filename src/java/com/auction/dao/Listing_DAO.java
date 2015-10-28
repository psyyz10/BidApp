/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.db.DbManager;
import com.auction.entity.Listing;
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

public class Listing_DAO implements IDAO{
    
    public int delete(Integer id) {
        String sql = "";
        return update(sql);
    }
    
    //Save new row to the Listing table
    public <T> int save(T obj) {
        Listing listing = (Listing)obj;
        String sql = "insert into Listing ("
                + "Category, SellerID, ImagePath, ListingTitle, "
                + "StartPrice, PostagePrice, Description, StartTime"
                + ", EndTime) "
                + "values("
                + listing.getTypeId() + ","
                + listing.getUserId() + ",'"
                + listing.getImagePath() + "','"
                + listing.getListingTitle() + "',"
                + listing.getStartPrice() + ","
                + listing.getPostagePrice() + ",'"
                + listing.getDescription() + "','"
                + listing.getStartTime() + "','"
                + listing.getEndTime() + "');";
        return update(sql);
    }
    
    // Delete a feedback from Feedbacks entity table with certainlisting id
    public int del(int listingid)
    {
        String sql="delete listing where listingid='"
                +listingid+"';";
        return update(sql);
    }
    
    // Query all listings
    public List<Listing> queryAllListing()
    {
        String sql="select * from Listing";
        return query(sql);
    }
    
    // Query listings with the same user id
    public List<Listing> queryListingByUserid(Integer userid)
    {
        String sql="select * from Listing where SellerID ="+userid+";";
        return query(sql);
    }
    
    // Query a lisitng list with certain liting title and category
    public List<Listing> queryListingByListingTitleAndTypeid(String listingTitle,Integer tid)
    {
        String sql="select * from Listing where ListingTitle like "+ "'%" +listingTitle +"%'" + " and Category ="+tid+";";
        return query(sql);
    }
    
    // Query a listing list with certain sender id and receiver ids from Bids table
    public List<Listing> queryListingByBids(int senderId, int receiverId)
    {
        String sql="SELECT * FROM Bids a JOIN Listing b ON a.listingid = b.listingid where (SellerID = " + senderId + 
                " and userId = " + receiverId + ") or (SellerID = " + receiverId + 
                " and userId = " + senderId + ");";
        return query(sql);
    }
    
    
    // Query a listing with certain listing title
    public List<Listing> queryListingByListingTitle(String listingTitle)
    {
        String sql="select * from Listing where ListingTitle like "+ "'%" +listingTitle +"%'" +";";
        return query(sql);
    }
    
    // Query a listing withe cetatin listing id.
    public Listing queryListingByListingid(Integer listingid)
    {
        String sql="select * from Listing where ListingID ="+ listingid +";";
        return query(sql).get(0);
    }
    
    // Query a list of listings with specific page number, listing title, category and filter
    public List<Listing> queryPageByListingTitleAndTypeid(int page, String listingTitle, int tid, int filter){
        page=(page-1)*10;
        String sql ="";
        //String sql= "select * from Listing where ListingTitle like "+ "'%" + listingTitle +"%'" + " and Category ="+tid  +
         //       " order by ListingID DESC limit " + page + ", 10;";;
        if (filter == 1)
            sql="select * from Listing where ListingTitle like "+ "'%" + listingTitle +"%'" + " and Category ="+tid  +
                " order by ListingID DESC limit " + page + ", 10;";
        else if (filter == 2)
            sql="SELECT ListingID, SellerID, ImagePath,ListingTitle, StartPrice, PostagePrice, Description, "
                + "StartTime, EndTime,Category, (EndTime-CURRENT_TIMESTAMP) AS TimeRemaining From"
                + " Listing where ListingTitle like "+ "'%" + listingTitle +"%'" + " and Category ="+tid  +
                " ORDER BY TimeRemaining limit " + page + ", 10  ;";
        else if (filter == 2)
            sql=" SELECT * FROM Bids a JOIN Listing b ON a.listingid = b.listingid where ListingTitle like "+ "'%" + listingTitle +"%'" + " and Category ="+tid  +
                " order by BidAmount DESC limit " + page + ", 10;";
        else if (filter == 2)
            sql=" SELECT * FROM Bids a JOIN Listing b ON a.listingid = b.listingid where ListingTitle like "+ "'%" + listingTitle +"%'" + " and Category ="+tid  +
                " order by BidAmount limit " + page + ", 10;";
        else if (filter == 5){
            sql= "select * from Listing where ListingTitle like "+ "'%" + listingTitle +"%'" + " and Category ="+tid  +
                " order by ListingID DESC limit " + page + ", 10;";;
        }
        return query(sql);
    }
    
    // Query a list of listings with specific page number, listing title and filter
    public List<Listing> queryListingByListingTitle(int page, String listingTitle, int filter)
    {
        page=(page-1)*10;
        String sql ="";
        //String sql= "select * from Listing where ListingTitle like "+ "'%" + listingTitle +"%'" + " and Category ="+tid  +
         //       " order by ListingID DESC limit " + page + ", 10;";;
        if (filter == 1)
            sql="select * from Listing where ListingTitle like "+ "'%" + listingTitle +"%'"  +
                " order by ListingID DESC limit " + page + ", 10;";
        else if (filter == 2)
            sql="SELECT ListingID, SellerID, ImagePath,ListingTitle, StartPrice, PostagePrice, Description, "
                + "StartTime, EndTime,Category, (EndTime-CURRENT_TIMESTAMP) AS TimeRemaining From"
                + " Listing where ListingTitle like "+ "'%" + listingTitle +"%'"   +
                " ORDER BY TimeRemaining limit " + page + ", 10  ;";
        else if (filter == 3)
            sql= "SELECT * FROM Bids a JOIN Listing b ON a.listingid = b.listingid where ListingTitle like "+ "'%" + listingTitle +"%'" +
                " order by BidAmount DESC limit " + page + ", 10;";
        else if (filter == 4)
            sql= "SELECT * FROM Bids a JOIN Listing b ON a.listingid = b.listingid where ListingTitle like "+ "'%" + listingTitle +"%'" +
                " order by BidAmount limit " + page + ", 10;";
        else if (filter == 5)
            sql= "select * from Listing where ListingTitle like "+ "'%" + listingTitle +"%'" +
                " order by ListingID limit " + page + ", 10;";
        
        return query(sql);
    }
    
    // Convert queary a Listing table to a list of Listing             
    private List<Listing> query(String sql)
    {
        DbManager db=new DbManager();
        ResultSet rs=null;
        List<Listing> list=new ArrayList<Listing>();
        rs = db.getRs(sql);
        try {
            while(rs.next())
            {
                Listing listing = new Listing();
                listing.setDescription(rs.getString("Description"));
                listing.setEndTime(rs.getString("EndTime"));
                listing.setId(rs.getInt("ListingID"));
                listing.setListingTitle(rs.getString("ListingTitle"));
                listing.setPostagePrice(rs.getDouble("PostagePrice"));
                listing.setStartPrice(rs.getDouble("StartPrice"));
                listing.setStartTime(rs.getString("StartTime"));
                listing.setUserId(rs.getInt("SellerID"));
                listing.setTypeId(rs.getInt("Category"));
                listing.setImagePath(rs.getString("ImagePath"));
                list.add(listing);
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
