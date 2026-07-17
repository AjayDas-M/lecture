#include<stdio.h>
int main()
{
	int time_in_min;
	
	printf("Enter the time in minutes : ");
	scanf("%d",&time_in_min);
	
	int hr = time_in_min/60;
	int min = time_in_min%60;
	
	printf("%d hrs and %d mins",hr,min);
	return 0;
}
