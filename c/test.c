#include<stdio.h>
int main()
{
	int a = 20;
	int b = 30;
	a=a+b;
	b=a-b;
	a=a-b;
	
	printf("a = %d \n b = %d",a,b);
	return 0;
}
