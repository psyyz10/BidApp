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
public class ReportTest {
    Report instance;
    
    public ReportTest() {
        instance = new Report();
        instance.setComments("");
        instance.setReceiverId(0);
        instance.setReportId(0);
        instance.setTimeSent("");
        instance.setSenderId(0);
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
     * Test of getTimeSent method, of class Report.
     */
    @Test
    public void testGetTimeSent() {
        System.out.println("getTimeSent");
        
        String expResult = "";
        String result = instance.getTimeSent();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setTimeSent method, of class Report.
     */
    @Test
    public void testSetTimeSent() {
        System.out.println("setTimeSent");
        String timeSent = "";
        
        instance.setTimeSent(timeSent);
        
        
    }

    /**
     * Test of getReportId method, of class Report.
     */
    @Test
    public void testGetReportId() {
        System.out.println("getReportId");
        
        int expResult = 0;
        int result = instance.getReportId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getSenderId method, of class Report.
     */
    @Test
    public void testGetSenderId() {
        System.out.println("getSenderId");
        
        int expResult = 0;
        int result = instance.getSenderId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getReceiverId method, of class Report.
     */
    @Test
    public void testGetReceiverId() {
        System.out.println("getReceiverId");
        
        int expResult = 0;
        int result = instance.getReceiverId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getComments method, of class Report.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        
        String expResult = "";
        String result = instance.getComments();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setReportId method, of class Report.
     */
    @Test
    public void testSetReportId() {
        System.out.println("setReportId");
        int reportId = 0;
        
        instance.setReportId(reportId);
        assertEquals(reportId, instance.getReportId());
        
    }

    /**
     * Test of setSenderId method, of class Report.
     */
    @Test
    public void testSetSenderId() {
        System.out.println("setSenderId");
        int senderId = 0;
        
        instance.setSenderId(senderId);
        assertEquals(senderId, instance.getSenderId());
        
    }

    /**
     * Test of setReceiverId method, of class Report.
     */
    @Test
    public void testSetReceiverId() {
        System.out.println("setReceiverId");
        int receiverId = 0;
        
        instance.setReceiverId(receiverId);
        assertEquals(receiverId, instance.getReceiverId());
        
    }

    /**
     * Test of setComments method, of class Report.
     */
    @Test
    public void testSetComments() {
        System.out.println("setComments");
        String comments = "";
        
        instance.setComments(comments);
        assertEquals(comments, instance.getComments());
        
    }
}
