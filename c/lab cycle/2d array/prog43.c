//transpose
#include <stdio.h>
int main()
{
	int r,c,i,j;
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
	printf("\ntranspose of the matrix\n");
	for(i=0;i<c;i++)
	{
		for(j=0;j<r;j++)
		{
			printf("%d  ",a[j][i]);
		}
		printf("\n");
	}
	

	return 0;
}
