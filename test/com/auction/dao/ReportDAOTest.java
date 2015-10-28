/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

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
public class ReportDAOTest {
    Report obj;
    
    public ReportDAOTest() {
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
     * Test of delete method, of class ReportDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        ReportDAO instance = new ReportDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class ReportDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        ReportDAO instance = new ReportDAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of del method, of class ReportDAO.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        int reportId = 0;
        ReportDAO instance = new ReportDAO();
        int expResult = 0;
        int result = instance.del(reportId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryReportByReceiverId method, of class ReportDAO.
     */
    @Test
    public void testQueryReportByReceiverId() {
        System.out.println("queryReportByReceiverId");
        Integer receiverID = null;
        ReportDAO instance = new ReportDAO();
        List expResult = new ArrayList();
        List result = instance.queryReportByReceiverId(receiverID);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryReportByReportId method, of class ReportDAO.
     */
    @Test
    public void testQueryReportByReportId() {
        System.out.println("queryReportByReportId");
        Integer reportId = null;
        ReportDAO instance = new ReportDAO();
        List expResult = new ArrayList();
        List result = instance.queryReportByReportId(reportId);
        assertEquals(expResult, result);
        
        
    }
}
