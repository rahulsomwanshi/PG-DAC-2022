/*Probeem Statement:
	WAP to accept percentage and display the class in which category it is First Class, Second Class, Fail, Distinction
*/

import java.util.*;

class Percentage
{
	public static void main(String args[])
	{
		double per;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Percentage (%): ");
		per = sc.nextDouble();
		
		if(per<35.00d)
			System.out.println("You are Failed");
		else if(per>=35.00d && per<=45.00d)
			System.out.println("You got third class");
		else if(per>=46.00d && per<=55.00d)
			System.out.println("You got second class");
		else if(per>=56.00d && per<=60.00d)
			System.out.println("You got higher second class");
		else if(per>=60.00d && per<=74.00d)
			System.out.println("You got first class");
		else if(per>=75.00d && per<=100.00d)
			System.out.println("You got first class with distinction class");
			
	}
}

/*Output:
Enter Percentage (%):
85.00
You got first class with distinction class
*/