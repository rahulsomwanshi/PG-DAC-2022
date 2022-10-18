import java.util.*;
class intrest_04
{
	public static void main(String []args)
	{
		double simint, priamt, rate, year;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount: ");
		priamt = sc.nextInt();
		System.out.println("Enter Rate: ");
		rate = sc.nextInt();
		System.out.println("Enter Duration in years: ");
		year = sc.nextInt();
		
		//calculating simple intrest 
		simint = (priamt*rate*year)/100;
		
		System.out.println("Simple Intrest: "+simint);
		
	}
}

/*OUTPUT:

Enter Principle Amount:
90000
Enter Rate:
14
Enter Duration in years:
3
Simple Intrest: 37800.0

*/