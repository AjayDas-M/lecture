//Find the sum of the digits of a given number
#include<stdio.h>
void sumd(int m)
{
	int rem,sum=0;
	while(m>0)
	{
		rem = m%10;
		sum = sum+rem;
		m = m/10;
	}
	printf("sum = %d",sum);
}
int main()
{
	int n;
	printf("Enter the number :");
	scanf("%d",&n);
	sumd(n);

	return 0;
}
