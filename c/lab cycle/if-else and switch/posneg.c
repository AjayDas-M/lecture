#include<stdio.h>
int main()
{
	int num;
	printf("Enter the first number : ");
	scanf("%d",&num);

	
	if(num>0)
		printf("%d is a positive number",num);
	else if(num<0)
		printf("%d is negative number",num);
	else
		printf("it is zero");
	
	return 0;
}

