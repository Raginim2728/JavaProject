package edu.projectnew;
import java.util.Scanner;
public class MainOperation {
static StudentDetails Details = new StudentDetails();
static boolean ordering = true;
public static void menu() {
System.out.println("**************WELCOME TO STUDENT MANAGEMENT SYSTEM****************"
+"\n1.Add Student"
+"\n2.View Student"
+"\n3.Update Student"
+"\n4.Delete Student"
+"\n5.view All Student Detail"
+"\n6.Exit");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
do {
menu();
System.out.println("Enter the choice:");
int choice = sc.nextInt();
switch(choice) {
case 1:
System.out.println("Add Student");
Details.addstudent();
break;
case 2:
System.out.println("View Student");
Details.viewstudent();
break;
case 3:
System.out.println("Update Student");
Details.updatestudent();
break;
case 4:
System.out.println("Delete Student");
Details.deletestudent();
break;
case 5:
System.out.println("View All Students Detail");
Details.viewallstudent();
break;
case 6:
System.out.println("Thank you for using application!!");
System.exit(0);
default:
System.out.println("Please enter valid choice");
}
}while(ordering);
}
}