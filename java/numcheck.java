import java.util.Scanner;
class numcheck
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 0)
			System.out.println("Negative Number");
		else if(num > 0)
			System.out.println("Positive number");
		else
			System.out.println("The number is Zero");
			
	}
}