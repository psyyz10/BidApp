/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.entity.Userinfo;
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
public class UserinfoDAOTest {
    Userinfo obj;
    
    public UserinfoDAOTest() {
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
     * Test of save method, of class UserinfoDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        UserinfoDAO instance = new UserinfoDAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }


    /**
     * Test of queryUserinfoByUsername method, of class UserinfoDAO.
     */
    @Test
    public void testQueryUserinfoByUsername() {
        System.out.println("queryUserinfoByUsername");
        String username = "";
        UserinfoDAO instance = new UserinfoDAO();
        Userinfo expResult = null;
        Userinfo result = instance.queryUserinfoByUsername(username);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryUserinfoByUserscore method, of class UserinfoDAO.
     */
    @Test
    public void testQueryUserinfoByUserscore() {
        System.out.println("queryUserinfoByUserscore");
        Integer userscore = null;
        UserinfoDAO instance = new UserinfoDAO();
        List expResult = new ArrayList();
        List result = instance.queryUserinfoByUserscore(userscore);
        assertEquals(expResult, result);
        
        
    }

}
