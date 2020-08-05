package com.bank.clientservice.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "addresses")
public class UserAddr implements Serializable {
	private static final long serialVersionUID = -6848375430659013311L;
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String houseno;
	private String village;
	private String Street;
	private String mandal;
	private String district;
	private Integer pincode;
	private String emailid;
	private long phoneno;
	private long alternateno;
	//@OneToOne(fetch = FetchType.LAZY, optional = false)
	//@JoinColumn(name = "user_id", nullable = false)
	@OneToOne(targetEntity=UserRegistration.class,cascade=CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName="uid")
	private UserRegistration userReg;

	public UserAddr() {
	}

	
	/*
	 * public UserAddr(Long id, String houseno, String village, String street,
	 * String mandal, String district, Integer pincode, String emailid, long
	 * phoneno, long alternateno, UserRegistration userReg) { super(); this.id = id;
	 * this.houseno = houseno; this.village = village; Street = street; this.mandal
	 * = mandal; this.district = district; this.pincode = pincode; this.emailid =
	 * emailid; this.phoneno = phoneno; this.alternateno = alternateno; this.userReg
	 * = userReg; }
	 */


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
				+ ", phoneno=" + phoneno + ", alternateno=" + alternateno + ", userReg=" + userReg + "]";
	}

	
	 
}
