//sum of rows and sum of coloumn
#include <stdio.h>
int main()
{
	int r,c,i,j,srow,scol;
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
	
	for(i=0;i<c;i++)
	{
		srow=0;
		scol=0;
		for(j=0;j<r;j++)
		{
			srow+= a[i][j];
			scol+=a[j][i];
		}
		printf("\n sum of row %d = %d",i+1,srow);
		printf("\n sum of coloumn %d = %d",i+1,scol);
	}

	return 0;
}
