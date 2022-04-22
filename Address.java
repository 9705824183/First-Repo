package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Embeddable
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int addressid;
	@Column
	String cityname;
	@Column
	String pincode;
	
	@Embedded
	@OneToOne()
	@MapsId
	Employee employee;


	public int getAddressid() {
		return addressid;
	}


	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}


	public String getCityname() {
		return cityname;
	}


	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", cityname=" + cityname + ", pincode=" + pincode + ", employee="
				+ employee + "]";
	}


	public Address(int addressid, String cityname, String pincode, Employee employee) {
		super();
		this.addressid = addressid;
		this.cityname = cityname;
		this.pincode = pincode;
		this.employee = employee;
	}


	public Address(String cityname, String pincode, Employee employee) {
		super();
		this.cityname = cityname;
		this.pincode = pincode;
		this.employee = employee;
	}


	public Address() {
		super();
	}
	
	

}
