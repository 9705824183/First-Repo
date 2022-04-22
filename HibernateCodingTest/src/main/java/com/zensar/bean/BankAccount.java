package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;


public class BankAccount {
	@Column
	int bankid;
	@Column
	String accountid;
	
	
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getAccountid() {
		return accountid;
	}
	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [bankid=" + bankid + ", accountid=" + accountid + "]";
	}
	public BankAccount(int bankid, String accountid) {
		super();
		this.bankid = bankid;
		this.accountid = accountid;
	}
	public BankAccount() {
		super();
	}
	
	
	

}
