/*
Write a Java program to accept N integers from the user and display the largest and second largest numbers
*/
import java.util.Scanner;
class largestandsecondlargest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,n;
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter athe element "+i+": ");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The array elements");
		for(i=0;i<n;i++)
		{
			System.out.println("Enter athe element "+": "+arr[i]);
		}
		int large = arr[0];
		int large2 = arr[1];
		for(i=0;i<n;i++)
		{
			if(arr[i] > large)
			{
				large2 = large;
				large = arr[i];
			}
			 
		}
		System.out.println("The largest element in the array is :" + large);
		System.out.println("The second largest element in the array is :" + large2);
	}
}