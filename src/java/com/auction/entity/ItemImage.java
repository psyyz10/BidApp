package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * 
 * This class is the class of ItemImage entity in database
 */

public class ItemImage {
	private int imageId;
        private int listingId;
	private String imagePath;
        
	public int getImageid() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
        
        public int getListingId() {
		return listingId;
	}
	public void setListingId(int listingId) {
		this.listingId = listingId;
	}
        
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
        }
}
