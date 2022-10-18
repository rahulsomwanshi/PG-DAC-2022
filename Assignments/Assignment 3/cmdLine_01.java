/* 
Problem Statment:
Write a program that takes user’s name as command line argument and prints Welcome <entered user name>. 
*/

class cmdLine_01
{
	public static void main(String []args)
	{
		System.out.println("Welcome "+args[0]+" "+args[1]);
	}
}

/* OUTPUT: 

C:\Users\Administrator\Desktop\C-DAC\JavaPrograms\Assignments\Assignment 3>java cmdLine_01 Rahul Sommwanshi
Welcome Rahul Sommwanshi

*/