/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.entity.Message;
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
public class MessageDAOTest {
    Message obj;
    
    public MessageDAOTest() {
        obj = new Message();
        obj.setMessageContent("sd");
        obj.setMid(1);
        obj.setReceiverId(1);
        obj.setSenderId(3);
        obj.setTimeSent("2012-11-12 15:00:00");
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
     * Test of save method, of class MessageDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        MessageDAO instance = new MessageDAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryByUserid method, of class MessageDAO.
     */
    @Test
    public void testQueryByUserid() {
        System.out.println("queryByUserid");
        int userid = 0;
        MessageDAO instance = new MessageDAO();
        List expResult = new ArrayList();
        List result = instance.queryByUserid(userid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryMessageByUserid method, of class MessageDAO.
     */
    @Test
    public void testQueryMessageByUserid() {
        System.out.println("queryMessageByUserid");
        int user1id = 0;
        int user2id = 0;
        MessageDAO instance = new MessageDAO();
        List expResult = new ArrayList();
        List result = instance.queryMessageByUserid(user1id, user2id);
        assertEquals(expResult, result);
        
        
    }
}
