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
public class FollowItemTest {
    FollowItem instance;
    
    public FollowItemTest() {
        instance = new FollowItem();
        instance.setListingId(0);
        instance.setUserId(0);
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
     * Test of getUserId method, of class FollowItem.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        
        int expResult = 0;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setUserId method, of class FollowItem.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        int userId = 0;
        
        instance.setUserId(userId);
        assertEquals(userId, instance.getUserId());
        
    }

    /**
     * Test of getListingId method, of class FollowItem.
     */
    @Test
    public void testGetListingId() {
        System.out.println("getListingId");
        
        int expResult = 0;
        int result = instance.getListingId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setListingId method, of class FollowItem.
     */
    @Test
    public void testSetListingId() {
        System.out.println("setListingId");
        int listingId = 0;
        
        instance.setListingId(listingId);
        assertEquals(listingId, instance.getListingId());
        
    }
}
