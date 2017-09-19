package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BillingAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int billingaddressid;
	private String line1;
	private String line2;
	private String state;
	private String country;
	private String pincode;

	public int getBillingaddressid() {
		return billingaddressid;
	}

	public void setBillingaddressid(int billingaddressid) {
		this.billingaddressid = billingaddressid;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
