//Find the sum of first n numbers using while loop
#include<stdio.h>
int main()
{
	int n,sum=0,i=0;
	printf("Enter the number :");
	scanf("%d",&n);
	
	while(i<=n)
	{
		sum = sum+i;
		i++;
	}
	printf("sum = %d",sum);
	return 0;
}
