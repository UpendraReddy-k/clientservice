
package com.bank.clientservice.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BANKTYPE")
public class BankType implements Serializable {

	private static final long serialVersionUID = -6628888198151300733L;
	@Id
	@Column(name = "bid", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String acctype;
	private String banktype;
	@OneToMany(targetEntity = UserRegistration.class, mappedBy = "bankType", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<UserRegistration> users;

	public BankType() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
