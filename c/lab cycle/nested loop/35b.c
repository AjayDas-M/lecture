#include<stdio.h>
int main()
{
	int n,i,j,value;
	printf("ENter the limit:");
	scanf("%d",&n);
	for(i = 0; i < n; i++)
	    {
	        value = 1;
	
	        // spaces
	        for(j = 0; j < n - i - 1; j++)
	        {
	            printf("  ");
	        }
	
	        // numbers
	        for(j = 0; j <= i; j++)
	        {
	            printf("%d   ", value);
	
	            value = value * (i - j) / (j + 1);
	        }
	
	        printf("\n");
	    }
	return 0;
}
