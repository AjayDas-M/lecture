#include<stdio.h>
int main()
{
	int num1,num2;
	printf("Enter the first number : ");
	scanf("%d",&num1);
	printf("Enter the second number : ");
	scanf("%d",&num2);
	
	printf("---------------------logic 1----------------\n");
	if(num1 > num2)
		printf("%d is greatest\n",num1);
	else
		printf("%d is greatest\n",num2);
		
	printf("---------------------logic 2----------------\n");
	
	(num1>num2)?printf("%d is greatest\n",num1) : printf("%d is greatest\n",num2);
	return 0;
}

