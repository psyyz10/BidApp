package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * 
 * This class is the class of type entity in database
 */

public class Type {
	private int tid;
	private String typename;

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}

}
