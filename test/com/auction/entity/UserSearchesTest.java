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
public class UserSearchesTest {
    UserSearches instance;
    
    public UserSearchesTest() {
        instance = new UserSearches();
        instance.setSearch(0);
        instance.setSearchText("");
        instance.setTime("");
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
     * Test of getSearchId method, of class UserSearches.
     */
    @Test
    public void testGetSearchId() {
        System.out.println("getSearchId");
        
        int expResult = 0;
        int result = instance.getSearchId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getUserId method, of class UserSearches.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        
        int expResult = 0;
        int result = instance.getUserId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getSearchText method, of class UserSearches.
     */
    @Test
    public void testGetSearchText() {
        System.out.println("getSearchText");
        
        String expResult = "";
        String result = instance.getSearchText();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTime method, of class UserSearches.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        
        String expResult = "";
        String result = instance.getTime();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setSearch method, of class UserSearches.
     */
    @Test
    public void testSetSearch() {
        System.out.println("setSearch");
        int searchId = 0;
        
        instance.setSearch(searchId);
        
        
    }

    /**
     * Test of setUserId method, of class UserSearches.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        int userId = 0;
        
        instance.setUserId(userId);
        
        
    }

    /**
     * Test of setSearchText method, of class UserSearches.
     */
    @Test
    public void testSetSearchText() {
        System.out.println("setSearchText");
        String searchText = "";
        
        instance.setSearchText(searchText);
        
        
    }

    /**
     * Test of setTime method, of class UserSearches.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "";
        
        instance.setTime(time);
        
        
    }
}
