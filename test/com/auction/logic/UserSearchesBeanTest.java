/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.entity.UserSearches;
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
public class UserSearchesBeanTest {
    UserSearches obj;
    
    public UserSearchesBeanTest() {
        obj = new UserSearches();
        obj.setSearch(18);
        obj.setSearchText("sdg");
        obj.setTime("2013-01-17 13:03:00");
        obj.setUserId(1);
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
     * Test of queryByUserId method, of class UserSearchesBean.
     */
    @Test
    public void testQueryByUserId() {
        System.out.println("queryByUserId");
        int userId = 0;
        UserSearchesBean instance = new UserSearchesBean();
        List expResult = new ArrayList();
        List result = instance.queryByUserId(userId);
        assertEquals(expResult, result);
        
        
    }
}
