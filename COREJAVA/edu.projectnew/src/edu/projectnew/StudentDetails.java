package edu.projectnew;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class StudentDetails {
HashSet<Student> stuset = new HashSet<Student>();
Student st1 = new
Student(1001,"Arun",34,"Cs","Arunak@gmail.com","9943908230");
Student st2 = new
Student(1002,"Malar",35,"ECE","malar@gmail.com","9095910391");
Student st3 = new
Student(1003,"Shiva",34,"Comm","shivask@gmail.com","9345233887");
Student st4 = new
Student(1004,"Ragini",35,"Mca","ragiak@gmail.com","9653402378");
Student st5 = new
Student(1005,"Pragatheesh",34,"Comm","Praga@gmail.com","9865360999");
Scanner sc=new Scanner(System.in);
boolean found=false;
int id;
String name;
int deptcode;
String department;
String gmail;
String phno;
public StudentDetails() {
stuset.add(st1);
stuset.add(st2);
stuset.add(st3);
stuset.add(st4);
stuset.add(st5);
}
//add student
public void addstudent() {
System.out.println("Enter id:");
id=sc.nextInt();
System.out.println("Enter name:");
name=sc.next();
System.out.println("Enter deptcode:");
deptcode=sc.nextInt();
System.out.println("Enter department:");
department=sc.next();
System.out.println("Enter gmail:");
gmail=sc.next();
System.out.println("Enter phno:");
phno=sc.next();
Student st=new Student(id, name, deptcode,
department, gmail, phno);
stuset.add(st);
System.out.println(st);
System.out.println("Student added successfully");
}
//view student based on their id
public void viewstudent(){
System.out.println("Enter id: ");
id=sc.nextInt();
for(Student st:stuset) {
if(st.getId()==id) {
System.out.println(st);
found=true;
}
}
if(!found) {
System.out.println("Student with this id is not present");
}
}
//update the student
public void updatestudent() {
System.out.println("Enter id: ");
id=sc.nextInt();
boolean found=false;
for(Student st:stuset) {
if(st.getId()==id) {
System.out.println("Enter new name: ");
name=sc.next();
System.out.println("Enter the deptcode:");
deptcode=sc.nextInt();
System.out.println("Enter the department:");
department=sc.next();
System.out.println("Enter the gmail:");
gmail=sc.next();
System.out.println("Enter new phno");
phno=sc.next();
st.setName(name);
st.setdeptcode(deptcode);
st.setDepartment(department);
st.setgmail(gmail);
st.setphno(phno);
System.out.println("Updated Details of student are:");
System.out.println(st);
found=true;
}
}
if(!found) {
System.out.println("Student is not present");
}
else {
System.out.println("Student details updated successfully !!");
}
}
//delete student
public void deletestudent() {
System.out.println("Enter id");
id=sc.nextInt();
boolean found=false;
Student stdelete=null;
for(Student st:stuset) {
if(st.getId()==id) {
stdelete=st;
found=true;
}
}
if(!found) {
System.out.println("Student is not present");
}
else {
stuset.remove(stdelete);
System.out.println("Student deleted successfully!!");
}
}
//view all students
public void viewallstudent() {
for(Student st:stuset) {
System.out.println(st);
}
}
}