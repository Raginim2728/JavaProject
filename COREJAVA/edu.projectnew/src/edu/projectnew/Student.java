package edu.projectnew;

import java.io.Serializable;
import java.time.LocalDate;
public class Student {
private int id;
private String name;
private int deptcode;
private String department;
private String gmail;
private String phno;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getdeptcode() {
return deptcode;
}
public void setdeptcode(int deptcode) {
this.deptcode = deptcode;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
public String getgmail() {
return gmail;
}
public void setgmail(String gmail) {
this.gmail = gmail;
}
public String getphno() {
return phno;
}
public void setphno(String phno) {
this.phno = phno;
}
@Override
public String toString() {
return "Student [id=" + id + ", name:" + name + ", deptcode:" + deptcode + ", department:" +
department+ ", gmail:" + gmail + ", phno:" + phno +
"]";
}
public Student(int id, String name, int deptcode,
String department, String gmail,String phno) {
super();
this.id = id;
this.name = name;
this.deptcode = deptcode;
this.department = department;
this.gmail = gmail;
this.phno = phno;
}
}