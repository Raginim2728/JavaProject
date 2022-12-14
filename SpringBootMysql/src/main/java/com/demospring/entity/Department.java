package com.demospring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long departmentId;
private String departmentName;

private String departmentLocation;
private String departmentCode;
public Department() {
	super();
}

public Department(Long departmentId, String departmentName, String departmentLocation, String departmentCode) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentLocation = departmentLocation;
	this.departmentCode = departmentCode;
}





public Long getDepartmentId() {
	return departmentId;
}

public void setDepartmentId(Long departmentId) {
	this.departmentId = departmentId;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public String getDepartmentLocation() {
	return departmentLocation;
}

public void setDeparttmentLocation(String departtmentLocation) {
	this.departmentLocation = departtmentLocation;
}

public String getDepartmentCode() {
	return departmentCode;
}

public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}

@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentLocation="
			+ departmentLocation + ", departmentCode=" + departmentCode + "]";
}





}
