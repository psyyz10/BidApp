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
public class UserinfoTest {
    Userinfo instance;
    
    public UserinfoTest() {
        instance = new Userinfo();
        instance.setAmin(false);
        instance.setBanned(false);
        instance.setCity("");
        instance.setCountry("");
        instance.setCounty("");
        instance.setEmailAddress("");
        instance.setFirstName("");
        instance.setHouseNumber(0);
        instance.setLastName("");
        instance.setMemberSince("");
        instance.setMemberSince("");
        instance.setPhotoPath("");
        instance.setPostcode("");
        instance.setStreetName("");
        instance.setUseremail("");
        instance.setUserid(0);
        instance.setUsername("");
        instance.setUserpwd("");
        
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
     * Test of isBanned method, of class Userinfo.
     */
    @Test
    public void testIsBanned() {
        System.out.println("isBanned");
        
        boolean expResult = false;
        boolean result = instance.isBanned();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setBanned method, of class Userinfo.
     */
    @Test
    public void testSetBanned() {
        System.out.println("setBanned");
        boolean isBanned = false;
        
        instance.setBanned(isBanned);
        assertEquals(isBanned, instance.isBanned());
        
    }

    /**
     * Test of isAmin method, of class Userinfo.
     */
    @Test
    public void testIsAmin() {
        System.out.println("isAmin");
        
        boolean expResult = false;
        boolean result = instance.isAmin();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setAmin method, of class Userinfo.
     */
    @Test
    public void testSetAmin() {
        System.out.println("setAmin");
        boolean isAmin = false;
        
        instance.setAmin(isAmin);
        assertEquals(isAmin, instance.isAmin());
        
    }

    /**
     * Test of getPhotoPath method, of class Userinfo.
     */
    @Test
    public void testGetPhotoPath() {
        System.out.println("getPhotoPath");
        
        String expResult = "";
        String result = instance.getPhotoPath();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setPhotoPath method, of class Userinfo.
     */
    @Test
    public void testSetPhotoPath() {
        System.out.println("setPhotoPath");
        String photoPath = "";
        
        instance.setPhotoPath(photoPath);
        assertEquals(photoPath, instance.getPhotoPath());
        
    }

    /**
     * Test of getUsername method, of class Userinfo.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setUsername method, of class Userinfo.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        
        instance.setUsername(username);
        assertEquals(username, instance.getUsername());
        
    }

    /**
     * Test of getUseremail method, of class Userinfo.
     */
    @Test
    public void testGetUseremail() {
        System.out.println("getUseremail");
        
        String expResult = "";
        String result = instance.getUseremail();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setUseremail method, of class Userinfo.
     */
    @Test
    public void testSetUseremail() {
        System.out.println("setUseremail");
        String useremail = "";
        
        instance.setUseremail(useremail);
        assertEquals(useremail, instance.getUseremail());
        
    }

    /**
     * Test of getUserid method, of class Userinfo.
     */
    @Test
    public void testGetUserid() {
        System.out.println("getUserid");
        
        int expResult = 0;
        int result = instance.getUserid();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setUserid method, of class Userinfo.
     */
    @Test
    public void testSetUserid() {
        System.out.println("setUserid");
        int userid = 0;
        
        instance.setUserid(userid);
        assertEquals(userid, instance.getUserid());
        
    }

    /**
     * Test of getUserpwd method, of class Userinfo.
     */
    @Test
    public void testGetUserpwd() {
        System.out.println("getUserpwd");
        
        String expResult = "";
        String result = instance.getUserpwd();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setUserpwd method, of class Userinfo.
     */
    @Test
    public void testSetUserpwd() {
        System.out.println("setUserpwd");
        String userpwd = "";
        
        instance.setUserpwd(userpwd);
        assertEquals(userpwd, instance.getUserpwd());
        
    }

    /**
     * Test of getUserscore method, of class Userinfo.
     */
    @Test
    public void testGetUserscore() {
        System.out.println("getUserscore");
        
        int expResult = 0;
        int result = instance.getUserscore();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setUserscore method, of class Userinfo.
     */
    @Test
    public void testSetUserscore() {
        System.out.println("setUserscore");
        int userscore = 0;
        
        instance.setUserscore(userscore);
        assertEquals(userscore, instance.getUserscore());
        
    }

    /**
     * Test of getFistName method, of class Userinfo.
     */
    @Test
    public void testGetFistName() {
        System.out.println("getFistName");
        
        String expResult = "";
        String result = instance.getFistName();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setFirstName method, of class Userinfo.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        
        instance.setFirstName(firstName);
        assertEquals(firstName, instance.getFistName());
        
    }

    /**
     * Test of getLastName method, of class Userinfo.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setLastName method, of class Userinfo.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        
        instance.setLastName(lastName);
        assertEquals(lastName, instance.getLastName());
        
    }

    /**
     * Test of getHouseNumber method, of class Userinfo.
     */
    @Test
    public void testGetHouseNumber() {
        System.out.println("getHouseNumber");
        
        int expResult = 0;
        int result = instance.getHouseNumber();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setHouseNumber method, of class Userinfo.
     */
    @Test
    public void testSetHouseNumber() {
        System.out.println("setHouseNumber");
        int houseNumber = 0;
        
        instance.setHouseNumber(houseNumber);
        assertEquals(houseNumber, instance.getHouseNumber());
        
    }

    /**
     * Test of getStreetName method, of class Userinfo.
     */
    @Test
    public void testGetStreetName() {
        System.out.println("getStreetName");
        
        String expResult = "";
        String result = instance.getStreetName();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setStreetName method, of class Userinfo.
     */
    @Test
    public void testSetStreetName() {
        System.out.println("setStreetName");
        String streetName = "";
        
        instance.setStreetName(streetName);
        assertEquals(streetName, instance.getStreetName());
        
    }

    /**
     * Test of getPostcode method, of class Userinfo.
     */
    @Test
    public void testGetPostcode() {
        System.out.println("getPostcode");
        
        String expResult = "";
        String result = instance.getPostcode();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setPostcode method, of class Userinfo.
     */
    @Test
    public void testSetPostcode() {
        System.out.println("setPostcode");
        String postcode = "";
        
        instance.setPostcode(postcode);
        assertEquals(postcode, instance.getPostcode());
        
    }

    /**
     * Test of getCity method, of class Userinfo.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setCity method, of class Userinfo.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        
        instance.setCity(city);
        assertEquals(city, instance.getCity());
        
    }

    /**
     * Test of getCounty method, of class Userinfo.
     */
    @Test
    public void testGetCounty() {
        System.out.println("getCounty");
        
        String expResult = "";
        String result = instance.getCounty();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setCounty method, of class Userinfo.
     */
    @Test
    public void testSetCounty() {
        System.out.println("setCounty");
        String county = "";
        
        instance.setCounty(county);
        assertEquals(county, instance.getCounty());
        
    }

    /**
     * Test of getCountry method, of class Userinfo.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setCountry method, of class Userinfo.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        
        instance.setCountry(country);
        assertEquals(country, instance.getCountry());
        
    }

    /**
     * Test of getEmailAddress method, of class Userinfo.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        
        String expResult = "";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setEmailAddress method, of class Userinfo.
     */
    @Test
    public void testSetEmailAddress() {
        System.out.println("setEmailAddress");
        String emailAddress = "";
        
        instance.setEmailAddress(emailAddress);
        assertEquals(emailAddress, instance.getEmailAddress());
        
    }

    /**
     * Test of getMemberSince method, of class Userinfo.
     */
    @Test
    public void testGetMemberSince() {
        System.out.println("getMemberSince");
        
        String expResult = "";
        String result = instance.getMemberSince();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setMemberSince method, of class Userinfo.
     */
    @Test
    public void testSetMemberSince() {
        System.out.println("setMemberSince");
        String memeberSince = "";
        
        instance.setMemberSince(memeberSince);
        assertEquals(memeberSince, instance.getMemberSince());
        
    }
}
