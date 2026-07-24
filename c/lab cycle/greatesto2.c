#include<stdio.h>

int main()
{
	int a = 10,b = 20,great;
	(a>b)?printf("%d is the greatest",a):printf("%d is the greatest",b);
	(a>b)?(great = a): (great = b);
	printf("%d is great",great);
	return 0;
}
