package com.auction.entity;

/**
 *
 * @author gp12-mvr2 group
 * 
 * This class is the class of Userinfo entity in database
 */

public class Userinfo {
	private int userid;
	private String photoPath;
	private String username;
	private String userpwd;
	private String useremail;
	private int userscore;
        private String firstName;
	private String lastName;
        private int houseNumber;
        private String streetName;
        private String postcode;
        private String city;
        private String county;
        private String country;
        private String emailAddress;
        private String memberSince;
        private boolean isBanned;
        private boolean isAmin;
        
        public boolean isBanned(){
            return isBanned;
        }
        
        public void setBanned(boolean isBanned){
            this.isBanned = isBanned;
        }
        
        public boolean isAmin(){
            return isAmin;
        }
        
        public void setAmin(boolean isAmin){
            this.isAmin = isAmin;
        }
        
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
        }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
        
	public int getUserscore() {
		return userscore;
	}
	public void setUserscore(int userscore) {
		this.userscore = userscore;
	}
        
        public String getFistName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
        public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
        public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
        public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
        public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
        public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
        public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
        public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
        public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
        public String getMemberSince() {
		return memberSince;
	}
	public void setMemberSince(String memeberSince) {
		this.memberSince = memeberSince;
	}    
}
