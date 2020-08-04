package com.bank.clientservice.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="banktype")
public class BankType {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String acctype;
	private String banktype;
	@OneToMany(mappedBy="bankType", cascade = CascadeType.ALL)
	private Set<UserRegistration> users;
	public BankType() {
		}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getBanktype() {
		return banktype;
	}
	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}
	public Set<UserRegistration> getUsers() {
		return users;
	}
	public void setUsers(Set<UserRegistration> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "BankType [id=" + id + ", acctype=" + acctype + ", banktype=" + banktype + "]";
	}


	
}
