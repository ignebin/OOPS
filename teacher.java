/*
Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to initialize the data members. Create another class ‘Teacher’ that inherit the properties of class employee and contain its own data members department, Subjects taught and constructors to initialize these data members and also include display function to display all the data members. Use array of objects to display details of N teachers.
*/

import java.util.Scanner;
 class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;
    Employee(int no, String na, double sal, String add) {
        this.Empid = no;
        this.Name = na;
        this.Salary = sal;
        this.Address = add;
    }
}
public class Teacher extends Employee{
 String dept;
 String subject;
 
 Teacher(int no, String na, double sal, String add, String dep, String sub){
     super(no,na,sal,add);
     this.dept= dep;
     this.subject=sub;
 }
    
 void display(){
    System.out.println("Employee id: "+Empid);
    System.out.println("Name: "+Name);
    System.out.println("Salary: "+Salary);
    System.out.println("Address: "+Address);
    System.out.println("Department: "+dept);
    System.out.println("Subject: "+subject);
 }
 public static void main(String[] args) {
    System.out.println("\nEnter the No. of Employee's");
    Scanner sc1 = new Scanner(System.in);
    int num = sc1.nextInt();
    Teacher arr[]=new Teacher[num];
    for(int i =0;i<num;i++)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter Employee id: ");
        int Empid=sc.nextInt();
        System.out.println("\nEnter Employee Name: ");
        String Name=sc.next();
        System.out.println("\nEnter Salary: ");
        double Salary=sc.nextDouble();
        System.out.println("\nEnter Address: ");
        String Address=sc.next();
        System.out.println("\nEnter department: ");
        String dept=sc.next();
        System.out.println("\nEnter Subject: ");
        String subject=sc.next();
        arr[i]=new Teacher(Empid,Name,Salary,Address,dept,subject);
    

    }
    System.out.println("\n********Informations of all the employee's************");
    for(int i=0;i<num;i++){
        int j=i+1;
        System.out.println("\n"+j+").");
        arr[i].display();
        
 }
 sc1.close();
 }

}
/*
mlm@mlm-desktop:~/Desktop/Rojin/java$ javac Teacher.java
mlm@mlm-desktop:~/Desktop/Rojin/java$ java Teacher

Enter the No. of Employee's
2

Enter Employee id: 
101

Enter Employee Name: 
zaina

Enter Salary: 
35000

Enter Address: 
kottayam

Enter department: 
mca

Enter Subject: 
java

Enter Employee id: 
102

Enter Employee Name: 
alvin

Enter Salary: 
36000

Enter Address: 
changanasherry

Enter department: 
mca

Enter Subject: 
dbms 

********Informations of all the employee's************

1).
Employee id: 101
Name: zaina
Salary: 35000.0
Address: kottayam
Department: mca
Subject: java

2).
Employee id: 102
Name: alvin
Salary: 36000.0
Address: changanasherry
Department: mca
Subject: dbms

*/
