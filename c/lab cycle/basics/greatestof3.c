#include<stdio.h>

int main()
{
	int a = 40,b = 20, c = 30,great;
	
	great =((a>b)?((a>c)?a:c):((b>c)? b:c ));
	printf("%d is great",great);
	return 0;
}
