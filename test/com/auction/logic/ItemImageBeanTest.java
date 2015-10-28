/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

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
public class ItemImageBeanTest {
    ItemImage obj;
    
    public ItemImageBeanTest() {
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
     * Test of queryItemImageByListingId method, of class ItemImageBean.
     */
    @Test
    public void testQueryItemImageByListingId() {
        System.out.println("queryItemImageByListingId");
        Integer listingId = null;
        ItemImageBean instance = new ItemImageBean();
        List expResult = new ArrayList();
        List result = instance.queryItemImageByListingId(listingId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class ItemImageBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");

        ItemImageBean instance = new ItemImageBean();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }
}
