import java.util.Scanner;
class bubble
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
        int n, i, j, temp;
		System.out.print("Enter the size of the array : ");
		n = sc.nextInt();
		

        int[] arr = new int[n];

        for(i = 0; i < n; i++)
            arr[i] = sc.nextInt();
			

        System.out.println();

        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}