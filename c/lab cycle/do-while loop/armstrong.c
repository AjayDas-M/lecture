#include<stdio.h>

int main()
{
	int num,temp,rem,i;
	int digit=0,sum = 0,term;
	printf("Enter the number: ");
	scanf("%d",&num);
	
	temp = num;
	
	while(temp>0)
	{
		temp = temp/10;
		digit++;
	}
	printf("Number of digits = %d\n",digit);
	
	temp = num;
	while(temp > 0)
	{
		rem = temp%10;
		term=1;
		for( i = 0; i<digit;i++)
		{
			term = term * rem;
		}
		sum = sum+term;
		temp = temp/10;
	}
	printf("sum = %d\n",sum);
	
	if(sum == num)
		printf("the given number is armstrong");
	else
		printf("The given number is not an armstrong number");
	return 0;
}
