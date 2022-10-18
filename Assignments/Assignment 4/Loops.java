/*Problem Statement:
WAP to print number from 20 to 1 using different loops
*/

class Loops
{
	public static void main(String []args)
	{
		int j,k;
			j=k=20;
		System.out.println("20 to 1 using for loop: ");
		for(int i=20; i>=1; i--)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
		System.out.println("20 to 1 using while loop: ");
		while(j>=1)
		{
			System.out.print(j+" ");
			j--;
		}
		System.out.println("\n");
		System.out.println("20 to 1 using do while loop: ");
		do{
			
			System.out.print(k+" ");
			k--;
		}while(k>=1);
		
	}
}

/*Output: 
20 to 1 using for loop:
20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1

20 to 1 using while loop:
20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1

20 to 1 using do while loop:
20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1

*/