//Creating two functions named forward and backward takes a positive number as argument and displays from 1 to n and n to 1 respectively.
#include<stdio.h>

void forward(int n)
{
	int i;
	for(i=1;i<=n;i++)
	{
		printf("%d  ",i);
	}
	printf("\n");
}

void backward(int n)
{
	int i;
	for(i=n;i>=1;i--)
	{
		printf("%d  ",i);
	}
	printf("\n");
}
int main()
{
	int n;
	printf("enter the value of n:");
	scanf("%d",&n);
	forward(n);
	backward(n);
	return 0;
	
}
