//Program to check if the given number is prime or not.
#include<stdio.h>
int main()
{
	int n,f=0,i=2;
	printf("Enter the  number:");
	scanf("%d",&n);
	do
	{
		if(n%i == 0)
			f = 1;
		i++;
	}while(i<n);
	
	if(n==2)
		f=0;
	
	if(f==0)
		printf("Prime number");
	else
		printf("Not prime");	
	
	return 0;
}
