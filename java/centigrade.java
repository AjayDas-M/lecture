import java.util.Scanner;

class centigrade
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value in centigrade : ");
		double c  = sc.nextDouble();
		double f = c * 1.8 +32;
		System.out.println("Enter the value in Fahrenheit : " + f);
	}
	
}