/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.dao.UserSearchesDAO;
import com.auction.entity.UserSearches;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */

public class UserSearchesBean {
    UserSearchesDAO sdao;
    
    public UserSearchesBean(){
        sdao = new UserSearchesDAO();
    }
    
    // Get searches list by user id
    public List<UserSearches> queryByUserId(int userId){
        return sdao.queryByUserId(userId);
    }
    
    // Save the user to the database
    public <T> int save(T obj){
        return sdao.save(obj);
    }
    
}
