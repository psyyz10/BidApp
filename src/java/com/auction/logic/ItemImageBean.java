/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auction.logic;

import com.auction.dao.ImageDAO;
import com.auction.entity.ItemImage;
import java.util.List;

/**
 *
 * @author gp12-mvr2 group
 */
public class ItemImageBean {
    private ImageDAO idao;
    
    public ItemImageBean(){
        idao = new ImageDAO();
    }
    
    public  List<ItemImage> queryItemImageByListingId(Integer listingId){
        return idao.queryItemImageByListingId(listingId);
    }
    
    public  ItemImage queryItemImageByImageId(Integer imageId){
        return idao.queryItemImageByImageId(imageId);
    }
    
    public <T> int save(T obj) {
        return idao.save(obj);
    }
}
