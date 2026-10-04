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
	printf("\n Lower triangle \n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(i>=j)
				printf("%d  ",a[i][j]);
			else
				printf("  ");
		}
		printf("\n");
	}
	printf("\n upper triangle \n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(i<=j)
				printf("%d  ",a[i][j]);
			else
				printf("  ");
		}
		printf("\n");
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(a[i][j] != a[j][i])
			{
				flag =1;
				break;
			}	
		}
	}
	
	if(flag == 0)
	{
		printf("\nUpper and lower triangles are the same");
	}
	else
	{
		printf("\nUpper and lower triangles are not the same");
	}
	
	
	
	return 0;
}
