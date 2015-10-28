/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.entity.ItemImage;
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
public class ImageDAOTest {
    ItemImage obj;
    
    public ImageDAOTest() {
        obj = new ItemImage();
        obj.setImageId(12);
        obj.setImagePath("sdf");
        obj.setListingId(12);
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
     * Test of save method, of class ImageDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        ImageDAO instance = new ImageDAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryItemImageByListingId method, of class ImageDAO.
     */
    @Test
    public void testQueryItemImageByListingId() {
        System.out.println("queryItemImageByListingId");
        Integer listingId = null;
        ImageDAO instance = new ImageDAO();
        List expResult = new ArrayList();
        List result = instance.queryItemImageByListingId(listingId);
        assertEquals(expResult, result);
        
        
    }
}
