//Creating two functions named forward and backward takes a positive number as argument and displays from 1 to n and n to 1 respectively.
#include<stdio.h>

int fact(int n)
{
	int i,f=1;
	for(i=1;i<=n;i++)
	{
		f *=i;
	}
	return f;
}


int main()
{
	int n;
	printf("enter the value of n:");
	scanf("%d",&n);
	printf("factoria of %d is = %d",n,fact(n));
	return 0;
	
}
