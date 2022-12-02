package com.onetoonerelation;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_table_onetomany")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="employee_id")
private Integer employeeId;
@Column(name="employee_name",length=30, nullable = false)
private String employeeName;
@Column(name="email_id",length = 40,nullable = false)
private String email;
private Date doj;
private Double salary;


@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee") //when we save parent child also saved
//specify tablename instead of default table name third table
//@JoinTable(name="emp_add_table",joinColumns = @JoinColumn(name="emp_id"),inverseJoinColumns=@JoinColumn(name="add_id"))
private List<Address> addresslist=new ArrayList<Address>(); //for onetomany(one emp many address)



public Integer getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Date getDoj() {
	return doj;
}

public void setDoj(Date doj) {
	this.doj = doj;
}

public Double getSalary() {
	return salary;
}

public void setSalary(Double salary) {
	this.salary = salary;
}



public List<Address> getAddresslist() {
	return addresslist;
}

public void setAddresslist(List<Address> addresslist) {
	this.addresslist = addresslist;
}

public void setSalary(double salary2) {
	// TODO Auto-generated method stub
	
}

}
