/* display the even elements first then the odd elements*/
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
	printf("The array elements which are even elements:\n");
	for(i=0;i<n;i++)
	{
		if(arr[i]%2 == 0)
		{
			printf("%d  ",arr[i]);	
		}
	}
	printf("\nThe array elements which are odd elements:\n");
	for(i=0;i<n;i++)
	{
		if(arr[i]%2 != 0)
		{
			printf("%d  ",arr[i]);	
		}
	}
	return 0;
}
