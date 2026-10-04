/*Find the maximum element in an array*/
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
	int large=arr[0];
	for(i=0;i<n;i++)
	{
		if(arr[i]>large)
		{
			large = arr[i];
		}
	}
	printf("\nThe largest element in the array is: %d",large);
	return 0;
}
