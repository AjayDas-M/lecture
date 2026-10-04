/*Find the second largest element in an array*/
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
	printf("The array is:\n");
	for(i=0;i<n;i++)
	{
		printf("%d  ",arr[i]);
	}
	int large = 0;
	int second = 0;
	int third = 0;
	for(i=0;i<n;i++)
	{
		if(arr[i]>large)
		{
			third = second;
			second = large;
			large = arr[i];
		}
	}
	printf("\nThe largest element in the array is: %d",large);
	printf("\nThe second largest element in the array is: %d",second);
	printf("\nThe third largest element in the array is: %d",third);
	return 0;
}
