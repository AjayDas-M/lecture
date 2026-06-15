import java.util.Scanner;

class minutes_convertor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the time in minutes : ");
		int mins = sc.nextInt();
		
		int hr = mins/60;
		int min = mins%60;
		
		System.out.println(hr + "hr and " + min +"mins");
	}
	
}