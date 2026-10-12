#include <stdio.h>
int sumofn(int n)
{
	int i=1,sum=0;
	if(n<=0)
	{
		return 0;
	}
	else
	{
		return n+sumofn(n-1);
	}
}

int main()
{
	int n;
	printf("Enter the limit : ");
	scanf("%d",&n);
	printf("sum of numbers upto %d  is %d ",n,sumofn(n));
	return 0;
}
