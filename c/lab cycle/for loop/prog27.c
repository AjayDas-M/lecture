//Find the factorial of a given number
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
		sum +=f;
		printf("%d \n",f,sum);
	}
	printf("Factorial = %d",sum);
	return 0;
}
