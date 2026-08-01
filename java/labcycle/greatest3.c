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
	int great;
	great =((num1>num2)?((num1>num3)?num1:num3):((num2>num3)? num2:num3 ));
	printf("%d is great\n",great);
	
	
	printf("---------------------logic 3----------------\n");
	
	if(num1>num2 && num1 > num3)
		printf("%d is greatest\n",num1);
	else if(num2>num1 && num2 > num3)
		printf("%d is greatest\n",num2);
	else
		printf("%d is greatest\n",num3);
		
	printf("---------------------logic 4----------------\n");
	
	great = num1;
	
	if(num2>great)
		great = num2;
	if(num3>great)
		great = num3;
	
	printf("%d is greatest\n",great);
	return 0;
}

