/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.entity.Userinfo;
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
public class LoginBeanTest {
    
    public LoginBeanTest() {
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
     * Test of isUser method, of class LoginBean.
     */
    @Test
    public void testIsUser() {
        System.out.println("isUser");
        String username = "";
        String userpwd = "";
        LoginBean instance = new LoginBean();
        boolean expResult = false;
        boolean result = instance.isUser(username, userpwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserinfoByUsername method, of class LoginBean.
     */
    @Test
    public void testGetUserinfoByUsername() {
        System.out.println("getUserinfoByUsername");
        String username = "";
        LoginBean instance = new LoginBean();
        Userinfo expResult = null;
        Userinfo result = instance.getUserinfoByUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
