import java.util.*;
class Swap_07
{
	public static void main(String []args)
	{
		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Numbers before swapping is "+a+" and "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Numbers after swapping is "+a+" and "+b);
		
	}
}

/* OUTPUT:

Enter two number:
20
10
Numbers before swapping is 20 and 10
Numbers after swapping is 10 and 20

*/