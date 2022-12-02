package com.onetoonerelation;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="address_table_onetomany")
public class Address {
@Id	
@Column(name="address_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer addressId;

@Column(name="street_name", length=40)
private String street;
@Column(name="city_name", length=40)
private String city;
private String state;
@Column(name="pin_code")
private Long pincode;

@ManyToOne
@JoinColumn(name="employee_id")
Employee employee;
public Integer getAddressId() {
	return addressId;
}


public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}


public Employee getEmployee() {
	return employee;
}


public void setEmployee(Employee employee) {
	this.employee = employee;
}


public Integer getAddressid() {
	return addressId;
}


public Address() {
	super();
}


public void setAddressid(Integer addressid) {
	this.addressId = addressid;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Long getPincode() {
	return pincode;
}
public void setPincode(Long pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
			+ ", pincode=" + pincode + "]";
}


 
	
}

