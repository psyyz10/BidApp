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
public class RegisterBeanTest {
    
    public RegisterBeanTest() {
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
     * Test of isUser method, of class RegisterBean.
     */
    @Test
    public void testIsUser() {
        System.out.println("isUser");
        String username = "";
        RegisterBean instance = new RegisterBean();
        boolean expResult = false;
        boolean result = instance.isUser(username);
        assertEquals(expResult, result);
        
        
    }
}
