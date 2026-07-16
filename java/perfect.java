import java.util.Scanner;
class perfect
{
	public static void main()
	{
		Scanner sc = new Scanner(System.in);
		int n,i = 1,pn=0;
		System.out.print("Enter the number : ");
		n = sc.nextInt();
		
		while(i<n)
		{
			if(n%i == 0)
			{
				pn+=i;
				System.out.println(pn+" "+i);
			}
			i++;
		}
		if(pn == n)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect number");
	}
	
	
}