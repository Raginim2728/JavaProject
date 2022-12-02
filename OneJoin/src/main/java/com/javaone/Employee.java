package com.javaone;
import java.util.Date;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_table")
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

@OneToOne(cascade = CascadeType.ALL) 
@JoinColumn(name="address_id")
                                
//adress_address_id
private Address address;

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", doj=" + doj
			+ ", salary=" + salary + ", address=" + address + "]";
}

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

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public void setSalary(double salary2) {
	
	
	
}


}
