import java.util.Scanner;

class number_frequency
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n ; i++)
		{
			System.out.println("Enter the element " +i +": ");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n ; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
		System.out.print("Enter the element to be counted: ");
		int countitem = sc.nextInt();
		int count = 0;
		for(int i = 0; i < n ; i++)
		{
			if(arr[i] == countitem)
				count++;
		}
		System.out.println("\nCount of "+countitem+" = "+count);
	}
}