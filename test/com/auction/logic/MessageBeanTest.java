/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

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
public class MessageBeanTest {
    Message obj;
    
    public MessageBeanTest() {
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
     * Test of save method, of class MessageBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        MessageBean instance = new MessageBean();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryByUserid method, of class MessageBean.
     */
    @Test
    public void testQueryByUserid() {
        System.out.println("queryByUserid");
        int userid = 0;
        MessageBean instance = new MessageBean();
        List expResult = new ArrayList();
        List result = instance.queryByUserid(userid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getPage method, of class MessageBean.
     */
    @Test
    public void testGetPage() {
        System.out.println("getPage");
        int user1id = 0;
        int user2id = 0;
        MessageBean instance = new MessageBean();
        int expResult = 0;
        int result = instance.getPage(user1id, user2id);
        assertEquals(expResult, result);
        
        
    }
}
