//Program to check if the given number is prime or not.
#include<stdio.h>
int prime(int n)
{
	int f=0,i=2;
	do
	{
		if(n%i == 0)
			f = 1;
		i++;
	}while(i<n);
	
	if(n==2)
		f=0;
	
	if(f==0)
		return 0;
	else
		return 1;
}
int main()
{
	int n,f=0,i=2;
	printf("Enter the  number:");
	scanf("%d",&n);
	f = prime(n);
	if(f==0)
		printf("Prime number");
	else
		printf("Not prime");
	return 0;
}
