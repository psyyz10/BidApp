/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.entity.FollowItem;
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
public class FollowItemDAOTest {
    FollowItem obj;
    
    public FollowItemDAOTest() {
        obj = new FollowItem();
        obj.setListingId(9);
        obj.setUserId(2);
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
     * Test of save method, of class FollowItemDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        FollowItemDAO instance = new FollowItemDAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of del method, of class FollowItemDAO.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        int userId = 0;
        int listingId = 0;
        FollowItemDAO instance = new FollowItemDAO();
        int expResult = 0;
        int result = instance.del(userId, listingId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryFollowsByUserId method, of class FollowItemDAO.
     */
    @Test
    public void testQueryFollowsByUserId() {
        System.out.println("queryFollowsByUserId");
        Integer userId = null;
        FollowItemDAO instance = new FollowItemDAO();
        List expResult = new ArrayList();
        List result = instance.queryFollowsByUserId(userId);
        assertEquals(expResult, result);
        
        
    }
}
