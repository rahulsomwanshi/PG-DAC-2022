import java.util.*;

class circle_02
{
	public static void main(String []args)
	{
		final float pi = 3.14159f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		float rad = sc.nextFloat();
		
		//calculating circumference of circle
		float cir = 2*pi*rad;
		System.out.println("Circumference of circle is: "+cir);
				
	}
}

/*OUTPUT: 

Enter radius of circle:
15.4
Circumference of circle is: 96.76097

*/