/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.entity.Listing;
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
public class ListingBeanTest {
    Listing obj;
    
    public ListingBeanTest() {
        obj = new Listing();
        obj.setStartTime("2012-11-12 15:00:00");
        obj.setEndTime("2012-11-12 15:00:00");
        obj.setUserId(2);
        obj.setTypeId(1);
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
     * Test of queryListingByListingid method, of class ListingBean.
     */
    @Test
    public void testQueryListingByListingid() {
        System.out.println("queryListingByListingid");
        Integer listingid = null;
        ListingBean instance = new ListingBean();
        Listing expResult = null;
        Listing result = instance.queryListingByListingid(listingid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByUserid method, of class ListingBean.
     */
    @Test
    public void testQueryListingByUserid() {
        System.out.println("queryListingByUserid");
        Integer userid = null;
        ListingBean instance = new ListingBean();
        List expResult = null;
        List result = instance.queryListingByUserid(userid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryAllListing method, of class ListingBean.
     */
    @Test
    public void testQueryAllListing() {
        System.out.println("queryAllListing");
        ListingBean instance = new ListingBean();
        List expResult = null;
        List result = instance.queryAllListing();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByListingidAndTypeid method, of class ListingBean.
     */
    @Test
    public void testQueryListingByListingidAndTypeid() {
        System.out.println("queryListingByListingidAndTypeid");
        String listingTitle = "";
        Integer tid = null;
        ListingBean instance = new ListingBean();
        List expResult = null;
        List result = instance.queryListingByListingidAndTypeid(listingTitle, tid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByListingTitle method, of class ListingBean.
     */
    @Test
    public void testQueryListingByListingTitle_String() {
        System.out.println("queryListingByListingTitle");
        String listingTitle = "";
        ListingBean instance = new ListingBean();
        List expResult = null;
        List result = instance.queryListingByListingTitle(listingTitle);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryPageByListingTitleAndTypeid method, of class ListingBean.
     */
    @Test
    public void testQueryPageByListingTitleAndTypeid() {
        System.out.println("queryPageByListingTitleAndTypeid");
        int page = 0;
        String listingTitle = "";
        int tid = 0;
        int filter = 0;
        ListingBean instance = new ListingBean();
        List expResult = null;
        List result = instance.queryPageByListingTitleAndTypeid(page, listingTitle, tid, filter);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByListingTitle method, of class ListingBean.
     */
    @Test
    public void testQueryListingByListingTitle_3args() {
        System.out.println("queryListingByListingTitle");
        int page = 0;
        String listingTitle = "";
        int filter = 0;
        ListingBean instance = new ListingBean();
        List expResult = null;
        List result = instance.queryListingByListingTitle(page, listingTitle, filter);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of queryListingByBids method, of class ListingBean.
     */
    @Test
    public void testQueryListingByBids() {
        System.out.println("queryListingByBids");
        int senderId = 0;
        int receiverId = 0;
        ListingBean instance = new ListingBean();
        List expResult = null;
        List result = instance.queryListingByBids(senderId, receiverId);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class ListingBean.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Object obj = null;
        ListingBean instance = new ListingBean();
        int expResult = 0;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of del method, of class ListingBean.
     */
    @Test
    public void testDel() {
        System.out.println("del");
        int listingid = 0;
        ListingBean instance = new ListingBean();
        int expResult = 0;
        int result = instance.del(listingid);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getPage method, of class ListingBean.
     */
    @Test
    public void testGetPage() {
        System.out.println("getPage");
        List<Listing> listinglist = null;
        ListingBean instance = new ListingBean();
        int expResult = 0;
        int result = instance.getPage(listinglist);
        assertEquals(expResult, result);
        
        
    }
}
