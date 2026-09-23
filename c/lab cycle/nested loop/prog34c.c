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
			{
				if(j%2 == 0)
					printf("%d ",0);
				else
					printf("%d ",1);
			}		
		}
		printf("\n");
	}
	
	printf("\nLogic 2 \n");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(i>=j)
				printf("%d ",j%2);
		}
		printf("\n");
	}

	return 0;
}
