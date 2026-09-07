#include<stdio.h>
int main()
{
	int a = 10;
	int b = 20;
	
	printf("Before interchanging : \n a = %d \n b = %d \n",a,b);
	
	printf("Logic 1 : using temporary variable \n");
	
	int temp = a;
	a = b;
	b = temp;
	
	printf("after interchanging : \n a = %d \n b = %d \n",a,b);
	
	printf("Logic 2 using arithametic operators \n");
	
	a = a+b;
	b = a-b;
	a = a-b;
	
	printf("after interchanging : \n a = %d \n b = %d \n",a,b);
	
	printf("Logic 3 : using XOR \n");
	
	a = a ^ b;
    b = a ^ b;
    a = a ^ b;
	
	printf("after interchanging : \n a = %d \n b = %d \n",a,b);
	
	
	return 0;
}
