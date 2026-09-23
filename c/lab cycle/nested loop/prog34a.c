#include<stdio.h>
int main()
{
	int n,i,j;
	printf("Enter the limit:");
	scanf("%d",&n);
	printf("Logic 1 \n");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i>=j)
				printf("%d ",j);
		}
		printf("\n");
	}
	
	printf("\nLogic 2 \n");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf("%d ",j);
		}
		printf("\n");
	}
	return 0;
}
