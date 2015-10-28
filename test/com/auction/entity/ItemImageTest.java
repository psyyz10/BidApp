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
public class ItemImageTest {
    ItemImage instance;
    
    public ItemImageTest() {
        instance = new ItemImage();
        instance.setImageId(0);
        instance.setImagePath("");
        instance.setListingId(0);
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
     * Test of getImageid method, of class ItemImage.
     */
    @Test
    public void testGetImageid() {
        System.out.println("getImageid");
        
        int expResult = 0;
        int result = instance.getImageid();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setImageId method, of class ItemImage.
     */
    @Test
    public void testSetImageId() {
        System.out.println("setImageId");
        int imageId = 0;
        
        instance.setImageId(imageId);
        assertEquals(imageId, instance.getImageid());
        
    }

    /**
     * Test of getListingId method, of class ItemImage.
     */
    @Test
    public void testGetListingId() {
        System.out.println("getListingId");
        
        int expResult = 0;
        int result = instance.getListingId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setListingId method, of class ItemImage.
     */
    @Test
    public void testSetListingId() {
        System.out.println("setListingId");
        int listingId = 0;
        
        instance.setListingId(listingId);
        assertEquals(listingId, instance.getListingId());
        
    }

    /**
     * Test of getImagePath method, of class ItemImage.
     */
    @Test
    public void testGetImagePath() {
        System.out.println("getImagePath");
        
        String expResult = "";
        String result = instance.getImagePath();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setImagePath method, of class ItemImage.
     */
    @Test
    public void testSetImagePath() {
        System.out.println("setImagePath");
        String imagePath = "";
        
        instance.setImagePath(imagePath);
        assertEquals(imagePath, instance.getImagePath());
        
    }
}
