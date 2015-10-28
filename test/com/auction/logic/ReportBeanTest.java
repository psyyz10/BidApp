/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.entity.Report;
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
public class ReportBeanTest {
    Report obj;
    
    public ReportBeanTest() {
        obj = new Report();
        obj.setComments("sd");
        obj.setReceiverId(1);
        obj.setReportId(1);
        obj.setSenderId(2);
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
     * Test of save method, of class ReportBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        ReportBean instance = new ReportBean();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }


    /**
     * Test of queryReportByReportId method, of class ReportBean.
     */
    @Test
    public void testQueryReportByReportId() {
        System.out.println("queryReportByReportId");
        Integer ReportID = null;
        ReportBean instance = new ReportBean();
        List expResult = new ArrayList();
        List result = instance.queryReportByReportId(ReportID);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryReportByReceiverId method, of class ReportBean.
     */
    @Test
    public void testQueryReportByReceiverId() {
        System.out.println("queryReportByReceiverId");
        Integer receiverID = null;
        ReportBean instance = new ReportBean();
        List expResult = new ArrayList();
        List result = instance.queryReportByReceiverId(receiverID);
        assertEquals(expResult, result);
        
        
    }
}
