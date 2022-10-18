import java.util.*;
class Days_05
{
	public static void main(String []args)
	{
		long day, year, month, days;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Days: ");
		day = sc.nextInt();
		
		//calculating years
		year = day / 365;
		
		//calculating months
		month = (day - year * 365) / 30;
		
		//calculating days
		days = (day - year * 365 - month * 30);
		
		System.out.println("Years: "+year);
		System.out.println("Months: "+month);
		System.out.println("Days: "+days);
		
	}
}

/* OUTPUT:

Enter Days:
1458
Years: 3
Months: 12
Days: 3

*/