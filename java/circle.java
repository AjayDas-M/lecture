//Importing scanner
import java.util.Scanner;

// find area and perimeter of a circle
 class circle
 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		int r = sc.nextInt();
		
		System.out.println("Area of the circle " + (3.14 * r * r));
		System.out.println("Perimeter of the circle " + (2 * 3.14 * r));
	}
 }