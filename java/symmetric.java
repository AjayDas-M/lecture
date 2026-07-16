import java.util.Scanner;
class symmetric
{
	public static void main(String[] args)
	{
		
	
		Scanner sc = new Scanner(System.in);
		int r1,c1,i,j;
		boolean trans = true;
		
		System.out.print("Enter the row size: ");
		r1 = sc.nextInt();
		System.out.print("Enter the col size: ");
		c1 = sc.nextInt();
		
		int[][] arr = new int[r1][c1];
		int[][] arrt = new int[c1][r1];
		
		for(i = 0 ; i<r1; i++)
			for(j=0;j<c1;j++)
				arr[i][j] = sc.nextInt();
			
		System.out.println("original matrix : ");

		for(i = 0 ; i<r1; i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				arrt[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Transpose matrix : ");

		for(i = 0 ; i<r1; i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(arrt[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				if(arr[i][j] != arrt[i][j])
				{
					trans = false;
					break;
				}
					
					
			}
		}
		if(!trans)
			System.out.println("It is not a symmetric matrix");
		else
			System.out.println("It is a symmetric matrix");
	}	
}