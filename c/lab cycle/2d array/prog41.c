//sum of 2 matrices
#include <stdio.h>
int main()
{
	int r,c,i,j;
	printf("Enter the row size:");
	scanf("%d",&r);
	printf("Enter the coloumn size:");
	scanf("%d",&c);
	int a[r][c],b[r][c];
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("Enter the element at a[%d][%d]:",i,j);
			scanf("%d",&a[i][j]);
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("Enter the element at b[%d][%d]:",i,j);
			scanf("%d",&b[i][j]);
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
	printf("\nB matrix\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d  ",b[i][j]);
		}
		printf("\n");
	}
	
	printf("Sum of the matrises\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d  ",a[i][j] + b[i][j]);
		}
		printf("\n");
	}
	return 0;
}
