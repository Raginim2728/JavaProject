package com.jpa;

import javax.persistence.Entity
;
import javax.persistence.Id;
@Entity
public class StudentsJpa {
@Id
private Integer id;
private String name;
private float fees;
public StudentsJpa() {
	super();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getFees() {
	return fees;
}
public void setFees(float fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "StudentsJPA [id=" + id + ", name=" + name + ", fees=" + fees + "]";
}

}
