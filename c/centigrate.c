#include<stdio.h>
int main()
{
	float c;
	printf("Enter the temperature in centigrade: ");
	scanf("%f", &c);
	float f = c* 1.8+32;
	printf("temperature in Fahrenheit : %.2f", f);
	return 0;
}
