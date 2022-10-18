/* Problem Statement
Demonstration of creating a class

property/data/state
behivour/methods/functions
instance/object


Student class
Data - int roll, String name, double marks;
Method - printDetails, changeMarks, addDetails;

*/


import java.util.*;

class Student
{
	static int roll;
	static String name;
	static double marks, mk, cng_mrk, b;

	static void addDetails()
	{
		
		Scanner ad = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter Roll Number: ");
		roll = ad.nextInt();
		System.out.println("Enter Name of Student: ");
		name = ad.next();
		System.out.println("Enter marks in percentage");
		
		marks = ad.nextDouble();
		
		printDetails();
	}
	static void printDetails()
	{
		System.out.println("Roll Number: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks+"%");
		
	}
	static double changeMarks(double a)
	{
		marks = a;
		return marks;
	}


	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		char ch;

		do{
		System.out.println("****************************************");
		System.out.println("1. Add Student Details");
		System.out.println("2. Show Student Details");
		System.out.println("3. Change Marks");
		System.out.println("****************************************");

		System.out.println("Enter Your Choice");
		int choice = sc.nextInt();

		switch(choice)
			{
			case 1:
					addDetails();
					break;
			case 2:
					printDetails();
					break;
					
			case 3:
					System.out.println("Enter updated marks of student: ");
					mk = sc.nextDouble();
					b = changeMarks(mk);
					System.out.println("Updated marks of student is: "+b);
					break;
					
			default:
					System.out.println("Wrong Choice");
					break;
			
			}
	
		System.out.println("********************************************************");
		System.out.println("Press Y/y to continue or N/n to exit");
		ch =sc.next().charAt(0);
		}while(ch=='Y' || ch=='y');
	}
}

/*Output:

****************************************
1. Add Student Details
2. Show Student Details
3. Change Marks
****************************************
Enter Your Choice
1

Enter Roll Number:
123
Enter Name of Student:
Rahul
Enter marks in percentage
85.22
Roll Number: 123
Name: Rahul
Marks: 85.22%
********************************************************
Press Y/y to continue or N/n to exit
Y
****************************************
1. Add Student Details
2. Show Student Details
3. Change Marks
****************************************
Enter Your Choice
2
Roll Number: 123
Name: Rahul
Marks: 85.22%
********************************************************
Press Y/y to continue or N/n to exit
y
****************************************
1. Add Student Details
2. Show Student Details
3. Change Marks
****************************************
Enter Your Choice
3
Enter updated marks of student:
98.65
Updated marks of student is: 98.65
********************************************************
Press Y/y to continue or N/n to exit
y
****************************************
1. Add Student Details
2. Show Student Details
3. Change Marks
****************************************
Enter Your Choice
2
Roll Number: 123
Name: Rahul
Marks: 98.65%
********************************************************
Press Y/y to continue or N/n to exit
*/