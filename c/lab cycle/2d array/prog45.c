//Check the forward diagonal is equal to the backward diagonal
#include <stdio.h>
int main()
{
	int r,c,i,j,flag=0;
	printf("Enter the row size:");
	scanf("%d",&r);
	printf("Enter the coloumn size:");
	scanf("%d",&c);
	int a[r][c];
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("Enter the element at a[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);
		}
	}
	
	printf("\nA matrix\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d  ",a[i][j]);
		}
		printf("\n");
	}
	
	printf("\nforward diagonal of the matrix\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(i==j)
				printf("%d  ",a[i][j]);
			else
				printf("  ");
		}
		printf("\n");
	}
	printf("\nbackward diagonal of the matrix\n");
	for(i=0;i<r;i++)
	{
		printf("%d  ",a[i][r-1-i]);
	}
	for(i=0;i<r;i++)
	{
		if(a[i][i] != a[i][r-1-i])
		{
			flag = 1;
			printf("\nForward and backward diagonals are not same");
			break;
		}
	}
	if(flag == 0)
		printf("\nForward and backward diagonals are  same");
	return 0;
}

