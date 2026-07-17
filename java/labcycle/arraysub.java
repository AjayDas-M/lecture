import java.util.Scanner;
class arraysub
{
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		int r1,c1,r2,c2,i,j;
		
		System.out.print("Enter the row size of first matrix : ");
		r1 = sc.nextInt();
		System.out.print("Enter the col size of first matrix : ");
		c1 = sc.nextInt();
		System.out.print("Enter the row size of second matrix : ");
		r2 = sc.nextInt();
		System.out.print("Enter the col size of second matrix : ");
		c2 = sc.nextInt();
		
		int[][] m1 = new int[r1][c1];
		int[][] m2 = new int[r2][c2];
		int[][] sub = new int[r1][c1];
		
		System.out.println("\nInserting elements into matrix1 : ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print("Enter the element at position ["+i+","+j+"]");
				m1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nInserting elements to matrix2 : ");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print("Enter the element at position ["+i+","+j+"]");
				m2[i][j] = sc.nextInt();
			}
		}
		
		
		
		
		System.out.println("\nmatrix1 : ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(m1[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("\nmatrix2 : ");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(m2[i][j]+"  ");
			}
			System.out.println();
		}
		
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				sub[i][j] = m1[i][j] - m2[i][j];
			}
		}
		
		System.out.println("\n the difference of matrix2 and matrix1 ");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(sub[i][j]+"  ");
			}
			System.out.println();
		}
		
	}	
}