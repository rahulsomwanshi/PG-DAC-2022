import java.util.*;
class gross_08
{
	public static void main(String []args)
	{
		double bsal, hra, da, gs;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Basic Salary: ");
		
		bsal = sc.nextDouble();
		
		if(bsal<10000)
		{
			hra = (bsal*10)/100;
			da = (bsal*90)/100;
		}
		else
		{
			hra = 2000;
			da = (bsal*98)/100;
		}
		
		//Calculating Gross Salary
		gs = bsal+da+hra;
		
		System.out.println("HRA is: "+hra);
		System.out.println("DA is: "+da);
		System.out.println("Gross Salary is: "+gs);
	}
}

/* OUTPUT:

Enter Basic Salary:
9000
HRA is: 900.0
DA is: 8100.0
Gross Salary is: 18000.0


Enter Basic Salary:
80000
HRA is: 2000.0
DA is: 78400.0
Gross Salary is: 160400.0

*/