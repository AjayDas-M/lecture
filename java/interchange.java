class interchange
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		
		System.out.println("The value in a before interchanging : " + a);
		System.out.println("The value in b before interchanging : " + b);
		
		System.out.println("\n--------------------interchanging-------------------------\n");
		int temp = a;
		a = b;
		b = temp;
		System.out.println("The value in a after interchanging : " + a);
		System.out.println("The value in b after interchanging : " + b);
	}
}