/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

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
public class FollowItemBeanTest {
    FollowItem obj;
    
    public FollowItemBeanTest() {
        obj = new FollowItem();
        obj.setListingId(10);
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
     * Test of queryFollowsByUserId method, of class FollowItemBean.
     */
    @Test
    public void testQueryFollowsByUserId() {
        System.out.println("queryFollowsByUserId");
        Integer userId = null;
        FollowItemBean instance = new FollowItemBean();
        List expResult = new ArrayList();
        List result = instance.queryFollowsByUserId(userId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class FollowItemBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");

        FollowItemBean instance = new FollowItemBean();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }
}
