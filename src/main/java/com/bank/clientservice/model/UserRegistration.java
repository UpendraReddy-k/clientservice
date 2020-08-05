package com.bank.clientservice.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

//import org.hibernate.annotations.NotFound;
//import org.hibernate.annotations.NotFoundAction;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Table(name = "users")
public class UserRegistration implements Serializable {

	private static final long serialVersionUID = -1336411889466137553L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String fname;
	private String lname;
	private String surname;
	private String pan_no;
	private long aadhar_no;
	@OneToOne(mappedBy = "userReg", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private UserAddr useraddr;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	// @NotFound( action = NotFoundAction.IGNORE)
	@JoinColumn(name = "banktype_id", nullable = false)
	private BankType bankType;

	public UserRegistration() {
	}

	/*
	 * public UserRegistration(Long id, String fname, String lname, String surname,
	 * String pan_no, long aadhar_no, UserAddr useraddr) { super(); this.id = id;
	 * this.fname = fname; this.lname = lname; this.surname = surname; this.pan_no =
	 * pan_no; this.aadhar_no = aadhar_no; this.useraddr = useraddr; }
	 */


	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", fname=" + fname + ", lname=" + lname + ", surname=" + surname
				+ ", pan_no=" + pan_no + ", aadhar_no=" + aadhar_no + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public long getAadhar_no() {
		return aadhar_no;
	}

	public void setAadhar_no(long aadhar_no) {
		this.aadhar_no = aadhar_no;
	}

	public UserAddr getUseraddr() {
		return useraddr;
	}

	public void setUseraddr(UserAddr useraddr) {
		this.useraddr = useraddr;
	}

	public BankType getBankType() {
		return bankType;
	}

	public void setBankType(BankType bankType) {
		this.bankType = bankType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}