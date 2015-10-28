/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

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
public class UserSearchesDAOTest {
    UserSearches obj;
    
    public UserSearchesDAOTest() {
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
     * Test of save method, of class UserSearchesDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        UserSearchesDAO instance = new UserSearchesDAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryByUserId method, of class UserSearchesDAO.
     */
    @Test
    public void testQueryByUserId() {
        System.out.println("queryByUserId");
        int userId = 0;
        UserSearchesDAO instance = new UserSearchesDAO();
        List expResult = new ArrayList();
        List result = instance.queryByUserId(userId);
        assertEquals(expResult, result);
        
        
    }
}
