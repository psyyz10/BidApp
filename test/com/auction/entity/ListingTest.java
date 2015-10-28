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
public class ListingTest {
    Listing instance;
    
    public ListingTest() {
        instance = new Listing();
        instance.setDescription("");
        instance.setEndTime("");
        instance.setId(0);
        instance.setImagePath("");
        instance.setListingTitle("");
        instance.setPostagePrice(0);
        instance.setStartPrice(0);
        instance.setStartTime("");
        instance.setTypeId(0);
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
     * Test of getId method, of class Listing.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTypeId method, of class Listing.
     */
    @Test
    public void testGetTypeId() {
        System.out.println("getTypeId");
        
        int expResult = 0;
        int result = instance.getTypeId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getUserId method, of class Listing.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        
        int expResult = 0;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getListingTitle method, of class Listing.
     */
    @Test
    public void testGetListingTitle() {
        System.out.println("getListingTitle");
        
        String expResult = "";
        String result = instance.getListingTitle();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getPostagePrice method, of class Listing.
     */
    @Test
    public void testGetPostagePrice() {
        System.out.println("getPostagePrice");
        
        double expResult = 0.0;
        double result = instance.getPostagePrice();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of getStartPrice method, of class Listing.
     */
    @Test
    public void testGetStartPrice() {
        System.out.println("getStartPrice");
        
        double expResult = 0.0;
        double result = instance.getStartPrice();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of getDescription method, of class Listing.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getStartTime method, of class Listing.
     */
    @Test
    public void testGetStartTime() {
        System.out.println("getStartTime");
        
        String expResult = "";
        String result = instance.getStartTime();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getEndTime method, of class Listing.
     */
    @Test
    public void testGetEndTime() {
        System.out.println("getEndTime");
        
        String expResult = "";
        String result = instance.getEndTime();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getImagePath method, of class Listing.
     */
    @Test
    public void testGetImagePath() {
        System.out.println("getImagePath");
        
        String expResult = "";
        String result = instance.getImagePath();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setId method, of class Listing.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int lId = 0;
        
        instance.setId(lId);
        assertEquals(lId, instance.getId());
        
    }

    /**
     * Test of setUserId method, of class Listing.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        int userId = 0;
        
        instance.setUserId(userId);
        assertEquals(userId , instance.getUserId());
        
    }

    /**
     * Test of setTypeId method, of class Listing.
     */
    @Test
    public void testSetTypeId() {
        System.out.println("setTypeId");
        int tid = 0;
        
        instance.setTypeId(tid);
        assertEquals(tid, instance.getTypeId());
        
    }

    /**
     * Test of setListingTitle method, of class Listing.
     */
    @Test
    public void testSetListingTitle() {
        System.out.println("setListingTitle");
        String listingTitle = "";
        
        instance.setListingTitle(listingTitle);
        assertEquals(listingTitle, instance.getListingTitle());
        
    }

    /**
     * Test of setPostagePrice method, of class Listing.
     */
    @Test
    public void testSetPostagePrice() {
        System.out.println("setPostagePrice");
        double postagePrice = 0.0;
        
        instance.setPostagePrice(postagePrice);
        assertEquals(postagePrice, instance.getPostagePrice(), 0.0);
        
    }

    /**
     * Test of setStartPrice method, of class Listing.
     */
    @Test
    public void testSetStartPrice() {
        System.out.println("setStartPrice");
        double startPrice = 0.0;
        
        instance.setStartPrice(startPrice);
        assertEquals(startPrice, instance.getStartPrice(), 0.0);
        
    }

    /**
     * Test of setDescription method, of class Listing.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        
        instance.setDescription(description);
        assertEquals(description, instance.getDescription());
        
    }

    /**
     * Test of setStartTime method, of class Listing.
     */
    @Test
    public void testSetStartTime() {
        System.out.println("setStartTime");
        String startTime = "";
        
        instance.setStartTime(startTime);
        assertEquals(startTime, instance.getStartTime());
        
    }

    /**
     * Test of setEndTime method, of class Listing.
     */
    @Test
    public void testSetEndTime() {
        System.out.println("setEndTime");
        String endTime = "";
        
        instance.setEndTime(endTime);
        assertEquals(endTime, instance.getEndTime());
        
    }

    /**
     * Test of setImagePath method, of class Listing.
     */
    @Test
    public void testSetImagePath() {
        System.out.println("setImagePath");
        String imagePath = "";
        
        instance.setImagePath(imagePath);
        assertEquals(imagePath, instance.getImagePath());
        
    }
}
