#include<stdio.h>
int main()
{
	int n,i,j;
	printf("Enter the limit:");
	scanf("%d",&n);

	printf("Logic 1 \n");
	for(i = 1; i <= n; i++)
	{
	    int k;
	
	    if(i % 3 == 1)
	        k = 1;
	    else if(i % 3 == 2)
	        k = 0;
	    else
	        k = 0;
	
	    for(j = 1; j <= i; j++)
	    {
	        printf("%d ", k);
	        k = 1 - k;
	    }
	
	    printf("\n");
	}


	return 0;
}
