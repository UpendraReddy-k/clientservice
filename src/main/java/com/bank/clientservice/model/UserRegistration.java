package com.bank.clientservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Table(name="userreg")
public class UserRegistration {

	@Id
	@GeneratedValue
	private Integer id;
	private String fname;
	private String lname;
	private String surname;
	private String pan_no;
	private long aadhar_no;
	@OneToOne(mappedBy="userReg",cascade = {CascadeType.ALL})
	private UserAddr useraddr;
	@ManyToOne(fetch=FetchType.LAZY)
	@NotFound(
	        action = NotFoundAction.IGNORE)
	@JoinColumn(name="bank_id")
	private BankType bankType;
	public UserRegistration() {
		}
	public String getFname() {
		return fname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "UserRegistration [id=" + id + ", fname=" + fname + ", lname=" + lname + ", surname=" + surname
				+ ", pan_no=" + pan_no + ", aadhar_no=" + aadhar_no + ", useraddr=" + useraddr + ", bankType="
				+ bankType + "]";
	}
	
	
}
