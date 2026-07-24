#include<stdio.h>
int main()
{
	float r;
	printf("Enter the radius: ");
	scanf("%f",&r);
	
	float area = 3.14*r*r;
	float peri = 2*3.14*r;
	
	printf("Area = %.2f \n peri = %.2f \n",area,peri);
	return 0;
}
