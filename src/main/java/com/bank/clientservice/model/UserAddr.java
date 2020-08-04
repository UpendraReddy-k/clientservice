package com.bank.clientservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="useraddr")
public class UserAddr {

	@Id
	@GeneratedValue
	private Integer id;
	private String houseno;
	private String village;
	private String Street;
	private String mandal;
	private String district;
	private Integer pincode;
	private String emailid;
	private long phoneno;
	private long alternateno;
	@OneToOne
	@JoinColumn(name="userid")
	private UserRegistration userReg;
	public UserAddr() {
		}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public long getAlternateno() {
		return alternateno;
	}
	public void setAlternateno(long alternateno) {
		this.alternateno = alternateno;
	}
	public UserRegistration getUserReg() {
		return userReg;
	}
	public void setUserReg(UserRegistration userReg) {
		this.userReg = userReg;
	}
	@Override
	public String toString() {
		return "UserAddr [id=" + id + ", houseno=" + houseno + ", village=" + village + ", Street=" + Street
				+ ", mandal=" + mandal + ", district=" + district + ", pincode=" + pincode + ", emailid=" + emailid
				+ ", phoneno=" + phoneno + ", alternateno=" + alternateno + "]";
	}
	
	
	}
