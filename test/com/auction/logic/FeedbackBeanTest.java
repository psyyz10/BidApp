/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.entity.Feedback;
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
public class FeedbackBeanTest {
    Feedback obj;
    
    public FeedbackBeanTest() {
        obj = new Feedback();
        obj.setComments("sdf");
        obj.setFeedbackId(2222);
        obj.setFeedbackScore(123);
        obj.setReceiverId(2);
        obj.setSenderId(1);
        obj.setListingId(2);
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
     * Test of queryNumberOfScoreByReceiverId method, of class FeedbackBean.
     */
    @Test
    public void testQueryNumberOfScoreByReceiverId() {
        System.out.println("queryNumberOfScoreByReceiverId");
        int receiverId = 0;
        int score = 0;
        FeedbackBean instance = new FeedbackBean();
        int expResult = 0;
        int result = instance.queryNumberOfScoreByReceiverId(receiverId, score);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByReceiverId method, of class FeedbackBean.
     */
    @Test
    public void testQueryListingByReceiverId() {
        System.out.println("queryListingByReceiverId");
        Integer receiverId = null;
        FeedbackBean instance = new FeedbackBean();
        List expResult = new ArrayList();
        List result = instance.queryListingByReceiverId(receiverId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class FeedbackBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        FeedbackBean instance = new FeedbackBean();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }
}
