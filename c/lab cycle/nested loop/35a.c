#include<stdio.h>
int main()
{
	int n,i,j;
	printf("Enter the limit: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i>=j)
			printf("* ");
		}
		printf("\n");
	}
	
	for(i=2;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i<=j)
			{
				printf("* ");
				
			}
		}
		printf("\n");
	}
	
	return 0;
}
