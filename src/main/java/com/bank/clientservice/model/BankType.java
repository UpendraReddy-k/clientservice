
package com.bank.clientservice.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "banktype")
public class BankType implements Serializable{

	private static final long serialVersionUID = -6628888198151300733L;
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue
	private Long id;
	private String acctype;
	private String banktype;

	@OneToMany(targetEntity = UserRegistration.class, mappedBy = "bankType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<UserRegistration> users;

	public BankType() {
	}

	/*
	 * public BankType(Integer bankid, String acctype, String banktype,
	 * Set<UserRegistration> users) { super(); this.bankid = bankid; this.acctype =
	 * acctype; this.banktype = banktype; this.users = users; }
	 */

	public String getAcctype() {
		return acctype;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "BankType [id=" + id + ", acctype=" + acctype + ", banktype=" + banktype + ", users=" + users + "]";
	}

	
}
