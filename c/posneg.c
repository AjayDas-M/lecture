#include<stdio.h>
int main()
{
	int num;
	printf("Enter a number ");
	scanf("%d",&num);
	(num>0) ?printf("The num is a positive number"):((num<0)?printf("The number isa negative number"):printf("The number is zero"));
	return 0;
}
