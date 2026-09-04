#include<stdio.h>
int main()
{
	int n,i=1,sum=0,total_sum=0;
	printf("Enter the limit: ");
	scanf("%d",&n);
	while(i<=n)
	{
		sum += i;
		total_sum += sum;
		i++;
		
	}
	
	printf("Sum = %d",total_sum);
	return 0;
}
