/* Create a class MathOperation that has four static methods. add() method that takes two integer numbers as 
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and 
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the 
product. power() method that takes two integer numbers as parameter and returns the power of first number to 
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four 
methods of MathOperation class by providing entered numbers and prints the return values of every method.*/

import java.util.*;
class MathOperation
{
    int a, b, pow=1;
    
    int add(int a, int b)
    {
		return a+b;
    }
	int subtract(int a, int b)
    {
			return a-b;
    }
	int multiply(int a, int b)
    {
		return a*b;
    }
	int power(int base, int expo)
    {
		
		while(expo!=0)
		{
			pow = base*pow;
			--expo;
		}
		return pow;
    }

}
class MathDemo07
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		MathOperation mo = new MathOperation();
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		sc.close();
		System.out.println("Addition of "+a+" and "+b+" is: "+mo.add(a,b));
		System.out.println("Subtraction of "+a+" and "+b+" is: "+mo.subtract(a,b));
		System.out.println("Multiplication of "+a+" and "+b+" is: "+mo.multiply(a,b));
		System.out.println(a+" to the power of "+b+" is: "+mo.power(a,b));
	}
}

/*Output: 

Enter first number:
2
Enter second number:
3
Addition of 2 and 3 is: 5
Subtraction of 2 and 3 is: -1
Multiplication of 2 and 3 is: 6
2 to the power of 3 is: 8

*/