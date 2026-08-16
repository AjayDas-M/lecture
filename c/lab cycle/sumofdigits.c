//Find the sum of the digits of a given number
#include<stdio.h>
int main()
{
	int n,rem,sum=0;
	printf("Enter the number :");
	scanf("%d",&n);
	int m= n;
	while(m>0)
	{
		rem = m%10;
		sum = sum+rem;
		m = m/10;
	}
	printf("sum = %d",sum);
	return 0;
}
