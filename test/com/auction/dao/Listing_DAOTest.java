/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.entity.Listing;
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
public class Listing_DAOTest {
    Listing obj;
    
    public Listing_DAOTest() {
        obj = new Listing();
        obj.setStartTime("2012-11-12 15:00:00");
        obj.setEndTime("2012-11-12 15:00:00");
        obj.setUserId(2);
        obj.setTypeId(1);
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
     * Test of delete method, of class Listing_DAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        Listing_DAO instance = new Listing_DAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class Listing_DAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        Listing_DAO instance = new Listing_DAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByUserid method, of class Listing_DAO.
     */
    @Test
    public void testQueryListingByUserid() {
        System.out.println("queryListingByUserid");
        Integer userid = null;
        Listing_DAO instance = new Listing_DAO();
        List expResult = new ArrayList();
        List result = instance.queryListingByUserid(userid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByListingTitleAndTypeid method, of class Listing_DAO.
     */
    @Test
    public void testQueryListingByListingTitleAndTypeid() {
        System.out.println("queryListingByListingTitleAndTypeid");
        String listingTitle = "";
        Integer tid = null;
        Listing_DAO instance = new Listing_DAO();
        List expResult = new ArrayList();
        List result = instance.queryListingByListingTitleAndTypeid(listingTitle, tid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByBids method, of class Listing_DAO.
     */
    @Test
    public void testQueryListingByBids() {
        System.out.println("queryListingByBids");
        int senderId = 0;
        int receiverId = 0;
        Listing_DAO instance = new Listing_DAO();
        List expResult = new ArrayList();
        List result = instance.queryListingByBids(senderId, receiverId);
        assertEquals(expResult, result);
        
        
    }

}
