package student.newpackage;

import java.util.Scanner;


public class StudentList {

public static void main(String[] args) {

Student[] studList=new Student[3];
Scanner input=new Scanner(System.in);

for(int i=0; i<3; i++)
{
studList[i]=new Student();
System.out.println("Enter Student ID: ");
studList[i].setStudentID(input.nextInt());
input.nextLine();

System.out.println("Enter Student name: ");
studList[i].setStudentName(input.nextLine());


System.out.println("Enter Student program: ");
studList[i].setProgName(input.nextLine());

}

for(int i=0; i<3; i++)

System.out.println("Studet ID: " + studList[i].getStudentID()+ "Student name: "+studList[i].getStudentName()+
"Student Program: "+ studList[i].getProgName());
System.out.println("");
}
}