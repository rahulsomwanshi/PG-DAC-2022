class fiboCLA
{
	public static void main(String []args)
	{
		int a=0, b=1,c=0;
		int num = Integer.parseInt(args[0]);
		System.out.println("Fibonacci Series: ");
		System.out.print(a+" "+b);
		for(int i=1;i<num-1;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		
	}
}