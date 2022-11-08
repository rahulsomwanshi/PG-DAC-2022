/* Write a program to implement a class “student” with the following members. Name of the student. Marks of the 
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to 
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning 
of the above. */

import java.util.*;
class Student
{
	String name;
	
	double marks1, marks2,marks3;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Student: ");
		name = sc.next();
		System.out.println("Enter Mathematics marks: ");
		marks1 = sc.nextDouble();
		System.out.println("Enter Physics marks: ");
		marks2 = sc.nextDouble();
		System.out.println("Enter Chemistry: ");
		marks3 = sc.nextDouble();
		sc.close();
	}
	
	void dispData()
	{
		double sum, avg;
		sum = marks1+marks2+marks3;
		avg = sum/3;
		System.out.println("Name:"+name+"\nMathematics: "+marks1+"\nPhysics: "+marks2+"\nChemistry: "+marks3);
		System.out.println("Sum of all subjects (out of 300): "+sum);
		System.out.format("Average: %.2f\n", avg);
		
	}
	
}
public class StudentDemo05
{
	public static void main(String []args)
	{
		Student st = new Student();
		char c=0;
		int choice;
		
		Scanner mn = new Scanner(System.in);
		
		do
		{
		System.out.println("************************************************************************");
		System.out.println("1. Add Student Details");
		System.out.println("2. Show Details");
		System.out.println("************************************************************************");
		System.out.println("Enter Your Choice: ");
		choice = mn.nextInt();
		
		
			switch(choice)
			{
					case 1:
							st.getData();
							break;
					case 2: 
							st.dispData();
							break;
					
					default: 
							System.out.println("Wrong Choice");
							break;
			}
			System.out.println("************************************************************************");
			System.out.println("Do You Want To Continue (Y/N): ");
			c = mn.next().charAt(0);
			mn.close();
		}while(c=='Y' || c=='y');
	}
		
}

/*OUTPUT:

************************************************************************
1. Add Student Details
2. Show Details
************************************************************************
Enter Your Choice:
1
Enter Name of Student:
Rahul
Enter Mathematics marks:
99
Enter Physics marks:
98
Enter Chemistry:
96
************************************************************************
Do You Want To Continue (Y/N):
Y
************************************************************************
1. Add Student Details
2. Show Details
************************************************************************
Enter Your Choice:
2
Name:Rahul
Mathematics: 99.0
Physics: 98.0
Chemistry: 96.0
Sum of all subjects (out of 300): 293.0
Average: 97.67
************************************************************************
Do You Want To Continue (Y/N):
N

*/