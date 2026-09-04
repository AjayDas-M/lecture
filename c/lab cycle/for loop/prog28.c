//Find the sum of 1 + 2/2! + 3/3! + 4/4! + …. + n/n! Using a single for loop
#include <stdio.h>
int main()
{
	int n,i,f=1,sum=0;
	printf("ENter the number :");
	scanf("%d",&n);
	int m = n;
	for(i=1;i<=m;i++)
	{
		f *=i;
		sum +=i/f;
		printf("%d \n",sum);
	}
	printf("Factorial = %d",sum);
	return 0;
}
