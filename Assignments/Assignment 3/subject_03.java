import java.util.*;
class subject_03
{
	public static void main(String []args)
	{
		double sum, per;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter English subject marks: ");
		int eng = sc.nextInt();
		System.out.println("Enter Mathematics subject marks: ");
		int math = sc.nextInt();
		System.out.println("Enter Physics subject marks: ");
		int phy = sc.nextInt();
		System.out.println("Enter Chemistry subject marks: ");
		int che = sc.nextInt();
		System.out.println("Enter Biology subject marks: ");
		int bio = sc.nextInt();
		
		sum = eng+math+phy+che+bio;
		System.out.println("Sum of all subjects marks is "+sum+" out of 500");
		
		per = (sum/500)*100;
		System.out.println("Percentage marks = "+per+"%");
	
		
	}
}

/* OUTPUT: 

Enter English subject marks:
98
Enter Mathematics subject marks:
89
Enter Physics subject marks:
87
Enter Chemistry subject marks:
95
Enter Biology subject marks:
92
Sum of all subjects marks is 461.0 out of 500
Percentage marks = 92.2%

*/