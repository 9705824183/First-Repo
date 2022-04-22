package com.zensar.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int employeeid;
	
	@Column
	String name;
	@Column
	double basicsalary;
	
	@Embedded
	@OneToOne(mappedBy="employee",cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	Address address;
	
	@Embedded
	List<Skill> skillList;
	
	
	BankAccount account;

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Skill> getSkillList() {
		return skillList;
	}

	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", basicsalary=" + basicsalary + ", address="
				+ address + ", skillList=" + skillList + ", account=" + account + "]";
	}

	public Employee(int employeeid, String name, double basicsalary, Address address, List<Skill> skillList,
			BankAccount account) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.basicsalary = basicsalary;
		this.address = address;
		this.skillList = skillList;
		this.account = account;
	}

	public Employee() {
		super();
	}
	
	

}
