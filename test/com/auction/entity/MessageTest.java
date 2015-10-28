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
public class MessageTest {
    Message instance;
    
    public MessageTest() {
        instance = new Message();
        instance.setMessageContent("");
        instance.setMid(0);
        instance.setReceiverId(0);
        instance.setSenderId(0);
        instance.setTimeSent("");
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
     * Test of getMid method, of class Message.
     */
    @Test
    public void testGetMid() {
        System.out.println("getMid");
        
        int expResult = 0;
        int result = instance.getMid();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of getSenderId method, of class Message.
     */
    @Test
    public void testGetSenderId() {
        System.out.println("getSenderId");
        
        int expResult = 0;
        int result = instance.getSenderId();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of getReceiverId method, of class Message.
     */
    @Test
    public void testGetReceiverId() {
        System.out.println("getReceiverId");
        
        int expResult = 0;
        int result = instance.getReceiverId();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of getMessageContent method, of class Message.
     */
    @Test
    public void testGetMessageContent() {
        System.out.println("getMessageContent");
        
        String expResult = "";
        String result = instance.getMessageContent();
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of getTimeSent method, of class Message.
     */
    @Test
    public void testGetTimeSent() {
        System.out.println("getTimeSent");
        
        String expResult = "";
        String result = instance.getTimeSent();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setMid method, of class Message.
     */
    @Test
    public void testSetMid() {
        System.out.println("setMid");
        int mid = 0;
        
        instance.setMid(mid);
        assertEquals(mid, instance.getMid());
        
    }

    /**
     * Test of setSenderId method, of class Message.
     */
    @Test
    public void testSetSenderId() {
        System.out.println("setSenderId");
        int senderId = 0;
        
        instance.setSenderId(senderId);
        assertEquals(senderId, instance.getSenderId());
        
    }

    /**
     * Test of setReceiverId method, of class Message.
     */
    @Test
    public void testSetReceiverId() {
        System.out.println("setReceiverId");
        int receiverId = 0;
        
        instance.setReceiverId(receiverId);
        assertEquals(receiverId, instance.getReceiverId());
        
    }

    /**
     * Test of setMessageContent method, of class Message.
     */
    @Test
    public void testSetMessageContent() {
        System.out.println("setMessageContent");
        String messageContent = "";
        
        instance.setMessageContent(messageContent);
        assertEquals(messageContent, instance.getMessageContent());
        
    }

    /**
     * Test of setTimeSent method, of class Message.
     */
    @Test
    public void testSetTimeSent() {
        System.out.println("setTimeSent");
        String timeSent = "";
        
        instance.setTimeSent(timeSent);
        assertEquals(timeSent, instance.getTimeSent());
        
    }
}
