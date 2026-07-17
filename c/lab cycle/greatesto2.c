#include<stdio.h>

int main()
{
	int a = 30,b = 20,great;
	//int great = (a>b)?a:b;
	(a>b)?(great = a): (great = b);
	printf("%d is great",great);
	return 0;
}
