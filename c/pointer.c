#include<stdio.h>
int main()
{
	int a =5;

	int *b =&a;
	printf("%d______ %d_________%d",a,b,b+1);
	*b=6;
	printf("%d______ %d",a,*b);
	return 0;

}


