/*Problem Statement:
WAP in java to find sum of 2 numbers using command line argument
*/

class sumCLA
{
	public static void main(String []args)
	{
		int sum;
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		sum = num1+num2;
		System.out.println("Sum of "+args[0]+" and "+args[1]+" is: "+sum);
	}
}

/*Output: 
javac sumCLA.java

java sumCLA 80 50

Sum of 80 and 50 is: 130

*/
