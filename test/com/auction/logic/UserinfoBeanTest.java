/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.entity.Userinfo;
import java.util.ArrayList;
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
public class UserinfoBeanTest {
    Userinfo obj;
    
    public UserinfoBeanTest() {
        obj = new Userinfo();
        obj.setUsername("sdf");
        obj.setUserpwd("dfssdf");
        obj.setMemberSince("2012-11-03");
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
     * Test of getUserinfoByUserName method, of class UserinfoBean.
     */
    @Test
    public void testGetUserinfoByUserName() {
        System.out.println("getUserinfoByUserName");
        String username = "";
        UserinfoBean instance = new UserinfoBean();
        Userinfo expResult = null;
        Userinfo result = instance.getUserinfoByUserName(username);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class UserinfoBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        UserinfoBean instance = new UserinfoBean();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

}
