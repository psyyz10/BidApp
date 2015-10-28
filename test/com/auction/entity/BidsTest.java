/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.entity;

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
public class BidsTest {
    private Bids instance;
    
    public BidsTest() {
        instance = new Bids();
        instance.setBidAmount(0);
        instance.setBidId(0);
        instance.setBidTime("");
        instance.setListingId(0);
        instance.setMaximumBid(0);
        instance.setPaid(false);
        instance.setUserId(0);
        instance.setWon(false);
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
     * Test of isWon method, of class Bids.
     */
    @Test
    public void testIsWon() {
        System.out.println("isWon");
         
        boolean expResult = false;
        boolean result = instance.isWon();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPaid method, of class Bids.
     */
    @Test
    public void testIsPaid() {
        System.out.println("isPaid");
        boolean expResult = false;
        
        boolean result = instance.isPaid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBidId method, of class Bids.
     */
    @Test
    public void testGetBidId() {
        System.out.println("getBidId");
        int expResult = 0;
        
        int result = instance.getBidId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUserId method, of class Bids.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        
        int expResult = 0;
        int result = instance.getUserId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListingId method, of class Bids.
     */
    @Test
    public void testGetListingId() {
        System.out.println("getListingId");
        
        int expResult = 0;
        int result = instance.getListingId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBidAmount method, of class Bids.
     */
    @Test
    public void testGetBidAmount() {
        System.out.println("getBidAmount");
        
        double expResult = 0.0;
        double result = instance.getBidAmount();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getMaximumBid method, of class Bids.
     */
    @Test
    public void testGetMaximumBid() {
        System.out.println("getMaximumBid");
        
        double expResult = 0.0;
        double result = instance.getMaximumBid();
        assertEquals(expResult, result, 0.0);
    
    }


    /**
     * Test of setBidId method, of class Bids.
     */
    @Test
    public void testSetBidId() {
        System.out.println("setBidId");
        int bidId = 0;
        Bids instance = new Bids();
        instance.setBidId(bidId);
        assertEquals(bidId , instance.getBidId());
        
    }

    /**
     * Test of setUserId method, of class Bids.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        int userId = 0;
        Bids instance = new Bids();
        instance.setUserId(userId);
        assertEquals(userId , instance.getUserId());
        
    }

    /**
     * Test of setListingId method, of class Bids.
     */
    @Test
    public void testSetListingId() {
        System.out.println("setListingId");
        int listingId = 0;
        Bids instance = new Bids();
        instance.setListingId(listingId);
        assertEquals(listingId , instance.getListingId());
        
    }

    /**
     * Test of setBidAmount method, of class Bids.
     */
    @Test
    public void testSetBidAmount() {
        System.out.println("setBidAmount");
        double bidAmount = 0.0;
        Bids instance = new Bids();
        instance.setBidAmount(bidAmount);
        assertEquals(bidAmount , instance.getBidAmount(), 0.0);
        
    }

    /**
     * Test of setMaximumBid method, of class Bids.
     */
    @Test
    public void testSetMaximumBid() {
        System.out.println("setMaximumBid");
        double maximumBid = 0.0;
        Bids instance = new Bids();
        instance.setMaximumBid(maximumBid);
        assertEquals(maximumBid , instance.getMaximumBid(), 0.0);
        
    }

    /**
     * Test of setBidTime method, of class Bids.
     */
    @Test
    public void testSetBidTime() {
        System.out.println("setBidTime");
        String bidTime = "";
        Bids instance = new Bids();
        instance.setBidTime(bidTime);
        assertEquals(bidTime , instance.getBidTime());
        
    }

    /**
     * Test of setWon method, of class Bids.
     */
    @Test
    public void testSetWon() {
        System.out.println("setWon");
        boolean won = false;
        Bids instance = new Bids();
        instance.setWon(won);
        assertEquals(won , instance.isWon());
        
    }

    /**
     * Test of setPaid method, of class Bids.
     */
    @Test
    public void testSetPaid() {
        System.out.println("setPaid");
        boolean paid = false;
        Bids instance = new Bids();
        instance.setPaid(paid);
        assertEquals(paid, instance.isPaid());
        
        
    }
}
