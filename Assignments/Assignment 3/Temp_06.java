import java.util.*;
class Temp_06
{
	public static void main(String []args)
	{
		double far, cel;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temparature in Fahrenheit: ");
		far = sc.nextDouble();
		cel = 5*((far-32)/9);
		System.out.println("Temparature in Celcius: "+cel+" C");
	}
}

/* OUTPUT:

Enter Temparature in Fahrenheit:
50
Temparature in Celcius: 10.0 C

*/