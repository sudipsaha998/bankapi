package com.banks.app.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branches {

	@Id
	private String ifsc;
	private long bankId;
	private String branch;
	private String address;
	private String city;
	private String district;
	private String state;
	
	public Branches() {}
	
	public Branches(String ifsc, long bankId, String branch, String address, String city, String district,
			String state) {
		this.ifsc = ifsc;
		this.bankId = bankId;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		this.state = state;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public long getBankId() {
		return bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
