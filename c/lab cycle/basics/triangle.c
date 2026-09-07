#include<stdio.h>
int main()
{
	int angle1,angle2;
	printf("Enter the angle1 : ");
	scanf("%d",&angle1);
	printf("Enter the angle2 : ");
	scanf("%d",&angle2);
	
	int angle3 = 180-(angle1+angle2);
	printf("Third angle is : %d",angle3);
	
	return 0;
}
