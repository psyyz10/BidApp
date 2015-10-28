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
public class FeedbackTest {
    Feedback instance;
    
    public FeedbackTest() {
        instance = new Feedback();
        instance.setComments("");
        instance.setFeedbackId(0);
        instance.setFeedbackScore(0);
        instance.setListingId(0);
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
     * Test of getFeedbackId method, of class Feedback.
     */
    @Test
    public void testGetFeedbackId() {
        System.out.println("getFeedbackId");
        
        int expResult = 0;
        int result = instance.getFeedbackId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getSenderId method, of class Feedback.
     */
    @Test
    public void testGetSenderId() {
        System.out.println("getSenderId");
        
        int expResult = 0;
        int result = instance.getSenderId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getReceiverId method, of class Feedback.
     */
    @Test
    public void testGetReceiverId() {
        System.out.println("getReceiverId");
        
        int expResult = 0;
        int result = instance.getReceiverId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getFeedbackScore method, of class Feedback.
     */
    @Test
    public void testGetFeedbackScore() {
        System.out.println("getFeedbackScore");
        
        int expResult = 0;
        int result = instance.getFeedbackScore();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getComments method, of class Feedback.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        
        String expResult = "";
        String result = instance.getComments();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTimeSent method, of class Feedback.
     */
    @Test
    public void testGetTimeSent() {
        System.out.println("getTimeSent");
        
        String expResult = "";
        String result = instance.getTimeSent();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getListingId method, of class Feedback.
     */
    @Test
    public void testGetListingId() {
        System.out.println("getListingId");
        
        int expResult = 0;
        int result = instance.getListingId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setFeedbackId method, of class Feedback.
     */
    @Test
    public void testSetFeedbackId() {
        System.out.println("setFeedbackId");
        int feedbackId = 0;
        
        instance.setFeedbackId(feedbackId);
        assertEquals(feedbackId, instance.getFeedbackId());
        
    }

    /**
     * Test of setSenderId method, of class Feedback.
     */
    @Test
    public void testSetSenderId() {
        System.out.println("setSenderId");
        int senderId = 0;
        
        instance.setSenderId(senderId);
        assertEquals(senderId, instance.getSenderId());
        
    }

    /**
     * Test of setReceiverId method, of class Feedback.
     */
    @Test
    public void testSetReceiverId() {
        System.out.println("setReceiverId");
        int receiverId = 0;
        
        instance.setReceiverId(receiverId);
        assertEquals(receiverId, instance.getReceiverId());
        
    }

    /**
     * Test of setListingId method, of class Feedback.
     */
    @Test
    public void testSetListingId() {
        System.out.println("setListingId");
        int listingId = 0;
        
        instance.setListingId(listingId);
        assertEquals(listingId, instance.getListingId());
        
    }

    /**
     * Test of setFeedbackScore method, of class Feedback.
     */
    @Test
    public void testSetFeedbackScore() {
        System.out.println("setFeedbackScore");
        int feedbackScore = 0;
        
        instance.setFeedbackScore(feedbackScore);
        assertEquals(feedbackScore, instance.getFeedbackScore());
        
    }

    /**
     * Test of setComments method, of class Feedback.
     */
    @Test
    public void testSetComments() {
        System.out.println("setComments");
        String comments = "";
        
        instance.setComments(comments);
        assertEquals(comments, instance.getComments());
        
    }

    /**
     * Test of setTimeSent method, of class Feedback.
     */
    @Test
    public void testSetTimeSent() {
        System.out.println("setTimeSent");
        String timeSent = "";
        
        instance.setTimeSent(timeSent);
        assertEquals(timeSent, instance.getTimeSent());
        
    }
}
