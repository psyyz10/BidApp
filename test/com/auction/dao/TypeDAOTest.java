/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.dao;

import com.auction.entity.Type;
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
public class TypeDAOTest {
    Type obj;
    
    public TypeDAOTest() {
        obj = new Type();
        obj.setTid(1);
        obj.setTypename("as");
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
     * Test of delete method, of class TypeDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = null;
        TypeDAO instance = new TypeDAO();
        int expResult = 0;
        int result = instance.delete(id);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of merge method, of class TypeDAO.
     */
    @Test
    public void testMerge() {
        System.out.println("merge");
        
        TypeDAO instance = new TypeDAO();
        int expResult = 0;
        int result = instance.merge(obj);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of save method, of class TypeDAO.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        
        TypeDAO instance = new TypeDAO();
        int expResult = 1;
        int result = instance.save(obj);
        assertEquals(expResult, result);
        
        
    }
}
