import java.util.Scanner;

class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int  num_d,r,rev=0;
		System.out.print("Enter the number to check : ");
		int num = sc.nextInt();
		
		num_d = num;
		
		while(num_d > 0)
		{
			r = num_d%10;
			rev = rev*10 + r;
			num_d = num_d/10;
		}
		if(rev == num)
			System.out.print("The number " + num + " is a palindrome");
		else
			System.out.print("The number " + num + " is not a palindrome");
		
	}
}
