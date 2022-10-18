/*Problem Statement:
WAP to print table of number 3 X 1 =3 till 3 X 10=30.
*/

import java.util.*;
class multi
{
	public static void main(String args[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number to print multiplication table: ");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+" X "+i+" = "+i*num);
		} 
		
	}
}

/*OUTPUT:
Enter a number to print multiplication table:
5
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50
*/