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
public class TypeTest {
    Type instance;
    
    public TypeTest() {
        instance = new Type();
        instance.setTid(0);
        instance.setTypename("");
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
     * Test of getTid method, of class Type.
     */
    @Test
    public void testGetTid() {
        System.out.println("getTid");
        
        int expResult = 0;
        int result = instance.getTid();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setTid method, of class Type.
     */
    @Test
    public void testSetTid() {
        System.out.println("setTid");
        int tid = 0;
        
        instance.setTid(tid);
        assertEquals(tid, instance.getTid());
        
    }

    /**
     * Test of getTypename method, of class Type.
     */
    @Test
    public void testGetTypename() {
        System.out.println("getTypename");
        
        String expResult = "";
        String result = instance.getTypename();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setTypename method, of class Type.
     */
    @Test
    public void testSetTypename() {
        System.out.println("setTypename");
        String typename = "";
        
        instance.setTypename(typename);
        assertEquals(typename, instance.getTypename());
        
    }
}
