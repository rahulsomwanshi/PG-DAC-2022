/* Problem Statement: 
WAP in java to find Factorial of a number using command line argument
*/ 
class factCLA
{
	public static void main(String []args)
	{
		int fact=1, i;
		int num = Integer.parseInt(args[0]);
		
		for(i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+args[0]+" is: "+fact);
		
	}
}
/* Output:
javac factCLA.java

java factCLA 6

Factorial of 6 is: 720
*/