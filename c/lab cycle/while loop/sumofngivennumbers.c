//Find the sum of n given numbers using a while loop. (Should not use array)
#include<stdio.h>
int main()
{
	int n,sum=0,i=1,num;
	printf("Enter the limit :");
	scanf("%d",&n);
	
	while(i<=n)
	{
		printf("ENter the number: ");
		scanf("%d",&num);
		sum = sum+num;
		i++;
	}
	printf("sum = %d",sum);
	return 0;
}
