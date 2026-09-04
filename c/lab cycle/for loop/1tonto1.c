//Display from 1 to n and n to 1 using two for loops, where n is a positive integer given by the user.
#include<stdio.h>
int main()
{
	int n,i;
	printf("Enter the limit:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		printf("%d\t",i);
	}
	printf("\n");
	
	for(i=n;i>0;i--)
	{
		printf("%d\t",i);
	}
	
	return 0;
}
