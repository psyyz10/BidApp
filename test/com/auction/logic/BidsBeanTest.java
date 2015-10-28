/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

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
public class BidsBeanTest {
    Bids obj;
    
    public BidsBeanTest() {
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
     * Test of updateBidAmount method, of class BidsBean.
     */
    @Test
    public void testUpdateBidAmount() {
        System.out.println("updateBidAmount");
        int bidId = 0;
        double bidAmount = 0.0;
        BidsBean instance = new BidsBean();
        int expResult = 0;
        int result = instance.updateBidAmount(bidId, bidAmount);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryBidsByUserid method, of class BidsBean.
     */
    @Test
    public void testQueryBidsByUserid() {
        System.out.println("queryBidsByUserid");
        Integer userid = null;
        BidsBean instance = new BidsBean();
        List expResult = new ArrayList();
        List result = instance.queryBidsByUserid(userid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryBidsByListingid method, of class BidsBean.
     */
    @Test
    public void testQueryBidsByListingid() {
        System.out.println("queryBidsByListingid");
        Integer listingId = null;
        BidsBean instance = new BidsBean();
        List expResult = new ArrayList();
        List result = instance.queryBidsByListingid(listingId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByHighestPrices method, of class BidsBean.
     */
    @Test
    public void testQueryListingByHighestPrices() {
        System.out.println("queryListingByHighestPrices");
        int listingId = 0;
        BidsBean instance = new BidsBean();
        Bids expResult = null;
        Bids result = instance.queryListingByHighestPrices(listingId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updateBidWon method, of class BidsBean.
     */
    @Test
    public void testUpdateBidWon() {
        System.out.println("updateBidWon");
        int bidId = 0;
        boolean won = false;
        BidsBean instance = new BidsBean();
        int expResult = 0;
        int result = instance.updateBidWon(bidId, won);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryBidsByUseridAndWon method, of class BidsBean.
     */
    @Test
    public void testQueryBidsByUseridAndWon() {
        System.out.println("queryBidsByUseridAndWon");
        Integer userid = null;
        BidsBean instance = new BidsBean();
        List expResult = new ArrayList();
        List result = instance.queryBidsByUseridAndWon(userid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class BidsBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");

        BidsBean instance = new BidsBean();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }
}
