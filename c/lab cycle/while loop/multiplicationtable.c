#include<stdio.h>

int main()
{
	int n,i;
	printf("Enter the number : ");
	scanf("%d",&n);
	i=1;
	while(i<=10)
	{
		printf("%d X %d = %d\n",i,n,i*n);
		i++;
	}
	
	return 0;
}
