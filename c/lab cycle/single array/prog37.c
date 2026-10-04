/*display the elements in the odd position, then the elements in the even position*/
#include<stdio.h>
int main()
{
	int n,i;
	printf("Enter the size of the array:");
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++)
	{
		printf("Enter the element arr[%d]:",i);
		scanf("%d",&arr[i]);
	}
	printf("The array elements in even position:\n");
	for(i=0;i<n;i++)
	{
		if((i+1)%2 == 0)
		{
			printf("%d  ",arr[i]);	
		}
	}
	printf("\nThe array elements in odd position:\n");
	for(i=0;i<n;i++)
	{
		if((i+1)%2 != 0)
		{
			printf("%d  ",arr[i]);	
		}
	}
	return 0;
}
