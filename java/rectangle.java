//Importing scanner
import java.util.Scanner;

// find area and perimeter of a rectangle
 class rectangle
 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle : ");
		int l = sc.nextInt();
		
		System.out.print("Enter the bredth of the rectangle : ");
		int b = sc.nextInt();
		
		System.out.println("Area of the circle " + (l*b));
		System.out.println("Perimeter of the circle " + (2 * (l + b)));
	}
 }