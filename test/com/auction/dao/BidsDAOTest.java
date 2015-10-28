/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.entity.Bids;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yxz02u
 */
public class BidsDAOTest {
    Bids obj;
    
    public BidsDAOTest() {
        obj = new Bids();
        obj.setBidAmount(1);
        obj.setBidTime("2012-11-12 15:00:00");
        obj.setListingId(2);
        obj.setMaximumBid(234);
        obj.setPaid(false);
        obj.setUserId(2);
        obj.setWon(false);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class BidsDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        BidsDAO instance = new BidsDAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of del method, of class BidsDAO.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        int bidid = 0;
        BidsDAO instance = new BidsDAO();
        int expResult = 0;
        int result = instance.del(bidid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updateBidAmount method, of class BidsDAO.
     */
    @Test
    public void testUpdateBidAmount() {
        System.out.println("updateBidAmount");
        int bidId = 0;
        double bidAmount = 0.0;
        BidsDAO instance = new BidsDAO();
        int expResult = 0;
        int result = instance.updateBidAmount(bidId, bidAmount);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updateBidWon method, of class BidsDAO.
     */
    @Test
    public void testUpdateBidWon() {
        System.out.println("updateBidWon");
        int bidId = 0;
        boolean won = false;
        BidsDAO instance = new BidsDAO();
        int expResult = 0;
        int result = instance.updateBidWon(bidId, won);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryBidsByUserid method, of class BidsDAO.
     */
    @Test
    public void testQueryBidsByUserid() {
        System.out.println("queryBidsByUserid");
        Integer userid = null;
        BidsDAO instance = new BidsDAO();
        List expResult = new ArrayList();
        List result = instance.queryBidsByUserid(userid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryBidsByUseridAndWon method, of class BidsDAO.
     */
    @Test
    public void testQueryBidsByUseridAndWon() {
        System.out.println("queryBidsByUseridAndWon");
        Integer userid = null;
        BidsDAO instance = new BidsDAO();
        List expResult = new ArrayList();
        List result = instance.queryBidsByUseridAndWon(userid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryBidsByHighestPrices method, of class BidsDAO.
     */
    @Test
    public void testQueryBidsByHighestPrices() {
        System.out.println("queryBidsByHighestPrices");
        int listingId = 0;
        BidsDAO instance = new BidsDAO();
        Bids expResult = null;
        Bids result = instance.queryBidsByHighestPrices(listingId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryBidsByListingid method, of class BidsDAO.
     */
    @Test
    public void testQueryBidsByListingid() {
        System.out.println("queryBidsByListingid");
        Integer listingId = null;
        BidsDAO instance = new BidsDAO();
        List expResult = new ArrayList();;
        List result = instance.queryBidsByListingid(listingId);
        assertEquals(expResult, result);
        
        
    }
}
