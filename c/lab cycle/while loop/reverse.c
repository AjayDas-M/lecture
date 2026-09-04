//Find the reverse of a given number
#include<stdio.h>
int main()
{
	int n,rem,rev=0;
	printf("Enter the number to reverse :");
	scanf("%d",&n);
	int m= n;
	while(m>0)
	{
		rem = m%10;
		rev = rev *10 +rem;
		m = m/10;
	}
	printf("Reverse = %d",rev);
	return 0;
}
