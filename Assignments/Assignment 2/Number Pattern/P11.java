class P11
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++) 
		{
			for(int j=5; j>=i; j--) //space
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) //star
			{
				System.out.print("*");
			}
			for(int m=1; m<i; m++) //star
			{
				System.out.print("*");
			}
		System.out.println();
		
		}
	}
}