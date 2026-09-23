#include<stdio.h>
int main()
{
	int n,i,j;
	printf("Enter the limit:");
	scanf("%d",&n);
	printf("Logic 1 \n");
	for(i=1;i<=n;i++)
	{
		int k=1;
		for(j=1;j<=n;j++)
		{
			if(i<=j)
			{
				printf("%d ",k);
				k++;
			}
		}
		printf("\n");
	}
	
	printf("\nLogic 2 \n");
	int limit = n;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=limit;j++)
		{
			printf("%d ",j);
		}
		limit--;
		printf("\n");
	}
	return 0;
}
