#include<stdio.h>
int main()
{
	int a,b,ch;
	printf("Enter the number 1: ");
	scanf("%d",&a);
	printf("Enter the number 2: ");
	scanf("%d",&b);
	
	do
	{
		printf("1.Bitwise and (&) \n ");
		printf("2.bitwise or (|) \n ");
		printf("3.NOT (~) \n ");
		printf("4.XOR (^) \n ");
		printf("5.Left shift (<<) \n ");
		printf("6.Right Shift(>>) \n ");
		printf("7. Exit");
		printf("Enter your choice : ");
		scanf("%d",&ch);
		
		switch(ch)
		{
			case 1:
				printf("a & b = %d \n\n",(a&b));
				break;
			case 2:
				printf("a | b = %d \n\n",(a|b));
				break;
			case 3:
				printf("~a = %d \n\n",(~a));
				printf("~b = %d \n\n",(~b));
				break;
			case 4:
				printf("a ^ b = %d \n\n",(a^b));
				break;
			case 5:
				printf("a << b = %d \n\n",(a<<b));
				break;
			case 6:
				printf("a >> b = %d \n\n",(a>>b));
				break;
			case 7:
				break;
			default :
				printf("Invalid option\n\n");
				break;
			
		}
	}while(ch!=7);
	
	return 0;
}
