//Find the factorial of a given number
#include <stdio.h>
int main()
{
	int n,i,f=1;
	printf("ENter the number :");
	scanf("%d",&n);
	int m = n;
	for(i=1;i<=m;i++)
	{
		f *=i;
		printf("%d \n",f);
	}
	printf("Factorial = %d",f);
	return 0;
}
