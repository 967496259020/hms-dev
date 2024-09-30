package com.hms.entity;


import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "add_member")
public class AddMember implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "ID")
    private int id;

    @Column(name = "FLAT_DETAILS")
    private String flatDetails;

    @Column(name = "FLAT_NO")
    private String flatNo;

    @Column(name = "FLAT_AREA")
    private String flatArea;

    @Column(name = "FLAT_WING")
    private String flatWing;

    @Column(name = "FLAT_RENT")
    private String flatRent;
    
    @Column(name = "OCCUPIED_DATE")
    private String occupiedDate;
    

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MIDDLE_NAME")
    private String middleName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "DOB")
    private String dob;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "MOBILE_NO")
    private String mobileNo;

    @Column(name = "ADDRESS")
    private String address;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlatDetails() {
        return flatDetails;
    }

    public void setFlatDetails(String flatDetails) {
        this.flatDetails = flatDetails;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getFlatArea() {
        return flatArea;
    }

    public void setFlatArea(String flatArea) {
        this.flatArea = flatArea;
    }

    public String getFlatWing() {
        return flatWing;
    }

    public void setFlatWing(String flatWing) {
        this.flatWing = flatWing;
    }

    public String getFlatRent() {
        return flatRent;
    }

    public void setFlatRent(String flatRent) {
        this.flatRent = flatRent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	public String getOccupiedDate() {
		return occupiedDate;
	}

	public void setOccupiedDate(String occupiedDate) {
		this.occupiedDate = occupiedDate;
	}
    
    
    
}
