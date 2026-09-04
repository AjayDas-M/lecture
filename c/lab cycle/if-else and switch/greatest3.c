#include<stdio.h>
int main()
{
	int num1,num2,num3;
	printf("Enter the first number : ");
	scanf("%d",&num1);
	printf("Enter the second number : ");
	scanf("%d",&num2);
	printf("Enter the second number : ");
	scanf("%d",&num3);
	
	printf("---------------------logic 1----------------\n");
	if(num1 > num2)
	{
		if(num1>num3)
			printf("%d is greatest\n",num1);
		else
			printf("%d is greatest\n",num3);
	}
		
	else
		if(num2>num3)
			printf("%d is greatest\n",num2);
		else
			printf("%d is greatest\n",num3);
		
		
	printf("---------------------logic 2----------------\n");
	
	(num1>num2)?printf("%d is greatest\n",num1) : printf("%d is greatest\n",num2);
	return 0;
}

